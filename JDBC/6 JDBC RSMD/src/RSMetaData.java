
import java.sql.*;

public class RSMetaData {

	public static void main(String[] args) {
		try {
			String url = "jdbc:mysql://localhost:3307/demo";
	    	Class.forName ("com.mysql.jdbc.Driver");
	    	Connection conn = DriverManager.getConnection (url, "root", "password@123");
	    	
	    	PreparedStatement ps=conn.prepareStatement("select * from emp");  
	    	ResultSet rs=ps.executeQuery();  
	    	ResultSetMetaData rsmd=rs.getMetaData();  
	    	  
	    	System.out.println("Total columns: "+rsmd.getColumnCount());  
	    	System.out.println("Column Name of 1st column: "+rsmd.getColumnName(1));  
	    	System.out.println("Column Type Name of 1st column: "+rsmd.getColumnTypeName(1));  
	    	System.out.println("table name: "+rsmd.getTableName(1));
	    	conn.close(); 
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
/*The metadata means data about data i.e. we can get further information from the data.

If you have to get metadata of a table like total number of column, column name,
 column type etc. ,
 ResultSetMetaData interface is useful because it provides methods to 
 get metadata from the ResultSet object.
*/