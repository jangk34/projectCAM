<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
등록창입니다.
<form action="/notice/insertproc.do" method="POST">

<input type="text" name="title" />
<input type="text" name="content" />  

<button type = "submit">등록</button>
</form>

</body>
</html>