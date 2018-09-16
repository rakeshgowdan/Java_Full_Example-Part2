package com.niit.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SqlConnect {
	
	 Connection conn=null;
	 public static void main(String[] args) {
		 
		 
		 
		 try {
			 String url = "jdbc:mysql://localhost/bank";
		    	Class.forName ("com.mysql.jdbc.Driver").newInstance ();
		    	Connection conn = DriverManager.getConnection (url, "root", "root");
		    	System.out.println("connection successfull");
		    	
			 
		    //create database
		    	Statement stmt=conn.createStatement();  
		    	 System.out.println("Creating database...");
		         stmt = conn.createStatement();
		         
		         /*String sql = "CREATE DATABASE bank1";
		         stmt.executeUpdate(sql);
		         System.out.println("Database created successfully...");*/
		         
		         System.out.println("Creating table in given database...");
		         stmt = conn.createStatement();
		        //create table 
		         String sql1 = "CREATE TABLE REGISTRATION " +
		                      "(id INTEGER not NULL, " +
		                      " first VARCHAR(255), " + 
		                      " last VARCHAR(255), " + 
		                      " age INTEGER, " + 
		                      " PRIMARY KEY ( id ))"; 
		         stmt.executeUpdate(sql1);
		         System.out.println("Created table in given database...");
		         
		         //insert values
		         
		       //STEP 4: Execute a query
		         System.out.println("Inserting records into the table...");
		         stmt = conn.createStatement();
		         
		         String sql2 = "INSERT INTO Registration " +
		                      "VALUES (100, 'Zara', 'Ali', 18)";
		         stmt.executeUpdate(sql2);
		         sql2 = "INSERT INTO Registration " +
		                      "VALUES (101, 'Mahnaz', 'Fatma', 25)";
		         stmt.executeUpdate(sql2);
		         sql2 = "INSERT INTO Registration " +
		                      "VALUES (102, 'Zaid', 'Khan', 30)";
		         stmt.executeUpdate(sql2);
		         sql2 = "INSERT INTO Registration " +
		                      "VALUES(103, 'Sumit', 'Mittal', 28)";
		         stmt.executeUpdate(sql2);
		         System.out.println("Inserted records into the table...");
		         
		         //print table
		         
		       //STEP 4: Execute a query
		         System.out.println("Creating statement...");
		         stmt = conn.createStatement();

		         String sql3 = "SELECT id, first, last, age FROM Registration1";
		         ResultSet rs = stmt.executeQuery(sql3);
		         //STEP 5: Extract data from result set
		         while(rs.next()){
		            //Retrieve by column name
		            int id  = rs.getInt("id");
		            int age = rs.getInt("age");
		            String first = rs.getString("first");
		            String last = rs.getString("last");

		            //Display values
		            System.out.print("ID: " + id);
		            System.out.print(", Age: " + age);
		            System.out.print(", First: " + first);
		            System.out.println(", Last: " + last);
		         }
		         rs.close();

		         conn.close();
		 }
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }
		
	}

}
