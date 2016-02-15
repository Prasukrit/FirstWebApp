<%-- 
    Document   : login
    Created on : Jun 1, 2014, 1:08:27 PM
    Author     : Prasukrit
--%>

<%@page import="java.sql.*"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    
    String userid = request.getParameter("username");    
    String pwd = request.getParameter("password");
    Class.forName("org.apache.derby.jdbc.ClientDriver");
    Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/project",
            "app", "app");
    Statement st = con.createStatement();
    ResultSet rs;
    rs = st.executeQuery("select * from STUDENT where ACCOUNT_ID='" + userid + "' and ACCOUNT_PASSWORD='" + pwd + "'");
    if (rs.next()) {
        
        session.setAttribute("userid", userid);
        //out.println("welcome " + userid);
        //out.println("<a href='logout.jsp'>Log out</a>");
        response.sendRedirect("Reservation.jsp");
    } else {
        response.sendRedirect("invalid.jsp");
                           
    }
%>
