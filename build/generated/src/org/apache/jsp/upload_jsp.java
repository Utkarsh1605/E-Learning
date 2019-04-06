package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;

public final class upload_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("   <script src=\"script/jquery.min.js\"></script>\n");
      out.write("   <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("   <link rel=\"stylesheet\" type=\"text/css\" href=\"register.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");

if(session.getAttribute("uname")!=null){
try
{
	
	File f;
	String File="";
	String path="";
	String contentType=request.getContentType();
	if((contentType!=null)&&(contentType.indexOf("multipart/form-data")>=0)) 
	{
		DataInputStream in=new DataInputStream(request.getInputStream());
		int datalength=request.getContentLength();
		byte data[]=new byte[datalength];
		int byteRead=0;
		int totalBytesRead=0;
		while(totalBytesRead<datalength) 
		{
			byteRead=in.read(data,totalBytesRead,datalength);
			totalBytesRead=totalBytesRead+byteRead;
		}
		String file=new String(data);
		File=file.substring(file.indexOf("filename=\"")+10);
		File=File.substring(0,File.indexOf("\n"));
		File=File.substring(File.lastIndexOf("\\")+1,File.indexOf("\""));
		int lastIndex=contentType.lastIndexOf("=");
		String boundary=contentType.substring(lastIndex+1,contentType.length());
		int pos;
		pos=file.indexOf("filename=\"");
		pos=file.indexOf("\n", pos) + 1;
		pos=file.indexOf("\n", pos) + 1;
		pos=file.indexOf("\n", pos) + 1;
		int boundaryLocation=file.indexOf(boundary,pos)-4;
		int startPos=((file.substring(0,pos)).getBytes()).length;
		int endPos=((file.substring(0, boundaryLocation)).getBytes()).length;
		path="Upload/"+File;
		File=config.getServletContext().getRealPath("/")+"Upload/"+File;
		f = new File(File);
		//f.renameTo(new File(name));
		FileOutputStream fileOut=new FileOutputStream(f);
		fileOut.write(data,startPos,(endPos-startPos));
		fileOut.flush();
		fileOut.close();

		out.println("File Uploaded");
	}
	
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
