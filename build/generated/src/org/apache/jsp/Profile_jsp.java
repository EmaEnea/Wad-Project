package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Profile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/WEB-INF/jspf/header.jspf");
    _jspx_dependants.add("/WEB-INF/jspf/header_logged.jspf");
    _jspx_dependants.add("/WEB-INF/jspf/header_admin.jspf");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_c_if_test.release();
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
      out.write("        ");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_0.setPageContext(_jspx_page_context);
      _jspx_th_c_if_0.setParent(null);
      _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty  sessionScope.users }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write(" \r\n");
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
          out.write("        ");
          int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
        return;
      }
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      out.write("\r\n");
      out.write("        ");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_1.setPageContext(_jspx_page_context);
      _jspx_th_c_if_1.setParent(null);
      _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty  sessionScope.admin }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
      if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write(" \r\n");
          out.write("            ");
 ad = 0; 
          out.write("\r\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
        return;
      }
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      out.write("\r\n");
      out.write("        ");
 if (ok == 1 && ad == 0) { 
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
 if (ok == 1 && ad == 1) { 
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
      out.write("                    <script>\r\n");
      out.write("                        $('#add1').hide();\r\n");
      out.write("                    </script>\r\n");
      out.write("                    <div class=\"word\">\r\n");
      out.write("                        <h2>Profile</h2><br>\r\n");
      out.write("                        <form method=\"POST\" action=\"NotificationController\">\r\n");
      out.write("                            <p id=\"notif\" style=\"font-weight: bold\">Follow your favorite movies!</p>\r\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("<br>\r\n");
      out.write("                            <input type=\"submit\" value=\"Turn on notifications\">\r\n");
      out.write("                        </form>\r\n");
      out.write("                        <h3>5 winning oscar movies</h3>\r\n");
      out.write("                        <h4>Choose year</h4>\r\n");
      out.write("                        <button id=\"show1\" onClick=\"show1()\">2015</button>\r\n");
      out.write("                        <div>\r\n");
      out.write("                            <p style=\"display:none\" id=\"add1\"> Birdman <br> The Theory of Everything <br> Whiplash <br> The Grand Budapest Hotel <br> Big Hero 6 <br> </p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <button id=\"show1\" onClick=\"show2()\">2016</button>\r\n");
      out.write("                        <div>\r\n");
      out.write("                            <p style=\"display:none\" id=\"add2\"> Spotlight <br> The Revenant <br> The Danish Girl <br> Inside Out <br> Mad Max <br> </p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <button id=\"show1\" onClick=\"show3()\">2017</button>\r\n");
      out.write("                        <div>\r\n");
      out.write("                            <p style=\"display:none\"  id=\"add3\"> Moonlight <br> La La Land <br> The Jungle Book <br> Suicide Squad <br> Zootopia <br> </p>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <script>\r\n");
      out.write("                            function show1() {\r\n");
      out.write("                                var x = document.getElementById(\"add1\");\r\n");
      out.write("                                if (x.style.display === \"none\") {\r\n");
      out.write("                                    x.style.display = \"block\";\r\n");
      out.write("                                } else {\r\n");
      out.write("                                    x.style.display = \"none\";\r\n");
      out.write("                                }\r\n");
      out.write("                            }\r\n");
      out.write("                            function show2() {\r\n");
      out.write("                                var x = document.getElementById(\"add2\");\r\n");
      out.write("                                if (x.style.display === \"none\") {\r\n");
      out.write("                                    x.style.display = \"block\";\r\n");
      out.write("                                } else {\r\n");
      out.write("                                    x.style.display = \"none\";\r\n");
      out.write("                                }\r\n");
      out.write("                            }\r\n");
      out.write("                            function show3() {\r\n");
      out.write("                                var x = document.getElementById(\"add3\");\r\n");
      out.write("                                if (x.style.display === \"none\") {\r\n");
      out.write("                                    x.style.display = \"block\";\r\n");
      out.write("                                } else {\r\n");
      out.write("                                    x.style.display = \"none\";\r\n");
      out.write("                                }\r\n");
      out.write("                            }\r\n");
      out.write("                        </script>\r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.movies}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("movie");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                ");
          if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("                                <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${movie.getImage()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" width=\"200\"> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${movie.getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("  rating: ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${movie.getRating()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("<br><br>\r\n");
          out.write("                                <input type=\"checkbox\" name=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${movie.getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${movie.getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" style=\"float: right\"><p id=\"check\" style=\"float: right\">Notify me</p><br><br>\r\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.name}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }
}
