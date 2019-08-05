package login;

import java.sql.*;
import java.util.Scanner;
public class login {

	public static void main(String[] args) {
		try {
			int i=0,p = 0;
			String url = "jdbc:mysql://localhost:3307/niit";
			String sql="select * from login where id=? and pass =?";
	    	Class.forName ("com.mysql.jdbc.Driver").newInstance ();
	    	Connection conn = DriverManager.getConnection (url, "root", "password@123");
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("enter id");
	    	int id=sc.nextInt();
	    	int pass=sc.nextInt();
	    	PreparedStatement pst=conn.prepareStatement(sql);
	    	pst.setInt(1, id);
	    	pst.setInt(2, pass);
	    	
	   
	    	if(pst.executeQuery()!=null) {
	    		System.out.println("logged");
	    	}else
	    	{
	    		System.out.println("failed");
	    	}
		}
		catch(Exception e) {
			
		}
	}

}