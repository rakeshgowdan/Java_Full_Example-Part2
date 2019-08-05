package com.niit.connect;

import java.sql.*;
public class SqlConnect {

	public static void main(String[] args) {
		 try {
		    	
		    	String url = "jdbc:mysql://localhost:3307/demo";
		    	Class.forName ("com.mysql.jdbc.Driver").newInstance ();
		    	Connection conn = DriverManager.getConnection (url, "root", "password@123");
		    
		    	System.out.println(conn);
		    	
		    }
		    catch(Exception e)
		    {
		    	System.out.println(e);
		    	
		    }
	}

}
