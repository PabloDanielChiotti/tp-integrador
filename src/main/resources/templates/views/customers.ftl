<!DOCTYPE HTML>
<head>
    <title>Getting Started: Serving Web Content</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
<#list customers as customer>
    ${customer.id}-${customer.name} <br>
</#list>
</body>
</html>