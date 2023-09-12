package Demo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc 
{

	public static int insert(String UserId, String name, String Emailid,String password) throws SQLException, ClassNotFoundException
    {
        
        Connection c = connection.getConnection();
        Statement s = c.createStatement();
    
        int r = s.executeUpdate("insert into admin values('"+UserId+"','"+name+"','"+Emailid+"','"+password+"');");
        return r;
 
    }
	public static boolean validate(String name,String pwd) throws SQLException, ClassNotFoundException
    {
        boolean rs=false;
        Connection c = connection.getConnection();
        Statement s = c.createStatement();
    
        ResultSet r = s.executeQuery("select * from admin where name='"+name+"' and  password='"+pwd+"';");
        rs=r.next();
        return rs;

    }
	

	
	
	
	
 }