package co.edureka.web;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		out.println("<html>");
		out.println("<head><title>edureka</title></head>");
		out.println("<body style=\"text-align:center;background-color:lightgreen\">");
		out.println("<h1>edureka limited</h1>");
		out.println("<img src=images/edureka.png width=300px><hr>");
		out.println("<p style=\"text-align:left;font-size:20px\">Hello "+ request.getParameter("txt_uid") + "</p>");
		out.println("</body>");
		out.println("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
