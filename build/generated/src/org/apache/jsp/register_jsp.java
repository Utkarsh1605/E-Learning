package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("      <!--Import Google Icon Font-->\n");
      out.write("      <link href=\"http://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("      <!--Import materialize.css-->\n");
      out.write("      <link type=\"text/css\" rel=\"stylesheet\" href=\"css/materialize.min.css\"  media=\"screen,projection\"/>\n");
      out.write("\n");
      out.write("      <!--Let browser know website is optimized for mobile-->\n");
      out.write("      <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("      <!--Import jQuery before materialize.js-->\n");
      out.write("      <script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-2.1.1.min.js\"></script>\n");
      out.write("      <script type=\"text/javascript\" src=\"js/materialize.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"row\">\n");
      out.write("    <form class=\"col s5\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"input-field col s6\">\n");
      out.write("          <input name=\"fname\" placeholder=\"First Name\" type=\"text\" class=\"validate\">\n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("        <div class=\"input-field col s6\">\n");
      out.write("          <input name=\"lname\"placeholder=\"Last Name\" type=\"text\" >\n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("        <div class=\"row\">\n");
      out.write("        <div class=\"input-field col s6\">\n");
      out.write("          <input name=\"id\" placeholder=\"College ID\" type=\"text\" class=\"validate\">\n");
      out.write("          <label></label></div></div>\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"input-field col s12\">\n");
      out.write("          <input name=\"pass\"placeholder=\"Password\" type=\"password\" >\n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"input-field col s12\">\n");
      out.write("          <input name=\"email\" type=\"email\" placeholder=\"Email\">\n");
      out.write("         \n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\t  <button class=\"btn waves-effect waves-light\" name=\"b1\" type=\"submit\">Submit</button>\n");
      out.write("    </form>\n");
      out.write("  </div>\n");
      out.write("   ");

      if(request.getParameter("b1")!=null)
	{
	Connection con=null;
        	Statement st;
        	ResultSet rs;
                try{
            		Class.forName("com.mysql.jdbc.Driver");	
            		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/e-learning","root","");
            		st=con.createStatement();
                       
		  String fn=request.getParameter("id");
                  String sql1="select * from stur where id='"+fn+"' ";
                                      rs=st.executeQuery(sql1);
			if(rs.next())
                        {
                            out.println("User already Exists");  
                        }
                        else
                        {
                  String f =request.getParameter("fname");
                  String l =request.getParameter("lname");
                  String m=request.getParameter("email");
                  String p =request.getParameter("pass");
                  String sql="insert into stur values('"+f+"','"+l+"','"+fn+"','"+p+"','"+m+"','"+"student"+"');";
                        
                  
                  
                     
                                   int res=st.executeUpdate(sql);
			if(res!=0)
                        {
                           
                            response.sendRedirect("login.jsp");
                        }
				
			else
				response.sendRedirect("error"+".jsp");      
			
                        }
		
                }
                catch(Exception e)
        	{
            		out.println(e.toString());
        	}
	}
        
      out.write("\t\n");
      out.write("\n");
      out.write("  </body>\n");
      out.write("  </html>");
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
