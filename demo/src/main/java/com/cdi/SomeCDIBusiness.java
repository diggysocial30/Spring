package com.cdi;

import javax.inject.Inject;
import javax.inject.Named;

// CDI Renamed component and autowired

@Named
public class SomeCDIBusiness {
	
	@Inject
	private SomeCDIDAO dao;

	public SomeCDIDAO getDao() {
		return dao;
	}

	public void setDao(SomeCDIDAO dao) {
		this.dao = dao;
	}
	

}
