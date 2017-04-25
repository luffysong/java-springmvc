<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SimpleFormController只需要一个请求路径(GET,POST)访问Controller中的不同方法</title>
</head>
<body>
	<form action="" method="post">
		编号: <input type="text" name="id" /><br />
		姓名: <input type="text" name="name" /><br />
		部门: 
		<select name="dept">
			<c:forEach items="${depts}" var="dept">
				<option value="${dept}">${dept}</option>
			</c:forEach>
		</select><br />
		<input type="submit" value="提交">
	</form>
</body>
</html>