package com.service;

import java.util.ArrayList;

import com.dao.AdminDao;
import com.dao.AdminDaoImple;
import com.dao.BusDao;
import com.dao.BusDaoImple;
import com.dto.BusDetails;

public class BusServiceImple implements BusService {

	private BusDao busDao;
	
	
	public BusServiceImple() {
		
		busDao =new BusDaoImple();
	}

	@Override
	public int addBus(BusDetails busDetails) {
		
		return busDao.addBus(busDetails);
	}

	@Override
	public ArrayList<BusDetails> showBus() {
		
		return busDao.showBus();
	}

	@Override
	public BusDetails getbusUpdateInfo(int busId) {
		
		return busDao.getbusUpdateInfo(busId);
	}

	@Override
	public int updateBusDetails(BusDetails busDetails) {
		
		return busDao.updateBusDetails(busDetails);
	}

	@Override
	public int deleteBus(int busId) {
		
		return busDao.deleteBus(busId);
	}



}
