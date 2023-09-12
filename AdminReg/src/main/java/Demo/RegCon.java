package Demo;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RegCon")
public class RegCon extends HttpServlet 
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String UserId = request.getParameter("UserId");
		
		String name = request.getParameter("name");

		String Emailid = request.getParameter("email");
		
		String password = request.getParameter("pwd");

		jdbc jc = new jdbc();
		int count=0;
		try 
		{
			count = jdbc.insert(UserId,name,Emailid,password);
		} 
		catch (ClassNotFoundException e) 
		{
			
			e.printStackTrace();
		} 
		
		catch (SQLException e) 
		{
			
			e.printStackTrace();
		}

		if(count>0)

		  {

		   response.sendRedirect("AdminLogin.jsp");

		  }

		else

		  {

		   response.sendRedirect("./AdminReg.jsp");

		  }
	
		}

}
