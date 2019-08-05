import java.sql.*;

//callable statements without param
public class SPNoParameters {

	public static void main(String[] args) {
		try {
			String url = "jdbc:mysql://localhost:3307/niit";
	    	Class.forName ("com.mysql.jdbc.Driver").newInstance ();
	    	Connection conn = DriverManager.getConnection (url, "root", "password@123");
	    	
	    	CallableStatement ct=conn.prepareCall("call show_info");
	    	ResultSet rs=ct.executeQuery();
	    	while(rs.next()) {
	    		System.out.println(rs.getInt(1)+" "+rs.getString(2));
	    	}
	    	
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
