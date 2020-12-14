<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<form action="login" method="post">
			<table>
				<tr>
					<td>用户名：</td>
					<td><input type="text" name="user.userName"></td>
				
				</tr>
				<tr>
					<td>密码：</td>
					<td><input type="password" name="user.password"></td>
				
				</tr>
				<tr>
					<td colspan="2"> <input type="submit" value="登录"></td>
					
				
				</tr>
			
			</table>
		
		</form>
	</div>
</body>
</html>