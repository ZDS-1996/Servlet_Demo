package com.imut.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.imut.bean.Users;
import com.imut.dao.UserDao;
import com.imut.db.DBUtil;
import com.imut.db.DBclose;

public class UserDaoImpl implements UserDao {
	private Connection conn=null;
	private PreparedStatement pstmt=null;
	private ResultSet rs=null;
	public Users findUser(Users user) {
		String sql="select * from users where username=? and password=?";
		conn=DBUtil.getConnection();
		Users users=null;
		System.out.println(conn);
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, user.getUserName());
			pstmt.setString(2, user.getPasseord());
			rs=pstmt.executeQuery();
			if(rs.next()){
				String name=rs.getString(1);
				String pass=rs.getString(2);
				users=new Users(name, pass);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBclose.getClose(conn, pstmt, rs);
			
		}
		
		return users;
	}

}
