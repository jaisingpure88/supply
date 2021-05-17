package com.scm.admin.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.mysql.cj.x.protobuf.MysqlxConnection.Close;
import com.scm.model.Product;

public class AdminProductDbUtil {
	private DataSource dataSource;
	
	public AdminProductDbUtil(DataSource theDataSource) {
		dataSource = theDataSource;
	}
	
	public List<Product> getProducts() throws Exception{
		List<Product> products = new ArrayList<Product>();
		
		Connection myConn= null;
		Statement myStmt = null;
		ResultSet myRs = null;
		
		try {
		myConn = dataSource.getConnection();
		
		String sql ="select * from product";
		myStmt = myConn.createStatement();
		
		myRs = myStmt.executeQuery(sql);
		
		while(myRs.next()) {
			int productId =myRs.getInt("ProductID");
			String productName = myRs.getString("ProductName");
			String productDisc = myRs.getString("ProductDisc");
			int productPrice = myRs.getInt("ProductPrice");
		
			Product tempProduct = new Product(productId,productName,productDisc,productPrice);
			
			products.add(tempProduct);
		}
		
		return products;
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
