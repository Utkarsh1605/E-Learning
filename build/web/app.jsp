<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
      
          <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" >
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.1.0/css/all.css" >
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        


</head>
<body>
    
<br><br>
<form method="post" name="form">
<table border="1">
<%
out.println("<table class='table'>");
out.println("<tr>");
out.println("<td colspan='13' style='background-color:maroon; color:white;'>");
out.println("Record</td>");
out.println("</tr>");
out.println("<tr style='background-color:black;color:white'>");
out.println("<th>First name</th><th>Last Name</th><th>ID</th><th>Password</th><th>Email</th><th>Type</th><th>Edit</th><th>Delete</th");


out.println("</tr>");
Connection con=null;
		Statement st;
		ResultSet rs;
		try{
			Class.forName("com.mysql.jdbc.Driver");	
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/e-learning","root","");
			st=con.createStatement();	
			String n=request.getParameter("name");
			String na="'"+n+"%'";
			rs=st.executeQuery("select * from stur where ID like "+na);
			while(rs.next())
			{
%>


<tr><td><%=rs.getString(1)%></td>
    <td><%=rs.getString(2)%></td>

<td><%=rs.getString(3)%></td>
<td><%=rs.getString(4)%></td>
<td><%=rs.getString(5)%></td>
<td><%=rs.getString(6)%></td>



<td><a href="edit.jsp?id=<%=rs.getString(3)%>" name="edit" class="btn btn-primary" ><i class="fas fa-user-edit"></i></a></td>
<td><a href="delete.jsp?id=<%=rs.getString(3)%>" name="edit" class="btn btn-primary" ><i class="fas fa-trash"></i></a></td>

</tr>
<%
}
%>
<%
}
catch(Exception e){
e.printStackTrace();
}
%>
</table>
</form>
</body>
    
   
</html>
<%
	if(session.getAttribute("username")==null){
            		response.sendRedirect("admin123456.jsp");		

        }
        %>