import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ResultSetEx {

	public static void main(String[] args) {
		 try {
		    	
		    	String url = "jdbc:mysql://localhost:3307/demo";
		    	Class.forName ("com.mysql.jdbc.Driver").newInstance ();
		    	Connection conn = DriverManager.getConnection (url, "root", "password@123");
		    	
		    	//Result set fields
		    	Statement st=conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		    	String Query="select * from emp1";
		    	ResultSet rs=st.executeQuery(Query);
		    	
		    	if(rs.isBeforeFirst()==true) {
		    		System.out.println("IsBeforeFirst() Method is called ");
		    	}
		    	if(rs.isFirst()==true) {
		    		System.out.println("IsFirst() method called ");
		    	}
		    	if(rs.isAfterLast()==true) {
		    		System.out.println("IsAfterFirst() method called");
		    	}
		    	while(rs.next()) {
		    		if(rs.isFirst()==true) {
			    		System.out.println("IsFirst() method called:: after next() method ");
			    	}
		    		
		    		System.out.println(" id is "+rs.getInt(1)+" and name is "+rs.getString(2));
		    			
		    	}
		    	//Absolute method
		    	System.out.println("Absolute() method called");
		    	rs.absolute(3);
		    	int rowcount=rs.getRow();
		    	System.out.println("row is "+rowcount);
		    	
		    	
		    	//updatable resultset
		    	System.out.println("updatble result set");
		    	Statement st1=conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		    	String Query1="select * from emp1 where id=101";
		    	ResultSet rs1=st1.executeQuery(Query1);
		    	System.out.println(rs1.isBeforeFirst());
		    	rs1.next();
		    	System.out.println(rs1.isBeforeFirst());
		    	rs1.updateInt("id",200);
		    	rs1.updateRow();
		    	System.out.println("updated");
		    
		    	
		 }
		    catch(Exception e)
		    {
		    	System.out.println(e);
		    	
		    }

	}

}
