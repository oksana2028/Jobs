<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <title>Title</title>
  <style><%@include file="main.css" %></style>
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
    <li class="nav-item">
      <a class="nav-link" href="resume.jsp">Статті</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="Cursova/src/main/webapp/WEB-INF/view/professions.jsp">Все про резюме</a>
    </li>
  </ul>
</header>
</body>
</html>
