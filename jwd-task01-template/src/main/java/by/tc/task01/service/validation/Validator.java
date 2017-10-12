package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;

import java.util.Map;

public class Validator {


	
	public static <E> boolean criteriaValidator(Criteria<E> criteria) {

		if (criteria.getCriteria().isEmpty()){
			return false;
		}

		boolean result;
		for(Map.Entry<E, Object> singlValue: criteria.getCriteria().entrySet()){
			result = true;
			if( InfoAboutCriteria.getInfo().get( singlValue.getKey().toString() ).toString().equals("double")){
				result = DoubleTest.test(singlValue.getValue().toString());
			}
			if(!result){

				return false;
			}

		}
		
		return true;
	}

}

//you may add your own new classes