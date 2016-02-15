<%-- 
    Document   : Bask
    Created on : Jun 1, 2014, 9:47:17 PM
    Author     : Prasukrit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page = "header.jsp" flush="false"/> 

<section style="max-width:900px;height:450px">
    <div id="lockerimg">
        <img src="img/bas.png">
    </div>
    <div id="lockertext">
        <form action="ChooseLockerServlet">
            <table>
                <tr>
                    <td colspan="2">
                        <h2>เลือกจำนวนลูกบาส</h2>
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <div id="lockerselect">
                            <input type="radio" value="1" name="equipment" checked="checked">
                            &nbsp;&nbsp;เลือกจำนวน 1 ลูก
                            <br>
                            <input type="radio" value="2" name="equipment">
                            &nbsp;&nbsp;เลือกจำนวน 2 ลูก
                            <br>
                            <input type="radio" value="3" name="equipment">
                            &nbsp;&nbsp;เลือกจำนวน 3 ลูก
                            <br>
                            <input type="radio" value="4" name="equipment">
                            &nbsp;&nbsp;เลือกจำนวน 4 ลูก
                            <br>
                            <input type="radio" value="5" name="equipment">
                            &nbsp;&nbsp;เลือกจำนวน 5 ลูก
                            <br></div>
                    </td>
                </tr>
                <tr>
                    <td>
                        
                        <button type="submit">เลือก</button>
                        
                    </td>
                    <td>
                        <button type="submit" formaction="ChooseEq.jsp" >กลับ</button>
                    </td>
                </tr>
            </table>
        </form>

    </div>
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
