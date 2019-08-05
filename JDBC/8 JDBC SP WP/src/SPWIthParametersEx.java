import java.sql.*;


public class SPWIthParametersEx {

	public static void main(String[] args) {
		try {
			String url = "jdbc:mysql://localhost:3307/niit";
	    	Class.forName ("com.mysql.jdbc.Driver").newInstance ();
	    	Connection conn = DriverManager.getConnection (url, "root", "password@123");
	    	CallableStatement ct=conn.prepareCall("call add_info(?,?);");
	    	
	    	ct.setInt(1, 111);
	    	ct.setString(2, "supriya");
	    	
	    	ct.execute();
	    	System.out.println("Stored Procedure Exceuted :: Successfully");
		}
		catch(Exception e) {
		  	System.out.println("Stored Procedure Terminated :: Some Thing Went Wrong!!");
		}
	}

}
