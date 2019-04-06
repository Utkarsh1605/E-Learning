<%@page contentType="text/html" import="java.sql.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
      <!--Import Google Icon Font-->
      <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
      <!--Import materialize.css-->
      <link type="text/css" rel="stylesheet" href="css/materialize.min.css"  media="screen,projection"/>

      <!--Let browser know website is optimized for mobile-->
      <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    </head>

    <body>
      <!--Import jQuery before materialize.js-->
      <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
      <script type="text/javascript" src="js/materialize.min.js"></script>






<div class="row">
    <form class="col s5">
      <div class="row">
        <div class="input-field col s6">
          <input name="fname" placeholder="First Name" type="text" class="validate">
          
        </div>
        <div class="input-field col s6">
          <input name="lname"placeholder="Last Name" type="text" >
          
        </div>
      </div>
        <div class="row">
        <div class="input-field col s6">
          <input name="id" placeholder="College ID" type="text" class="validate">
          <label></label></div></div>
      <div class="row">
        <div class="input-field col s12">
          <input name="pass"placeholder="Password" type="password" >
          
        </div>
      </div>
      <div class="row">
        <div class="input-field col s12">
          <input name="email" type="email" placeholder="Email">
         
        </div>
      </div>
	  <button class="btn waves-effect waves-light" name="b1" type="submit">Submit</button>
    </form>
  </div>
   <%
      if(request.getParameter("b1")!=null)
	{
	Connection con=null;
        	Statement st;
        	ResultSet rs;
                try{
            		Class.forName("com.mysql.jdbc.Driver");	
            		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/e-learning","root","");
            		st=con.createStatement();
                       
		  String fn=request.getParameter("id");
                  String sql1="select * from stur where ID='"+fn+"' ";
                                      rs=st.executeQuery(sql1);
			if(rs.next())
                        {
                            %>
                            <script type="text/javascript"> 
alert("User Already Exists!"); 
</script> <%
                        }
                        else
                        {
                  String f =request.getParameter("fname");
                  String l =request.getParameter("lname");
                  String m=request.getParameter("email");
                  String p =request.getParameter("pass");
                  String sql="insert into stur values('"+f+"','"+l+"','"+fn+"','"+p+"','"+m+"','"+"student"+"');";
                        
                  
                  
                     
                                   int res=st.executeUpdate(sql);
			if(res!=0)
                        {
                           
                            response.sendRedirect("login.jsp");
                        }
				
                        else{
                        %> 
<script type="text/javascript"> 
alert("Sorry Try Again!"); 
</script> 
<% }
		
                }}
                catch(Exception e)
        	{
            		out.println(e.toString());
        	}
	}
        %>	

  </body>
  </html>