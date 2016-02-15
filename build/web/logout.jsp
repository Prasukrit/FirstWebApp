<%-- 
    Document   : logout
    Created on : Jun 1, 2014, 3:41:01 PM
    Author     : Prasukrit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    session.setAttribute("username", null);
    session.invalidate();
    response.sendRedirect("index.jsp");
%>
