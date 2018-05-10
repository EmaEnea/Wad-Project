package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/WEB-INF/jspf/header.jspf");
    _jspx_dependants.add("/WEB-INF/jspf/header_logged.jspf");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title></title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\">\n");
      out.write("        <style>\n");
      out.write("            button{\n");
      out.write("                background-color:pink;\n");
      out.write("                box-shadow: inset 4px 4px 8px 0px #ffffff,4px 4px 8px 0px #ffb3b3;\n");
      out.write("                border: 1px solid black;\n");
      out.write("                font-size: 15px;\n");
      out.write("                border-radius:5px;\n");
      out.write("            }\n");
      out.write("            .form button{\n");
      out.write("                background-color:pink;\n");
      out.write("                box-shadow: inset 4px 4px 8px 0px #ffffff,4px 4px 8px 0px #ffb3b3;\n");
      out.write("                border: 1px solid black;\n");
      out.write("                font-size: 20px;\n");
      out.write("                border-radius:5px;\n");
      out.write("            }\n");
      out.write("            .cookie {\n");
      out.write("                padding-left:30px;\n");
      out.write("                padding-bottom:15px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <header class=\"navigation\">\n");
      out.write("    ");
 int ok=1; 
      out.write("\n");
      out.write("    <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty  sessionScope.get(\"users\")}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> \n");
      out.write("            ");
 ok=0; 
      out.write("\n");
      out.write("            <script>\n");
      out.write("                console.log(sessionScope.get(\"users\"));\n");
      out.write("            </script>\n");
      out.write("            ");
      out.write("<div class=\"pic\">\n");
      out.write("    <img src=\"img/77.jpg\" width=\"200\" height=\"124\">\n");
      out.write("</div>\n");
      out.write("<nav>\n");
      out.write("    <ul>\n");
      out.write("        <li><a href=\"Home.jsp\" class=\"btn btn-danger btn-sm active\">\n");
      out.write("                <span class=\"glyphicon glyphicon-home\"></span> Home</a></li>\n");
      out.write("        <li><a href=\"Register.jsp\" class=\"btn btn-danger btn-sm active\">\n");
      out.write("                <span class=\"glyphicon glyphicon-registration-mark\"></span> Register</a></li>\n");
      out.write("        <li><a href=\"Login.jsp\" class=\"btn btn-danger btn-sm active\">\n");
      out.write("                <span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>\n");
      out.write("    </ul>\n");
      out.write("</nav>");
      out.write("\n");
      out.write("    </c:if>\n");
      out.write("    ");
 if (ok==1) { 
      out.write("\n");
      out.write("            ");
 System.out.println("user"); 
      out.write("\n");
      out.write("            ");
      out.write("<div class=\"pic\">\n");
      out.write("    <img src=\"img/77.jpg\" width=\"200\" height=\"124\">\n");
      out.write("</div>\n");
      out.write("<nav>\n");
      out.write("    <ul>\n");
      out.write("        <li><a href=\"Home.jsp\" class=\"btn btn-danger btn-sm active\">\n");
      out.write("                <span class=\"glyphicon glyphicon-home\"></span> Home</a></li>\n");
      out.write("        <li><a href=\"Logout.jsp\" class=\"btn btn-danger btn-sm active\">\n");
      out.write("                <span class=\"glyphicon glyphicon-log-out\"></span> Logout</a></li>\n");
      out.write("        <li><a href=\"Profile.jsp\" class=\"btn btn-danger btn-sm active\">\n");
      out.write("                <span class=\"glyphicon glyphicon-user\"></span> Profile</a></li>\n");
      out.write("    </ul>\n");
      out.write("</nav>>");
      out.write("\n");
      out.write("    ");
 } 
      out.write("\n");
      out.write("    </header>\n");
      out.write("    <body class=\"background\" background=\"img/64.jpg\">\n");
      out.write("        <section>\n");
      out.write("            <div class=\"content\">\n");
      out.write("                <div class=\"box\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <input type=\"search\" id=\"search\" placeholder=\"Search...\" />\n");
      out.write("                        <button class=\"icon\"><i class=\"fa fa-search\"></i></button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <br>\n");
      out.write("                <div class=\"left\">\n");
      out.write("                    <img src=\"https://open-stand.org/wp-content/uploads/2016/04/International-Union-of-Cinemas-Calls-for-Open-Standards-in-the-Cinema-Industry.jpg\" alt=\"cinema\" width=\"260\">\n");
      out.write("                    <h4>Cele mai aşteptate filme în 2018</h4>\n");
      out.write("                    <h5>La început de decembrie, am scris despre filmele cu potenţial la festivalurile cinematografice din anul 2018. Insa noul an vine la pachet cu mult mai multe titluri faine.</h5>\n");
      out.write("                    <h5>Tocmai din acest motiv m-am gândit să fac o scurtă trecere în revistă a blockbusterelor care, din punctul meu de vedere, vor defini 2018.</h5>\n");
      out.write("                    <img src=\"https://i.ytimg.com/vi/FDbtaYjF5dQ/maxresdefault.jpg\" alt=\"world\" width=\"260\">\n");
      out.write("                    <h4>Recomandări TV. Lumi ieșite din comun</h4>\n");
      out.write("                    <h5>Serial SF. Westworld 2, premieră luni, 23 aprilie, ora 20, HBO</h5>\n");
      out.write("                    <h5>Romance distopic. Homarul (2015) marţi, 24 aprilie, ora 16:35,  Digi Film</h5>\n");
      out.write("                    <h5>Mister. O terapie pentru viaţă miercuri, 25 aprilie, ora 01:15, HBO</h5>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"right\">\n");
      out.write("                    <br></br><br>\n");
      out.write("                    <div class=\"word\">\n");
      out.write("                        <h2>Home</h2>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
