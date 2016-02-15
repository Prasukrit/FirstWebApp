package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import sit.bootcamp.model.Stadium;
import java.util.ArrayList;

public final class Reservation_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write(" \n");
      out.write("<section style=\"text-align:center\">\n");
      out.write("    <h1>ตารางการจองสนาม</h1>\n");
      out.write("    <form action=\"EquipmentServlet\">\n");
      out.write("        <table border=\"1\">\n");
      out.write("            <tr>\n");
      out.write("                <td></td>\n");
      out.write("                <td>8.00-9.00</td>\n");
      out.write("                <td>9.00-10.00</td>\n");
      out.write("                <td>10.00-11.00</td>\n");
      out.write("                <td>11.00-12.00</td>\n");
      out.write("                <td>12.00-13.00</td>\n");
      out.write("                <td>13.00-14.00</td>\n");
      out.write("                <td>14.00-15.00</td>\n");
      out.write("                <td>15.00-16.00</td>\n");
      out.write("                <td>16.00-17.00</td>\n");
      out.write("                <td>17.00-18.00</td>\n");
      out.write("                <td>18.00-19.00</td>\n");
      out.write("                <td>19.00-20.00</td>\n");
      out.write("                <td>20.00-21.00</td>\n");
      out.write("            </tr>\n");
      out.write("            ");
 ArrayList<Stadium> list = (ArrayList<Stadium>) request.getAttribute("stadiums"); 
      out.write("\n");
      out.write("            ");
 for (Stadium s : list) {
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td width=\"120px;\">");
      out.print( s.getName());
      out.write("</td>\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"radio\" name=\"time\" value=\"");
      out.print( s.getId());
      out.write(";1\"></td>\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"radio\" name=\"time\" value=\"");
      out.print( s.getId());
      out.write(";2\"></td>\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"radio\" name=\"time\" value=\"");
      out.print( s.getId());
      out.write(";3\"></td>\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"radio\" name=\"time\" value=\"");
      out.print( s.getId());
      out.write(";4\"></td>\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"radio\" name=\"time\" value=\"");
      out.print( s.getId());
      out.write(";5\"></td>\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"radio\" name=\"time\" value=\"");
      out.print( s.getId());
      out.write(";6\"></td>\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"radio\" name=\"time\" value=\"");
      out.print( s.getId());
      out.write(";7\"></td>\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"radio\" name=\"time\" value=\"");
      out.print( s.getId());
      out.write(";8\"></td>\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"radio\" name=\"time\" value=\"");
      out.print( s.getId());
      out.write(";9\"></td>\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"radio\" name=\"time\" value=\"");
      out.print( s.getId());
      out.write(";10\"></td>\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"radio\" name=\"time\" value=\"");
      out.print( s.getId());
      out.write(";11\"></td>\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"radio\" name=\"time\" value=\"");
      out.print( s.getId());
      out.write(";12\"></td>\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"radio\" name=\"time\" value=\"");
      out.print( s.getId());
      out.write(";13\"></td>\n");
      out.write("            </tr>\n");
      out.write("            ");
 }
      out.write("\n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("        <div>\n");
      out.write("            <br>\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td width=\"200px;maring:10px;\">\n");
      out.write("                        <img width=\"15px\" src=\"img/greendot.png\">ว่าง</td>\n");
      out.write("                    <td width=\"200px;\">\n");
      out.write("                        <img width=\"15px\" src=\"img/reddot.png\">ไม่ว่าง</td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("\n");
      out.write("                    <div>\n");
      out.write("                        <div class=\"morph-button morph-button-modal morph-button-modal-1 morph-button-fixed\">\n");
      out.write("                            <button type=\"submit\">ถัดไป</button>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <div class=\"morph-button morph-button-modal morph-button-modal-1 morph-button-fixed\">\n");
      out.write("                        <button type=\"submit\">Logout</button>\n");
      out.write("                    </div>\n");
      out.write("                </td>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("    </form>\n");
      out.write("</section>\n");
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
