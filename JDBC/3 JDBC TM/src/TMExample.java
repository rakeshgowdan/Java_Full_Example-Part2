import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class TMExample {

	public static void main(String[] args) throws ClassNotFoundException {
		try {
			String url = "jdbc:mysql://localhost:3307/demo";
	    	Class.forName ("com.mysql.jdbc.Driver");
	    	Connection con = DriverManager.getConnection (url, "root", "password@123");
	    	//tm
	    	con.setAutoCommit(false);  
	    	  
	    	PreparedStatement ps=con.prepareStatement("insert into user values(?,?,?)");  
	    	  
	    	Scanner sc=new Scanner(System.in);
	    	while(true){  
	    	  
	    	System.out.println("enter id");  
	    	String id=sc.next();  
	    	  
	    	System.out.println("enter name");  
	    	String name=sc.next();  
	    	  
	    	System.out.println("enter salary");  
	    	String salary=sc.next(); 
	    	  
	    	ps.setString(1,id);  
	    	ps.setString(2,name);  
	    	ps.setString(3,salary);  
	    	ps.executeUpdate();  
	    	  
	    	System.out.println("commit/rollback");  
	    	String answer=sc.next();  
	    	if(answer.equals("commit")){  
	    	con.commit();  
	    	}  
	    	if(answer.equals("rollback")){  
	    	con.rollback();  
	    	}  
	    	  
	    	  
	    	System.out.println("Want to add more records y/n");  
	    	String ans=sc.next(); 
	    	if(ans.equals("n")){  
	    	break;  
	    	}  
	    	  
	    	}  
	    	con.commit();  
	    	System.out.println("record successfully saved");  
	    	  
	    	con.close();//before closing connection commit() is called  
	    	}
		catch(SQLException e) {
			System.out.println(e);
		}
	}

}
