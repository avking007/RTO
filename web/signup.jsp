<%-- 
    Document   : signup.jsp
    Created on : 9 Mar, 2019, 6:31:50 PM
    Author     : Anish
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
        <%
            try
            {
                String name,email,gen,dob,mob,us,ps;
                name=request.getParameter("name");
                dob=request.getParameter("dob");
                gen=request.getParameter("gen");
                mob=request.getParameter("mob");
                us=request.getParameter("us");
                ps=request.getParameter("ps");

                Class.forName("oracle.jdbc.OracleDriver");
                Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","oracle");
                Statement stm = conn.createStatement(); 
                stm.executeQuery("insert into signup values(id.nextval,'"+name+"','"+gen+"','"+ps+"','"+dob+"','"+mob+"','"+us+"')");
                response.sendRedirect("signup.html");
            }
            catch(Exception e)
            {
                request.getRequestDispatcher("signup.html").include(request, response);
                out.print("username already exists");
                %>
                <a href="login.html">Go to Login</a>   
                <%
            }
            %>
    </body>
</html>
