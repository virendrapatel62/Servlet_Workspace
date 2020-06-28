package perameters;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		resp.getWriter().write("Login Servlet " + email + " -- " + 										password);
		
		
		
		
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
			
		HttpSession httpSession = req.getSession();
		httpSession.invalidate();
		
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		resp.getWriter().write("Login Servlet From POST  " + email + " -- " + 										password);
		
	}
}
