package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class startquiz_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta name=\"description\" content=\"Vali is a responsive and free admin theme built with Bootstrap 4, SASS and PUG.js. It's fully customizable and modular.\">\n");
      out.write("    <!-- Twitter meta-->\n");
      out.write("    <meta property=\"twitter:card\" content=\"summary_large_image\">\n");
      out.write("    <meta property=\"twitter:site\" content=\"@pratikborsadiya\">\n");
      out.write("    <meta property=\"twitter:creator\" content=\"@pratikborsadiya\">\n");
      out.write("    <!-- Open Graph Meta-->\n");
      out.write("    <meta property=\"og:type\" content=\"website\">\n");
      out.write("    <meta property=\"og:site_name\" content=\"Vali Admin\">\n");
      out.write("    <meta property=\"og:title\" content=\"Vali - Free Bootstrap 4 admin theme\">\n");
      out.write("    <meta property=\"og:url\" content=\"http://pratikborsadiya.in/blog/vali-admin\">\n");
      out.write("    <meta property=\"og:image\" content=\"http://pratikborsadiya.in/blog/vali-admin/hero-social.png\">\n");
      out.write("    <meta property=\"og:description\" content=\"Vali is a responsive and free admin theme built with Bootstrap 4, SASS and PUG.js. It's fully customizable and modular.\">\n");
      out.write("    <title>Student Dashboard</title>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <!-- Main CSS-->\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/main.css\">\n");
      out.write("    <!-- Font-icon css-->\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    <style>\n");
      out.write("        a:link {\n");
      out.write("            text-decoration:none;\n");
      out.write("        }\n");
      out.write("        a:hover {\n");
      out.write("            text-decoration:underline;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("    </style>\n");
      out.write("  </head>\n");
      out.write("  <body class=\"app sidebar-mini rtl\">\n");
      out.write("    <!-- Navbar-->\n");
      out.write("    <header class=\"app-header\"><a class=\"app-header__logo\" href=\"sd.jsp\">Student</a>\n");
      out.write("      <!-- Sidebar toggle button--><a class=\"app-sidebar__toggle\" href=\"#\" data-toggle=\"sidebar\" aria-label=\"Hide Sidebar\"></a>\n");
      out.write("      <!-- Navbar Right Menu-->\n");
      out.write("      <ul class=\"app-nav\">\n");
      out.write("        \n");
      out.write("       \n");
      out.write("        <!-- User Menu-->\n");
      out.write("          <a href=\"index.jsp\" class=\"btn btn-primary \">Logout</a> \n");
      out.write("      </ul>\n");
      out.write("    </header>\n");
      out.write("    <!-- Sidebar menu-->\n");
      out.write("    <div class=\"app-sidebar__overlay\" data-toggle=\"sidebar\"></div>\n");
      out.write("    <aside class=\"app-sidebar\">\n");
      out.write("      <div class=\"app-sidebar__user\"><img class=\"app-sidebar__user-avatar\" src=\"https://s3.amazonaws.com/uifaces/faces/twitter/jsa/48.jpg\" alt=\"User Image\">\n");
      out.write("        <div>\n");
      out.write("          <p class=\"app-sidebar__user-name\">");

	if(session.getAttribute("username")!=null)
	{
		String un1=(String)session.getAttribute("username");
		out.println(un1);
	}
        else{
		
      out.write("\n");
      out.write("                            <script type=\"text/javascript\"> \n");
      out.write("alert(\"Please Login First!\"); \n");
      out.write("</script> ");
		
        }

      out.write("</p>\n");
      out.write("          <p class=\"app-sidebar__user-designation\"></p>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <ul class=\"app-menu\">\n");
      out.write("        <li><a class=\"app-menu__item active\" href=\"#\"><i class=\"app-menu__icon fa fa-dashboard\"></i><span class=\"app-menu__label\">Dashboard</span></a></li>\n");
      out.write("        \n");
      out.write("          <ul class=\"treeview-menu\">\n");
      out.write("            <li><a class=\"treeview-item\" href=\"bootstrap-components.html\"><i class=\"icon fa fa-circle-o\"></i> Bootstrap Elements</a></li>\n");
      out.write("            <li><a class=\"treeview-item\" href=\"https://fontawesome.com/v4.7.0/icons/\" target=\"_blank\" rel=\"noopener\"><i class=\"icon fa fa-circle-o\"></i> Font Icons</a></li>\n");
      out.write("            <li><a class=\"treeview-item\" href=\"ui-cards.html\"><i class=\"icon fa fa-circle-o\"></i> Cards</a></li>\n");
      out.write("            <li><a class=\"treeview-item\" href=\"widgets.html\"><i class=\"icon fa fa-circle-o\"></i> Widgets</a></li>\n");
      out.write("          </ul>\n");
      out.write("                \n");
      out.write("      </ul>\n");
      out.write("    </aside>\n");
      out.write("    <main class=\"app-content\">\n");
      out.write("      <div class=\"app-title\">\n");
      out.write("        <div>\n");
      out.write("          <h1><i class=\"fa fa-dashboard\"></i> Dashboard</h1>\n");
      out.write("          <p>Your workspace to provide quality education </p>\n");
      out.write("        </div>\n");
      out.write("        <ul class=\"app-breadcrumb breadcrumb\">\n");
      out.write("          <li class=\"breadcrumb-item\"><i class=\"fa fa-home fa-lg\"></i></li>\n");
      out.write("          <li class=\"breadcrumb-item\"><a href=\"sd.jsp\">Dashboard</a></li>\n");
      out.write("        </ul>\n");
      out.write("          \n");
      out.write("                              \n");
      out.write("\t\t\t\t\n");
      out.write("      </div><table class=\"table table-bordered table-dark\">\n");
      out.write("          <tr><td><img src=\"C:/Users/utkarsh/Documents/NetBeansProjects/E-Learning/web/quizques/Computer Network/2.png\"></td></tr>\n");
      out.write("           ");

            out.println("<table class='table'>");
out.println("<tr>");
out.println("<td colspan='10' style='background-color:maroon; color:white;'>");
out.println("Quiz</td>");
out.println("</tr>");
out.println("<tr style='background-color:black;color:white'>");
out.println("<th>Question</th><th>Option</th>");


out.println("</tr>");

     
               
                Connection con=null;
		Statement st;
		ResultSet rs;
		try{
			Class.forName("com.mysql.jdbc.Driver");	
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/e-learning","root","");
			st=con.createStatement();
                        String m=(String)session.getAttribute("asub"),ss;
			String sql="select * from quiz where Subject='"+m+"';";
                        rs=st.executeQuery(sql);
                        int i=1;
			while(rs.next())
			{ss="C:/Users/utkarsh/Documents/NetBeansProjects/E-Learning/web/quizques/"+m+"/"+rs.getString(3)+".png";
                            
      out.write("<td>\n");
      out.write("                               <img src=\"C:/Users/utkarsh/Documents/NetBeansProjects/E-Learning/web/quizques/Computer Network/2.png\" height=\"80px\" width=\"80px\">\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\n");
      out.write("                            \n");
      out.write("                         %>\n");
      out.write("                         \n");
      out.write("                            ");

                              i++;
                              
                            }
                           
                        
                }
                catch(Exception e){
                    					System.out.println(e.toString());

                }
                        
      out.write("\n");
      out.write("           \n");
      out.write("      \n");
      out.write("     \n");
      out.write("         </main>\n");
      out.write("  </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
