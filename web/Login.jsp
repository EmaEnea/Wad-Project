<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <%@include file="/WEB-INF/jspf/header.jspf" %>
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
                    <div class="word">
                        <h2>Login</h2>
                        <form method="POST" action="LoginController"> 
                            <div class="form-element">
                                <label for="username">Username</label>
                                <input type="text" name="uname" id="uname" required >
                            </div>
                            <div class="form-element" >
                                <label for="password" >Password</label>
                                <input type="password" name="password" id="password" required>
                            </div>
                            <div class="form-element">
                                <input type="submit" value="Submit" id="submit">
                            </div> 
                            <c:if test="${not empty requestScope.errors}">
                                <c:forEach items="${requestScope.errors}" var="error">
                                    <p>${error} </p>
                                    <br/>
                                </c:forEach>
                            </c:if>     
                        </form>
                    </div>
                </div>
            </div>
        </section>
        <footer class="ending">
            <%@include file="/WEB-INF/jspf/footer.jspf" %>
        </footer>
    </body>
</html>