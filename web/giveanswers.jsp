<%@page contentType="text/html" import="java.sql.*" pageEncoding="UTF-8"%>
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
    <header class="app-header"><a class="app-header__logo" href="td.jsp">Teacher</a>
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
           <h2>Choose Subject </h2> 
        <select name="sub">
            <option value="">Choose Subject</option>
    <option value="Engineering Mathematics">Engineering Mathematics</option>
    <option value="Engineering Physics">Engineering Physics/option>
    <option value="Chemistry">Chemistry</option>
  <option value="Fundamentals of Computer Programming">Fundamentals of Computer Programming</option>
  <option value="Electrical Engineering">Electrical Engineering</option>
  <option value="Basic Mechanical Engineering">Basic Mechanical Engineering</option>
  <option value="Problem Solving Using Computers">Problem Solving Using Computers</option>
  <option value="Applied Mechanics">Applied Mechanics</option>
  <option value="Electronics Engineering">Electronics Engineering</option>
  <option value="Ethics and Values">Ethics and Values</option>
  <option value="Data Structure And Algorithms">Data Structure And Algorithms</option>
  <option value="DataBase Managment System">DataBase Managment System</option>
  <option value="Computer Organization">Computer Organization</option>
  <option value="English">English</option>
  <option value="Industrial Economics">Industrial Economics</option>
  <option value="Environmental Studies">Environmental Studies</option>
  <option value="Operating Systems">Operating Systems</option>
  <option value="Computer Network">Computer Network</option>
  <option value="Discrete Mathematics">Discrete Mathematics</option>
  <option value="Introduction to microprocessors">Introduction to microprocessors</option>
  <option value="Object Oriented Programming">Object Oriented Programming</option>
  <option value="Design and Analysis of Algorithms">Design and Analysis of Algorithms</option>
  <option value="Software Engineering">Software Engineering</option>
  <option value="Web Technology">Web Technology</option>
  <option value="Theory of Automata and Formal Languages">Theory of Automata and Formal Languages</option>
  <option value="Python Programming">Python Programming</option>
  <option value="Soft Skills">Soft Skills</option>
  <option value="Compiler Design">Compiler Design </option>
  <option value="Optimization Techniques">Optimization Techniques</option>
  <option value="Sost Computing">Soft Computing</option>
  <option value="Big Data And Analytics">Big Data And Analytics</option>
  <option value="Digital Image Processing">Digital Image Processing</option>
  <option value="Advanced Computer Architecture">Advanced Computer Architecture</option>
  <option value="Mobile Computing">Mobile Computing</option>
  <option value="Advanced Computer Networks">Advanced Computer Networks</option>
  <option value="Data Mining & Warehousing">Data Mining & Warehousing</option>
  <option value="Service Oriented Architecture">Service Oriented Architecture</option>
  <option value="Embedded Systems">Embedded Systems</option>
  <option value="Information Retrieval Systems">Information Retrieval Systems </option>
  <option value="Business Intelligence ">Business Intelligence</option>
  <option value="Distributed Systems">Distributed Systems</option>
  <option value="Cryptography & Network Security">Cryptography & Network Security </option>
  <option value="Agile Software Development">Agile Software Development</option>
  <option value="Cloud Computing">Cloud Computing</option>
  <option value="Natural Language Processing">Natural Language Processing</option>
  <option value="Cyber Security">Cyber Security</option>
  <option value="Distributed & Parallel Database">Distributed & Parallel Database</option>
</select>
           <input type="submit" name="b2" class="btn-primary" value="Check" >
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
                     
                  String m=request.getParameter("sub");%>
        <table class="table table-bordered table-dark"><%
            out.println("<table class='table'>");
    out.println("<tr>");
out.println("<td colspan='10' style='background-color:maroon; color:white;'>");
out.println("Records</td>");
out.println("</tr>");
out.println("<tr style='background-color:black;color:white'>");
 out.println("<th>ID</th><th>Question</th><th>Answer</th>");


out.println("</tr>");
String sql="select * from questions where Subject='"+m+"';";
                        rs=st.executeQuery(sql);
                        while(rs.next())
                        {
                            %>
                        <tr>
			<td>
                              <%  out.println(rs.getString(1));%>
				</td>	
                                <td>
                                <%  out.println(rs.getString(3));%>
				</td>	
                                
                                <td><a href="reply.jsp"><button class="btn-secondary" >Reply</button></a>
                                </td>
                        
			  </tr>
                               <% }
                                 
                        out.println("</table>");

		
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