<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Mentors and Menti</title>
</head>
<body>

<%@include file="../header.jsp" %>
<div class="blockmain">
    <div class="content">
        <p class="text2" style="width: 650px">Назва ${professionModel.name} </p>
        <p class="text2" style="width: 650px">Категорія: ${professionModel.category} </p>
        <p class="text2" style="width: 650px">Рейтинг: ${professionModel.rating} /10 </p>
        <p class="text2" style="width: 650px">Створено: ${professionModel.createdAt}  </p>
        <p class="text2" style="width: 650px">Опис: ${professionModel.description} </p>
        <p class="text2" style="width: 650px">Рекомендація: ${professionModel.recommendation} </p>
    </div>
    <sec:authorize access="hasRole('USER') or hasRole('ADMIN')">
        <a href="/book/edit/${bookModel.id}"> Редагувати</a>
    </sec:authorize>
</div>
</body>
</html>
