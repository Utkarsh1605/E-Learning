package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("     \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login Page</title>\n");
      out.write("    \n");
      out.write("\n");
      out.write("\t<style type=\"text/css\">\n");
      out.write("\t.body\n");
      out.write("\t{\n");
      out.write("\t\tbackground: #2F4F4F;\n");
      out.write("\t}\n");
      out.write("\t* {\n");
      out.write(" margin: 0;\n");
      out.write(" padding: 0;\n");
      out.write(" box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write(".container {\n");
      out.write(" width: 390px;\n");
      out.write(" height: 549px;\n");
      out.write(" background: #000;\n");
      out.write(" margin-left: auto;\n");
      out.write(" margin-right: auto;\n");
      out.write(" margin-top: 11px;\n");
      out.write(" -webkit-box-shadow: 0px 0px 114px 2px rgba(0, 0, 0, 0.75);\n");
      out.write(" -moz-box-shadow: 0px 0px 114px 2px rgba(0, 0, 0, 0.75);\n");
      out.write(" box-shadow: 0px 0px 114px 2px rgba(0, 0, 0, 0.75);\n");
      out.write("\n");
      out.write(" svg {\n");
      out.write("  position: absolute;\n");
      out.write(" }\n");
      out.write("}\n");
      out.write("\n");
      out.write(".rect1 {\n");
      out.write(" z-index: 1;\n");
      out.write(" stroke-dasharray: 197 509;\n");
      out.write(" stroke-dashoffset: -729;\n");
      out.write(" transition: stroke-width 1s, stroke-dashoffset 1s, stroke-dasharray 1s;\n");
      out.write(" transition-timing-function: cubic-bezier(0.215, 0.61, 0.355, 1);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".rect2 {\n");
      out.write(" z-index: 1;\n");
      out.write(" stroke-dasharray: 197 509;\n");
      out.write(" stroke-dashoffset: -1058;\n");
      out.write(" transition: stroke-width 1s, stroke-dashoffset 1s, stroke-dasharray 1s;\n");
      out.write(" transition-timing-function: cubic-bezier(0.215, 0.61, 0.355, 1);\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(".text {\n");
      out.write(" position: absolute;\n");
      out.write(" margin-top: 254px;\n");
      out.write(" border: none;\n");
      out.write(" background: #000;\n");
      out.write(" margin-left: 101px;\n");
      out.write(" color: gray;\n");
      out.write(" width: 196px;\n");
      out.write(" height: 44px;\n");
      out.write(" padding-left: 3px;\n");
      out.write(" z-index: 100;\n");
      out.write(" font-family: 'Roboto', sans-serif;\n");
      out.write(" padding-top: 21px;\n");
      out.write(" transition: all 600ms cubic-bezier(0.895, 0.03, 0.685, 0.22);\n");
      out.write(" &:focus {\n");
      out.write("  outline-width: 0;\n");
      out.write("  font-size: 16px;\n");
      out.write(" }\n");
      out.write("}\n");
      out.write("\n");
      out.write(".pass {\n");
      out.write(" position: absolute;\n");
      out.write(" margin-top: 305px;\n");
      out.write(" border: none;\n");
      out.write(" background: #000;\n");
      out.write(" margin-left: 101px;\n");
      out.write(" color: gray;\n");
      out.write(" width: 196px;\n");
      out.write(" height: 44px;\n");
      out.write(" padding-left: 3px;\n");
      out.write(" z-index: 100;\n");
      out.write(" font-family: 'Roboto', sans-serif;\n");
      out.write(" padding-top: 21px;\n");
      out.write(" transition: all 600ms cubic-bezier(0.895, 0.03, 0.685, 0.22);\n");
      out.write(" &:focus {\n");
      out.write("  outline-width: 0;\n");
      out.write("  font-size: 16px;\n");
      out.write(" }\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("button {\n");
      out.write(" position: absolute;\n");
      out.write(" z-index: 100;\n");
      out.write(" width: 149px;\n");
      out.write(" height: 43px;\n");
      out.write(" border: 1px solid #fff;\n");
      out.write(" background: #000;\n");
      out.write(" font-family: 'Roboto', sans-serif;\n");
      out.write(" color: #fff;\n");
      out.write(" font-size: 16px;\n");
      out.write(" border-radius: 22px;\n");
      out.write(" margin-top: 421px;\n");
      out.write(" margin-left: 120.5px;\n");
      out.write(" transition: 0.5s;\n");
      out.write(" cursor: pointer;\n");
      out.write("\n");
      out.write(" &:hover {\n");
      out.write("  color: #000;\n");
      out.write("  background: #fff;\n");
      out.write(" }\n");
      out.write("\n");
      out.write(" &:focus {\n");
      out.write("  outline-width: 0;\n");
      out.write(" }\n");
      out.write("}\n");
      out.write("\n");
      out.write(".header {\n");
      out.write("\n");
      out.write(" position: absolute;\n");
      out.write(" text-align: center;\n");
      out.write(" font-family: 'Roboto', sans-serif;\n");
      out.write(" color: #fff;\n");
      out.write(" font-size: 48px;\n");
      out.write(" margin-left: 128px;\n");
      out.write(" margin-top: 81px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".info {\n");
      out.write("\n");
      out.write(" position: absolute;\n");
      out.write(" text-align: center;\n");
      out.write(" font-family: 'Roboto', sans-serif;\n");
      out.write(" color: #BDFFBD;\n");
      out.write(" font-size: 14px;\n");
      out.write(" margin-left: 125px;\n");
      out.write(" margin-top: 181px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(" \n");
      out.write("</style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <form method=\"get\" action=\"\">\n");
      out.write("\t<div class=\"al\"></div>\n");
      out.write("<div class=\"container\">\n");
      out.write(" <div class=\"header\">Welcome</div>\n");
      out.write(" <div class='info'>Admin Login</div>\n");
      out.write(" <input id='username' class='text' onfocus=\"handle2()\" class='form-control' type=\"text\" name=\"t1\" placeholder='Username' value=\"\">\n");
      out.write("<!-- Had to remove the type \"password\" due to the browser user credential's autofill-->\n");
      out.write(" <input id='password' class='pass' onfocus=\"handle1()\" class='form-control' type=\"password\" name=\"t2\" placeholder='Password' value=\"\">\n");
      out.write("\n");
      out.write(" <button name=\"b1\" type=\"submit\" value=\"Submit\">Login</button>\n");
      out.write("<!-- <button name=\"b1\">Sign In </button>  -->\n");
      out.write(" <svg width=\"390\" height=\"549\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\">\n");
      out.write("      <rect id='rect' class='rect1'   x=\"45px\"  y=\"300px\"   rx=\"27\" ry=\"27\" width=\"300px\" height=\"50px\" style=\"stroke: #fff; stroke-width: 1px; fill: #000\" />\n");
      out.write("</svg>\n");
      out.write("</div>\n");
      out.write("\n");

         
                           
                       

	if(request.getParameter("b1")!=null)
        {
	
	String un=request.getParameter("t1");
	String pw=request.getParameter("t2");
        	
		
		
		if(un.equals("QuizAdmin") && pw.equals("levicorpus"))
		{
			session.setAttribute("username",un);
			response.sendRedirect("adminwelcome.jsp");
		}
		else
			out.println("<div style='color:red'>Invalid User Name or pasword</div>");
               	}
              
        
      out.write("\t\n");
      out.write("\n");
      out.write("    </form>\n");
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
