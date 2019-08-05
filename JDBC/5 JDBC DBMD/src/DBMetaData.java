import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class DBMetaData {

	public static void main(String[] args) {
		try {
			String url = "jdbc:mysql://localhost:3307/demo";
	    	Class.forName ("com.mysql.jdbc.Driver").newInstance ();
	    	Connection conn = DriverManager.getConnection (url, "root", "password@123");
	    	
	    	DatabaseMetaData dbmd=conn.getMetaData(); 
	    	
	    	System.out.println("Driver Name: "+dbmd.getDriverName());  
	    	System.out.println("Driver Version: "+dbmd.getDriverVersion());  
	    	System.out.println("UserName: "+dbmd.getUserName());  
	    	System.out.println("Database Product Name: "+dbmd.getDatabaseProductName());  
	    	System.out.println("Database Product Version: "+dbmd.getDatabaseProductVersion()); 
	    	String[] tabTypes= {"TABLE"};
	    	ResultSet tables=dbmd.getTables(null, null, null, tabTypes);
	    	
	    	while(tables.next()) {
	    		System.out.println(tables.getString("TABLE_NAME"));
	    	}
	    	conn.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}

/*
DatabaseMetaData interface provides methods to get meta data of a database 
such as database product name, database product version, driver name,
 name of total number of tables, name of total number of views etc.
*/