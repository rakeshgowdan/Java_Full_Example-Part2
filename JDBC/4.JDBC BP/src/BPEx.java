import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BPEx {

	public static void main(String[] args) throws Exception {
		
		String url = "jdbc:mysql://localhost:3307/demo";
    	Class.forName ("com.mysql.jdbc.Driver");
    	Connection con = DriverManager.getConnection (url, "root", "password@123");
    	
    	con.setAutoCommit(false);  
    	  
    	Statement stmt=con.createStatement();  
    	stmt.addBatch("insert into user values('190','abhi','40000')");  
    	stmt.addBatch("insert into user values('191','umesh','50000')");  
    	  
    	int arr[]=stmt.executeBatch();//executing the batch  
    	
    	con.commit();  
		
		

	}

}

/*
batch processing steps
Load the driver class
Create Connection
Create Statement
Add query in the batch
Execute Batch
Close Connection

void addBatch(String query)	It adds query into batch.
int[] executeBatch()	It executes the batch of queries.

*
*/
