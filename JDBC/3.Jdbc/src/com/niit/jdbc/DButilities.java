package com.niit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DButilities {

	public static void main(String[] args) {
	try {
		String url = "jdbc:mysql://localhost/demo";
    	Class.forName ("com.mysql.jdbc.Driver").newInstance ();
    	Connection conn = DriverManager.getConnection (url, "root", "root");
    	System.out.println("connection successfull");
    	Statement stmt=conn.createStatement();  
    	System.out.println("Inserting records into the table...");
        
        
        String sql2 = "INSERT INTO Registration1 " +
                     "VALUES (100, 'Zara', 'Ali', 18)";
        stmt.executeUpdate(sql2);
        sql2 = "INSERT INTO Registration1 " +
                     "VALUES (101, 'Mahnaz', 'Fatma', 25)";
        stmt.executeUpdate(sql2);
        sql2 = "INSERT INTO Registration1 " +
                     "VALUES (102, 'Zaid', 'Khan', 30)";
        stmt.executeUpdate(sql2);
        sql2 = "INSERT INTO Registration1 " +
                     "VALUES(103, 'Sumit', 'Mittal', 28)";
        stmt.executeUpdate(sql2);
        System.out.println("Inserted records into the table...");
          
        stmt.close();
        conn.close();
        
	}
	
	catch(Exception e)
	 {
		 System.out.println(e);
	 }

	}

}
