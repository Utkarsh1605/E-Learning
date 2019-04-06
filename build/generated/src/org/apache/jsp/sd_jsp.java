package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sd_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

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
      out.write("  </head>\n");
      out.write("  <body class=\"app sidebar-mini rtl\">\n");
      out.write("    <!-- Navbar-->\n");
      out.write("    <header class=\"app-header\"><a class=\"app-header__logo\" href=\"#\">Home</a>\n");
      out.write("      <!-- Sidebar toggle button--><a class=\"app-sidebar__toggle\" href=\"#\" data-toggle=\"sidebar\" aria-label=\"Hide Sidebar\"></a>\n");
      out.write("      <!-- Navbar Right Menu-->\n");
      out.write("      <ul class=\"app-nav\">\n");
      out.write("        \n");
      out.write("\n");
      out.write("        \n");
      out.write("        <!-- User Menu-->\n");
      out.write("        <li class=\"dropdown\"><a class=\"app-nav__item\" href=\"#\" data-toggle=\"dropdown\" aria-label=\"Open Profile Menu\">Logout<i class=\"fa fa-user fa-lg\"></i></a>\n");
      out.write("          <ul class=\"dropdown-menu settings-menu dropdown-menu-right\">\n");
      out.write("            <li><a class=\"dropdown-item\" href=\"index.html\"><i class=\"fa fa-sign-out fa-lg\"></i>Confirm</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("    </header>\n");
      out.write("    <!-- Sidebar menu-->\n");
      out.write("    <div class=\"app-sidebar__overlay\" data-toggle=\"sidebar\"></div>\n");
      out.write("    <aside class=\"app-sidebar\">\n");
      out.write("      <div class=\"app-sidebar__user\"><img class=\"app-sidebar__user-avatar\" src=\"https://s3.amazonaws.com/uifaces/faces/twitter/jsa/48.jpg\" alt=\"User Image\">\n");
      out.write("        <div>\n");
      out.write("           \n");
      out.write("          <p class=\"app-sidebar__user-name\">John Doe</p>\n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <ul class=\"app-menu\">\n");
      out.write("        <li><a class=\"app-menu__item active\" href=\"#\"><i class=\"app-menu__icon fa fa-dashboard\"></i><span class=\"app-menu__label\">Dashboard</span></a></li>\n");
      out.write("      </ul>\n");
      out.write("    </aside>\n");
      out.write("    <main class=\"app-content\">\n");
      out.write("      \n");
      out.write("        \n");
      out.write("      </div>\n");
      out.write("      <div class=\"row\">\n");
      out.write("          <div class=\"col-md-8 col-lg-4\">\n");
      out.write("          <div class=\"widget-small primary coloured-icon\"><i class=\"icon fa fa-users fa-3x\"></i>\n");
      out.write("            <a href=\"\"><div class=\"info\">\n");
      out.write("              <h4>Give Quiz</h4>\n");
      out.write("              <p><b>26</b></p>\n");
      out.write("                </div></a>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-8 col-lg-4\">\n");
      out.write("          <div class=\"widget-small info coloured-icon\"><i class=\"icon fa fa-thumbs-o-up fa-3x\"></i>\n");
      out.write("            <div class=\"info\">\n");
      out.write("         \n");
      out.write("              \n");
      out.write("            </div></a>\n");
      out.write("          </div>\n");
      out.write("        </div></div>\n");
      out.write("          <div class=\"row\">\n");
      out.write("        <div class=\"col-md-8 col-lg-4\">\n");
      out.write("          <div class=\"widget-small warning coloured-icon\"><i class=\"icon fa fa-files-o fa-3x\"></i>\n");
      out.write("          <a href=\"\">  <div class=\"info\">\n");
      out.write("              <h4>Download Notes</h4>\n");
      out.write("              <p><b>20+</b></p>\n");
      out.write("            </div></a>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-8 col-lg-4\">\n");
      out.write("          <div class=\"widget-small danger coloured-icon\"><i class=\"icon fa fa-star fa-3x\"></i>\n");
      out.write("          <a href=\"\">   <div class=\"info\">\n");
      out.write("              <h4>View Answers</h4>\n");
      out.write("              <p><b></b></p>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div></div>\n");
      out.write("      \n");
      out.write("      \n");
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
