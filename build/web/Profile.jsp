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
                    <script>
                        $('#add1').hide();
                    </script>
                    <div class="word">
                        <h2>Profile</h2><br>
                        <div class="notif"><p id="notif">${sessionScope.notifications}</p></div>
                        <form method="POST" action="NotificationController">
                            <p id="notif" style="font-weight: bold">Follow your favorite movies!</p>
                            <table>
                            <c:forEach items="${sessionScope.movies}" var="movie">
                                <tr>
                                    <td rowspan="3"><img src="${movie.getImage()}" width="200"></td>
                                    <td>${movie.getName()}</td> 
                                </tr> 
                                <tr><td>Rating: ${movie.getRating()}</td></tr>
                                <tr><td>Date and time: ${movie.getDate()}, ${movie.getHour()} -
                                        <input type="checkbox" name="${movie.getName()}" value="${movie.getName()}" style="float: right"><p id="check" style="float: right">Notify me</p><br><br></td></tr>
                                <tr><td><br></td></tr>
                                
                            </c:forEach><br>
                            </table>
                            <input type="submit" value="Turn on notifications">
                        </form>
                        <h3>5 winning oscar movies</h3>
                        <h4>Choose year</h4>
                        <button id="show1" onClick="show1()">2015</button>
                        <div>
                            <p style="display:none" id="add1"> Birdman <br> The Theory of Everything <br> Whiplash <br> The Grand Budapest Hotel <br> Big Hero 6 <br> </p>
                        </div>
                        <button id="show1" onClick="show2()">2016</button>
                        <div>
                            <p style="display:none" id="add2"> Spotlight <br> The Revenant <br> The Danish Girl <br> Inside Out <br> Mad Max <br> </p>
                        </div>
                        <button id="show1" onClick="show3()">2017</button>
                        <div>
                            <p style="display:none"  id="add3"> Moonlight <br> La La Land <br> The Jungle Book <br> Suicide Squad <br> Zootopia <br> </p>
                        </div>

                        <script>
                            function show1() {
                                var x = document.getElementById("add1");
                                if (x.style.display === "none") {
                                    x.style.display = "block";
                                } else {
                                    x.style.display = "none";
                                }
                            }
                            function show2() {
                                var x = document.getElementById("add2");
                                if (x.style.display === "none") {
                                    x.style.display = "block";
                                } else {
                                    x.style.display = "none";
                                }
                            }
                            function show3() {
                                var x = document.getElementById("add3");
                                if (x.style.display === "none") {
                                    x.style.display = "block";
                                } else {
                                    x.style.display = "none";
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