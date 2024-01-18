<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>星星官网</title>
</head>
<body>

<h1>欢迎来到星星官网</h1>

<ul>
    <#list menuItems as item>
    <li><a href="${item.url}">${item.label}</a></li>
    </#list>
</ul>

<footer>
    ${currentYear} 星星官网. All rights reserved.
</footer>

</body>
</html>