package com.scm.admin.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.mysql.cj.x.protobuf.MysqlxConnection.Close;
import com.scm.model.Euser;


public class AdminUserDbUtil {
	private DataSource dataSource;
	
	public AdminUserDbUtil(DataSource theDataSource) {
		dataSource = theDataSource;
	}
	
	public List<Euser> getUsers() throws Exception{
		List<Euser> users = new ArrayList<Euser>();
		
		Connection myConn= null;
		Statement myStmt = null;
		ResultSet myRs = null;
		
		try {
		myConn = dataSource.getConnection();
		
		String sql ="select * from euser";
		myStmt = myConn.createStatement();
		
		myRs = myStmt.executeQuery(sql);
		
		while(myRs.next()) {
			int userId =myRs.getInt("UserID");
			String userName = myRs.getString("UserName");
			String userCity = myRs.getString("UserCity");
		
		
			Euser tempUser = new Euser(userId,userName,userCity);
			
			users.add(tempUser);
		}
		
		return users;
	}
	finally {
		close(myConn,myStmt,myRs);
	}
}

	private void close(Connection myConn, Statement myStmt, ResultSet myRs) {
		// TODO Auto-generated method stub
		try {
			if(myRs != null) {
				myRs.close();
			}
			if(myStmt !=null) {
				myStmt.close();
			}
			if(myConn !=null) {
				myConn.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
