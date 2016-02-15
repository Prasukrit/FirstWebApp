package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Bask_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<section style=\"max-width:900px;height:450px\">\n");
      out.write("    <div id=\"lockerimg\">\n");
      out.write("        <img src=\"img/bas.png\">\n");
      out.write("    </div>\n");
      out.write("    <div id=\"lockertext\">\n");
      out.write("        <form action=\"aaa.jsp\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"2\">\n");
      out.write("                        <h2>เลือกจำนวนลูกบาส</h2>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"2\">\n");
      out.write("                        <div id=\"lockerselect\">\n");
      out.write("                            <input type=\"radio\" value=\"1\" name=\"locker\">\n");
      out.write("                            &nbsp;&nbsp;เลือกจำนวน 1 ลูก\n");
      out.write("                            <br>\n");
      out.write("                            <input type=\"radio\" value=\"2\" name=\"locker\">\n");
      out.write("                            &nbsp;&nbsp;เลือกจำนวน 2 ลูก\n");
      out.write("                            <br>\n");
      out.write("                            <input type=\"radio\" value=\"3\" name=\"locker\">\n");
      out.write("                            &nbsp;&nbsp;เลือกจำนวน 3 ลูก\n");
      out.write("                            <br>\n");
      out.write("                            <input type=\"radio\" value=\"4\" name=\"locker\">\n");
      out.write("                            &nbsp;&nbsp;เลือกจำนวน 4 ลูก\n");
      out.write("                            <br>\n");
      out.write("                            <input type=\"radio\" value=\"5\" name=\"locker\">\n");
      out.write("                            &nbsp;&nbsp;เลือกจำนวน 5 ลูก\n");
      out.write("                            <br></div>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <button type=\"submit\">เลือก</button>\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <button type=\"button\">ข้าม</button>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</section>\n");
      out.write("</div>\n");
      out.write("\n");
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
      out.write("        var el = document.querySelector('.morph-button');\n");
      out.write("\n");
      out.write("        new UIMorphingButton(el, {\n");
      out.write("            closeEl: '.icon-close',\n");
      out.write("            onBeforeOpen: function() {\n");
      out.write("                // don't allow to scroll\n");
      out.write("                noScroll();\n");
      out.write("            },\n");
      out.write("            onAfterOpen: function() {\n");
      out.write("                // can scroll again\n");
      out.write("                canScroll();\n");
      out.write("                // add class \"noscroll\" to body\n");
      out.write("                classie.addClass(document.body, 'noscroll');\n");
      out.write("                // add scroll class to main el\n");
      out.write("                classie.addClass(el, 'scroll');\n");
      out.write("            },\n");
      out.write("            onBeforeClose: function() {\n");
      out.write("                // remove class \"noscroll\" to body\n");
      out.write("                classie.removeClass(document.body, 'noscroll');\n");
      out.write("                // remove scroll class from main el\n");
      out.write("                classie.removeClass(el, 'scroll');\n");
      out.write("                // don't allow to scroll\n");
      out.write("                noScroll();\n");
      out.write("            },\n");
      out.write("            onAfterClose: function() {\n");
      out.write("                // can scroll again\n");
      out.write("                canScroll();\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("    })();\n");
      out.write("</script>\n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write(' ');
      out.write('\n');
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
