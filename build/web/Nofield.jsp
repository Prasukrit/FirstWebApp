<%-- 
    Document   : Nofield
    Created on : Jun 1, 2014, 10:45:19 PM
    Author     : Prasukrit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html >
<head>
	<title>เข้าสู่ระบบไม่ถูกต้อง</title>
	<meta charset="UTF-8" />
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="Morphing Buttons Concept: Inspiration for revealing content by morphing the action element" />
	<meta name="keywords" content="expanding button, morph, modal, fullscreen, transition, ui" />
	<link rel="shortcut icon" href="../favicon.ico">
	<link rel="stylesheet" type="text/css" href="css/animate.css">
	<link rel="stylesheet" type="text/css" href="css/normalize.css" />
	<link rel="stylesheet" type="text/css" href="css/demo.css" />
	<link rel="stylesheet" type="text/css" href="css/component.css" />
	<link rel="stylesheet" type="text/css" href="css/content.css" />
	<script src="js/modernizr.custom.js"></script>
	<script type="text/javascript">
	var _gaq = _gaq || [];
	_gaq.push(['_setAccount', 'UA-7243260-2']);
	_gaq.push(['_trackPageview']);
	(function() {
	var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
	ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
	var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
	})();
	</script>
	<style type="text/css">
	#backbutton{
		background-color: black;
		color: white;
		font-size: 30px;
		padding: 20px;
		display: block;
		display: inline-block;
		margin: auto;
		border:solid 5px black;
		margin-top: 40px;
	}

	a:hover #backbutton{
		background-color: white;
		color: black;
		border:solid black 5px;
	}
	</style>
</head>
<body  class="animated fadeInRight">
	<div class="container" style="background-color:#FAFAFA">
		<header class="codrops-header">

			<div id="headimg">
				<img src="img/kmutt.gif"></div>
			<div id="headtext">
				<h1>ระบบจองโรงยิมกีฬา มจธ.</h1>
				<p>
					ระบบที่ช่วยให้นักศึกษามหาวิทยาลัยเทคโนโลยีพระจอมเกล้าธนบุรีมีการจองโรงยิมที่สะดวกยิ่งขึ้น
				</p>
			</div>
		</header>

		<section style="max-width:900px;height:350px">
		<div style="margin:auto;text-align:center">
			<h1 align="center">กรุณาเลือกสนามที่ท่านต้องการ</h1>
			<a href="StadiumServlet"><div id="backbutton" class="animated swing">ย้อนกลับ</div></a>
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
					window.scrollTo( scrollPosition ? scrollPosition.x : 0, scrollPosition ? scrollPosition.y : 0 );
				}

				function noScroll() {
					window.removeEventListener( 'scroll', scrollHandler );
					window.addEventListener( 'scroll', noScrollFn );
				}

				function scrollFn() {
					window.addEventListener( 'scroll', scrollHandler );
				}

				function canScroll() {
					window.removeEventListener( 'scroll', noScrollFn );
					scrollFn();
				}

				function scrollHandler() {
					if( !didScroll ) {
						didScroll = true;
						setTimeout( function() { scrollPage(); }, 60 );
					}
				};

				function scrollPage() {
					scrollPosition = { x : window.pageXOffset || docElem.scrollLeft, y : window.pageYOffset || docElem.scrollTop };
					didScroll = false;
				};

				scrollFn();
				
				var el = document.querySelector( '.morph-button' );
				
				new UIMorphingButton( el, {
					closeEl : '.icon-close',
					onBeforeOpen : function() {
						// don't allow to scroll
						noScroll();
					},
					onAfterOpen : function() {
						// can scroll again
						canScroll();
						// add class "noscroll" to body
						classie.addClass( document.body, 'noscroll' );
						// add scroll class to main el
						classie.addClass( el, 'scroll' );
					},
					onBeforeClose : function() {
						// remove class "noscroll" to body
						classie.removeClass( document.body, 'noscroll' );
						// remove scroll class from main el
						classie.removeClass( el, 'scroll' );
						// don't allow to scroll
						noScroll();
					},
					onAfterClose : function() {
						// can scroll again
						canScroll();
					}
				} );
			})();
		</script>

	<footer>
		&copy; 2014  School of Information Technology, King Mongkut's University of Technology Thonburi.
	</footer>

</body>
</html>
