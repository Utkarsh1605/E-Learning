<%
String filename=request.getParameter("f");
String sub=(String)session.getAttribute("dss");
String filepath="C:/Users/utkarsh/Documents/NetBeansProjects/E-Learning/web/studymaterial/"+sub+"/";
response.setContentType("APPLICATION/OCTET-STREAM");
response.setHeader("Content-Disposition","attachment; filename=\"" + filename+ "\"");
java.io.FileInputStream fileInputStream=new java.io.FileInputStream(filepath + filename);
int i;
while((i=fileInputStream.read())!=-1)
{
	out.write(i);
}
fileInputStream.close();
%>