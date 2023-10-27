<%-- 
    Document   : ShowComfirmation
    Created on : Oct 27, 2023, 9:16:51 AM
    Author     : iarsk
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Confirm Order</title>
    </head>
    <body>
        <form action="index.jsp"method = "POST" >
            <center>

            <h1>Your Order is confirmed!</h1>
            <h1>The total amount is $<%= request.getAttribute("totalPrice")%>.00</h1>
            <br><input type="submit" value="Back to First Page" name="submit" />
            </center>
        </from>
</body>
</html>
