<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<body>
${user.id}-------${user.name}------${user.group!} 
${(user.group.name)!"1234"} 

${(a.b)!"no a.b"}


<#if (a.b)??> <#--if????$-->
    ???
<#else>
    ??
</#if>
</body>
</html>