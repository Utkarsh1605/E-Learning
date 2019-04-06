<%@page contentType="text/html"import="java.sql.*" pageEncoding="UTF-8"%>
<%@ page import="java.io.*" %> 

<!DOCTYPE html>
<html>
    <head>
         
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View</title>
    </head>
    <body>
   
<%
    if(session.getAttribute("username")==null){
            		response.sendRedirect("admin.jsp");		

        }
else{%>
<table class="table table-bordered table-dark"><%
            out.println("<table class='table'>");
    out.println("<tr>");
out.println("<td colspan='10' style='background-color:maroon; color:white;'>");
out.println("Records</td>");
out.println("</tr>");
out.println("<tr style='background-color:black;color:white'>");
 out.println("<th>Name</th><th>Email</th><th>Subject</th><th>Message</th>");


out.println("</tr>");
        
try {
    Connection con=null;
        	Statement st;
        	ResultSet rs;
Class.forName("com.mysql.jdbc.Driver").newInstance();
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/e-learning", "root", "");
st=con.createStatement();
 String m=request.getParameter("email");
                     String p =request.getParameter("pass");
                  
                   

                     String sql="select * from queries ;";
                                      rs=st.executeQuery(sql);
                        while(rs.next())
                        { 

 {%>
                       <tr>
			<td>
                              <%  out.println(rs.getString(1));%>
				</td>	
                                <td>
                                <%  out.println(rs.getString(2));%>
				</td>
                        <td>
                                <%  out.println(rs.getString(3));%>
				</td>
                                <td>
                                <%  out.println(rs.getString(4));%>
				</td>
			  </tr>
                        
                             %> 
        </table>
<% 
                        }}
}
catch(Exception e){}
    }
%> </body>
</html>