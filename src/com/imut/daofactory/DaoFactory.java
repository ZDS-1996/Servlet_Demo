package com.imut.daofactory;

import com.imut.dao.UserDao;
import com.imut.daoimpl.UserDaoImpl;

public class DaoFactory {
	public static UserDao getUserDao(){
		UserDao dao=new UserDaoImpl();
		return dao;
	}
}
