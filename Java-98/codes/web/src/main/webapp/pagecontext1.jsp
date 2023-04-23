<h2>
<%
 String uname = request.getParameter("txt_uid");
 pageContext.setAttribute("name", uname, PageContext.SESSION_SCOPE);
 out.println("Welcome "+ uname);
%>
</h2>
<a href="pagecontext2.jsp">Next Page</a>