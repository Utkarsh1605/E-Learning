package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class logint_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t\n");
      out.write("<head>\n");
      out.write("\t<title>Login!</title>\n");
      out.write("\t\t<meta charset=\"utf-8\">\n");
      out.write("\t\t<link href=\"css/style.css\" rel='stylesheet' type='text/css' />\n");
      out.write("\t\t\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t\t\t<div class=\"login-form\">\n");
      out.write("\t\t\t\t\t<div class=\"head\">\n");
      out.write("\t\t\t\t\t\t<img src=\"images/mem2.jpg\" alt=\"\"/>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t<form>\n");
      out.write("\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"text\" name=\"email\" placeholder=\"Teacher(email)\"  onfocus=\"this.value = '';\"><a class=\" icon user\"></a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t<input type=\"password\" class=\"text\" name=\"pass\" placeholder=\"Password\" onfocus=\"this.value = '';\"><a  class=\" icon lock\"></a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<div class=\"p-container\">\n");
      out.write("\t\t\t\t\t<input type=\"submit\" name=\"b2\" value=\"SIGN IN\" >\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t<form action=\"registert.jsp\">\n");
      out.write("\t\t\t<input type=\"submit\" name=b1\" value=\"REGISTER!\">\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t");

	if(request.getParameter("b2")!=null)
	{
	Connection con=null;
        	Statement st;
        	ResultSet rs;
                try{
            		Class.forName("com.mysql.jdbc.Driver");	
            		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/e-learning","root","");
            		st=con.createStatement();
                     
                  String m=request.getParameter("email");
                     String p =request.getParameter("pass");
                  
                   

                     String sql="select * from stur where Email='"+m+"' and Password='"+p+"' and Type='teacher';";
                                      rs=st.executeQuery(sql);
			if(rs.next())
                        {
                              
                            session.setAttribute("usernamet",rs.getString(1));
                            session.setAttribute("idt",rs.getString(3));
				response.sendRedirect("td.jsp");
                       
                        }else {
                            
      out.write(" \n");
      out.write("<script type=\"text/javascript\"> \n");
      out.write("alert(\"Invalid Username or Password\"); \n");
      out.write("</script> \n");
}
                }
                catch(Exception e)
        	{
            		out.println(e.toString());
        	}
	}
        
      out.write("\t\n");
      out.write("\n");
      out.write("\t\t\t</body>\n");
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
