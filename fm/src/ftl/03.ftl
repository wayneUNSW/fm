<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>${user.id}-----${user.name}-----${user.age}</h1>
<#if user.age lt 12>
    ${user.name} is a boy
<#elseif user.age lt 18>
    ${user.name} is not adult
<#else>
    ${user.name} is adult
</#if>
</body>
</html>