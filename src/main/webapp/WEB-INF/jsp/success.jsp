<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'success.jsp' starting page</title>


</head>

<body>
	<h1>${message}</h1>
	<button id="button">a</button>
	
	<script type="text/javascript" src="<%=basePath%>statics/js/jquery-1.12.4.js"></script>
	<!-- <script src="https://cdn.bootcss.com/jquery/1.2.6/jquery.min.js"></script> -->
	<script type="text/javascript">
		$(document).ready(function() {
			$("#button").click(function() {
				// 				setTimeout(function() { //两秒后跳转  
				// 					alert("恭喜你登录成功，两秒后跳转。");
				// 					location.href = "welcome.jsp"; //PC网页式跳转  
				// 				// $.mobile.changePage("welcome.jsp"); //手机网页式跳转  
				// 				}, 2000);
				alert("123");
			});
	
		});
	</script>
</body>
</html>
