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
        <title>Update</title>
    </head>
    <body>
   
<%
    if(session.getAttribute("username")==null){
            		response.sendRedirect("admin.jsp");		

        }
else{

        String id=request.getParameter("id");

int sumcount=0;
try {
Class.forName("com.mysql.jdbc.Driver").newInstance();
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/e-learning", "root", "");
String query = "delete from stur where id='"+id+"';";
Statement st = conn.createStatement();
int  res = st.executeUpdate(query);
if(res!=0){
     %> 
<script type="text/javascript"> 
alert("Record Deleted"); 
</script> 
<%response.sendRedirect("adminwelcome.jsp");
}
else{
    out.println("Record Not Deleted");
}
}
catch(Exception e){}
    }
%> </body>
</html>