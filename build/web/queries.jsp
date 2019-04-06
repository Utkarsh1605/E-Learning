<%@page contentType="text/html" import="java.sql.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
	
<head>
	<title>Login!</title>
		<meta charset="utf-8">
		
		
</head>
    <body>
			

			
	<table class="table table-bordered table-dark"><%
            out.println("<table class='table'>");
    out.println("<tr>");
out.println("<td colspan='10' style='background-color:maroon; color:white;'>");
out.println("Records</td>");
out.println("</tr>");
out.println("<tr style='background-color:black;color:white'>");
 out.println("<th>Name</th><th>Email</th><th>Subject</th><th>Message</th>");


out.println("</tr>");
	Connection con=null;
        	Statement st;
        	ResultSet rs;
                try{
                    
            		Class.forName("com.mysql.jdbc.Driver");	
            		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/e-learning","root","");
            		st=con.createStatement();
                     
                  String m=request.getParameter("email");
                     String p =request.getParameter("pass");
                  
                   

                     String sql="select * from queries ;";
                                      rs=st.executeQuery(sql);
			while(rs.next())
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

<% 
                        }}
                catch(Exception e)
        	{
            		out.println(e.toString());
        	}
	}
        %>	

			</body>
</html>