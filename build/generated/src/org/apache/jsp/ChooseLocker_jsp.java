package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ChooseLocker_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write(" \n");
      out.write("<div class=\"content alert\" style=\"height:420px\">\n");
      out.write("    <div id=\"box1\" class=\"animated bounceIn\">\n");
      out.write("        <h1>คุณต้องการจองล็อคเกอร์ ?</h1>\n");
      out.write("        <hr>\n");
      out.write("        <ul>\n");
      out.write("            <li><h3>จำนวนล็อคเกอร์ในการจองสูงสุดไม่เกิน 5 ช่อง</h3></li>\n");
      out.write("            <li><h3>ห้ามล็อคกุญแจเกินเวลาที่โรงยิมกำหนด</h3></li>\n");
      out.write("            <li><h3>ห้ามทำลายทรัพสินของทางโรงยิม</h3></li>\n");
      out.write("        </ul>\n");
      out.write("        <div id=\"form\">\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"\"><div class=\"box\">จอง</div></a></li>\n");
      out.write("                <li><a href=\"\"><div class=\"box\">ไม่จอง</div></a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<script src=\"js/classie.js\"></script>\n");
      out.write("<script src=\"js/uiMorphingButton_fixed.js\"></script>\n");
      out.write("<script>\n");
      out.write("    (function() {\n");
      out.write("        var docElem = window.document.documentElement, didScroll, scrollPosition;\n");
      out.write("\n");
      out.write("        // trick to prevent scrolling when opening/closing button\n");
      out.write("        function noScrollFn() {\n");
      out.write("            window.scrollTo(scrollPosition ? scrollPosition.x : 0, scrollPosition ? scrollPosition.y : 0);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function noScroll() {\n");
      out.write("            window.removeEventListener('scroll', scrollHandler);\n");
      out.write("            window.addEventListener('scroll', noScrollFn);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function scrollFn() {\n");
      out.write("            window.addEventListener('scroll', scrollHandler);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function canScroll() {\n");
      out.write("            window.removeEventListener('scroll', noScrollFn);\n");
      out.write("            scrollFn();\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function scrollHandler() {\n");
      out.write("            if (!didScroll) {\n");
      out.write("                didScroll = true;\n");
      out.write("                setTimeout(function() {\n");
      out.write("                    scrollPage();\n");
      out.write("                }, 60);\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("        ;\n");
      out.write("\n");
      out.write("        function scrollPage() {\n");
      out.write("            scrollPosition = {x: window.pageXOffset || docElem.scrollLeft, y: window.pageYOffset || docElem.scrollTop};\n");
      out.write("            didScroll = false;\n");
      out.write("        }\n");
      out.write("        ;\n");
      out.write("\n");
      out.write("        scrollFn();\n");
      out.write("\n");
      out.write("        [].slice.call(document.querySelectorAll('.morph-button')).forEach(function(bttn) {\n");
      out.write("            new UIMorphingButton(bttn, {\n");
      out.write("                closeEl: '.icon-close',\n");
      out.write("                onBeforeOpen: function() {\n");
      out.write("                    // don't allow to scroll\n");
      out.write("                    noScroll();\n");
      out.write("                },\n");
      out.write("                onAfterOpen: function() {\n");
      out.write("                    // can scroll again\n");
      out.write("                    canScroll();\n");
      out.write("                },\n");
      out.write("                onBeforeClose: function() {\n");
      out.write("                    // don't allow to scroll\n");
      out.write("                    noScroll();\n");
      out.write("                },\n");
      out.write("                onAfterClose: function() {\n");
      out.write("                    // can scroll again\n");
      out.write("                    canScroll();\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("\n");
      out.write("\n");
      out.write("    })();\n");
      out.write("</script>\n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write(' ');
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
