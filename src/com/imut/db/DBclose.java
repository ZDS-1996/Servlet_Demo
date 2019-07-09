package com.imut.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBclose {
	public static void getClose(Connection conn,PreparedStatement pstmt,ResultSet rs){
		try {
			if(rs!=null)
				rs.close();
			if(pstmt!=null)
				pstmt.close();
			if(conn!=null)
				conn.close();
		} catch (SQLException e) {
			e.getStackTrace();
			// TODO: handle exception
		}
	} 
}
