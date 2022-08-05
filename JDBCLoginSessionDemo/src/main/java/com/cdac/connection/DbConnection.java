package com.cdac.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//change database name and password
public class DbConnection {

	public static Connection getDatabaseConnection() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/cdacdb?useSSL=false", "root", "Mysql@#12");
			
			return con;
			
		} catch (SQLException | ClassNotFoundException exc) {
			exc.printStackTrace();
			return null;
		}
	}
}
