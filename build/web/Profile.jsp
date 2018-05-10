<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
        <link rel="stylesheet" href="bootstrap.css"/>
        <link rel="stylesheet" href="style.css"/>
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
        <style>
            button{
                background-color:pink;
                box-shadow: inset 4px 4px 8px 0px #ffffff,4px 4px 8px 0px #ffb3b3;
                border: 1px solid black;
                font-size: 15px;
                border-radius:5px;
            }
            .form button{
                background-color:pink;
                box-shadow: inset 4px 4px 8px 0px #ffffff,4px 4px 8px 0px #ffb3b3;
                border: 1px solid black;
                font-size: 20px;
                border-radius:5px;
            }
            .cookie {
                padding-left:30px;
                padding-bottom:15px;
            }
        </style>
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
                <div class="left">
                    <img src="https://open-stand.org/wp-content/uploads/2016/04/International-Union-of-Cinemas-Calls-for-Open-Standards-in-the-Cinema-Industry.jpg" alt="cinema" width="260">
                    <h4>Cele mai aşteptate filme în 2018</h4>
                    <h5>La început de decembrie, am scris despre filmele cu potenţial la festivalurile cinematografice din anul 2018. Insa noul an vine la pachet cu mult mai multe titluri faine.</h5>
                    <h5>Tocmai din acest motiv m-am gândit să fac o scurtă trecere în revistă a blockbusterelor care, din punctul meu de vedere, vor defini 2018.</h5>
                    <img src="https://i.ytimg.com/vi/FDbtaYjF5dQ/maxresdefault.jpg" alt="world" width="260">
                    <h4>Recomandări TV. Lumi ieșite din comun</h4>
                    <h5>Serial SF. Westworld 2, premieră luni, 23 aprilie, ora 20, HBO</h5>
                    <h5>Romance distopic. Homarul (2015) marţi, 24 aprilie, ora 16:35,  Digi Film</h5>
                    <h5>Mister. O terapie pentru viaţă miercuri, 25 aprilie, ora 01:15, HBO</h5>
                </div>
                <div class="right">
                    <br></br><br>
                    <script>$('#add1').hide();</script>
                    <div class="word">
                        <h2>Profile</h2>
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
    </body>
</html>