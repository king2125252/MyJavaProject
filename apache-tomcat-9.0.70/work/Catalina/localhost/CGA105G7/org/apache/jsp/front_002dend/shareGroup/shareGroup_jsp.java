/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.70
 * Generated at: 2023-02-06 10:49:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.front_002dend.shareGroup;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class shareGroup_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/front-end/shareGroup/../headAndFoot/header.jsp", Long.valueOf(1675517835898L));
    _jspx_dependants.put("/front-end/shareGroup/../headAndFoot/footer.jsp", Long.valueOf(1675662312276L));
  }

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
      out.write("    \r\n");
      out.write("   ");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"UTF-8\">\r\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("  <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\r\n");
      out.write("    integrity=\"sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU\" crossorigin=\"anonymous\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.2/font/bootstrap-icons.css\"\r\n");
      out.write("    integrity=\"sha384-b6lVK+yci+bfDmaY1u0zE8YYJt0TZxLEAFyYSLHId4xoVvsrQu3INevFKo+Xir8e\" crossorigin=\"anonymous\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/front-end/css/jquery.datetimepicker.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/front-end/css/header.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/front-end/css/userTripAll.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/front-end/css/tripPlan.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/front-end/LeafletMarkers/css/leaflet.extra-markers.min.css\">\r\n");
      out.write("   <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.3/jquery.min.js\"\r\n");
      out.write("    integrity=\"sha512-STof4xm1wgkfm7heWqFJVn58Hm3EtS31XFaagaa8VMReCXAkQnJZ+jEy8PCC/iT18dFy95WcExNHFTqLyp72eQ==\"\r\n");
      out.write("    crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\"></script>\r\n");
      out.write("    \r\n");
      out.write("<!-- below is tripPlan  -->\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://unpkg.com/leaflet@1.9.3/dist/leaflet.css\"\r\n");
      out.write("    integrity=\"sha256-kLaT2GOSpHechhsozzB+flnD+zUyjE2LlfWPgU04xyI=\" crossorigin=\"\" />\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body style=\"overflow: auto\">\r\n");
      out.write("  <!-- nav start -->\r\n");
      out.write("  <nav class=\"navbar navbar-expand-lg navbar-light bg-cblue sticky-top\">\r\n");
      out.write("    <div class=\"container-fluid\">\r\n");
      out.write("      <a class=\"navbar-brand\" href=\"./header.html\">\r\n");
      out.write("        <img src=\"");
      out.print(request.getContextPath() );
      out.write("/front-end/images/Logo.jpg\" id=\"logo\">\r\n");
      out.write("      </a>\r\n");
      out.write("      <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\"\r\n");
      out.write("        aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("        <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("      </button>\r\n");
      out.write("      <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("        <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\r\n");
      out.write("          <li class=\"nav-item hover-down\">\r\n");
      out.write("            <a class=\"nav-link fs-5 fw-bold\" href=\"#\">??????</a>\r\n");
      out.write("            <ul class=\"bg-cblue hover-list\">\r\n");
      out.write("              <li><a class=\"hover-item fs-5 fw-bold\" href=\"#\">????????????</a></li>\r\n");
      out.write("              <li><a class=\"hover-item fs-5 fw-bold\" href=\"#\">??????</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li class=\"nav-item hover-down\">\r\n");
      out.write("            <a class=\"nav-link fs-5 fw-bold\" href=\"#\">??????</a>\r\n");
      out.write("            <ul class=\"bg-cblue hover-list\">\r\n");
      out.write("              <li><a class=\"hover-item fs-5 fw-bold\" href=\"#\">????????????</a></li>\r\n");
      out.write("              <li><a class=\"hover-item fs-5 fw-bold\" href=\"#\">????????????</a></li>\r\n");
      out.write("              <li><a class=\"hover-item fs-5 fw-bold\" href=\"#\">?????????</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li class=\"nav-item hover-down\">\r\n");
      out.write("            <a class=\"nav-link fs-5 fw-bold\" href=\"#\">??????</a>\r\n");
      out.write("            <ul class=\"bg-cblue hover-list\">\r\n");
      out.write("              <li><a class=\"hover-item fs-5 fw-bold\" href=\"#\">????????????</a></li>\r\n");
      out.write("              <li><a class=\"hover-item fs-5 fw-bold\" href=\"#\">????????????</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("          </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <ul class=\"navbar-nav mb-2 mb-lg-0\">\r\n");
      out.write("          <li class=\"nav-item bg-dblue rounded mx-3 input-group\">\r\n");
      out.write("            <form action=\"tripLoc.do\" method=\"post\" class=\"d-flex\" id=\"search-loc\">\r\n");
      out.write("            </form>\r\n");
      out.write("          </li>\r\n");
      out.write("\r\n");
      out.write("          <li class=\"nav-item user-msg\">\r\n");
      out.write("            <i class=\"bi bi-bell-fill fa-2x msg-icon\"></i>\r\n");
      out.write("            <ul class=\"bg-cblue msg-list\">\r\n");
      out.write("              <li class=\"msg-item\">\r\n");
      out.write("                <h5>title</h5>\r\n");
      out.write("                <p class=\"text-truncate\">\r\n");
      out.write("                  ????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????\r\n");
      out.write("                </p>\r\n");
      out.write("              </li>\r\n");
      out.write("              <hr class=\"m-1\">\r\n");
      out.write("\r\n");
      out.write("              <li class=\"msg-item\">\r\n");
      out.write("                <h5>title</h5>\r\n");
      out.write("                <p class=\"text-truncate\">????????????</p>\r\n");
      out.write("              </li>\r\n");
      out.write("              <hr class=\"m-1\">\r\n");
      out.write("\r\n");
      out.write("              <li class=\"msg-item\">\r\n");
      out.write("                <form action=\"\">\r\n");
      out.write("                  <h5>XXX??????????????????????????????</h5>\r\n");
      out.write("                  <button class=\"btn btn-primary rounded p-1\">??????</button>\r\n");
      out.write("                  <button class=\"btn btn-danger rounded p-1\">??????</button>\r\n");
      out.write("                </form>\r\n");
      out.write("              </li>\r\n");
      out.write("              <hr class=\"m-1\">\r\n");
      out.write("\r\n");
      out.write("              <li class=\"msg-item\">\r\n");
      out.write("                <h5>title</h5>\r\n");
      out.write("                <p class=\"text-truncate\">????????????</p>\r\n");
      out.write("              </li>\r\n");
      out.write("              <hr class=\"m-1\">\r\n");
      out.write("            </ul>\r\n");
      out.write("          </li>\r\n");
      out.write("\r\n");
      out.write("          <li class=\"nav-item mx-3 user-info\">\r\n");
      out.write("            <img src=\"");
      out.print(request.getContextPath() );
      out.write("/front-end/images/dog.jpeg\" alt=\"????????????\" class=\"user-pic\">\r\n");
      out.write("            <ul class=\"bg-cblue info-list\">\r\n");
      out.write("              <li><a href=\"#\" class=\"d-block info-item\">??????????????????</a></li>\r\n");
      out.write("              <li><a href=\"#\" class=\"d-block info-item\">????????????</a></li>\r\n");
      out.write("              <li><a href=\"#\" class=\"d-block info-item\">????????????</a></li>\r\n");
      out.write("              <li><a href=\"#\" class=\"d-block info-item\">????????????</a></li>\r\n");
      out.write("              <li><a href=\"#\" class=\"d-block info-item\">??????</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("          </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </nav>\r\n");
      out.write("  <!-- nav end -->");
      out.write("\r\n");
      out.write("  <title>7 Tour | ???????????? </title>\r\n");

	String tripName = request.getParameter("TRIP_NAME");
	String startDate =request.getParameter("STARTDATE");
	String endDate = request.getParameter("ENDDATE");

      out.write("\r\n");
      out.write("  <!-- content start -->\r\n");
      out.write("  <section class=\"intro\">\r\n");
      out.write("    <div class=\"bg-image-vertical\" style=\"margin-bottom: -50px; background-color: #EFD3E4;\r\n");
      out.write("            background-image: url(../images/shareGroup.jpg); background-size: cover;\">\r\n");
      out.write("      <div class=\"mask d-flex align-items-center h-100\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("          <div class=\"row justify-content-center\">\r\n");
      out.write("            <div class=\"col-12 col-lg-10 w-50\">\r\n");
      out.write("              <div class=\"card\" style=\"border-radius: 1rem; background-color: rgba(255,255,255,0.4 );\">\r\n");
      out.write("                <div class=\"card-body p-4\">\r\n");
      out.write("                  <h1 class=\"mb-4 text-center\">????????????</h1>\r\n");
      out.write("                  <form>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"form-outline mb-4\">\r\n");
      out.write("                      <label class=\"form-label\" for=\"groupTopic\">???????????? : </label>\r\n");
      out.write("                      <input type=\"text\" id=\"groupTopic\" class=\"form-control\" value=\"");
      out.print(tripName);
      out.write("\" required />\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"d-flex justify-content-around\">\r\n");
      out.write("                      <div class=\"form-outline mb-4\">\r\n");
      out.write("                        <label class=\"form-label\" for=\"regStart\">?????????????????? : </label>\r\n");
      out.write("                        <input type=\"text\" id=\"regStart\" class=\"form-control\" required />\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"form-outline mb-4\">\r\n");
      out.write("                        <label class=\"form-label\" for=\"regEnd\">?????????????????? : </label>\r\n");
      out.write("                        <input type=\"text\" id=\"regEnd\" class=\"form-control\" required />\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"d-flex justify-content-around\">\r\n");
      out.write("                      <div class=\"form-outline mb-4\">\r\n");
      out.write("                        <label class=\"form-label\" for=\"tripStart\">?????????????????? : </label>\r\n");
      out.write("                        <input type=\"text\" id=\"tripStart\" class=\"form-control\" value=\"");
      out.print(startDate);
      out.write("\" required />\r\n");
      out.write("                      </div>\r\n");
      out.write("\r\n");
      out.write("                      <div class=\"form-outline mb-4\">\r\n");
      out.write("                        <label class=\"form-label\" for=\"tripEnd\">?????????????????? : </label>\r\n");
      out.write("                        <input type=\"text\" id=\"tripEnd\" class=\"form-control\" value=\"");
      out.print(endDate);
      out.write("\" required />\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"form-outline mb-4\">\r\n");
      out.write("                      <label class=\"form-label\" for=\"numPeo\">???????????? : </label>\r\n");
      out.write("                      <input type=\"number\" min=\"0\" id=\"numPeo\" class=\"form-control\" value=\"0\" required />\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"form-outline mb-4\">\r\n");
      out.write("                      <label class=\"form-label\" for=\"actContent\">????????????</label>\r\n");
      out.write("                      <textarea class=\"form-control\" style=\"height: 200px; resize: none;\" id=\"actContent\" required></textarea>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <!-- Submit button -->\r\n");
      out.write("                    <div class=\"text-end\">\r\n");
      out.write("                      <a href=\"#\" class=\"btn btn-secondary\">??????</a>\r\n");
      out.write("                      <button type=\"submit\" class=\"btn btn-primary\">??????</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </form>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </section>\r\n");
      out.write("  <!-- content end -->\r\n");
      out.write("\r\n");
      out.write("    <!-- footer start -->\r\n");
      out.write("\r\n");
      out.write("    <footer class=\"text-center text-lg-start text-dark bg-cblue mt-5\">\r\n");
      out.write("      <div class=\"container p-4 pb-0\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("          <div class=\"col-md-3 col-lg-3 col-xl-3 mx-auto mt-3\">\r\n");
      out.write("            <h6 class=\"mb-2 font-weight-bold\">TibaMe CGA105 JAVA??? ?????????</h6>\r\n");
      out.write("            <p class=\"mb-2\">?????? : </p>\r\n");
      out.write("            <p>\r\n");
      out.write("              XXXXXXX\r\n");
      out.write("            </p>\r\n");
      out.write("          </div>\r\n");
      out.write("  \r\n");
      out.write("          <hr class=\"w-100 clearfix d-md-none\" />\r\n");
      out.write("  \r\n");
      out.write("          <div class=\"col-md-4 col-lg-3 col-xl-3 mx-auto mt-3\">\r\n");
      out.write("            <h6 class=\"text-uppercase mb-4 font-weight-bold\">????????????</h6>\r\n");
      out.write("            <p><i class=\"fas fa-envelope mr-3\"></i>?????????email</p>\r\n");
      out.write("            <p><i class=\"fas fa-phone mr-3\"></i>???????????????</p>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("  \r\n");
      out.write("        <hr class=\"my-3\">\r\n");
      out.write("  \r\n");
      out.write("        <section class=\"p-3 pt-0\">\r\n");
      out.write("          <div class=\"row d-flex align-items-center\">\r\n");
      out.write("            <div class=\"col-md-7 col-lg-8 text-center text-md-start\">\r\n");
      out.write("              <div class=\"p-3\">?? 2020 Copyright</div>\r\n");
      out.write("            </div>\r\n");
      out.write("  \r\n");
      out.write("            <div class=\"col-md-5 col-lg-4 ml-lg-0 text-center text-md-end\">\r\n");
      out.write("              <!-- Facebook -->\r\n");
      out.write("              <a class=\"btn btn-outline-light btn-floating m-1\" role=\"button\">\r\n");
      out.write("                <i class=\"fab fa-facebook-f\"></i></a>\r\n");
      out.write("  \r\n");
      out.write("              <!-- Google -->\r\n");
      out.write("              <a class=\"btn btn-outline-light btn-floating m-1\" role=\"button\">\r\n");
      out.write("                <i class=\"fab fa-google\"></i></a>\r\n");
      out.write("  \r\n");
      out.write("              <!-- Instagram -->\r\n");
      out.write("              <a class=\"btn btn-outline-light btn-floating m-1\" role=\"button\">\r\n");
      out.write("                <i class=\"fab fa-instagram\"></i></a>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </section>\r\n");
      out.write("      </div>\r\n");
      out.write("    </footer>\r\n");
      out.write("    <!-- footer end -->\r\n");
      out.write("  ");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("  <script async src=\"https://maps.googleapis.com/maps/api/js?key=API_KEY&libraries=places&callback=initMap\"></script>\r\n");
      out.write("  <script src=\"");
      out.print(request.getContextPath());
      out.write("/front-end/js/geocoding.js\"></script>\r\n");
      out.write("  <script src=\"");
      out.print(request.getContextPath());
      out.write("/front-end/js/tripPlanAjax.js\"></script>\r\n");
      out.write("  \r\n");
      out.write("  <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("    integrity=\"sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ\"\r\n");
      out.write("    crossorigin=\"anonymous\"></script>\r\n");
      out.write("  <script src=\"https://kit.fontawesome.com/616f19a0b0.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("  <script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\r\n");
      out.write("  <script src=\"");
      out.print(request.getContextPath() );
      out.write("/front-end/js/jquery.datetimepicker.full.js\"></script>\r\n");
      out.write("  <script src=\"");
      out.print(request.getContextPath() );
      out.write("/front-end/js/userTripAll.js\"></script>\r\n");
      out.write("  <script src=\"");
      out.print(request.getContextPath() );
      out.write("/front-end/js/tripPlan.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
