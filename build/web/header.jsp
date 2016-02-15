<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html lang="en" class="no-js">
    <head>
        <meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>ระบบจองโรงยิมสนามกีฬา</title>
        <meta name="description" content="Morphing Buttons Concept: Inspiration for revealing content by morphing the action element" />
        <meta name="keywords" content="expanding button, morph, modal, fullscreen, transition, ui" />
        <link rel="shortcut icon" href="../favicon.ico">
        <link rel="stylesheet" type="text/css" href="css/animate.css">
        <link rel="stylesheet" type="text/css" href="css/normalize.css" />
        <link rel="stylesheet" type="text/css" href="css/demo.css" />
        <link rel="stylesheet" type="text/css" href="css/component.css" />
        <link rel="stylesheet" type="text/css" href="css/content.css" />
        <script src="js/modernizr.custom.js"></script>
    </head>
    <body class="animated fadeIn">
        <% if(session.getAttribute("userid")!=null){%>
        <div class="container" style="background-color:#FAFAFA">
        <%}else{%>
        <div class="container" style="background-color: #FFEDB9">
        <%}%>
            <header class="codrops-header">
                <div id="headimg">
                    <img src="img/kmutt.gif"></div>
                <div id="headtext">
                    <h1>ระบบจองโรงยิมกีฬา มจธ.</h1>
                    <p>
                        ระบบที่ช่วยให้นักศึกษามหาวิทยาลัยเทคโนโลยีพระจอมเกล้าธนบุรีมีการจองโรงยิมที่สะดวกยิ่งขึ้น
                    </p>
                </div>
                <% if(session.getAttribute("userid")!=null){%>
                <div id="headlogin">
                    <span>Id: <%=session.getAttribute("userid")%> &nbsp;  Name:<%=session.getAttribute("username")%></span>
                    &nbsp; <img src="img/status.png">
                </div>
                <%}%>
            </header>