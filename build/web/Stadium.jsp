<%-- 
    Document   : Reservation
    Created on : Jun 1, 2014, 1:08:41 PM
    Author     : Prasukrit
--%>

<%@page import="sit.bootcamp.model.Stadium"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page = "header.jsp" flush="false"/> 
<section style="text-align:center">
    <h1>ตารางการจองสนาม</h1>
    <form action="EquipmentServlet">
        <table border="1">
            <tr>
                <td></td>
                <td>8.00-9.00</td>
                <td>9.00-10.00</td>
                <td>10.00-11.00</td>
                <td>11.00-12.00</td>
                <td>12.00-13.00</td>
                <td>13.00-14.00</td>
                <td>14.00-15.00</td>
                <td>15.00-16.00</td>
                <td>16.00-17.00</td>
                <td>17.00-18.00</td>
                <td>18.00-19.00</td>
                <td>19.00-20.00</td>
                <td>20.00-21.00</td>
            </tr>
            <% ArrayList<Stadium> list = (ArrayList<Stadium>) request.getAttribute("stadiums"); %>
            <% for (Stadium s : list) {%>
            <tr>
                <td width="120px;"><%= s.getName()%></td>
                <td>
                    <input type="radio" name="stadium" value="<%= s.getId()%>;1 "></td>
                <td>
                    <input type="radio" name="stadium" value="<%= s.getId()%>;2"></td>
                <td>
                    <input type="radio" name="stadium" value="<%= s.getId()%>;3"></td>
                <td>
                    <input type="radio" name="stadium" value="<%= s.getId()%>;4"></td>
                <td>
                    <input type="radio" name="stadium" value="<%= s.getId()%>;5"></td>
                <td>
                    <input type="radio" name="stadium" value="<%= s.getId()%>;6"></td>
                <td>
                    <input type="radio" name="stadium" value="<%= s.getId()%>;7"></td>
                <td>
                    <input type="radio" name="stadium" value="<%= s.getId()%>;8"></td>
                <td>
                    <input type="radio" name="stadium" value="<%= s.getId()%>;9"></td>
                <td>
                    <input type="radio" name="stadium" value="<%= s.getId()%>;10"></td>
                <td>
                    <input type="radio" name="stadium" value="<%= s.getId()%>;11"></td>
                <td>
                    <input type="radio" name="stadium" value="<%= s.getId()%>;12"></td>
                <td>
                    <input type="radio" name="stadium" value="<%= s.getId()%>;13"></td>
            </tr>
            <% }%>
        </table>

        <div>
            <br>
            <table>
                <tr>
                    <td width="200px;maring:10px;">
                        <img width="15px" src="img/greendot.png">ว่าง</td>
                    <td width="200px;">
                        <img width="15px" src="img/reddot.png">ไม่ว่าง</td>
                </tr>
            </table>
        </div>
        <table>
            <tr>
                <td>
                    <div>
                        <div class="morph-button morph-button-modal morph-button-modal-1 morph-button-fixed">

                            <button type="submit">ถัดไป</button>
                        </div>
                </td>
                </div>
            </tr>
        </table>
    </form>
    <form action="logout.jsp">
        <div class="morph-button morph-button-modal morph-button-modal-1 morph-button-fixed">
            <button type="submit">Logout</button>
        </div>  
    </form>
</section>
</div>
<script src="js/classie.js"></script>
<script src="js/uiMorphingButton_fixed.js"></script>
<script>
    (function() {
        var docElem = window.document.documentElement, didScroll, scrollPosition;

        // trick to prevent scrolling when opening/closing button
        function noScrollFn() {
            window.scrollTo(scrollPosition ? scrollPosition.x : 0, scrollPosition ? scrollPosition.y : 0);
        }

        function noScroll() {
            window.removeEventListener('scroll', scrollHandler);
            window.addEventListener('scroll', noScrollFn);
        }

        function scrollFn() {
            window.addEventListener('scroll', scrollHandler);
        }

        function canScroll() {
            window.removeEventListener('scroll', noScrollFn);
            scrollFn();
        }

        function scrollHandler() {
            if (!didScroll) {
                didScroll = true;
                setTimeout(function() {
                    scrollPage();
                }, 60);
            }
        }
        ;

        function scrollPage() {
            scrollPosition = {x: window.pageXOffset || docElem.scrollLeft, y: window.pageYOffset || docElem.scrollTop};
            didScroll = false;
        }
        ;

        scrollFn();

        [].slice.call(document.querySelectorAll('.morph-button')).forEach(function(bttn) {
            new UIMorphingButton(bttn, {
                closeEl: '.icon-close',
                onBeforeOpen: function() {
                    // don't allow to scroll
                    noScroll();
                },
                onAfterOpen: function() {
                    // can scroll again
                    canScroll();
                },
                onBeforeClose: function() {
                    // don't allow to scroll
                    noScroll();
                },
                onAfterClose: function() {
                    // can scroll again
                    canScroll();
                }
            });
        });


    })();
</script>
<jsp:include page = "footer.jsp" flush="false"/> 