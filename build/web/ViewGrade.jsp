<%-- 
    Document   : ViewGrade
    Created on : May 30, 2014, 2:35:11 PM
    Author     : Prasukrit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String grade = (String)request.getAttribute("g");
            String color = "red";
            if(grade.equalsIgnoreCase("A")){
                color = "blue";
            }else if(grade.equalsIgnoreCase("B")){
                color = "green";
            }
            
        %>
        <h1>
            ID : <%=request.getParameter("id")%><br>
            Name : <%=request.getParameter("name")%><br>
            Score : <%=request.getParameter("score")%><hr>
            <font color="<%=color%>">
                Grade : <%=request.getAttribute("g")%><br>
            </font>
            <hr>
        </h1>
            <%int n =2;%>
            <table border="1" style="text-align: center">
                <tr>
                    <td colspan="5">Multiple * 2</td>
                </tr>
                <%for(int i =1;i<=12;i++){%>
                <tr>
                    <td><%=n%></td>
                    <td>x</td>
                    <td><%=i%></td>
                    <td>=</td>
                    <td><%=i*n%></td>
                </tr>
                <%}%>
            </table>
        
    </body>
</html>
