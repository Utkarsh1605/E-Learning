<%@page contentType="text/html" import="java.sql.* , java.util.*;" pageEncoding="UTF-8"%>
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
    <title>Student Dashboard</title>
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
    <header class="app-header"><a class="app-header__logo" href="sd.jsp">Student</a>
      <!-- Sidebar toggle button--><a class="app-sidebar__toggle" href="#" data-toggle="sidebar" aria-label="Hide Sidebar"></a>
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
	if(session.getAttribute("username")!=null)
	{
		String un1=(String)session.getAttribute("username");
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
        <li><a class="app-menu__item active" href="#"><i class="app-menu__icon fa fa-dashboard"></i><span class="app-menu__label">Dashboard</span></a></li>
        
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
          <li class="breadcrumb-item"><a href="sd.jsp">Dashboard</a></li>
        </ul>
          
                              
				
      </div>
         <form method="post" action="result.jsp">

           <%
                Connection con=null;
		Statement st;
		ResultSet rs;
		try{
			Class.forName("com.mysql.jdbc.Driver");	
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/e-learning","root","");
			st=con.createStatement();
                        String m=(String)session.getAttribute("aasub");
			String sql="select * from quiz where Subject='"+m+"';";
                        rs=st.executeQuery(sql);
                       int i=1,d=1,c=0;
                       Random rand=new Random();
                       int a=rand.nextInt(10);
                       a=a+1;
                       while(rs.next()&& d<a)
                       {d++;}
while(rs.next() && c<10){c++;
%>
<table border="1" width="500px"  cellspacing="0" cellpadding="0">
<tr>
<td width="100%">
<b>Select Correct Answer</b>
<table border="0" width="500px" cellspacing="2" cellpadding="4">
<tr>
<td width="50%"> Question: <img src="quizques/Computer Network/<%=rs.getString(3)%>" ></td>

<tr>
<td>

1: <input type="radio" name="radio<%=i%>" value= "a" /><b> a </b></td></tr> 
<tr>
<td>
2: <input type="radio" name="radio<%=i%>" value="b" /><b> b </b></td></tr>

<tr>
<td>
3: <input type="radio" name="radio<%=i%>" value="c" /><b> c </b> </td></tr>

<tr>
<td>
4: <input type="radio" name="radio<%=i%>" value="d" /> 
<b> d </b> </td></tr>

</table>

<%
i++;
}
%>
<tr><td><center><input type="submit" value="submit"></center></td></tr>
</table>
</form>
<%
                }
                catch(Exception e){
                    					System.out.println(e.toString());

                }
                        %>
           
      </table>
     
         </main>
  </body>
</html>