<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>    
<fmt:requestEncoding value="utf-8"/>
<c:set var="path" 
   value="${pageContext.request.contextPath}"/>
 
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <title>Insert title here</title>
   
    <script src = "https://code.jquery.com/jquery-3.7.0.js" type="text/javascript"></script>
    
    <script type="text/javascript">
       // window.onload와 동일한 메서드
       $(document).ready( function(){
          
          $("h2").text("jquery 로딩 성공")
       });
    </script>      
    
    
</head>
<%
Cookie p1 = new Cookie("price","3000");
response.addCookie(p1);

// a04_showCookie.jsp
/*
Cookie[] cookies = request.getCookies();
	for(Cookie c:cookies){
		if(!c.getName().equals("JSESSIONID")){
			out.print("<h2>"+c.getName()+":"+c.getValue()+"</h2>");
		}
	}
*/

%>
<body>
    <div class="container mt-3">
       <h2>사원정보 등록</h2>
        <nav class="navbar navbar-expand-sm bg-dark navbar-dark">
           <div class="container-fluid">       
          <form method="post"  class="d-flex align-items-center" >
                 
               <button type="button" class="btn btn-primary" 
               onclick="location.href='a04_showCookie.jsp'" style="width:200px;">
               쿠키가격</button>
           </form>
           </div>
       </nav>
      <table class="table table-striped table-hover">
         <thead class="table-success">
               <tr  class="text-center">
                <th>Firstname</th>
                <th>Lastname</th>
                <th>Email</th>
               </tr>
          </thead>
          <tbody>
               <tr  class="text-center">
                 <td>John</td>
                 <td>Doe</td>
                 <td>john@example.com</td>
               </tr>
          </tbody>
      </table>         
    </div>
</body>
</html>