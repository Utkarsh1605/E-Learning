

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
         <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" >
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.1.0/css/all.css" >
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
  
       <title>Search Page</title>
<script>
function ajaxres(str)
{
	var xmlhttp;
	if (window.XMLHttpRequest)
	{
		// code for IE7+, Firefox, Chrome, Opera, Safari
		 xmlhttp=new XMLHttpRequest();
	 }
	else
	{
		// code for IE6, IE5
		xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
	}
	xmlhttp.onreadystatechange=function()
	{
		if (xmlhttp.readyState==4 && xmlhttp.status==200)
	    	{
				document.getElementById("dynText").innerHTML=xmlhttp.responseText;
		}
	}
	xmlhttp.open("GET","app.jsp?name="+str,true);
	xmlhttp.send();
}

</script>
</head>

<body>
<%-- <nav>
          <a href="adminwelcome.jsp" class="btn btn-primary">Home</a>
            <a href="logout.jsp" class="btn btn-primary ">Logout</a> </nav> --%><br><br>
<form name="f1" method="get" action=""> 
<table width="100%" border="2" style="font-family:arial;font-size:14px">
<tr  style="background-color:black; color:white">
	<td colspan="2">Search User</td>
</tr>
<tr>
	<td>Enter Id</td>
	<td><input type="text" name="t1" onkeyup="ajaxres(t1.value)" /> </td>
</tr>
</table>
</form>


        	<div id="dynText"></div>
<%if(session.getAttribute("username")==null){
            		response.sendRedirect("admin123456.jsp");		

        }%>
</body>
</html>