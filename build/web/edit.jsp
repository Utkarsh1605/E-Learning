<%@page contentType="text/html"import="java.sql.*" pageEncoding="UTF-8"%>
<%@ page import="java.io.*" %> 
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html>
    <head>
     
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit</title>
    </head>
    <body>
   
<form method="post" action="update.jsp">
<table class="table">
<%
if(session.getAttribute("username")==null){
            		response.sendRedirect("admin.jsp");		

        }
        else{
    out.println("<table class='table'>");
out.println("<tr>");
out.println("<td colspan='13' style='background-color:maroon; color:white;'>");
out.println("Record</td>");
out.println("</tr>");
out.println("<tr style='background-color:black;color:white'>");
out.println("<th>First name</th><th>Last Name</th><th>ID</th><th>Password</th><th>Email</th><th>Type</th>");


out.println("</tr>");
%>
<%
String id=request.getParameter("id");

int sumcount=0;
try {
Class.forName("com.mysql.jdbc.Driver").newInstance();
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/e-learning", "root", "");
String query = "select * from stur where ID='"+id+"'";
Statement st = conn.createStatement();
ResultSet rs = st.executeQuery(query);
while(rs.next()){

%>

<tr>    

<td><input type="text" name="fname" value="<%=rs.getString(1)%>"></td>
<td><input type="text" name="lname" value="<%=rs.getString(2)%>"></td>     
<td><input type="text" name="id" value="<%=rs.getString(3)%>"></td>
<td><input type="pass" name="pass" value="<%=rs.getString(4)%>"></td>
<td><input type="email" name="email" value="<%=rs.getString(5)%>"></td>
<td><input type="type" name="type" value="<%=rs.getString(6)%>"></td>
</tr>
<tr>
<td><input type="submit" name="Submit" value="Update" style="background-color:#49743D;font-weight:bold;color:#ffffff;"></td>
</tr>
<%
}
}
catch(Exception e){}}
%>
</table>
</form>
    </body>
</html>