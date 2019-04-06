package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class app_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("      \n");
      out.write("          <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" >\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.1.0/css/all.css\" >\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        \n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<br><br>\n");
      out.write("<form method=\"post\" name=\"form\">\n");
      out.write("<table border=\"1\">\n");

out.println("<table class='table'>");
out.println("<tr>");
out.println("<td colspan='13' style='background-color:maroon; color:white;'>");
out.println("Record</td>");
out.println("</tr>");
out.println("<tr style='background-color:black;color:white'>");
out.println("<th>First name</th><th>Last Name</th><th>ID</th><th>Password</th><th>Email</th><th>Type</th><th>Edit</th><th>Delete</th");


out.println("</tr>");
Connection con=null;
		Statement st;
		ResultSet rs;
		try{
			Class.forName("com.mysql.jdbc.Driver");	
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/e-learning","root","");
			st=con.createStatement();	
			String n=request.getParameter("name");
			String na="'"+n+"%'";
			rs=st.executeQuery("select * from stur where ID like "+na);
			while(rs.next())
			{

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<tr><td>");
      out.print(rs.getString(1));
      out.write("</td>\n");
      out.write("    <td>");
      out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("\n");
      out.write("<td>");
      out.print(rs.getString(3));
      out.write("</td>\n");
      out.write("<td>");
      out.print(rs.getString(4));
      out.write("</td>\n");
      out.write("<td>");
      out.print(rs.getString(5));
      out.write("</td>\n");
      out.write("<td>");
      out.print(rs.getString(6));
      out.write("</td>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<td><a href=\"edit.jsp?id='");
      out.print(rs.getString(3));
      out.write("'\" name=\"edit\" class=\"btn btn-primary\" ><i class=\"fas fa-user-edit\"></i></a></td>\n");
      out.write("<td><a href=\"delete.jsp?id=");
      out.print(rs.getString(3));
      out.write("\" name=\"edit\" class=\"btn btn-primary\" ><i class=\"fas fa-trash\"></i></a></td>\n");
      out.write("\n");
      out.write("</tr>\n");

}

      out.write('\n');

}
catch(Exception e){
e.printStackTrace();
}

      out.write("\n");
      out.write("</table>\n");
      out.write("</form>\n");
      out.write("</body>\n");
      out.write("    \n");
      out.write("   \n");
      out.write("</html>\n");

	if(session.getAttribute("username")==null){
            		response.sendRedirect("admin123456.jsp");		

        }
        
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
