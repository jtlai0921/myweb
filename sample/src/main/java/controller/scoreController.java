package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class scoreController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public scoreController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int score=Integer.parseInt(request.getParameter("score"));
		
		if(score>=60)
		{
			response.sendRedirect("success.html");
		}
		else
		{
			response.sendRedirect("error.html");
		}
	}

}