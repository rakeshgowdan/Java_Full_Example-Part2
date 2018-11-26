import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
   /*Data Access Object Pattern or DAO pattern is used to separate
    *  low level data accessing API or operations from high level business services.
    */
public class JdbcDaoDemo {

	public static void main(String[] args) {
		RegistrationDao dao=new RegistrationDao();
		Registration r=dao.getInfo(101);
        System.out.println(r.name);
	}

}


class Registration
{
	int id;
	String name;
}

class RegistrationDao
{

	public Registration getInfo(int id) {
	Registration r1=new Registration();
	r1.id=id;
	try {
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		String url = "jdbc:mysql://localhost/demo";
		Connection conn = DriverManager.getConnection (url, "root", "root");
    	System.out.println("connection successfull");
    	Statement stmt=conn.createStatement();
    	String query="select first from registration where id="+id; 
    
    	ResultSet rs=stmt.executeQuery(query);
    	rs.next();
    	String first=rs.getString(1);
    	r1.name=first; 
    	return r1;
    	
	} catch (Exception e) {
		System.out.println(e);
	}
	
	return null;
	}
	
}