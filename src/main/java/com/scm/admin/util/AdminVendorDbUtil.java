package com.scm.admin.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.mysql.cj.x.protobuf.MysqlxConnection.Close;
import com.scm.model.Vendor;


public class AdminVendorDbUtil {
	private DataSource dataSource;
	
	public AdminVendorDbUtil(DataSource theDataSource) {
		dataSource = theDataSource;
	}
	
	public List<Vendor> getVendors() throws Exception{
		List<Vendor> vendors = new ArrayList<Vendor>();
		
		Connection myConn= null;
		Statement myStmt = null;
		ResultSet myRs = null;
		
		try {
		myConn = dataSource.getConnection();
		
		String sql ="select * from vendor";
		myStmt = myConn.createStatement();
		
		myRs = myStmt.executeQuery(sql);
		
		while(myRs.next()) {
			int vendorId =myRs.getInt("VrndorID");
			String vendorName = myRs.getString("VendorName");
			String vendorCity = myRs.getString("VendorCity");
		
			Vendor tempVendor = new Vendor(vendorId,vendorName,vendorCity);
			
			vendors.add(tempVendor);
		}
		
		return vendors;
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
