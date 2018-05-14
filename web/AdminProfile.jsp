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
        <% if (ok == 1 && ad==0) { %>
        <%@include file="/WEB-INF/jspf/header_logged.jspf" %>
        <% }%>
        <% if (ok == 1 && ad==1) { %>
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
                        <h2>Profile</h2><br>
                        <h3>Add new movie</h3>
                        <form id="reg" method="POST" action="MovieController"> 
                            <div class="form-element">
                                <label for="title">Title</label>
                                <input type="text" name="title" id="name" size="40" required="">
                            </div>
                            <div class="form-element">
                                <label for="genre">Genre</label>
                                <input type="text" name="genre" id="genre" required="">
                            </div>
                            <div class="form-element">
                                <label for="channel">Channel</label>
                                <input type="text" name="channel" id="channel" required="">
                            </div>
                            <div class="form-element">
                                <label for="hour">Hour</label>
                                <input type="text" name="hour" id="hour" required="">
                            </div>
                            <div class="form-element">
                                <label for="date">Date</label>
                                <input type="date" id="date" name="date" required="">
                            </div>
                            <div class="form-element">
                                <label for="oscar">Oscar</label>
                                <input type="checkbox" name="oscar" id="oscar">
                            </div> 
                            <div class="form-element">
                                <label for="rating">Rating</label>
                                <input type="text" name="rating" id="rating" required="">
                            </div>
                            <div class="form-element">
                                <input type="submit" value="Submit" onclick="return check(this)">
                                <input type="reset" value="Reset">
                            </div>  
                        </form>
                    </div>
                </div>
            </div>
        </section>
        <script>
            $("#left").load("News.txt");
        </script>
    </body>
</html>