import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FakeDataServlet  extends HttpServlet{
	
	static{
		System.out.println("1. Loading Class.....");
	}
	
	{
		System.out.println("2. Creating Object .. ");
	}
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("3. Inti Method Zero Perameter");
	}
	
	
	
	@Override
	protected void doGet(HttpServletRequest req, 
			HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("6. Do Get Method...");
		
		
		PrintWriter writer = resp.getWriter();
		Random random = new Random();
	
		resp.setContentType("text/html");
		
		writer.write("<ol>");
		
		for(int i = 0 ; i < 200 ; i++) {
			
			String cardNumber = (random.nextDouble() + "").substring(2, 6)  + "-" +
					(random.nextDouble() + "").substring(2, 6) +"-" +
					(random.nextDouble() + "").substring(2, 6) +"-" +
					(random.nextDouble() + "").substring(2, 6);
			writer.write("<li>" +cardNumber + "</li>");
		}
		
		writer.write("</ ol>");
		
		writer.flush();
		writer.close();
	}
	
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("7  Last : Destroy");
	}
	
	
}
