<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<#list users as user>
<li>${user_index + 1}${user.id}---------${user.name}-------${user.age}</li>
</#list>
</body>
</html>