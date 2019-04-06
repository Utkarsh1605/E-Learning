package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class try_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<style>\n");
      out.write(".dropbtn {\n");
      out.write("  background-color: #4CAF50;\n");
      out.write("  color: white;\n");
      out.write("  padding: 16px;\n");
      out.write("  font-size: 16px;\n");
      out.write("  border: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown {\n");
      out.write("  position: relative;\n");
      out.write("  display: inline-block;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content {\n");
      out.write("  display: none;\n");
      out.write("  position: absolute;\n");
      out.write("  background-color: #f1f1f1;\n");
      out.write("  min-width: 160px;\n");
      out.write("  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);\n");
      out.write("  z-index: 1;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content a {\n");
      out.write("  color: black;\n");
      out.write("  padding: 12px 16px;\n");
      out.write("  text-decoration: none;\n");
      out.write("  display: block;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content a:hover {background-color: #ddd;}\n");
      out.write("\n");
      out.write(".dropdown:hover .dropdown-content {display: block;}\n");
      out.write("\n");
      out.write(".dropdown:hover .dropbtn {background-color: #3e8e41;}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<b><h1>Query Handler</h1></b>\n");
      out.write("<p>Select the subject</p>\n");
      out.write("\n");
      out.write("<div class=\"dropdown\">\n");
      out.write("  <button class=\"dropbtn\">Subject</button>\n");
      out.write("  <div class=\"dropdown-content\">\n");
      out.write("    <a href=\"#\">Engineering Mathematics</a>\n");
      out.write("    <a href=\"#\">Engineering Physics</a>\n");
      out.write("    <a href=\"#\">Chemistry</a>\n");
      out.write("  <a href=\"#\">Fundamentals of Computer Programming</a>\n");
      out.write("  <a href=\"#\">Electrical Engineering</a>\n");
      out.write("  <a href=\"#\">Basic Mechanical Engineering</a>\n");
      out.write("  <a href=\"#\">Problem Solving Using Computers</a>\n");
      out.write("  <a href=\"#\">Applied Mechanics</a>\n");
      out.write("  <a href=\"#\">Electronics Engineering</a>\n");
      out.write("  <a href=\"#\">Ethics and Values</a>\n");
      out.write("  <a href=\"#\">Data Structure And Algorithms</a>\n");
      out.write("  <a href=\"#\">DataBase Managment System</a>\n");
      out.write("  <a href=\"#\">Computer Organization</a>\n");
      out.write("  <a href=\"#\">English</a>\n");
      out.write("  <a href=\"#\">Industrial Economics</a>\n");
      out.write("  <a href=\"#\">Environmental Studies</a>\n");
      out.write("  <a href=\"#\">Operating Systems</a>\n");
      out.write("  <a href=\"#\">Computer Network</a>\n");
      out.write("  <a href=\"#\">Discrete Mathematics</a>\n");
      out.write("  <a href=\"#\">Introduction to microprocessors</a>\n");
      out.write("  <a href=\"#\">Object Oriented Programming</a>\n");
      out.write("  <a href=\"#\">Design and Analysis of Algorithms</a>\n");
      out.write("  <a href=\"#\">Software Engineering</a>\n");
      out.write("  <a href=\"#\">Web Technology</a>\n");
      out.write("  <a href=\"#\">Theory of Automata and Formal Languages</a>\n");
      out.write("  <a href=\"#\">Python Programming</a>\n");
      out.write("  <a href=\"#\">Soft Skills</a>\n");
      out.write("  <a href=\"#\">Compiler Design </a>\n");
      out.write("  <a href=\"#\">Optimization Techniques</a>\n");
      out.write("  <a href=\"#\">Sost Computing</a>\n");
      out.write("  <a href=\"#\">Big Data And Analytics</a>\n");
      out.write("  <a href=\"# \">Digital Image Processing</a>\n");
      out.write("  <a href=\"# \">Advanced Computer Architecture</a>\n");
      out.write("  <a href=\"# \">Mobile Computing</a>\n");
      out.write("  <a href=\"# \">Advanced Computer Networks</a>\n");
      out.write("  <a href=\"# \">Data Mining & Warehousing</a>\n");
      out.write("  <a href=\"# \">Service Oriented Architecture</a>\n");
      out.write("  <a href=\"# \">Embedded Systems</a>\n");
      out.write("  <a href=\"# \">Information Retrieval Systems </a>\n");
      out.write("  <a href=\"# \">Business Intelligence </a>\n");
      out.write("  <a href=\"# \">Distributed Systems</a>\n");
      out.write("  <a href=\"# \">Cryptography & Network Security </a>\n");
      out.write("  <a href=\"# \">Agile Software Development</a>\n");
      out.write("  <a href=\"# \">Cloud Computing</a>\n");
      out.write("  <a href=\"# \">Natural Language Processing</a>\n");
      out.write("  <a href=\"# \">Cyber Security</a>\n");
      out.write("  <a href=\"# \">Distributed & Parallel Database</a>\n");
      out.write("  \n");
      out.write(" \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("  <h2>Please Enter Your Query </h2> \n");
      out.write("  <textarea rows=\"6\" cols=\"100\">\n");
      out.write("\n");
      out.write("</textarea><pre>\n");
      out.write("<input type=\"submit\" value=\"Submit\" />\n");
      out.write(" \n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
