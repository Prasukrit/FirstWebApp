package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("\n");
      out.write("\n");

    if(session!=null && session.getAttribute("username") == null){

      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write(" \n");
      out.write("            <section>\n");
      out.write("\n");
      out.write("                <div class=\"mockup-content\">\n");
      out.write("                    <p style=\"color:white\">\n");
      out.write("                        1. \tระบบนี้เป็นระบบที่ใช้แบบวันต่อวัน เมื่อเข้าสู่ระบบแล้วกรุณาเลือกช่วงที่จะใช้จองสนาม ซึ่งใช้ 1 สิทธิต่อ 1 ชั่วโมง \n");
      out.write("                        เพื่อให้นักศึกษาได้ใช้งานอย่างทั่วถึง <br>\n");
      out.write("                        2. \tเมื่อเข้าระบบจองสนามเสร็จแล้วจะเข้าสู่ระบบการยืมอุปกรณ์กีฬาซึ่งการยืมอุปกรณ์นั้นๆจะขึ้นอยู่กับการจองสนามกีฬานั้น\n");
      out.write("                        โดยไม่สามารถเลือกอุปกรณ์ ที่ไม่เกี่ยวข้องเกี่ยวสนามนั้นได้ แต่ถ้าไม่ต้องการยืมอุปกรณ์จะข้ามไปสู่ระบบจองล็อกเกอร์ได้เรย<br>\n");
      out.write("                        3.\tเมื่อเข้าระบบจองล็อกเกอร์จะแสดงสถานะ ว่าในวันนั้นมีล็อกเกอร์ว่างอยู่กี่ล็อกเกอร์ แล้วเมื่อต้องการมั้ย จะเข้าสู่ระบบยืนยัน \n");
      out.write("                        แต่ถ้าไม่ต้องการจองล็อกเกอร์จะข้ามไปสู่ระบบการยืนยันทันที<br>\n");
      out.write("                        4.\tเมื่อกเข้าสู่ระบบจองทั้งหมด จะมีหน้าสรุปบอกสถานะสำหรับผู้ใช้ว่าได้เลือกการจองอะไรไว้บ้าง เพื่อยืนยันการใช้บริการ\n");
      out.write("\n");
      out.write("                    </p>\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    <div class=\"morph-button morph-button-modal morph-button-modal-2 morph-button-fixed\">\n");
      out.write("                        <button type=\"button\" >\n");
      out.write("                            <span>เข้าสู่ระบบ</span>\n");
      out.write("                        </button>\n");
      out.write("                        <br>\n");
      out.write("                        <div class=\"morph-content\">\n");
      out.write("                            <div>\n");
      out.write("                                <div class=\"content-style-form content-style-form-1\">\n");
      out.write("                                    <span class=\"icon icon-close\">Close the dialog</span>\n");
      out.write("                                    <h2>Login</h2>\n");
      out.write("\n");
      out.write("                                    <form action=\"UserLogin\">\n");
      out.write("                                        <p>\n");
      out.write("                                            <label>Username</label>\n");
      out.write("                                            <input type=\"text\" name=\"username\" placeholder=\"Student id\"/>\n");
      out.write("                                        </p>\n");
      out.write("                                        <p>\n");
      out.write("                                            <label>Password</label>\n");
      out.write("                                            <input type=\"password\" name=\"password\" placeholder=\"Password\"/>\n");
      out.write("                                        </p>\n");
      out.write("                                        <p>\n");
      out.write("                                            <button type=\"submit\">Login</button>\n");
      out.write("                                        </p>\n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div> <!--Popup content-->\n");
      out.write("                    </div>\n");
      out.write("                    <!-- morph-button -->\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <!-- /form-mockup -->\n");
      out.write("            </section>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- /container -->\n");
      out.write("        <script src=\"js/classie.js\"></script>\n");
      out.write("        <script src=\"js/uiMorphingButton_fixed.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            (function() {\n");
      out.write("                var docElem = window.document.documentElement, didScroll, scrollPosition;\n");
      out.write("\n");
      out.write("                // trick to prevent scrolling when opening/closing button\n");
      out.write("                function noScrollFn() {\n");
      out.write("                    window.scrollTo(scrollPosition ? scrollPosition.x : 0, scrollPosition ? scrollPosition.y : 0);\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                function noScroll() {\n");
      out.write("                    window.removeEventListener('scroll', scrollHandler);\n");
      out.write("                    window.addEventListener('scroll', noScrollFn);\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                function scrollFn() {\n");
      out.write("                    window.addEventListener('scroll', scrollHandler);\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                function canScroll() {\n");
      out.write("                    window.removeEventListener('scroll', noScrollFn);\n");
      out.write("                    scrollFn();\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                function scrollHandler() {\n");
      out.write("                    if (!didScroll) {\n");
      out.write("                        didScroll = true;\n");
      out.write("                        setTimeout(function() {\n");
      out.write("                            scrollPage();\n");
      out.write("                        }, 60);\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("                ;\n");
      out.write("\n");
      out.write("                function scrollPage() {\n");
      out.write("                    scrollPosition = {x: window.pageXOffset || docElem.scrollLeft, y: window.pageYOffset || docElem.scrollTop};\n");
      out.write("                    didScroll = false;\n");
      out.write("                }\n");
      out.write("                ;\n");
      out.write("\n");
      out.write("                scrollFn();\n");
      out.write("\n");
      out.write("                [].slice.call(document.querySelectorAll('.morph-button')).forEach(function(bttn) {\n");
      out.write("                    new UIMorphingButton(bttn, {\n");
      out.write("                        closeEl: '.icon-close',\n");
      out.write("                        onBeforeOpen: function() {\n");
      out.write("                            // don't allow to scroll\n");
      out.write("                            noScroll();\n");
      out.write("                        },\n");
      out.write("                        onAfterOpen: function() {\n");
      out.write("                            // can scroll again\n");
      out.write("                            canScroll();\n");
      out.write("                        },\n");
      out.write("                        onBeforeClose: function() {\n");
      out.write("                            // don't allow to scroll\n");
      out.write("                            noScroll();\n");
      out.write("                        },\n");
      out.write("                        onAfterClose: function() {\n");
      out.write("                            // can scroll again\n");
      out.write("                            canScroll();\n");
      out.write("                        }\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("\n");
      out.write("            })();\n");
      out.write("        </script>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write(' ');
      out.write('\n');
  
    }else{
        response.sendRedirect("StadiumServlet");
    }
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
