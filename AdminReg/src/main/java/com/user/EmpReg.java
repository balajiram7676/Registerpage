package com.user;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Demo.jdbc;

/**
 * Servlet implementation class EmpReg
 */

@WebServlet("/EmpReg")
public class EmpReg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpReg() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


       String UserId = request.getParameter("id");
		
		String name = request.getParameter("name");

		String Emailid = request.getParameter("email");
		
		String password = request.getParameter("pwd");

		EmployeeQuery q= new EmployeeQuery();
		int count=0;
		try 
		{
			count = q.Userinsert(UserId,name,password,Emailid);
			if(count>0)

			  {

			   response.sendRedirect("EmpLogin.jsp");

			  }
			
			else
				
			  {

			   response.sendRedirect("EmpReg.jsp");

			  }
		
		} 
		catch (ClassNotFoundException e) 
		{
			
			e.printStackTrace();
		} 
		
		catch (SQLException e) 
		{
			
			e.printStackTrace();
		}

		
		
		}

		
		
		
		
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


	}

}
