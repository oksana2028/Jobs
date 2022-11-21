<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<html>
<head>
    <meta charset="utf-8">
    <title>Registration</title>

</head>
<body>
<div class="blockmain">
    <div class="content">
    <form:form method="POST" modelAttribute="userForm">
        <h2>Registration</h2>
        <p>Введіть особисту інформацію:</p>
        <div>
            <form:input type="text" path="name" placeholder="Name" autofocus="true"></form:input>
        </div>
        <div>
            <form:input type="text" path="surname" placeholder="Surname" autofocus="true"></form:input>
        </div>
        <div>
            <form:input type="age" path="age" placeholder="Age"></form:input>
        </div>
        <p>Введіть логін та пароль для входу:</p>
        <div>
            <form:input type="text" path="email" placeholder="Email" autofocus="true"></form:input>
        </div>
        <div>
            <form:input type="password" path="encryptedPassword" placeholder="Password"></form:input>
        </div>

        <button type="submit">Register</button>
    </form:form>
    <a href="${pageContext.request.contextPath}/">Головна</a>
    </div>
</div>
</body>
</html>