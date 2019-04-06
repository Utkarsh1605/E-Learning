package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.sql.*;

public final class enterfile_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("   <script src=\"script/jquery.min.js\"></script>\n");
      out.write("   <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("   <link rel=\"stylesheet\" type=\"text/css\" href=\"register.css\">\n");
      out.write("<style>\n");
      out.write("#page\n");
      out.write("{\n");
      out.write("\tmargin:150px auto;\n");
      out.write("\twidth:500px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<div class=\"container-fluid\">\n");
      out.write("<div class=\"row\">\n");
      out.write("\n");
      out.write("<center>\n");
      out.write("<h2>FILE TO BE UPLOADED !!</h2></center><BR>\n");
      out.write("</div>\n");

if(session.getAttribute("uname")!=null)
{
try
{
	
	String sheet=request.getParameter("answer");
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3340/online_exam","root","123456");
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select roll_no,copy_no,subject_code,teacher_id,answer_sheet  from exam_copy where answer_sheet = '"+sheet+"' ");
	rs.next();

      out.write("\n");
      out.write("<div class=\"row\">\n");
      out.write("<div class=\"col-md-2\">\n");
      out.write("</div>\n");
      out.write("<div class=\"col-md-8\">\n");
      out.write("\t<table border=\"1\" >\n");
      out.write("\t<tr>\n");
      out.write("\t\t\t\t\t<th>ROLL-NO.</th>\n");
      out.write("\t\t\t\t\t<th>COPY-NO.</th>\n");
      out.write("\t\t\t\t\t<th>TEACHER-ID</th>\n");
      out.write("\t\t\t\t\t<th>SUBJECT-CODE</th>\n");
      out.write("\t\t\t\t\t<th>FILE TO BE ENTERED</th>\n");
      out.write("\t</tr>\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td>");
      out.print(rs.getInt(1));
      out.write("</td>\n");
      out.write("\t\t<td>");
      out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("\t\t<td>");
      out.print(rs.getString(4));
      out.write("</td>\n");
      out.write("\t\t<td>");
      out.print(rs.getString(3));
      out.write("</td>\n");
      out.write("\t\t<td>");
      out.print(rs.getString(5));
      out.write("</td>\n");
      out.write("\t</tr>\n");
      out.write("\t</table>\n");
      out.write("\t</div>\n");
      out.write("\t</div>\n");

}
catch(Exception e)
{
	out.print(e);
}
}
else
{
	response.sendRedirect("error.jsp");
}

      out.write("\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<center>\n");
      out.write("<div id=\"upload\">\n");
      out.write("<form action=\"upload.jsp\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("\n");
      out.write("SELECT FILE\n");
      out.write("<input type=\"file\" name=\"file\" id=\"file\">\n");
      out.write("<br><br>\n");
      out.write("<input type=\"Submit\" value=\"UPLOAD\">\n");
      out.write("<br><br>\n");
      out.write("<input type=\"reset\" value=\"CLEAR\"></form>\n");
      out.write("</center>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
