package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class entercopy_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t\n");
      out.write("   <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("   <script src=\"script/jquery.min.js\"></script>\n");
      out.write("   <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("   <link rel=\"stylesheet\" type=\"text/css\" href=\"register.css\">\n");
      out.write("\n");
      out.write("<style type=\"text/css\">\n");
      out.write("\t\n");
      out.write("    \n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("  function check()\n");
      out.write("\t{\n");
      out.write("\t\tif(!rollNo())\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t\tif(!copyNo())\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t\treturn true;\n");
      out.write("\t}\n");
      out.write("function rollNo()\n");
      out.write("{\n");
      out.write("\t\tvar roll=document.getElementById(\"roll_no\").value;\n");
      out.write("\t\tvar r=roll.toString();\n");
      out.write("\t\tif(!charinbag(r,\"1234567890\"))\n");
      out.write("\t\t{\n");
      out.write("\t\t\talert(\"Roll number contains only Number!!\");\n");
      out.write("\t\t\tdocument.getElementById(\"roll_no\").focus();\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t\t}\n");
      out.write("\t\treturn true;\n");
      out.write("}\n");
      out.write("function copyNo()\n");
      out.write("{\n");
      out.write("\t\tvar copy=document.getElementById(\"copy_no\").value;\n");
      out.write("\t\tif(!charinbag(copy,\"1234567890QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm@\"))\n");
      out.write("\t\t{\n");
      out.write("\t\t\talert(\"Copy number can contain only Alphabets and numbers!!\");\n");
      out.write("\t\t\tdocument.getElementById(\"copy_no\").focus();\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t\t}\n");
      out.write("\t\treturn true;\n");
      out.write("}\n");
      out.write("function charinbag(input,allowed)\n");
      out.write("\t{\n");
      out.write("\t\tvar i;\n");
      out.write("\t\tfor(i=0;i<input.length;i++)\n");
      out.write("\t\t{\n");
      out.write("\t\t\tvar ch=input.charAt(i);\n");
      out.write("\t\t\tif(allowed.indexOf(ch)==-1)\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t}\n");
      out.write("\t\treturn true;\n");
      out.write("\t}\n");
      out.write("function selectteacher()\n");
      out.write("            {\n");
      out.write("                var sub=document.getElementById(\"sub_code\").value;\n");
      out.write("                var obj=new XMLHttpRequest();\n");
      out.write("                obj.onreadystatechange=function()\n");
      out.write("                {\n");
      out.write("                    if((obj.readyState==4) && (obj.status==200))\n");
      out.write("                    {\n");
      out.write("                        document.getElementById(\"t_id\").innerHTML=obj.responseText;\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("                obj.open(\"GET\",\"searchteacher.jsp?subcode=\"+sub,true);\n");
      out.write("                obj.send();\n");
      out.write("            }\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"container-fluid\">\n");
      out.write("\t<br>\n");
      out.write("\t<!---------heading------>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<div class=\"row\">\n");
      out.write("\t\t<div class=\"col-md-2\"></div>\n");
      out.write("\t\t<center>\n");
      out.write("\t\t<div class=\"col-md-8\">\n");
      out.write("\t\t\t<h1><font   face=\"Constantia\" >UPLOAD COPY </font></h1>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t</center>\t\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<!--------horizontal line----->\n");
      out.write("\n");
      out.write("\t<div class=\"row\">\n");
      out.write("\t\t<div class=\"col-md-2\"> </div>\n");
      out.write("\t\t<div class=\"col-md-8\">\n");
      out.write("\t\t\t<div id=\"hr\"></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!---------FORM--------->\n");
      out.write("\t<br>\n");
      out.write("\t<form action=\"uploadCopy.jsp\" onsubmit=\"return check()\">\n");
      out.write("\t\t<!-------roll no------>\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t<div class=\"col-md-2\"></div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"col-md-8\">\n");
      out.write("\t\t\t\t<label><font face=\"goudy old style\" size=\"5\" color=\"darkgray\">Roll No :\n");
      out.write("\t\t\t\t&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp\n");
      out.write("\t\t\t\t</font></label>\n");
      out.write("\t\t\t\t<input type=\"text\" id=\"roll_no\" name=\"roll_no\" placeholder=\"Enter the roll no\" required></div>\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t<!-------copy no------>\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t<div class=\"col-md-2\"></div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"col-md-8\">\n");
      out.write("\t\t\t\t<label><font face=\"goudy old style\" size=\"5\" color=\"darkgray\">Copy No :&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</font></label>\n");
      out.write("\t\t\t\t<input type=\"text\" id=\"copy_ni\" name=\"copy_no\" placeholder=\"Enter the copy no\" required></div>\n");
      out.write("\t\t\t    \n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<!--------subject code------>\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-md-2\"> </div>\n");
      out.write("\t\t\t\t<div class=\"col-md-8\">\n");
      out.write("\t\t\t\t\t<label><font face=\"goudy old style\" size=\"5\" color=\"darkgray\">Subject  :</font></label>\n");
      out.write("\t\t\t\t\t&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp\n");
      out.write("\t\t\t\t\t<select name=\"sub_code\" id=\"sub_code\" >\n");
      out.write("\t\t\t\t\t<option value=\"\">Select</option>\n");

				if(session.getAttribute("uname")!=null)
				{
				try
				{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3340/online_exam","root","123456");
				PreparedStatement ps=con.prepareStatement("select * from subject");
				ResultSet rs=ps.executeQuery();
				rs=ps.executeQuery();
				while(rs.next())
				{
				out.println("<option value="+rs.getString(1)+">"+rs.getString(2)+"</option>");
				}
			   

      out.write("\n");
      out.write("      \t\t\t\t</select>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t<!--------teacher id------>\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-md-2\"> </div>\n");
      out.write("\t\t\t\t<div class=\"col-md-8\">\n");
      out.write("\t\t\t\t\t<label><font face=\"goudy old style\" size=\"5\" color=\"darkgray\">Teacher id :</font></label>\n");
      out.write("\t\t\t\t\t&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp\n");
      out.write("\t\t\t\t\t<select name=\"t_id\" id=\"t_id\">\n");
      out.write("\t\t\t\t\t<option value=\"\">Select</option>\n");
      out.write("\t\t\t\t\t");

				PreparedStatement ps1=con.prepareStatement("select teacher_name,teacher_id from teacher_details");
				ResultSet rs1=ps1.executeQuery();
				rs1=ps1.executeQuery();
				while(rs1.next())
				{
				out.println("<option value="+rs1.getString(2)+">"+rs1.getString(1)+"</option>");
				}
			   
					
					
					
      out.write("\n");
      out.write("      \t\t\t\t</select>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\n");
      out.write("\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t<!-------------------------submmit-------------------->\n");
      out.write("\t\t\t<br><br><br><center>\n");
      out.write("\t\t\t<button type=\"submit\" class=\"btn btn-warning btn-lg\" >SUBMIT</button>\n");
      out.write("\t\t\t<button type=\"reset\" class=\"btn btn-warning btn-lg\" >CLEAR </button>\n");
      out.write("\n");
      out.write("\t\t\t</center>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t \n");
      out.write("\t</form>\n");
      out.write("\t");

				}
				catch(Exception e)
				{
					
					out.print(e);
				}
				}
				else
				{
					response.sendRedirect("error1.jsp");
				}
	
	
      out.write("\n");
      out.write("\t\n");
      out.write("</div>\n");
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
