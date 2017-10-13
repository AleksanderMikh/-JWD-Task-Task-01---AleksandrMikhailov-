package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.impl.choice.ApplianceDirector;
import by.tc.task01.dao.impl.choice.Command;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.*;
import java.io.*;

public class ApplianceDAOImpl implements ApplianceDAO {

	@Override
	public <E> Appliance find(Criteria<E> criteria) { //должна возвращать ссылку типа Appliance, т.е. на объект
		try {
			FileInputStream fstream = new FileInputStream("src/main/resources/appliances_db.txt");
			BufferedReader buffer = new BufferedReader(new InputStreamReader(fstream));	//открываем файл

			String strLine, line, strKey, strValue, criteriaKey, criteriaValue;
			boolean flag = false;
			List<Object> values = new ArrayList<Object>(); //лист для значений
			Pattern pattern = Pattern.compile("\\S+[=](\\w+\\W\\w|\\w+)"); //рег-е выражение
			Matcher m;
			ApplianceDirector director = new ApplianceDirector();
			Command command = director.getCommand(criteria.getApplianceType());
			Appliance appl;	//ссылка на объект

			while ((strLine = buffer.readLine()) != null) {		//считываем строку из файла

				if (criteria.getApplianceType().equals(strLine.split(" ")[0])) { //поиск строки по типу дженерика
					m = pattern.matcher(strLine);	//
					values.clear();
					Map<Object, Object> newMap = new HashMap<Object, Object>();

					while (m.find()) {	// поиск всех совпадений в строке
						line = m.group();
						newMap.put(line.split("=")[0], line.split("=")[1]);		//мап со значениями и ключами-критериями
						values.add(line.split("=")[1]);	//лист со значениями
					}

					for (Map.Entry<Object, Object> singleValue : newMap.entrySet()) {						//цикл по значениям из строки

						flag = true;	//ключ для отсеивания не подходящих строк

						strKey = singleValue.getKey().toString().toLowerCase();
						strValue = singleValue.getValue().toString().toLowerCase();

						for (Map.Entry<E, Object> oldMap : criteria.getCriteria().entrySet()) {

							criteriaKey = oldMap.getKey().toString().toLowerCase();
							criteriaValue = oldMap.getValue().toString().toLowerCase();

							if ( strKey.equals(criteriaKey) && strValue.equals(criteriaValue) ) {
								break;	//значение совпало - ключ остается true -> прерываем поиск

							} else if ( strKey.equals(criteriaKey) && !strValue.equals(criteriaValue) ) {
								flag = false;	//если значение по одинаковому ключу отличается -> неверный критерий	-> false
								break;
							}
						}
						if (!flag) { //false? -> выходим из поиска
							break;
						}
					}
					if ( flag ) {	//true? -> передаем лист значений в "СОЗДАТЕЛЬ"
						appl = command.execute(values.toArray());
						return appl;
					}
				}
			}
			return null;	//не верный критерий -> возвращаем null

		} catch (IOException e) {
			System.out.println("File error " + e);
			return null;
		}
	}
}

