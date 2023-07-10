<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <title>Insert title here</title>
</head>
<%--
# Cookie란?
1. 웹프로그래밍에 있어서 서버와 클라이언트 간에 접속하여 처리된 정보를 
	임시 저장하는 경우가 간간히 발생한다. 이 때, 이 정보를 서버에 보관하여
	사용하는 것을 session이라 하고, 서버에 보관되는 메모리 부담으로
	클라이언트에 저장하는 것을 쿠키라고 한다.
2. 쿠키의 생성 지점
	1) 쿠키는 클라이언트에서 요청에 의해, 서버 안에서 객체를 생성하여,
	다시 response 객체에 쿠키를 추가하여 클라이언트에 보내지면서
	클라이언트(브라우저)에 지정한 경로에 저장이된다.
3. 쿠키의 활용
	1) 쿠키가 서버에서 생성되어 클라이언트에 저장되면, 다시 요청 객체 request에 의해
		서버에 보내지면 쿠키값을 key/value형식으로 호출하여 사용할 수 있다.
	2) 쿠키는 동일한 키로 addCookie로 할당하며 동일한 키로 설정된 내용을 변경해준다.
		price ==> 3000
		price ==> 4000 최종으로 값이 설정된 값이 해당 쿠키의 key에 할당된 값이 된다.
	cf) 쿠키는 기존에 없는 키로 생성을 하면 새로운 쿠키값이 추가되고 기존에 있는 키도 
		변경된 쿠키값을 추가하면 쿠키값이 변경된다.
		ex) response.addCookie(new Cookie("key","value"))
4. 쿠키의 소멸
	1) 쿠키는 서버에서 해당 쿠키의 키명으로 유효시간으로 기능 메서드로 설정하여
		다시 클라이언트로 보내지만, 해당 시간이 지나면 클라이언트 안에서 사라지게 된다.
		삭제할 쿠키를 참조변수로 가져와서 setMaxAge(0)으로 설정하여
		다시 response.addCookie(참조변수); 처리하면 해당 쿠키값은 삭제가 된다.
		ex)
		Cookie c = new Cookie("key","value");
		c.setMaxAge(0);
		response.addCookie(c); 
 --%>
 <%
// 1. 쿠키 만들기
Cookie c1 = new Cookie("c01","himan");
// 2. 쿠키 클라이언트에 보내기
response.addCookie(c1);


// a02_showCookie.jsp

 %>
<body>
    <div class="container mt-3">
       <h2>쿠키생성완료</h2>
       <form action="" method="post">
           <button type="button" class="btn btn-primary"
            onclick="location.href='a02_showCookie.jsp'">
			쿠키 확인하러가기</button>
        </form>
    </div>
</body>
</html>