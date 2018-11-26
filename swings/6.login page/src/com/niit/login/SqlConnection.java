package com.niit.login;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class SqlConnection {
	  Connection conn=null;
	public static  Connection DbConnector()
	{
		try {
			String url="jdbc:mysql://localhost/demo";
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection(url, "root", "root");
			return conn;
		}
		
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e);
			return null;
		}
	}

}
