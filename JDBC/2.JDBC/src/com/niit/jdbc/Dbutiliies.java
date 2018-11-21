package com.niit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Dbutiliies {

	public static void main(String[] args) {
	
		try {
		 String url = "jdbc:mysql://localhost/demo";
	    	Class.forName ("com.mysql.jdbc.Driver").newInstance ();
	    	Connection conn1 = DriverManager.getConnection (url, "root", "root");
	    	System.out.println("connection successfull");
	    	
	    	Statement stmt=conn1.createStatement();  
 	
	    	String sql1 = "CREATE TABLE REGISTRATION2" +
                    "(id INTEGER not NULL, " +
                    " first VARCHAR(255), " + 
                    " last VARCHAR(255), " + 
                    " age INTEGER, " + 
                    " PRIMARY KEY ( id ))"; 
       stmt.executeUpdate(sql1);
       System.out.println("Created table in given database...");

		}  
       catch(Exception e)
		 {
			 System.out.println(e);
		 }
	}

}
