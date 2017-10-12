package by.tc.task01.service;

import by.tc.task01.service.impl.ApplianceServiceImpl;

public final class ServiceFactory {
	private static final ServiceFactory instance = new ServiceFactory();/* константная ссылка типа
													 ServiceFactory на объект ServiceFactory*/			
	private final ApplianceService applianceService = new ApplianceServiceImpl(); /*константная 
									ссылка типа ApplianceService на объект ApplianceServiceImpl*/
		private ServiceFactory() {}

	public ApplianceService getApplianceService() {

		return applianceService; /*возвращаем ссылку типа ApplianceService 
											на объект ApplianceServiceImpl*/
	}

	public static ServiceFactory getInstance() {
		return instance;	/*возвращаем ссылку типа ServiceFactory 
											на объект ServiceFactory*/
	}

}
