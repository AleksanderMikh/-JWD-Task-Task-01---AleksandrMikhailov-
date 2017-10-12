package by.tc.task01.entity.criteria;

import java.util.HashMap;
import java.util.Map;
import java.lang.String;


public class Criteria<E> {

	private String applianceType;

	private Map<E, Object> criteria = new HashMap<E, Object>(); /*при создании объекта 
									класса с типом дженерика E, ссыка типа Map указывает на HashMap*/
	
	public void add(E searchCriteria, Object value) { // перед-ся критерии, соотв-щие типу дженерика
		criteria.put(searchCriteria, value);		  	
	}

	public Map<E, Object> getCriteria(){
		return this.criteria;
	}

	public void setApplianceType(String type){

		this.applianceType = type;
	}

	public String getApplianceType(){
		return this.applianceType;
	}
	// you may add your own code here

}
