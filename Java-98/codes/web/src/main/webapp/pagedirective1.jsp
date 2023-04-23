<%@page import="java.util.Date" info="Java Server Pages" language="java" %>
<h2 style="text-align:center; color:blue">
<%!
  Date today;
%>
<%
 today = new Date();
 out.println(today + "<br><br>");
 out.println(getServletInfo());
%>
</h2>