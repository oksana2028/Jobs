<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>User Account</title>
</head>
<body>
<div class="header">

    <div class="headerleft" style="margin-left: 18px">
        <a href="/" class="bottomhead onthis" style="font-size: 19px" >На Головну</a>
        <a href="/profession/all" class="bottomhead" style="font-size: 19px">Знайти професію</a>
    </div>
    <div class="headerright">
        <a class="bottomhead-resgister" href="/user/edit">Редагувати особисту інформацію</a>
        <a class="bottomhead-resgister" href="<c:url value="/logout" />">Вийти</a>
    </div>
</div>

</body>
</html>
