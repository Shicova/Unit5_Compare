<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>動態網頁JSP</title>
  </head>
  <body text="#ff00ff">
  
    <%
      String line="";
    
      //由小而大
      for(int x=1; x<=6; x++) {
  	    line="<span style=font-size:" + String.valueOf(x) + "cm>" + "Welcome</span>"; 
        out.print(line + "<br>");
      }
      
    %>

  </body>
</html>