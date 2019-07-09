package com.imut.db;

import java.sql.Connection;
import java.sql.DriverManager;



public class DBUtil {
	private static final String DRIVER="oracle.jdbc.driver.OracleDriver";
	private static final String URL="jdbc:oracle:thin:@localhost:1521:orcl";
	private static final String USERNAME="zds";
	private static final String PASSEORD="zds";
	public static Connection getConnection(){
		Connection conn = null;
		try {
			Class.forName(DRIVER);
			conn=DriverManager.getConnection(URL, USERNAME, PASSEORD);
		} catch (Exception e) {
			// TODO: handle exception
		}	
		return conn;
		
	}
}
