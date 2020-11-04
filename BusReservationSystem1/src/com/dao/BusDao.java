package com.dao;

import java.util.ArrayList;

import com.dto.BusDetails;

public interface BusDao {

	int addBus(BusDetails busDetails);
	ArrayList<BusDetails> showBus();
	BusDetails getbusUpdateInfo(int busId);
	int updateBusDetails(BusDetails busDetails);
}
