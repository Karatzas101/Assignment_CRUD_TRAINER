<%-- 
    Document   : trainerinsert
    Created on : Jun 23, 2022, 10:37:24 PM
    Author     : karat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            body{
                background:  #FFE6E6;
            }
            label{
                font-size: 25px;
            }
            .error{
                color: red;
            }


        </style>
    </head>
    <body>
        <h1>Trainers' Form </h1>

        <form action="/trainer/insert" method="post" >  
            <div>
                <label>First name</label>
                <input type="text"  name="firstname"  required>
                
            </div>
            <div>
                <label>Last name</label>
                <input type="text" name="lastname" required>
                </div>
                   
                </div>
            </div>

            <label>Subject</label>
            <input type="radio"name="subject" value="java"  required >
            <label>Java</label> 
            <input type="radio"name="subject" value="javascript"  required >
            <label>JavaScript</label> 
            <input type="radio"name="subject" value="python"  required >
            <label>Python</label> 
            <input type="radio" name="subject" value="c#"  required >
            <label>C#</label>
            <input type="radio" name="subject" value="php"  required >
            <label>PHP</label> 
            <input type="submit">
            
            <h3 class="error">${errormessage}</h3>
        </form>        
    </body>
</html>
