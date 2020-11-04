package com.service;

import java.util.ArrayList;

import com.dto.BusDetails;

public interface BusService {

	int addBus(BusDetails busDetails);
	ArrayList<BusDetails> showBus();
	BusDetails getbusUpdateInfo(int busId);
	int updateBusDetails(BusDetails busDetails);
	int deleteBus(int busId);
	
}
