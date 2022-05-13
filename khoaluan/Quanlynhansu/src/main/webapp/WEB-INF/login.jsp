<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" 
integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" 
crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="./assets/css/login.css">
<title>Login</title>
</head>
<body>
	<div id="login">
        <h3 class="text-center text-white pt-5">Hệ thống quản lý nhân sự</h3>
        <div class="container">
            <div id="login-row" class="row justify-content-center align-items-center">
                <div id="login-column" class="col-md-6">
                    <div id="login-box" class="col-md-12">
                        <form id="login-form" class="form" action="TaiKhoanController" method="post">
                            <h3 class="text-center text-info">Login</h3>
                            <p class="message">${message}</p>
                            <div class="form-group">
                                <label for="Username" class="text-info">Username:</label><br>
                                <input type="text" name="Username" id="Username" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="Password" class="text-info">Password:</label><br>
                                <input type="password" name="Password" id="Password" class="form-control">
                            </div>
                            <div class="form-group">
                                <input type="submit" name="submit" class="btn btn-info btn-md btnsubmit" value="Submit">
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>