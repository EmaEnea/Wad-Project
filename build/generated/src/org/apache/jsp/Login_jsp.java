package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/WEB-INF/jspf/header.jspf");
    _jspx_dependants.add("/WEB-INF/jspf/header_logged.jspf");
    _jspx_dependants.add("/WEB-INF/jspf/header_admin.jspf");
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
      out.write("        <script src=\"jquery-3.3.1.js\"></script>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\"/>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <header class=\"navigation\">\r\n");
      out.write("        ");
 int ok = 1;
        int ad = 1; 
      out.write("\r\n");
      out.write("        <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty  sessionScope.users }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> \r\n");
      out.write("            ");
 ok = 0; 
      out.write("\r\n");
      out.write("            ");
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
      out.write("    </ul>\r\n");
      out.write("</nav>");
      out.write("\r\n");
      out.write("        </c:if>\r\n");
      out.write("        <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty  sessionScope.admin }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> \r\n");
      out.write("            ");
 ad = 0; 
      out.write("\r\n");
      out.write("        </c:if>\r\n");
      out.write("        ");
 if (ok == 1 && ad==0) { 
      out.write("\r\n");
      out.write("        ");
      out.write("<div class=\"pic\">\r\n");
      out.write("    <img src=\"img/77.jpg\" width=\"200\" height=\"124\">\r\n");
      out.write("</div>\r\n");
      out.write("<nav>\r\n");
      out.write("    <ul>\r\n");
      out.write("        <li><a href=\"Home.jsp\" class=\"btn btn-danger btn-sm active\">\r\n");
      out.write("                <span class=\"glyphicon glyphicon-home\"></span> Home</a></li>\r\n");
      out.write("        <li><a href=\"LogoutController\" class=\"btn btn-danger btn-sm active\">\r\n");
      out.write("                <span class=\"glyphicon glyphicon-log-out\"></span> Logout</a></li>\r\n");
      out.write("        <li><a href=\"Profile.jsp\" class=\"btn btn-danger btn-sm active\">\r\n");
      out.write("                <span class=\"glyphicon glyphicon-user\"></span> Profile</a></li>\r\n");
      out.write("        <li><a href=\"Settings.jsp\" class=\"btn btn-danger btn-sm active\">\r\n");
      out.write("                <span class=\"glyphicon glyphicon-settings\"></span> Settings</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("</nav>>");
      out.write("\r\n");
      out.write("        ");
 }
      out.write("\r\n");
      out.write("        ");
 if (ok == 1 && ad==1) { 
      out.write("\r\n");
      out.write("        ");
      out.write("<div class=\"pic\">\r\n");
      out.write("    <img src=\"img/77.jpg\" width=\"200\" height=\"124\">\r\n");
      out.write("</div>\r\n");
      out.write("<nav>\r\n");
      out.write("    <ul>\r\n");
      out.write("        <li><a href=\"Home.jsp\" class=\"btn btn-danger btn-sm active\">\r\n");
      out.write("                <span class=\"glyphicon glyphicon-home\"></span> Home</a></li>\r\n");
      out.write("        <li><a href=\"LogoutController\" class=\"btn btn-danger btn-sm active\">\r\n");
      out.write("                <span class=\"glyphicon glyphicon-log-out\"></span> Logout</a></li>\r\n");
      out.write("        <li><a href=\"AdminProfile.jsp\" class=\"btn btn-danger btn-sm active\">\r\n");
      out.write("                <span class=\"glyphicon glyphicon-user\"></span> Profile</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("</nav>>");
      out.write("\r\n");
      out.write("        ");
 }
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
      out.write("                <div class=\"left\" id=\"left\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"right\">\r\n");
      out.write("                    <br></br><br>\r\n");
      out.write("                    <div class=\"word\">\r\n");
      out.write("                        <h2>Login</h2>\r\n");
      out.write("                        <form method=\"POST\" action=\"LoginController\"> \r\n");
      out.write("                            <div class=\"form-element\">\r\n");
      out.write("                                <label for=\"username\">Username</label>\r\n");
      out.write("                                <input type=\"text\" name=\"uname\" id=\"uname\" required >\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-element\" >\r\n");
      out.write("                                <label for=\"password\" >Password</label>\r\n");
      out.write("                                <input type=\"password\" name=\"password\" id=\"password\" required>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-element\">\r\n");
      out.write("                                <input type=\"submit\" value=\"Submit\" id=\"submit\">\r\n");
      out.write("                            </div> \r\n");
      out.write("                            <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty requestScope.errors}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                                <c:forEach items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.errors}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" var=\"error\">\r\n");
      out.write("                                    <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </p>\r\n");
      out.write("                                    <br/>\r\n");
      out.write("                                </c:forEach>\r\n");
      out.write("                            </c:if>     \r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        <script>\r\n");
      out.write("            $(\"#left\").load(\"News.txt\");\r\n");
      out.write("        </script>\r\n");
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
