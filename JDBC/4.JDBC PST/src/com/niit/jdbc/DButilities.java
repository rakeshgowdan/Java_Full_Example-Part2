package com.niit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;


//The PreparedStatement interface is a subinterface of Statement.
//It is used to execute parameterized query.
public class DButilities {

	public static void main(String[] args) {
	try {
		
		//pst query
		String sql = "INSERT INTO Registration1 " +
                "VALUES (?,?,?,?)";
		
		
		String url = "jdbc:mysql://localhost/demo";
    	Class.forName ("com.mysql.jdbc.Driver").newInstance ();
    	Connection conn = DriverManager.getConnection (url, "root", "root");
    	System.out.println("connection successfull");
    	
    	//create pst
    	PreparedStatement pst=conn.prepareStatement(sql);  
    	System.out.println("Inserting records into the table...");
        
        //passing value
    	int id=111;
    	String fname="raja";
    	String lname="ram";
    	int age=29;
    	
    	pst.setInt(1, id);
    	pst.setString(2, fname);
    	pst.setString(3, lname);
        pst.setInt(4, age);        
        pst.executeUpdate();
       
        pst.close();
        conn.close();
        
	}
	
	catch(Exception e)
	 {
		 System.out.println(e);
	 }

	}

}
