<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inside Faculty</title>
       
       <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css">
	
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.1.0/css/all.css">
    
    </head>
    <body>
 <%--   <nav>
                    <a href="adminwelcome.jsp" class="btn btn-primary">Home</a>
            <a href="admin123456.jsp" class="btn btn-primary ">Logout</a>
 
        </nav> --%>
    <center>
    <div class="container" >
      <div class="jumbotron" style="margin-top: 5%">
        <center><%
	if(session.getAttribute("username")!=null)
	{
		String un=(String)session.getAttribute("username");
		out.println("<h3>Welcome Admin "+un+" !</h3>");
	}
        else{
		response.sendRedirect("admin.jsp");		
        }
%></center>
<br>
         <button class="btn btn-primary" style="vertical-align:middle" onclick="window.location ='vq.jsp'"><span>View Queries  <i class="fas fa-list"></i></span></button>
        
         <br><br>
  <button class="btn btn-primary" style="vertical-align:middle" onclick="window.location = 'test.jsp'"><span>Search <i class="fas fa-search"></i>/Edit <i class="fas fa-user-edit"></i>/Delete <i class="fas fa-trash"></i></span></button>
  <br>
  <br>
              <a href="admin.jsp" class="btn btn-primary ">Logout</a>

  <br>
      </div></div>
  </center>
    </body>
</html>