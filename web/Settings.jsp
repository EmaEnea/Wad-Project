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
                        <h2>Settings</h2>
                        <h3> Choose the movie genres that you are interested in. </h3>
                        <form id="set" method="POST" action="SettingsController"> 
                            <div class="form-element">
                                <label for="drama">Drama</label>
                                <input type="checkbox" name="drama" id="drama" size="40">
                            </div>
                            <div class="form-element">
                                <label for="SF">SF</label>
                                <input type="checkbox" name="SF" id="SF" size="40">
                            </div>
                            <div class="form-element">
                                <label for="action">Action</label>
                                <input type="checkbox" name="action" id="action" size="40">
                            </div>
                            <div class="form-element">
                                <label for="romance">Romance</label>
                                <input type="checkbox" name="romance" id="romance" size="40">
                            </div>
                            <div class="form-element">
                                <label for="comedy">Comedy</label>
                                <input type="checkbox" name="comedy" id="comedy" size="40">
                            </div>
                            <div class="form-element">
                                <label for="horror">Horror</label>
                                <input type="checkbox" name="horror" id="horror" size="40">
                            </div>
                            <div class="form-element">
                                <label for="advent">Adventure</label>
                                <input type="checkbox" name="advent" id="advent" size="40">
                            </div>
                            <div class="form-element">
                                <label for="fant">Fantasy</label>
                                <input type="checkbox" name="fant" id="fant" size="40">
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