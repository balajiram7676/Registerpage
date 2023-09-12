package com.user;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Demo.connection;

public class EmployeeQuery 
{

	
	public static int Userinsert(String UserId, String name,String password, String Emailid) throws SQLException, ClassNotFoundException
    {
        
        Connection c = connection.getConnection();
        Statement s = c.createStatement();
    
        int r = s.executeUpdate("insert into Employee values('"+UserId+"','"+name+"','"+password+"','"+Emailid+"');");
        return r;
 
    }
	
	public static boolean Uservalidate(String name,String pwd) throws SQLException, ClassNotFoundException
    {
        boolean rs=false;
        Connection c = connection.getConnection();
        Statement s = c.createStatement();
    
        ResultSet r = s.executeQuery("select * from Employee where name='"+name+"' and  password='"+pwd+"';");
        rs=r.next();
        return rs;

    }
	
	
	
	
	
}
