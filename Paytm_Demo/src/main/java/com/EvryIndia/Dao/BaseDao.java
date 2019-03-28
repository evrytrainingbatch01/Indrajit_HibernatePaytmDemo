package com.EvryIndia.Dao;

import com.EvryIndia.Model.EV_Account;
import com.EvryIndia.Model.EV_UserLogin;

public interface BaseDao {
	 public boolean login(String username, String password);
	 public String register(EV_UserLogin user);
	 /*public int addMoney(EV_Account accNum);*/
	 
}
