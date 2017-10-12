package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.impl.choice.ApplianceDirector;
import by.tc.task01.dao.impl.choice.Command;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.*;
import java.io.*;

public class ApplianceDAOImpl implements ApplianceDAO {

	@Override
	public <E> Appliance find(Criteria<E> criteria) { //должна возвращать ссылку типа Appliance, т.е. на объект
		// you may add your own code here
		try {
			FileInputStream fstream = new FileInputStream("src/main/resources/appliances_db.txt");
			BufferedReader buffer = new BufferedReader(new InputStreamReader(fstream));
			String strLine;
			int flag = -1;
			String line;
			ArrayList<Object> values = new ArrayList<Object>();
			Pattern pattern = Pattern.compile("\\S+[=](\\w+\\W\\w|\\w+)");
			Matcher m;
			ApplianceDirector director = new ApplianceDirector();
			Command command = director.getCommand(criteria.getApplianceType());
			Appliance appl;

			while ((strLine = buffer.readLine()) != null) {

				if (criteria.getApplianceType().equals(strLine.split(" ")[0])) {
					m = pattern.matcher(strLine);
					values.clear();
					Map<Object, Object> newMap = new HashMap<Object, Object>();
					while (m.find()) {
						line = m.group();
						newMap.put(line.split("=")[0], line.split("=")[1]);
						values.add(line.split("=")[1]);
					}
					for (Map.Entry<Object, Object> singleValue : newMap.entrySet()) {
						flag = 0;

						for (Map.Entry<E, Object> oldMap : criteria.getCriteria().entrySet()) {

							if (singleValue.getKey().toString().equals(oldMap.getKey().toString())
									&& singleValue.getValue().toString().equals(oldMap.getValue().toString())) {
								break;

							} else if (singleValue.getKey().toString().equals(oldMap.getKey().toString())
									&& !singleValue.getValue().toString().equals(oldMap.getValue().toString())) {
								flag = -1;
								break;

							}
						}

						if (flag == -1) {
							break;
						}

					}
					if ( flag == 0 ) {
						appl = command.execute(values.toArray());
						return appl;
					}
				}
			}
			return null;


		} catch (IOException e) {
			System.out.println("File error " + e);
			return null;
		}

		// you may add your own code here
	}
}

//you may add your own new classes