<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Main Page</title>
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
<div class="blockmain">
    <div id="carouselExampleCaptions" class="carousel slide" data-ride="carousel">
        <div class="carousel-inner">
            <div class="carousel-item active">
                <img src="img/Photo1.jpg" width="100%" data-holder-rendered="true">
                <div class="carousel-caption d-none d-md-block font-pd">
                    <h1 class="carousel1"><b>Все про професії</b></h1>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="pharagraph"></div>
<div class="card">
    <div class="row g-0">
        <div class="col-md-6">
            <img src="img/professions.jpg" alt="..." width="600px">
        </div>
        <div class="col-md-6">
            <div class="card-body">
                <h5 class="card-title" href="/professions">ТОП-10 професій з найвищою заробітньою платою</h5>
                <p class="card-text">Пропонуємо вам переглянути наш ТОП-10 професій, які вважаються найбільш високооплачуваними в Україні та на пострадянському просторі. Звичайно, рівень заробітної плати буде різнитися в столиці та в регіонах, але ми зібрали рейтинг таких вакансій, які принесуть своїм власникам максимальний заробіток. Отож, давайте розглянемо більш детально, яким фахівцям і які зарплати платять у 2020 році.</p>
            </div>
        </div>
    </div>
</div>
<div class="pharagraph"></div>
<div class="card">
    <div class="row g-0">
        <div class="col-md-6">
            <div class="card-body">
                <h5 class="card-title" href="/choose">Алгоритм вибору професії</h5>
                <p class="card-text">Кожна людина хоча б раз в житті обирала собі професію. Для прийняття правильного рішення при виборі професії тобі необхідно враховувати ряд факторів – власні побажання, психологічні особливості та можливості, не слід забувати й про потреби ринку праці. Для цього існує так звана “формула вибору професії”, яка в загальному вигляді показує первинний алгоритм прийняття оптимального рішення в поєднанні наступних компонентів: “хочу” – “можу” – “треба”. Розкриємо коротко суть цих компонентів.</p>
            </div>
        </div>
        <div class="col-md-6">
            <img src="img/choose.png" alt="..." width="600px">
        </div>
    </div>
</div>
<div class="pharagraph"></div>
<div class="card">
    <div class="row g-0">
        <div class="col-md-6">
            <img src="img/listening.jpg" alt="..." width="600px">
        </div>
        <div class="col-md-6">
            <div class="card-body">
                <h5 class="card-title" href="listening">Як оцінити навички активного слухання</h5>
                <p class="card-text">Стародавня мудрість стверджує, що людині не просто так дано два вуха і один рот. Це для того, щоб менше говорити і більше слухати. І дійсно, нечасто зустрінеш співрозмовника, який вміє по-справжньому вислухати. Найчастіше як буває: ми або не надто розуміємо, про що говорить наш співрозмовник, або банально не чуємо його, бо нам кортить самим висловитися. Прокачуючи навички активного слухання, ми можемо навчитися усувати ці та багато інших проблем в міжособистісній взаємодії.</p>
            </div>
        </div>
    </div>
</div>
<%@include file="footer.jsp" %>
</body>
</html>