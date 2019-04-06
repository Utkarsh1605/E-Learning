package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminwelcome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write(" ");

   response.addHeader("Cache-Control", "no-cache,no-store,private,must-revalidate,max-stale=0,post-check=0,pre-check=0"); 
   response.addHeader("Pragma", "no-cache"); 
   response.addDateHeader ("Expires", 0);
 
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Inside Faculty</title>\n");
      out.write("       \n");
      out.write("       <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\">\n");
      out.write("\t\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.1.0/css/all.css\">\n");
      out.write("    \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write(" ");
      out.write("\n");
      out.write("    <center>\n");
      out.write("    <div class=\"container\" >\n");
      out.write("      <div class=\"jumbotron\" style=\"margin-top: 5%\">\n");
      out.write("        <center>");

	if(session.getAttribute("username")!=null)
	{
		String un=(String)session.getAttribute("username");
		out.println("<h3>Welcome Admin "+un+" !</h3>");
	}
        else{
		response.sendRedirect("admin.jsp");		
        }

      out.write("</center>\n");
      out.write("<br>\n");
      out.write("         <button class=\"btn btn-primary\" style=\"vertical-align:middle\" onclick=\"window.location =\"><span>View Queries  <i class=\"fas fa-list\"></i></span></button>\n");
      out.write("        \n");
      out.write("         <br><br>\n");
      out.write("  <button class=\"btn btn-primary\" style=\"vertical-align:middle\" onclick=\"window.location = 'test.jsp'\"><span>Search <i class=\"fas fa-search\"></i>/Edit <i class=\"fas fa-user-edit\"></i>/Delete <i class=\"fas fa-trash\"></i></span></button>\n");
      out.write("  <br>\n");
      out.write("  <br>\n");
      out.write("   <button class=\"btn btn-primary\" style=\"vertical-align:middle\" onclick=\"window.location = 'addfaculty.jsp'\"><span>Add Faculty <i class=\"fas fa-user-plus\"></i></</span></button>\n");
      out.write("  \n");
      out.write("  <br>\n");
      out.write("  <br>\n");
      out.write("  <button class=\"btn btn-primary\" style=\"vertical-align:middle\" onclick=\"window.location = 'home.jsp'\"><span> Home <i class=\"fas fa-user-plus\"></i></</span></button>\n");
      out.write("  <br><br>\n");
      out.write("              <a href=\"admin.jsp\" class=\"btn btn-primary \">Logout</a>\n");
      out.write("\n");
      out.write("  <br>\n");
      out.write("      </div></div>\n");
      out.write("  </center>\n");
      out.write("    </body>\n");
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
