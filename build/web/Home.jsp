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
                        <h2>Home</h2>
                        <h3>TV guide: your no. 1 website for the best TV movie options</h3>
                        <h4>Get alerts with your favorite movies and keep up to date on everything that matters.<br>Take a peek at the upcoming films: </h4>
                        <table>
                            <c:forEach items="${applicationScope.allMovies}" var="movie">
                                <tr>
                                    <td rowspan="3"><img src="${movie.getImage()}" width="200"></td>
                                    <td>${movie.getName()}</td> 
                                </tr> 
                                <tr><td>Rating: ${movie.getRating()}</td></tr>
                                <c:if test="${movie.getReview()!=null}">
                                    <tr><td>Reviews: ${movie.getReview()}</td></tr>
                                </c:if>
                                <c:if test="${movie.getReview()==null}">
                                    <tr><td>Reviews: No reviews yet</td></tr>
                                </c:if>
                                <tr><td><br></td></tr>
                                    </c:forEach>
                        </table>
                        <br><c:if test="${not empty  sessionScope.users }"> 
                            <a href="Review.jsp" class="btn btn-default">Add a review</a>
                        </c:if>
                    </div>
                </div>
            </div>
        </section>
        <script>
            $("#left").load("News.txt");
        </script>
    </body>
</html>