package Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection 
{

	public static Connection getConnection() throws SQLException, ClassNotFoundException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver"); 
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/adminaccess","root","Root@123");
		return c;
		
	}

}
