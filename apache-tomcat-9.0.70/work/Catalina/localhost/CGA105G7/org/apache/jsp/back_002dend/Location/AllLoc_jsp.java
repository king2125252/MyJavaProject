/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.70
 * Generated at: 2023-01-12 14:48:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.back_002dend.Location;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AllLoc_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("  <script src=\"https://code.jquery.com/jquery-3.6.0.min.js\"></script>\r\n");
      out.write("  <meta charset=\"UTF-8\">\r\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("  <title>????????????</title>\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.2/font/bootstrap-icons.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"../css/back.css\">\r\n");
      out.write("  <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\r\n");
      out.write("    integrity=\"sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU\" crossorigin=\"anonymous\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"../css/listAllLoc.css\">\r\n");
      out.write("  <link rel=\"website icon\" href=\"../images/logo.png\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <!-- ---------------------aside body??? start--------------------->\r\n");
      out.write("  <aside class=\"aside\">\r\n");
      out.write("\r\n");
      out.write("    <img src=\"../images/logo.png\" width=\"80%\">\r\n");
      out.write("\r\n");
      out.write("    <ul class=\"aside_list\">\r\n");
      out.write("      <li><a href=\"#\">????????????</a></li>\r\n");
      out.write("      <li><a href=\"#\">????????????</a></li>\r\n");
      out.write("      <li><a href=\"#\">????????????</a></li>\r\n");
      out.write("      <li><a href=\"#\">????????????</a></li>\r\n");
      out.write("      <li><a href=\"#\">????????????</a></li>\r\n");
      out.write("      <li><a href=\"#\">????????????</a></li>\r\n");
      out.write("      <li><a href=\"#\">????????????</a></li>\r\n");
      out.write("      <li><a href=\"./aside.jsp\" class=\"bg-lblue\">????????????</a></li>\r\n");
      out.write("\r\n");
      out.write("    </ul>\r\n");
      out.write("    <h1 style=\"margin: 0;\">????????? &#58 empName</h1>\r\n");
      out.write("    <button><a href=\"#\">??????</a></button>\r\n");
      out.write("    <button><a href=\"#\">????????????</a></button>\r\n");
      out.write("\r\n");
      out.write("  </aside>\r\n");
      out.write("\r\n");
      out.write("  <div class=\"right\"></div>\r\n");
      out.write("  <!-- ---------------------aside body??? end--------------------->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <!-- ---------------------function body??? start--------------------->\r\n");
      out.write("  <div class=\"function sticky-top\">\r\n");
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- ---------------------function body??? end--------------------->\r\n");
      out.write("\r\n");
      out.write("  <!-- ---------------------main body??? start--------------------->\r\n");
      out.write("  <div class=\"workplace mt-2\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("        <div class=\"col\">\r\n");
      out.write("          <h3 class=\"fw-bold text-start\">??????????????????</h3>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <div class=\"row align-middle\">\r\n");
      out.write("        <div class=\"col text-end\">\r\n");
      out.write("          <button type=\"button\" class=\"btn btn-primary py-1 px-2\" data-bs-toggle=\"modal\"\r\n");
      out.write("            data-bs-target=\"#add\">????????????</button>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <div class=\"row mt-2\">\r\n");
      out.write("        <div class=\"col text-start\">\r\n");
      out.write("          <div class=\"d-inline\">??????</div>\r\n");
      out.write("          <select name=\"\">\r\n");
      out.write("            <option value=\"1\">1</option>\r\n");
      out.write("            <option value=\"2\">2</option>\r\n");
      out.write("            <option value=\"3\">3</option>\r\n");
      out.write("            <option value=\"5\">4</option>\r\n");
      out.write("          </select>\r\n");
      out.write("          <div class=\"d-inline\">?????????</div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"col text-end\">\r\n");
      out.write("          <form action=\"#\">\r\n");
      out.write("            <label for=\"searchLoc\">??????????????? : </label>\r\n");
      out.write("            <input type=\"text\" placeholder=\"?????????\" id=\"searchLoc\">\r\n");
      out.write("            <button class=\"btn btn-primary py-1 px-2\" type=\"submit\">\r\n");
      out.write("              <i class=\"bi bi-search\"></i>\r\n");
      out.write("            </button>\r\n");
      out.write("          </form>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("        <table class=\"table\">\r\n");
      out.write("          <thead>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <th scope=\"col\">??????</th>\r\n");
      out.write("              <th scope=\"col\">????????????</th>\r\n");
      out.write("              <th scope=\"col\">??????</th>\r\n");
      out.write("              <th scope=\"col\">????????????</th>\r\n");
      out.write("              <th scope=\"col\">??????</th>\r\n");
      out.write("              <th scope=\"col\">??????</th>\r\n");
      out.write("\r\n");
      out.write("            </tr>\r\n");
      out.write("          </thead>\r\n");
      out.write("          <tbody>\r\n");
      out.write("            <tr class=\"align-middle\">\r\n");
      out.write("              <td>1</td>\r\n");
      out.write("              <td class=\"text-truncate\">?????????????????????????????????????????????</td>\r\n");
      out.write("              <td class=\"text-truncate\">?????????????????????????????????</td>\r\n");
      out.write("              <td>??????</td>\r\n");
      out.write("              <td>\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-primary py-1 px-2\" data-bs-toggle=\"modal\"\r\n");
      out.write("                  data-bs-target=\"#updatePic\">??????????????????</button>\r\n");
      out.write("              </td>\r\n");
      out.write("              <td>\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-primary py-1 px-2\" data-bs-toggle=\"modal\"\r\n");
      out.write("                  data-bs-target=\"#update\">??????</button>\r\n");
      out.write("              </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("          </tbody>\r\n");
      out.write("        </table>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <!-- ?????? content start -->\r\n");
      out.write("      <div class=\"modal fade\" id=\"add\" tabindex=\"-1\" aria-labelledby=\"addLoc\" aria-hidden=\"true\">\r\n");
      out.write("        <div class=\"modal-dialog\">\r\n");
      out.write("\r\n");
      out.write("          <form action=\"\" class=\"modal-content\" method=\"post\">\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("              <h5 class=\"modal-title fw-bold\" id=\"addLoc\">????????????</h5>\r\n");
      out.write("              <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-body\">\r\n");
      out.write("\r\n");
      out.write("              <div class=\"container\">\r\n");
      out.write("                <div class=\"row m-2\">\r\n");
      out.write("                  <div class=\"col text-end p-0\">\r\n");
      out.write("                    <label for=\"Aloc_name\">???????????? : </label>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"col\">\r\n");
      out.write("                    <input type=\"text\" name=\"loc_name\" id=\"Aloc_name\" maxlength=\"15\" placeholder=\"??????\" value=\"\">\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"col text-start p-0\">\r\n");
      out.write("                    <span>????????????</span>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"row m-2\">\r\n");
      out.write("                  <div class=\"col text-end p-0\">\r\n");
      out.write("                    <label for=\"Alongitude\">?????? : </label>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"col\">\r\n");
      out.write("                    <input type=\"text\" name=\"longitude\" id=\"Alongitude\" maxlength=\"30\" placeholder=\"??????\" value=\"\">\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"col text-start p-0\">\r\n");
      out.write("                    <span>????????????</span>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"row m-2\">\r\n");
      out.write("                  <div class=\"col text-end p-0\">\r\n");
      out.write("                    <label for=\"Alatitude\">?????? : </label>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"col\">\r\n");
      out.write("                    <input type=\"text\" name=\"latitude\" id=\"Alatitude\" maxlength=\"30\" placeholder=\"??????\" value=\"\">\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"col text-start p-0\">\r\n");
      out.write("                    <span>????????????</span>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"row m-2\">\r\n");
      out.write("                  <div class=\"col text-end p-0\">\r\n");
      out.write("                    <label for=\"Aaddress\">?????? : </label>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"col\">\r\n");
      out.write("                    <input type=\"text\" name=\"address\" id=\"Aaddress\" maxlength=\"30\" placeholder=\"??????\" value=\"\">\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"col text-start p-0\">\r\n");
      out.write("                    <span>????????????</span>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"row m-2\">\r\n");
      out.write("                  <div class=\"col text-end p-0\">\r\n");
      out.write("                    <label for=\"Aphone\">???????????? : </label>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"col\">\r\n");
      out.write("                    <input type=\"text\" name=\"phone\" id=\"Aphone\" maxlength=\"15\">\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"col text-start p-0\">\r\n");
      out.write("                    <span>????????????</span>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"input-group p-4 pt-1\">\r\n");
      out.write("                  <label class=\"input-group-text\" for=\"Apicture\">???????????? : </label>\r\n");
      out.write("                  <input type=\"file\" class=\"form-control\" name=\"picture\" id=\"Apicture\" accept=\".jpg,.png,.jpeg\" multiple>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("              </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <input type=\"hidden\" name=\"action\" value=\"insert\">\r\n");
      out.write("            <div class=\"modal-footer\">\r\n");
      out.write("              <button type=\"button\" class=\"btn btn-secondary\" data-bs-dismiss=\"modal\">??????</button>\r\n");
      out.write("              <button type=\"submit\" class=\"btn btn-primary\">??????</button>\r\n");
      out.write("            </div>\r\n");
      out.write("          </form>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- ?????? content end -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <!-- ???????????? content start -->\r\n");
      out.write("  <div class=\"modal fade\" id=\"updatePic\" tabindex=\"-1\" aria-labelledby=\"pic\" aria-hidden=\"true\">\r\n");
      out.write("    <div class=\"modal-dialog\">\r\n");
      out.write("\r\n");
      out.write("      <div class=\"modal-content\">\r\n");
      out.write("        <div class=\"modal-header\">\r\n");
      out.write("          <h5 class=\"modal-title fw-bold\" id=\"pic\">????????????</h5>\r\n");
      out.write("          <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"modal-body\">\r\n");
      out.write("\r\n");
      out.write("          <div id=\"viewPic\" class=\"carousel slide carousel-dark\" data-bs-interval=\"false\">\r\n");
      out.write("            <div class=\"carousel-indicators\">\r\n");
      out.write("              <button type=\"button\" data-bs-target=\"#viewPic\" data-bs-slide-to=\"0\" class=\"active\" aria-current=\"true\"></button>\r\n");
      out.write("              <button type=\"button\" data-bs-target=\"#viewPic\" data-bs-slide-to=\"1\"></button>\r\n");
      out.write("              <button type=\"button\" data-bs-target=\"#viewPic\" data-bs-slide-to=\"2\"></button>\r\n");
      out.write("              \r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"carousel-inner\">\r\n");
      out.write("              <div class=\"carousel-item active\">\r\n");
      out.write("                <img src=\"../images/JavaTime.png\" class=\"d-block w-100\">\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"carousel-item\">\r\n");
      out.write("                <img src=\"../images/JavaTime.png\" class=\"d-block w-100\">\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"carousel-item\">\r\n");
      out.write("                <img src=\"../images/JavaTime.png\" class=\"d-block w-100\">\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <button class=\"carousel-control-prev\" type=\"button\" data-bs-target=\"#viewPic\" data-bs-slide=\"prev\">\r\n");
      out.write("              <span class=\"carousel-control-prev-icon\"></span>\r\n");
      out.write("              <span class=\"visually-hidden\">Previous</span>\r\n");
      out.write("            </button>\r\n");
      out.write("            <button class=\"carousel-control-next\" type=\"button\" data-bs-target=\"#viewPic\" data-bs-slide=\"next\">\r\n");
      out.write("              <span class=\"carousel-control-next-icon\"></span>\r\n");
      out.write("              <span class=\"visually-hidden\">Next</span>\r\n");
      out.write("            </button>\r\n");
      out.write("          </div>\r\n");
      out.write("          \r\n");
      out.write("          <form class=\"mt-2\" method=\"post\" action=\"\">\r\n");
      out.write("            <input type=\"checkbox\" id=\"pic1\" >\r\n");
      out.write("            <label for=\"pic1\" class=\"align-baseline m-1\">??????1</label>\r\n");
      out.write("\r\n");
      out.write("            <input type=\"checkbox\" id=\"pic2\" >\r\n");
      out.write("            <label for=\"pic2\" class=\"align-baseline m-1\">??????2</label>\r\n");
      out.write("\r\n");
      out.write("            <input type=\"checkbox\" id=\"pic3\" >\r\n");
      out.write("            <label for=\"pic3\" class=\"align-baseline m-1\">??????3</label>\r\n");
      out.write("\r\n");
      out.write("            <button type=\"submit\" class=\"btn btn-danger py-1 px-2\">???????????? </button>\r\n");
      out.write("          </form>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"input-group p-3\">\r\n");
      out.write("          <label class=\"input-group-text\" for=\"addpic\">????????????</label>\r\n");
      out.write("          <input type=\"file\" class=\"form-control\" id=\"addpic\" multiple>\r\n");
      out.write("        </div>\r\n");
      out.write("        <input type=\"hidden\" name=\"action\" value=\"updatePic\">\r\n");
      out.write("        <div class=\"modal-footer\">\r\n");
      out.write("          <button type=\"button\" class=\"btn btn-secondary\" data-bs-dismiss=\"modal\">??????</button>\r\n");
      out.write("          <button type=\"submit\" class=\"btn btn-primary\">??????</button>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- ?????? content end -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("      <!-- ?????? content start -->\r\n");
      out.write("      <div class=\"modal fade\" id=\"update\" tabindex=\"-1\" aria-labelledby=\"updateLoc\" aria-hidden=\"true\">\r\n");
      out.write("        <div class=\"modal-dialog\">\r\n");
      out.write("\r\n");
      out.write("          <form action=\"\" class=\"modal-content\" method=\"post\">\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("              <h5 class=\"modal-title fw-bold\" id=\"updateLoc\">????????????</h5>\r\n");
      out.write("              <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-body\">\r\n");
      out.write("\r\n");
      out.write("              <div class=\"container\">\r\n");
      out.write("                <div class=\"row m-2\">\r\n");
      out.write("                  <div class=\"col text-end p-0\">\r\n");
      out.write("                    <label for=\"Uloc_name\">???????????? : </label>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"col\">\r\n");
      out.write("                    <input type=\"text\" name=\"loc_name\" id=\"Uloc_name\" maxlength=\"15\" placeholder=\"??????\" value=\"\">\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"col text-start p-0\">\r\n");
      out.write("                    <span>????????????</span>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"row m-2\">\r\n");
      out.write("                  <div class=\"col text-end p-0\">\r\n");
      out.write("                    <label for=\"Ulongitude\">?????? : </label>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"col\">\r\n");
      out.write("                    <input type=\"text\" name=\"longitude\" id=\"Ulongitude\" maxlength=\"30\" placeholder=\"??????\" value=\"\">\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"col text-start p-0\">\r\n");
      out.write("                    <span>????????????</span>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"row m-2\">\r\n");
      out.write("                  <div class=\"col text-end p-0\">\r\n");
      out.write("                    <label for=\"Ulatitude\">?????? : </label>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"col\">\r\n");
      out.write("                    <input type=\"text\" name=\"latitude\" id=\"Ulatitude\" maxlength=\"30\" placeholder=\"??????\" value=\"\">\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"col text-start p-0\">\r\n");
      out.write("                    <span>????????????</span>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"row m-2\">\r\n");
      out.write("                  <div class=\"col text-end p-0\">\r\n");
      out.write("                    <label for=\"Uaddress\">?????? : </label>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"col\">\r\n");
      out.write("                    <input type=\"text\" name=\"address\" id=\"Uaddress\" maxlength=\"30\" placeholder=\"??????\" value=\"\">\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"col text-start p-0\">\r\n");
      out.write("                    <span>????????????</span>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"row m-2\">\r\n");
      out.write("                  <div class=\"col text-end p-0\">\r\n");
      out.write("                    <label for=\"Uphone\">???????????? : </label>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"col\">\r\n");
      out.write("                    <input type=\"text\" name=\"phone\" id=\"Uphone\" maxlength=\"15\">\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"col text-start p-0\">\r\n");
      out.write("                    <span>????????????</span>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"row m-2\">\r\n");
      out.write("                  <div class=\"col text-center p-0\">\r\n");
      out.write("                    <div>???????????? : </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"col-3 text-start\">\r\n");
      out.write("                    <input type=\"radio\" name=\"status\" id=\"puton\" value=\"??????\">\r\n");
      out.write("                    <label for=\"puton\">??????</label>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"col text-start\">\r\n");
      out.write("                    <input type=\"radio\" name=\"status\" id=\"putoff\" value=\"??????\">\r\n");
      out.write("                    <label for=\"putoff\">??????</label>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("              </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <input type=\"hidden\" name=\"action\" value=\"update\">\r\n");
      out.write("            <div class=\"modal-footer\">\r\n");
      out.write("              <button type=\"button\" class=\"btn btn-secondary\" data-bs-dismiss=\"modal\">??????</button>\r\n");
      out.write("              <button type=\"submit\" class=\"btn btn-primary\">??????</button>\r\n");
      out.write("            </div>\r\n");
      out.write("          </form>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- ???????????? content end -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- ---------------------main body??? end--------------------->\r\n");
      out.write("\r\n");
      out.write("  <script src=\"https://kit.fontawesome.com/616f19a0b0.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("  <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("    integrity=\"sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ\"\r\n");
      out.write("    crossorigin=\"anonymous\"></script>\r\n");
      out.write("  <script>\r\n");
      out.write("\r\n");
      out.write("    $(\".aside_list li\").click(function () {\r\n");
      out.write("      $(this).css(\"background\", \"#041427\").siblings().css(\"background\", \"\");\r\n");
      out.write("    })\r\n");
      out.write("  </script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
