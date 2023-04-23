<%!
  String cname="edureka limited";

  public int add(int x, int y){
	  return x + y;
  }
%>
<h2>
<%
 out.println("company name = " + cname + "<br><br>");

 int x = 11, y=24;
 out.println(x + " + " + y + " = " + add(12, 34));
%>
</h2>