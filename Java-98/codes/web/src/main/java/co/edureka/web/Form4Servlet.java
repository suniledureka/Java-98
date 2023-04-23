package co.edureka.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/form4")
public class Form4Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<body bgcolor=cyan>");		
		out.println("<h2>"+session.getId()+"-"+session.isNew()+"</h2>");
		
		out.println("<h2>");
		
		Enumeration<String> en = session.getAttributeNames();
		while(en.hasMoreElements()) {
			String name = en.nextElement();
			String value = session.getAttribute(name).toString();
			out.println(name+" = " + value+"<br>");
		}
		/*
		Cookie[] cookies = request.getCookies();
		for(Cookie ck : cookies) {
			String cname = ck.getName();
			String cvalue = ck.getValue();
			out.println(cname+" = " + cvalue+"<br>");
		}
		*/
		out.println("salary = " + request.getParameter("t6") + "<br>");		
		out.println("</body>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
