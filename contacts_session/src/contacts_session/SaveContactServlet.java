package contacts_session;



import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SaveContactServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String number = req.getParameter("mobile");
		HttpSession session = req.getSession();
		
		HashMap<String, String> contacts = 
					(HashMap<String, String>)session
				.getAttribute("contacts");
		
		if(contacts==null) {
			contacts = new HashMap();	
		}
		
		
		contacts.put(name, number);
		
		
		session.setAttribute("contacts", contacts);
		
		req.getRequestDispatcher("index.jsp").forward(req, resp);
		
	}
}
