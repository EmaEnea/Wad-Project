<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
        <link rel="stylesheet" href="bootstrap.css"/>
        <script src="jquery-3.3.1.js"></script>
        <link rel="stylesheet" href="style.css"/>
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
    </head>
    <header class="navigation">
        <% int ok = 1;
            int ad = 1; %>
        <c:if test="${empty  sessionScope.users }"> 
            <% ok = 0; %>
            <%@include file="/WEB-INF/jspf/header.jspf" %>
        </c:if>
        <c:if test="${empty  sessionScope.admin }"> 
            <% ad = 0; %>
        </c:if>
        <% if (ok == 1 && ad == 0) { %>
        <%@include file="/WEB-INF/jspf/header_logged.jspf" %>
        <% }%>
        <% if (ok == 1 && ad == 1) { %>
        <%@include file="/WEB-INF/jspf/header_admin.jspf" %>
        <% }%>
    </header>
    <body class="background" background="img/64.jpg">
        <section>
            <div class="content">
                <div class="box">
                    <div class="container">
                        <input type="search" id="search" placeholder="Search..." />
                        <button class="icon"><i class="fa fa-search"></i></button>
                    </div>
                </div>
                <br>
                <div class="left" id="left">
                </div>
                <div class="right">
                    <br></br><br>
                    <div class="word">
                        <h1>Registration form</h1>   
                        <form id="reg" name="myForm" method="POST" action="RegisterController"> 
                            <div class="form-element">
                                <label for="name">Name</label>
                                <input type="text" name="name" id="name" size="40" required="">
                            </div>
                            <div class="form-element">
                                <label for="username">Username</label>
                                <input type="text" name="uname" id="uname" required="">
                            </div>
                            <div class="form-element">
                                <label for="password">Password</label>
                                <input type="password" name="password" id="password" required="">
                            </div>
                            <div class="form-element">
                                <label for="rPassword">Confirm Pass</label>
                                <input type="password" name="rPassword" id="rPassword" onkeyup="checkPass();
                                        return false;">
                                <span id="confirmMessage" class="confirmMessage"></span>
                            </div>
                            <div class="form-element">
                                <label for="email">Email</label>
                                <input type="email" id="email" name="email" required="">
                            </div>
                            <div class="form-element">
                                <label for="admin">Admin account</label>
                                <input type="checkbox" name="admin" id="admin" onclick="yesnoCheck()">
                            </div>
                            <div class="form-element">
                                <input type="password" name="adpass" id="adpass" style="display:none">
                            </div>
                            <br>
                            <div class="form-element">
                                <input type="submit" value="Submit" onclick="return check(this)">
                                <input type="reset" value="Reset">
                            </div>  
                        </form>
                        <script>
                            function checkPass()
                            {
                                var pass1 = document.getElementById('password');
                                var pass2 = document.getElementById('rPassword');
                                var message = document.getElementById('confirmMessage');
                                var goodColor = "#66cc66";
                                var badColor = "#ff6666";
                                if (pass1.value == pass2.value) {
                                    pass2.style.backgroundColor = goodColor;
                                    message.style.color = goodColor;
                                    message.innerHTML = "Passwords Match!"
                                } else {
                                    pass2.style.backgroundColor = badColor;
                                    message.style.color = badColor;
                                    message.innerHTML = "Passwords Do Not Match!"
                                }
                            }
                            $('#adpass').hide();
                            function yesnoCheck() {
                                var checkBox = document.getElementById("admin");
                                var text = document.getElementById("adpass");
                                if (checkBox.checked == true) {
                                    text.style.display = "block";
                                } else {
                                    text.style.display = "none";
                                }
                            }
                        </script>
                    </div>
                </div>
            </div>
        </section>
        <script>
            $("#left").load("News.txt");
        </script>
    </body>
</html>