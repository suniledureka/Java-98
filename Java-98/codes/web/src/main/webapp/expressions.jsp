<%!
  String cname="edureka limited";

  public int add(int x, int y){
	  return x + y;
  }
%>
<h2>
company name = <%=cname %>
<br><br>

<%="sum = " + add(12,32) %>

</h2>