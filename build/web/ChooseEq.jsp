<%-- 
    Document   : ChooseEq
    Created on : Jun 1, 2014, 3:21:04 PM
    Author     : Prasukrit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page = "header.jsp" flush="false"/> 
<div class="content alert" style="height:420px">
    <div id="box1" class="animated bounceIn">
        <h1>คุณต้องการอุปกรณ์กีฬา ?</h1>
        <hr>
        <ul>
            <li><h3>จำนวนอุปกรณ์ในการใช้ยืมไม่เกิน 5 ชิ้น</h3></li>
            <li><h3>หลังจากหมดเวลาต้องนำกลับมาส่งคืน</h3></li>
            <li><h3>ห้ามนำอุปกรณ์ออกจากเพื่อนที่</h3></li>
        </ul>
        <div id="form">
            <ul>
                <li><a href="ChooseEqServlet"><div class="box">ยืม</div></a></li>
                <li><a href="ChooseLockerServlet"><div class="box">ไม่ยืม</div></a></li>
            </ul>
        </div>

    </div>
</div>
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