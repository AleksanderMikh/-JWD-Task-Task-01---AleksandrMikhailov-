package by.tc.task01.service.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.DAOFactory;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.validation.Validator;

public class ApplianceServiceImpl implements ApplianceService{ //наследуется от ApplianceService работает
																// работает с DAO
	@Override
	public <E> Appliance find(Criteria<E> criteria) {
		if (!Validator.criteriaValidator(criteria)) { //передаем в валидатор ссылку на объект класса 
			return null;							  //Criteria<E>
		}
		
		DAOFactory factory = DAOFactory.getInstance(); //берем ссылку на объект DAOFactory
		ApplianceDAO applianceDAO = factory.getApplianceDAO(); /*по ссылке на объект DAOFactory 
		методом getApplianceDAO() берем ссылку типа getApplianceDAO на объект ApplianceDAOImpl*/
		Appliance appliance = applianceDAO.find(criteria); //по ссылке вызываем перегруженный метод find
							// передаем ссылку типа Criteria, указывающую на объект, сод-щий HashMap
		// you may add your own code here
		
		return appliance;
	}

}

//you may add your own new classes
