package com.niit.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DButilities {
	

	 public static void main(String[] args) {
		 
		 
		
		 try {
			 
			 
			 String url = "jdbc:mysql://localhost/demo";
		    	Class.forName ("com.mysql.jdbc.Driver").newInstance ();
		    	Connection conn1 = DriverManager.getConnection (url, "root", "root");
		    	System.out.println("connection successfull");
		    	
		    	Statement stmt=conn1.createStatement();  
	    	
		 String query = "select * from demo";
         ResultSet rs = stmt.executeQuery(query);
         //STEP 5: Extract data from result set
         while(rs.next()){
            //Retrieve by column name
            int id  = rs.getInt("id");
           
            String name = rs.getString("name");

            //Display values
            System.out.print("ID: " + id);
            System.out.println(", name " + name);
         }
         rs.close();

         conn1.close();
 }
 catch(Exception e)
 {
	 System.out.println(e);
 }
}
}
