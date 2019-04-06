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
    String n=request.getParameter("name");
    String em=request.getParameter("email");
    String sub=request.getParameter("subject");
    String id=request.getParameter("mssg");
    
 if(request.getParameter("b1")!=null)
	{
	Connection con=null;
        	Statement st;
        	ResultSet rs;
                try{
            		Class.forName("com.mysql.jdbc.Driver");	
            		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/e-learning","root","");
            		st=con.createStatement();
String sql="insert into queries values('"+n+"','"+em+"','"+sub+"','"+id+"');";
                        
                  
                  
                     
                                   int res=st.executeUpdate(sql);
			if(res!=0)
                        {


    out.println("Done");
    response.sendRedirect("index.jsp");
}
else{
    out.println("Try Again Latter");
}
}
catch(Exception e){}
    }
%> </body>
</html>