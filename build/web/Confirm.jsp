<%-- 
    Document   : Confirm
    Created on : Jun 1, 2014, 10:13:45 PM
    Author     : Prasukrit
--%>

<%@page import="sit.bootcamp.model.Reservation"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page = "header.jsp" flush="false"/> 

<section style="max-width:800px;">
    <div class="content animated slideInDown">
        <h2 style="text-align:left"> <strong>ยืนยัน</strong>
            การจองสนามกีฬา
        </h2>
        <hr>
        <p>รหัสนักศึกษา: <% out.print(request.getAttribute("userName"));%></p>
        <p>ชื่อ: <% out.print(request.getAttribute("name"));%></p>
        <p>คุณจองสนามกีฬาประเภท: <% out.print(request.getAttribute("stadium"));%></p>
        <p>คุณได้ทำการเลือกล็อคเกอร์: จอง</p>

    </div>

    <table>
        <tr>
            <td>
                <div class="morph-button morph-button-overlay morph-button-fixed">
                    <button type="button">ยืนยัน</button>
                    <div class="morph-content">
                        <div>
                            <div class="content-style-overlay" style="color:white">
                                <span class="icon icon-close">Close the overlay</span>
                                <h2>ระบบการจองเสร็จสมบูรณ์!</h2>
                                <p>รหัสนักศึกษา : <% out.print(request.getAttribute("userName"));%></p>
                                <p>ชื่อ : <% out.print(request.getAttribute("name"));%></p>
                                <p>คุณจองสนามกีฬาประเภท : <% out.print(request.getAttribute("stadium"));%></p>
                                <p>คุณได้ยืมอุปกรณ์ : <% out.print(request.getParameter("equipment"));%></p>
                                <p>คุณได้ทำการเลือกล็อคเกอร์ : (เช่าล็อคเกอร์จำนวน)</p>

                            </div>
                        </div>
                    </div>
                </div>
            </td>
            <td>
                <form action="index.jsp" method="get">
                    <div class="morph-button morph-button-modal morph-button-modal-1 morph-button-fixed">
                        <button type="submit" >กลับไปหน้าหลักการจอง</button>
                    </div>
                </form>
            </td>
        </tr>
    </table>

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

        var el = document.querySelector('.morph-button');

        new UIMorphingButton(el, {
            closeEl: '.icon-close',
            onBeforeOpen: function() {
                // don't allow to scroll
                noScroll();
            },
            onAfterOpen: function() {
                // can scroll again
                canScroll();
                // add class "noscroll" to body
                classie.addClass(document.body, 'noscroll');
                // add scroll class to main el
                classie.addClass(el, 'scroll');
            },
            onBeforeClose: function() {
                // remove class "noscroll" to body
                classie.removeClass(document.body, 'noscroll');
                // remove scroll class from main el
                classie.removeClass(el, 'scroll');
                // don't allow to scroll
                noScroll();
            },
            onAfterClose: function() {
                // can scroll again
                canScroll();
            }
        });
    })();
</script>

<jsp:include page = "footer.jsp" flush="false"/> 
