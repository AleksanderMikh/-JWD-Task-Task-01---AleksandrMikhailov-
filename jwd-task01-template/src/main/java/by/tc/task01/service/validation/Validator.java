package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;

import java.util.Map;

public class Validator {


	
	public static <E> boolean criteriaValidator(Criteria<E> criteria) {

		if (criteria.getCriteria().isEmpty()){
			return false;
		}

		boolean result;
		String criteriaKey, criteriaValue;
		for(Map.Entry<E, Object> singlValue: criteria.getCriteria().entrySet()){
			result = true;
			criteriaKey = singlValue.getKey().toString();
			criteriaValue = singlValue.getValue().toString();
			if( InfoAboutCriteria.getInfo().get( criteriaKey ).toString().equals("double")){
				result = DoubleTest.testDouble(criteriaValue);
			}
			else if(InfoAboutCriteria.getInfo().get( criteriaKey ).toString().equals("string"))
			{

				result = StringTest.testString(criteriaValue);
			}
			return result;
		}
		
		return true;
	}

}

//you may add your own new classes