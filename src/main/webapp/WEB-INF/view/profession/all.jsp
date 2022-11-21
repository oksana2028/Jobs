<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Professions</title>
    <style><%@include file="main.css" %></style>
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@400&display=swap" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
</head>
<body>
<header class="row">
    <div>
        <button type="button" class="btn btn-light"><a href="/login" class="bottomhead-resgister" >Увійти</a></button>
        <button type="button" class="btn btn-light"><a href="/registration" class="bottomhead-resgister" >Зареєструватись</a></button>
    </div>
    <ul class="nav nav-tabs">
        <li class="nav-item">
            <a class="nav-link active" aria-current="page" href="#">Головна</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="/profession/all">Професії</a>
        </li>
    </ul>
</header>
<div >
    <form:form action="/profession/search" method="POST">
        <input name="search" placeholder="Введіть назву" type="text" />
        <input type="submit" value="Знайти">
    </form:form>

    <div >
        <div >
            <h3>Список професій:</h3>
            <form action="/profession/create">
                <input type="submit" value="Створити" >
            </form>
        </div>
        <hr>
        <c:forEach items="${professionModel}" var="profession">
            <div class="tablbox2">
                <p class="text2">${profession.id}</p>
                <a href="/profession/${profession.id}" class="text1">  ${profession.name} </a>
            </div>
        </c:forEach>
        <hr>
    </div>
    </div>
</body>
</html>
