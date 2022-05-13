<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
<div class="container-fluid">
<img style="width: 40px;height: 40px" alt="logo" src="./assets/img/logoHUSC.png">
<a class="navbar-brand" href="#">Hue university of science</a>
<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#main_nav"  aria-expanded="false" aria-label="Toggle navigation">
<span class="navbar-toggler-icon"></span>
</button>
<div class="collapse navbar-collapse" id="main_nav">
  <ul class="navbar-nav"> 
    <li class="nav-item active"><a class="nav-link" href="homeController"><i class="fas fa-school"></i> Trang chủ </a> </li>
    <li class="nav-item"><a class="nav-link" href="quanlytudienController"><i class="fas fa-book"></i> Quản lý từ điển </a></li>
    <li class="nav-item"><a class="nav-link" href="cocautochucController"><i class="fas fa-boxes"></i> Cơ cấu tổ chức </a></li>
    <li class="nav-item"><a class="nav-link" href="hienthinhansuController"><i class="fas fa-user-alt"></i> Quản lý nhân sự </a></li>
  </ul>
  <ul class="navbar-nav ms-auto">
        <c:choose>
        <c:when test="${sessionScope.tk!=null}">
        	<li class="nav-item">
        		<a class="nav-link" href="logoutController">(${sessionScope.tk.getUsername()}) Log out <i class="fas fa-sign-out-alt"></i></a>         		
        	</li>
        </c:when>
        </c:choose>
   </ul>
</div>
<!-- navbar-collapse.// -->
</div>
<!-- container-fluid.// -->
</nav>