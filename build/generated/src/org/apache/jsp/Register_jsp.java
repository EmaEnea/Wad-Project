package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/WEB-INF/jspf/header.jspf");
    _jspx_dependants.add("/WEB-INF/jspf/footer.jspf");
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

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <title></title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap.css\"/>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\"/>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\">\r\n");
      out.write("        <style>\r\n");
      out.write("            button{\r\n");
      out.write("                background-color:pink;\r\n");
      out.write("                box-shadow: inset 4px 4px 8px 0px #ffffff,4px 4px 8px 0px #ffb3b3;\r\n");
      out.write("                border: 1px solid black;\r\n");
      out.write("                font-size: 15px;\r\n");
      out.write("                border-radius:5px;\r\n");
      out.write("            }\r\n");
      out.write("            .form button{\r\n");
      out.write("                background-color:pink;\r\n");
      out.write("                box-shadow: inset 4px 4px 8px 0px #ffffff,4px 4px 8px 0px #ffb3b3;\r\n");
      out.write("                border: 1px solid black;\r\n");
      out.write("                font-size: 20px;\r\n");
      out.write("                border-radius:5px;\r\n");
      out.write("            }\r\n");
      out.write("            .cookie {\r\n");
      out.write("                padding-left:30px;\r\n");
      out.write("                padding-bottom:15px;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <header class=\"navigation\">\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("<div class=\"pic\">\r\n");
      out.write("    <img src=\"img/77.jpg\" width=\"200\" height=\"124\">\r\n");
      out.write("</div>\r\n");
      out.write("<nav>\r\n");
      out.write("    <ul>\r\n");
      out.write("        <li><a href=\"Home.jsp\" class=\"btn btn-danger btn-sm active\">\r\n");
      out.write("                <span class=\"glyphicon glyphicon-home\"></span> Home</a></li>\r\n");
      out.write("        <li><a href=\"Register.jsp\" class=\"btn btn-danger btn-sm active\">\r\n");
      out.write("                <span class=\"glyphicon glyphicon-registration-mark\"></span> Register</a></li>\r\n");
      out.write("        <li><a href=\"Login.jsp\" class=\"btn btn-danger btn-sm active\">\r\n");
      out.write("                <span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>\r\n");
      out.write("        <li><a href=\"Logout.jsp\" class=\"btn btn-danger btn-sm active\">\r\n");
      out.write("                <span class=\"glyphicon glyphicon-log-out\"></span> Logout</a></li>\r\n");
      out.write("        <li><a href=\"Profile.jsp\" class=\"btn btn-danger btn-sm active\">\r\n");
      out.write("                <span class=\"glyphicon glyphicon-user\"></span> Profile</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("</nav>");
      out.write("\r\n");
      out.write("    </header>\r\n");
      out.write("    <body class=\"background\" background=\"img/64.jpg\">\r\n");
      out.write("        <section>\r\n");
      out.write("            <div class=\"content\">\r\n");
      out.write("                <div class=\"box\">\r\n");
      out.write("                    <div class=\"container\">\r\n");
      out.write("                        <input type=\"search\" id=\"search\" placeholder=\"Search...\" />\r\n");
      out.write("                        <button class=\"icon\"><i class=\"fa fa-search\"></i></button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <br>\r\n");
      out.write("                <div class=\"left\">\r\n");
      out.write("                    <img src=\"https://open-stand.org/wp-content/uploads/2016/04/International-Union-of-Cinemas-Calls-for-Open-Standards-in-the-Cinema-Industry.jpg\" alt=\"cinema\" width=\"260\">\r\n");
      out.write("                    <h4>Cele mai aşteptate filme în 2018</h4>\r\n");
      out.write("                    <h5>La început de decembrie, am scris despre filmele cu potenţial la festivalurile cinematografice din anul 2018. Insa noul an vine la pachet cu mult mai multe titluri faine.</h5>\r\n");
      out.write("                    <h5>Tocmai din acest motiv m-am gândit să fac o scurtă trecere în revistă a blockbusterelor care, din punctul meu de vedere, vor defini 2018.</h5>\r\n");
      out.write("                    <img src=\"https://i.ytimg.com/vi/FDbtaYjF5dQ/maxresdefault.jpg\" alt=\"world\" width=\"260\">\r\n");
      out.write("                    <h4>Recomandări TV. Lumi ieșite din comun</h4>\r\n");
      out.write("                    <h5>Serial SF. Westworld 2, premieră luni, 23 aprilie, ora 20, HBO</h5>\r\n");
      out.write("                    <h5>Romance distopic. Homarul (2015) marţi, 24 aprilie, ora 16:35,  Digi Film</h5>\r\n");
      out.write("                    <h5>Mister. O terapie pentru viaţă miercuri, 25 aprilie, ora 01:15, HBO</h5>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"right\">\r\n");
      out.write("                    <br></br><br>\r\n");
      out.write("                    <div class=\"word\">\r\n");
      out.write("                        <h1>Registration form</h1>   \r\n");
      out.write("                        <form id=\"reg\" method=\"POST\" action=\"RegistrationController\"> \r\n");
      out.write("                            <div class=\"form-element\">\r\n");
      out.write("                                <label for=\"name\">Name</label>\r\n");
      out.write("                                <input type=\"text\" name=\"name\" id=\"name\" size=\"40\" required=\"\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-element\">\r\n");
      out.write("                                <label for=\"username\">Username</label>\r\n");
      out.write("                                <input type=\"text\" name=\"uname\" id=\"uname\" required=\"\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-element\">\r\n");
      out.write("                                <label for=\"password\">Password</label>\r\n");
      out.write("                                <input type=\"password\" name=\"password\" id=\"password\" required=\"\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-element\">\r\n");
      out.write("                                <label for=\"rPassword\">Repeat password</label>\r\n");
      out.write("                                <input type=\"password\" id=\"rPassword\" required=\"\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-element\">\r\n");
      out.write("                                <label for=\"email\">Email</label>\r\n");
      out.write("                                <input type=\"email\" id=\"email\" name=\"email\" required=\"\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-element\">\r\n");
      out.write("                                <input type=\"submit\" value=\"Submit\" onclick=\"return check(this)\">\r\n");
      out.write("                                <input type=\"reset\" value=\"Reset\">\r\n");
      out.write("                            </div>  \r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        <footer class=\"ending\">\r\n");
      out.write("            ");
      out.write("<h4>E-commerce application © WAD 2018</h4>");
      out.write("\r\n");
      out.write("        </footer>\r\n");
      out.write("    </body>\r\n");
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
