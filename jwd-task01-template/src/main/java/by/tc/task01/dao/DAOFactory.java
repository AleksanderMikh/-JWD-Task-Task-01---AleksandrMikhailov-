package by.tc.task01.dao;

import by.tc.task01.dao.impl.ApplianceDAOImpl;

public final class DAOFactory { // финал класс фабрика DAO для работы с данными и взаимодействием с сервисом
	private static final DAOFactory instance = new DAOFactory();

	private final ApplianceDAO applianceDAO = new ApplianceDAOImpl(); //ссылка типа ApplianceDAO на объект
																	  //ApplianceDAOImpl(перегрузка поиска)			
	private DAOFactory() {}

	public ApplianceDAO getApplianceDAO() {
		return applianceDAO;
	}

	public static DAOFactory getInstance() {
		return instance;
	}
}
