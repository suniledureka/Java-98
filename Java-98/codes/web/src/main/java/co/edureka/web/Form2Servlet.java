package co.edureka.web;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/form2")
public class Form2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String s1 = request.getParameter("t1");
		String s2 = request.getParameter("t2");
		String s3 = request.getParameter("t3");
		
		HttpSession session = request.getSession();
		session.setAttribute("name", s1);
		session.setAttribute("age", s2);
		session.setAttribute("address", s3);
		
		/*
		Cookie c1 = new Cookie("name", s1);
		Cookie c2 = new Cookie("age", s2);
		Cookie c3 = new Cookie("address", s3);
		c1.setMaxAge(60*60*24*365);
		
		response.addCookie(c1);
		response.addCookie(c2);
		response.addCookie(c3);
		*/
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<body bgcolor=cyan>");
		out.println("<h2>"+session.getId()+"-"+session.isNew()+"</h2>");
		
		out.println("<form action=form3 method=get>");
		out.println("<h2>");	
		out.println("Years of Exp <input type=text name=t4 size=5><br><br>");
		out.println("Prog Languages Known <input type=text name=t5 size=35><br><br>");
		
		/* out.print("<input type=hidden name=t1 value=\""+s1+"\">"); */
		
		out.println("<input type=submit value=SUBMIT>");
		out.println("</form></body>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
