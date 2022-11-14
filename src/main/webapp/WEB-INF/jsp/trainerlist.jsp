<%-- 
    Document   : trainerlist
    Created on : Jun 23, 2022, 11:06:23 PM
    Author     : karat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <style>
            #error {
                color: red;
            }
        </style>
    </head>
    <body>
        <h1>  <a href="/showTrainerform">Create Trainer</a> </h1>
        <h1>Trainer List</h1>
        <div id="error">${errormessage}</div>
        <table class="table table-dark">
            <thead>               
                    <th scope="col">ID</th>
                    <th scope="col">FirstName</th>
                    <th scope="col">LastName</th>
                    <th scope="col">Subject</th>
                    <th scope="col"></th>
                    <th scope="col"></th>               
            </thead>
            
            
            <tbody>
                
                <c:forEach items="${trainerlist}" var="trainers">
                    <tr>
                        <td scope="row">${trainers.getId()}</td>
                        <td>${trainers.getFirstname()}</td>
                        <td>${trainers.getLastname()}</td>
                        <td>${trainers.getSubject()}</td>
                        <td> <a class='btn btn-success' href="/trainer/update/${trainers.getId()}">Update</a> </td>
                        <td> <a class='btn btn-outline-danger' href="/trainer/delete/${trainers.getId()}">Delete</a>  </td>
                    </tr>
                </c:forEach>
                    
               
            </tbody>                
        </table>             
    </body>


</html>
