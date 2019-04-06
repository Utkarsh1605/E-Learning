package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.sql.*;

public final class uploadCopy_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("</head>\n");
      out.write("<body>\n");

if(session.getAttribute("uname")!=null){
try
{
	String copy=request.getParameter("copy_no");
	int roll=Integer.parseInt(request.getParameter("roll_no"));
	String subject=request.getParameter("sub_code");
	String tid=request.getParameter("t_id");
	int tmarks=100;
	String ans=copy+".pdf";
	
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3340/online_exam","root","123456");
	PreparedStatement ps=con.prepareStatement("insert into exam_copy(roll_no,copy_no,subject_code,teacher_id,answer_sheet,total_marks) values(?,?,?,?,?,?)");

	ps.setInt(1,roll);
	ps.setString(2,copy);
	ps.setString(3,subject);
	ps.setString(4,tid);
	ps.setString(5,ans);
	ps.setInt(6,tmarks);
	int x=ps.executeUpdate();
			
	if(x==1)
	{ 
      out.write("\n");
      out.write("\t<center><br><h1><a href=\"enterFile.jsp?answer=");
      out.print(ans);
      out.write("\">Enter the file</a></h1></center>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\n");
	}
	else
	{
		out.println("Failed");
	}
	con.close(); 
	

	}
catch(Exception e)
{
	response.sendRedirect("error.jsp");
}
}
else
{
	response.sendRedirect("error.jsp");
}

      out.write("\n");
      out.write("</body>\n");
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
