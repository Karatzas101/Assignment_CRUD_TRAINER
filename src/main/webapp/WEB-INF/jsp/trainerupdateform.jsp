<%-- 
    Document   : updateform
    Created on : Jun 24, 2022, 1:00:19 AM
    Author     : karat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>

        </style>
    </head>
    <body style="background: #FFE6E6">
        <h1 style="color: greenyellow">Update Form</h1> 

        <form action="/trainer/doupdate" method="post">
            
            <input type="hidden" name="trainerid" value="${trainertoupdate.getId()}" >
            <label>FirstName </label>
            <input type="text" name="firstname" value="${trainertoupdate.getFirstname()}" required> 
            <label>LastName </label>
            <input type="text" name="lastname" value="${trainertoupdate.getLastname()}" required> 
            <label>Subject</label><br>
            <input type="radio"name="subject" value="java"  required >
            <label>Java</label> </br>
            <input type="radio"name="subject" value="javascript"   required>
            <label>JavaScript</label> </br>
            <input type="radio"name="subject" value="python"  required>
            <label>Python</label> </br>
            <input type="radio" name="subject" value="c#"   required>
            <label>C#</label> </br>
            <input type="radio" name="subject" value="php"   required>
            <label>PHP</label> </br>
            <input type="submit">

        </form>
    </body>
</html>
