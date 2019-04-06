<%@page contentType="text/html" import="java.sql.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
	
<head>
	<title>Login!</title>
		<meta charset="utf-8">
		<link href="css/style.css" rel='stylesheet' type='text/css' />
		
</head>
<body>
			<div class="login-form">
					<div class="head">
						<img src="images/mem2.jpg" alt=""/>
						
					</div>
				<form>
					<li>
						<input type="text" class="text" name="email" placeholder="Student(email)"  onfocus="this.value = '';"><a class=" icon user"></a>
					</li>
					<li>
						<input type="password" class="text" name="pass" placeholder="Password" onfocus="this.value = '';"><a  class=" icon lock"></a>
					</li>
					<div class="p-container">
					<input type="submit" name="b2" value="SIGN IN" >
					</form>
					</div>
					
				<form action="register.jsp">
			<input type="submit" name=b1" value="REGISTER!">
			</form>
			
				
			</div>

			<%
	if(request.getParameter("b2")!=null)
	{
	Connection con=null;
        	Statement st;
        	ResultSet rs;
                try{
            		Class.forName("com.mysql.jdbc.Driver");	
            		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/e-learning","root","");
            		st=con.createStatement();
                     
                  String m=request.getParameter("email");
                     String p =request.getParameter("pass");
                  
                   

                     String sql="select * from stur where Email='"+m+"' and Password='"+p+"' and Type='student';";
                                      rs=st.executeQuery(sql);
			if(rs.next())
                        {
                              
                            session.setAttribute("username",rs.getString(1));
                            session.setAttribute("id",rs.getString(3));
				response.sendRedirect("sd.jsp");
                       
                        }else {
                             %> 
<script type="text/javascript"> 
alert("Invalid Username or Password"); 
</script> 
<% }
                }
                catch(Exception e)
        	{
            		out.println(e.toString());
        	}
	}
        %>	

			</body>
</html>