package com.service;

import com.dto.Admin;


public interface AdminService {
	int register(Admin admin);
	boolean login(Admin admin);

}
