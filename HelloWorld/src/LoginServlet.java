import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

public class LoginServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpServletRequest request = (HttpServletRequest)req;
		String method = request.getMethod();
		
		System.out.println("Login Servelt Called");
		String resp = "";
		
		if(method.equals("POST")) {
			resp = "<button>Click Here This Was "
					+ "POST Request</button>";
		}
		else if(method.equals("GET")) {
			resp = "<button >This was Get Request </button>";
		}
		
		PrintWriter writer =  res.getWriter();
		writer.write(resp);
		writer.flush();
		writer.close();
		
	}
	
	

}
