<%@page contentType="text/html" import="java.sql.*" pageEncoding="UTF-8" %> 
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta name="description" content="Vali is a responsive and free admin theme built with Bootstrap 4, SASS and PUG.js. It's fully customizable and modular.">
    <!-- Twitter meta-->
    <meta property="twitter:card" content="summary_large_image">
    <meta property="twitter:site" content="@pratikborsadiya">
    <meta property="twitter:creator" content="@pratikborsadiya">
    <!-- Open Graph Meta-->
    <meta property="og:type" content="website">
    <meta property="og:site_name" content="Vali Admin">
    <meta property="og:title" content="Vali - Free Bootstrap 4 admin theme">
    <meta property="og:url" content="http://pratikborsadiya.in/blog/vali-admin">
    <meta property="og:image" content="http://pratikborsadiya.in/blog/vali-admin/hero-social.png">
    <meta property="og:description" content="Vali is a responsive and free admin theme built with Bootstrap 4, SASS and PUG.js. It's fully customizable and modular.">
    <title>Teacher Dashboard</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Main CSS-->
    <link rel="stylesheet" type="text/css" href="css/main.css">
    <!-- Font-icon css-->
    <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <style>
        a:link {
            text-decoration:none;
        }
        a:hover {
            text-decoration:underline;
        }
        
    </style>
  </head>
  <body class="app sidebar-mini rtl">
    <!-- Navbar-->
    <header class="app-header"><a class="app-header__logo" href="td.jsp">Student</a>
      <!-- Sidebar toggle button--><a class="app-sidebar__toggle" href="td.jsp" data-toggle="sidebar" aria-label="Hide Sidebar"></a>
      <!-- Navbar Right Menu-->
      <ul class="app-nav">
        
       
        <!-- User Menu-->
          <a href="index.jsp" class="btn btn-primary ">Logout</a> 
      </ul>
    </header>
    <!-- Sidebar menu-->
    <div class="app-sidebar__overlay" data-toggle="sidebar"></div>
    <aside class="app-sidebar">
      <div class="app-sidebar__user"><img class="app-sidebar__user-avatar" src="https://s3.amazonaws.com/uifaces/faces/twitter/jsa/48.jpg" alt="User Image">
        <div>
          <p class="app-sidebar__user-name"><%
 if(session.getAttribute("usernamet")!=null)
 {
  String un1=(String)session.getAttribute("usernamet");
  out.println(un1);
 }
        else{
  %>
                            <script type="text/javascript"> 
alert("Please Login First!"); 
</script> <%  
        }
%></p>
          <p class="app-sidebar__user-designation"></p>
        </div>
      </div>
      <ul class="app-menu">
        <li><a class="app-menu__item active" href="td.jsp"><i class="app-menu__icon fa fa-dashboard"></i><span class="app-menu__label">Dashboard</span></a></li>
        
          <ul class="treeview-menu">
            <li><a class="treeview-item" href="bootstrap-components.html"><i class="icon fa fa-circle-o"></i> Bootstrap Elements</a></li>
            <li><a class="treeview-item" href="https://fontawesome.com/v4.7.0/icons/" target="_blank" rel="noopener"><i class="icon fa fa-circle-o"></i> Font Icons</a></li>
            <li><a class="treeview-item" href="ui-cards.html"><i class="icon fa fa-circle-o"></i> Cards</a></li>
            <li><a class="treeview-item" href="widgets.html"><i class="icon fa fa-circle-o"></i> Widgets</a></li>
          </ul>
                
      </ul>
    </aside>
    <main class="app-content">
      <div class="app-title">
        <div>
          <h1><i class="fa fa-dashboard"></i> Dashboard</h1>
          <p>Your workspace to provide quality education </p>
        </div>
        <ul class="app-breadcrumb breadcrumb">
          <li class="breadcrumb-item"><i class="fa fa-home fa-lg"></i></li>
          <li class="breadcrumb-item"><a href="td.jsp">Dashboard</a></li>
        </ul>
      </div>
      
           
      </div>
      <form>
           <h2> Reply to</h2><br>
           <input type="text" name="id" placeholder="Id"><br><br>
           <textarea rows="4" cols="50" name="comment" form="usrform"placeholder="Enter your answer here...">
</textarea><br><br>
    
           <input type="submit" name="b2" class="btn-primary" value="Submit" >
        </form>
     
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
                     
                  String m=request.getParameter("id");
                  String v=request.getParameter("comment");
                  String n=(String)session.getAttribute("idt");
                   String sql="insert into stuans values('"+m+"','"+v+"','"+n+"');";
                        
                       int res=st.executeUpdate(sql);
			if(res!=0)
                        {
                           
                            response.sendRedirect("td.jsp");
                        }
				
                        else{
                        %> 
<script type="text/javascript"> 
alert("Sorry Try Again!"); 
</script> 
<% }
		

        
                } 
                        
                
                catch(Exception e)
         {
              out.println(e.toString());
         }
 }
        %> 
         </main>
  </body>
</html>