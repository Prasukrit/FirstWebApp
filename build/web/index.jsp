<%-- 
    Document   : login
    Created on : May 31, 2014, 5:35:39 PM
    Author     : Prasukrit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    if(session!=null && session.getAttribute("username") == null){
%>
    <jsp:include page = "header.jsp" flush="false"/> 
            <section>

                <div class="mockup-content">
                    <p style="color:white">
                        1. 	ระบบนี้เป็นระบบที่ใช้แบบวันต่อวัน เมื่อเข้าสู่ระบบแล้วกรุณาเลือกช่วงที่จะใช้จองสนาม ซึ่งใช้ 1 สิทธิต่อ 1 ชั่วโมง 
                        เพื่อให้นักศึกษาได้ใช้งานอย่างทั่วถึง <br>
                        2. 	เมื่อเข้าระบบจองสนามเสร็จแล้วจะเข้าสู่ระบบการยืมอุปกรณ์กีฬาซึ่งการยืมอุปกรณ์นั้นๆจะขึ้นอยู่กับการจองสนามกีฬานั้น
                        โดยไม่สามารถเลือกอุปกรณ์ ที่ไม่เกี่ยวข้องเกี่ยวสนามนั้นได้ แต่ถ้าไม่ต้องการยืมอุปกรณ์จะข้ามไปสู่ระบบจองล็อกเกอร์ได้เรย<br>
                        3.	เมื่อเข้าระบบจองล็อกเกอร์จะแสดงสถานะ ว่าในวันนั้นมีล็อกเกอร์ว่างอยู่กี่ล็อกเกอร์ แล้วเมื่อต้องการมั้ย จะเข้าสู่ระบบยืนยัน 
                        แต่ถ้าไม่ต้องการจองล็อกเกอร์จะข้ามไปสู่ระบบการยืนยันทันที<br>
                        4.	เมื่อกเข้าสู่ระบบจองทั้งหมด จะมีหน้าสรุปบอกสถานะสำหรับผู้ใช้ว่าได้เลือกการจองอะไรไว้บ้าง เพื่อยืนยันการใช้บริการ

                    </p>
                    <br>
                    <br>
                    <div class="morph-button morph-button-modal morph-button-modal-2 morph-button-fixed">
                        <button type="button" >
                            <span>เข้าสู่ระบบ</span>
                        </button>
                        <br>
                        <div class="morph-content">
                            <div>
                                <div class="content-style-form content-style-form-1">
                                    <span class="icon icon-close">Close the dialog</span>
                                    <h2>Login</h2>

                                    <form action="UserLogin">
                                        <p>
                                            <label>Username</label>
                                            <input type="text" name="username" placeholder="Student id"/>
                                        </p>
                                        <p>
                                            <label>Password</label>
                                            <input type="password" name="password" placeholder="Password"/>
                                        </p>
                                        <p>
                                            <button type="submit">Login</button>
                                        </p>
                                    </form>
                                </div>
                            </div>
                        </div> <!--Popup content-->
                    </div>
                    <!-- morph-button -->

                </div>
                <!-- /form-mockup -->
            </section>

        </div>
        <!-- /container -->
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
<%  
    }else{
        response.sendRedirect("StadiumServlet");
    }%>