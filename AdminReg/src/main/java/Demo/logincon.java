package Demo;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class logincon
 */
@WebServlet("/logincon")
public class logincon extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
			String name = request.getParameter("name");
	        String pwd = request.getParameter("pwd");
		 
//		    request.getSession().invalidate();
//		    
//		    HttpSession session=request.getSession(true);
//		    session.setMaxInactiveInterval(300);
		    
	        jdbc j=new jdbc();
		    try 
		    {
				boolean rs=jdbc.validate(name, pwd);
				
			if(rs==true)
		     {
		           response.sendRedirect("AdminHome.jsp");
	            }
		    	else 
		    	{
		    		response.sendRedirect("AdminLogin.jsp");
		    	}
		     }
		    catch (ClassNotFoundException | SQLException e) 
		    {
				e.printStackTrace();
			}
		}
	}


