package com.user;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Demo.jdbc;

/**
 * Servlet implementation class EmpLoginServ
 */

@WebServlet("/EmpLogSer")
public class EmpLoginServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpLoginServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		
		
		String name = request.getParameter("name");
        String pwd = request.getParameter("pwd");
	    
        EmployeeQuery q= new EmployeeQuery();
	    try 
	    {
			boolean rs=q.Uservalidate(name, pwd);
			
		if(rs==true)
	     {
	           response.sendRedirect("EmpHome.jsp");
            }
	    	else 
	    	{
	    		response.sendRedirect("EmpLogin.jsp");
	    	}
	     }
	    catch (ClassNotFoundException | SQLException e) 
	    {
			e.printStackTrace();
		}
	}

	

}
