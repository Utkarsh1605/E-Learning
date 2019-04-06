<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page language="java"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
<%
	if(session.getAttribute("username")==null){
            		response.sendRedirect("admin123456.jsp");		

        }
        else{      
    String f=request.getParameter("fname");

String ln=request.getParameter("lname");
String id=request.getParameter("id");
String pass=request.getParameter("pass");
String em=request.getParameter("email");
String ty=request.getParameter("type");
try{
Connection conn = null;
Class.forName("com.mysql.jdbc.Driver").newInstance();
conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/e-learning","root", "");
Statement st;
st=conn.createStatement();
st.executeUpdate("update stur set FirstName='"+f+"',LastName='"+ln+"',ID='"+id+"',Password='"+pass+"',Email='"+em+"',Type='"+ty+"' where id='"+id+"';");
response.sendRedirect("adminwelcome.jsp");
}
catch(Exception e){
out.println(e);
}}
%>