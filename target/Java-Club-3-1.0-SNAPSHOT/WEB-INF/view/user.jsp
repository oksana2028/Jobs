<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User</title>
</head>
<body>
<%@include file="../header.jsp" %>
<div>
    <div class="container">
        Ім'я: ${userModel.userName} <br>
        Прізвище: ${userModel.userSurname} <br>
        Вік: ${userModel.age} <br>
        Email: ${userModel.email} <br>
        Дата реєстрації: ${userModel.registrationDate} <br>
        <p>Дані про освіту</p>
        Назва університет: ${userModel.university}
        Назва факультету: ${userModel.faculty}
        Курс: ${userModel.course}
        Предмет пошуку: ${userModel.subject}
        Рейтинг: ${userModel.rate}
        <br>
        <br>
    </div>
</div>
</body>
</html>
