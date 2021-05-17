package com.scm.db;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class Dbconector {
	public static Connection mydbconnection() {
		Context ctx = null;
		DataSource ds = null;
		Connection con = null;
		try {
			ctx = new InitialContext();
			ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/college");
			con = ds.getConnection();
			return con;
		} catch (NamingException | SQLException e) {

			e.printStackTrace();
		}
		return con;
	}
}
