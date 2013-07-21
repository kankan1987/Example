package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConection {
	
	public static Connection getConnection(){
		String oracle_driver = "oracle.jdbc.driver.OracleDriver";
		String mysql_driver = "com.mysql.jdbc.Driver";
		String sqlserver_driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		
		String oracle_url = "jdbc:oracle:thin:@localhost:1521:oracl";
		String mysql_url = "jdbc:mysql//localhost:3306/sample";
		String sqlserver_url = "jdbc:sqlserver://localhost:1433;DatabaseName=sample";
		
		String userName = "root";
		String passWord = "root";
		
		Connection conn = null;
		
		try{
			Class.forName(oracle_driver);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		
		 try {
			conn = DriverManager.getConnection(oracle_url,userName,passWord);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		return conn;
	}
}
