<h2>
<%
 //String uname = request.getParameter("txt_uid");
 String uname = pageContext.getAttribute("name", PageContext.SESSION_SCOPE).toString();
 out.println("Welcome "+ uname);
%>
</h2>