/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.52
 * Generated at: 2022-05-12 15:30:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class themphongkhoa_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("jar:file:/C:/Users/Dell/khoaluan/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Quanlynhansu/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153359882000L));
    _jspx_dependants.put("/WEB-INF/menu.jsp", Long.valueOf(1650701727315L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1647237997908L));
    _jspx_dependants.put("/WEB-INF/footer.jsp", Long.valueOf(1649729827533L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;

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
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\r\n");
      out.write("	<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.5.1.js\"></script>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"./assets/css/layout.css\">\r\n");
      out.write("	<link rel=\"stylesheet\" type=\"text/css\" href=\"./assets/css/cocautochuc.css\">\r\n");
      out.write("	<script src=\"./assets/js/cocautochuc.js\"></script>\r\n");
      out.write("<title>Thêm phòng ban</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"header\">\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark bg-primary\">\r\n");
      out.write("<div class=\"container-fluid\">\r\n");
      out.write("<img style=\"width: 40px;height: 40px\" alt=\"logo\" src=\"./assets/img/logoHUSC.png\">\r\n");
      out.write("<a class=\"navbar-brand\" href=\"#\">Hue university of science</a>\r\n");
      out.write("<button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#main_nav\"  aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("</button>\r\n");
      out.write("<div class=\"collapse navbar-collapse\" id=\"main_nav\">\r\n");
      out.write("  <ul class=\"navbar-nav\"> \r\n");
      out.write("    <li class=\"nav-item active\"><a class=\"nav-link\" href=\"homeController\"><i class=\"fas fa-school\"></i> Trang chủ </a> </li>\r\n");
      out.write("    <li class=\"nav-item\"><a class=\"nav-link\" href=\"quanlytudienController\"><i class=\"fas fa-book\"></i> Quản lý từ điển </a></li>\r\n");
      out.write("    <li class=\"nav-item\"><a class=\"nav-link\" href=\"cocautochucController\"><i class=\"fas fa-boxes\"></i> Cơ cấu tổ chức </a></li>\r\n");
      out.write("    <li class=\"nav-item\"><a class=\"nav-link\" href=\"hienthinhansuController\"><i class=\"fas fa-user-alt\"></i> Quản lý nhân sự </a></li>\r\n");
      out.write("  </ul>\r\n");
      out.write("  <ul class=\"navbar-nav ms-auto\">\r\n");
      out.write("        ");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("   </ul>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- navbar-collapse.// -->\r\n");
      out.write("</div>\r\n");
      out.write("<!-- container-fluid.// -->\r\n");
      out.write("</nav>");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"container\" id=\"container\">\r\n");
      out.write("  <h3>Thêm phòng ban</h3>\r\n");
      out.write("  <div class=\"row\">\r\n");
      out.write("  		<div class=\"col-3\"></div>\r\n");
      out.write("  		<div class=\"col-6\">\r\n");
      out.write("				<div class=\"container-fluid\" style=\"border: 1px solid;border-radius: 5px;line-height: 2.5;background-color: white;\">\r\n");
      out.write("					<div class=\"row\" >\r\n");
      out.write("					\r\n");
      out.write("						<p style=\"color: red;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("						<form action=\"themphongkhoaController\" method=\"post\" onsubmit=\"return testMaID();\">\r\n");
      out.write("						<h5>Thông tin chung</h5>\r\n");
      out.write("						<div class=\"row\">\r\n");
      out.write("							<div class=\"col-3\">Mã đơn vị:</div>\r\n");
      out.write("							<div class=\"col-4\"><input type=\"text\" class=\"form-control form-control-sm\" name=\"MaPhongKhoa\" id=\"MaPhongKhoa\" required=\"required\"></div>\r\n");
      out.write("							<small id=\"MaPhongKhoa1\" class=\"text-danger\"></small>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"row\">\r\n");
      out.write("							<div class=\"col-3\">Tên đơn vị:</div>\r\n");
      out.write("							<div class=\"col\"><input type=\"text\" class=\"form-control form-control-sm\" name=\"TenPhongKhoa\" required=\"required\"></div>\r\n");
      out.write("						</div>\r\n");
      out.write("						<h5>Thông tin liên hệ</h5>\r\n");
      out.write("						<div class=\"row\">\r\n");
      out.write("							<div class=\"col-3\">Điện thoại:</div>\r\n");
      out.write("							<div class=\"col-4\"><input type=\"text\" class=\"form-control form-control-sm\" name=\"DienThoai\"></div>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"row\">\r\n");
      out.write("							<div class=\"col-3\">Fax:</div>\r\n");
      out.write("							<div class=\"col-4\"><input type=\"text\" class=\"form-control form-control-sm\" name=\"Fax\"></div>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"row\">\r\n");
      out.write("							<div class=\"col-3\">Website:</div>\r\n");
      out.write("							<div class=\"col\"><input type=\"text\" class=\"form-control form-control-sm\" name=\"Website\"></div>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"row\">\r\n");
      out.write("							<div class=\"col-3\">Email:</div>\r\n");
      out.write("							<div class=\"col\"><input type=\"text\" class=\"form-control form-control-sm\" name=\"Email\"></div>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"row\">\r\n");
      out.write("							<div class=\"col-3\">Địa chỉ:</div>\r\n");
      out.write("							<div class=\"col\"><input type=\"text\" class=\"form-control form-control-sm\" name=\"DiaChi\"></div>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"row\" style=\"padding: 10px\">							\r\n");
      out.write("							<input type=\"submit\" class=\"btn btn-primary\" name=\"Submit\">\r\n");
      out.write("						</div>\r\n");
      out.write("						</form>\r\n");
      out.write("					</div>\r\n");
      out.write("					\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			<div class=\"col-3\"></div>\r\n");
      out.write("											\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"footer\">\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<footer class=\"bg-primary text-white text-center text-lg-start\">\r\n");
      out.write("  <!-- Grid container -->\r\n");
      out.write("  <div class=\"container p-4\">\r\n");
      out.write("    <!--Grid row-->\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("      <!--Grid column-->\r\n");
      out.write("      <div class=\"col-lg-6 col-md-12 mb-4 mb-md-0\">\r\n");
      out.write("        <h5 class=\"text-uppercase\">Đại học khoa học Huế</h5>\r\n");
      out.write("		<ul>\r\n");
      out.write("			<li><i class=\"fas fa-map-marker\"></i> <a href=\"#\" class=\"text-white\">77 Nguyễn Huệ</a></li>\r\n");
      out.write("			<li><i class=\"fas fa-phone-alt\"></i> <a href=\"#\" class=\"text-white\">(0234) 3823290</a></li>\r\n");
      out.write("			<li><i class=\"fas fa-envelope\"></i> <a href=\"#\" class=\"text-white\">khcndhkh@hueuni.edu.vn</a></li>\r\n");
      out.write("			<li><i class=\"fab fa-facebook-square\"></i> <a href=\"#\" class=\"text-white\">facebook.com/husc.edu.vn</a></li>\r\n");
      out.write("		</ul>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!--Grid column-->\r\n");
      out.write("\r\n");
      out.write("      <!--Grid column-->\r\n");
      out.write("      <div class=\"col-lg-3 col-md-6 mb-4 mb-md-0\">\r\n");
      out.write("        <h5 class=\"text-uppercase\">Thông tin về trường</h5>\r\n");
      out.write("\r\n");
      out.write("        <ul class=\"list-unstyled mb-0\">\r\n");
      out.write("          <li>\r\n");
      out.write("            <a href=\"#!\" class=\"text-white\">Tổng quan</a>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li>\r\n");
      out.write("            <a href=\"#!\" class=\"text-white\">Cơ cấu tổ chức</a>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li>\r\n");
      out.write("            <a href=\"#!\" class=\"text-white\">Đường dây nóng</a>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li>\r\n");
      out.write("            <a href=\"#!\" class=\"text-white\">Công khai chất lượng GD</a>\r\n");
      out.write("          </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!--Grid column-->\r\n");
      out.write("\r\n");
      out.write("      <!--Grid column-->\r\n");
      out.write("      <div class=\"col-lg-3 col-md-6 mb-4 mb-md-0\">\r\n");
      out.write("        <h5 class=\"text-uppercase mb-0\">Liên kết</h5>\r\n");
      out.write("\r\n");
      out.write("        <ul class=\"list-unstyled\">\r\n");
      out.write("          <li>\r\n");
      out.write("            <a href=\"#!\" class=\"text-white\">Thông tin tuyển sinh</a>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li>\r\n");
      out.write("            <a href=\"#!\" class=\"text-white\">Trang thông tin đào tạo tín chỉ</a>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li>\r\n");
      out.write("            <a href=\"#!\" class=\"text-white\">Thanh toán học phí trực tuyến</a>\r\n");
      out.write("          </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!--Grid column-->\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--Grid row-->\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- Grid container -->\r\n");
      out.write("\r\n");
      out.write("  <!-- Copyright -->\r\n");
      out.write("  <div class=\"text-center p-3\" style=\"background-color: rgba(0, 0, 0, 0.2);\">\r\n");
      out.write("    © 2022 Copyright:\r\n");
      out.write("    <a class=\"text-white\" href=\"https://www.facebook.com/hth.hth.790/\">Hoàng Thế Huy</a>\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- Copyright -->\r\n");
      out.write("</footer>");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
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

  private boolean _jspx_meth_c_005fchoose_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    boolean _jspx_th_c_005fchoose_005f0_reused = false;
    try {
      _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fchoose_005f0.setParent(null);
      int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
      if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("        ");
          if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      _jspx_th_c_005fchoose_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fchoose_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fchoose_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f0_reused = false;
    try {
      _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /WEB-INF/menu.jsp(20,8) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.tk!=null}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
      if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("        	<li class=\"nav-item\">\r\n");
          out.write("        		<a class=\"nav-link\" href=\"logoutController\">(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.tk.getUsername()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write(") Log out <i class=\"fas fa-sign-out-alt\"></i></a>         		\r\n");
          out.write("        	</li>\r\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      _jspx_th_c_005fwhen_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fwhen_005f0_reused);
    }
    return false;
  }
}
