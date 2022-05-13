<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
    <link rel="stylesheet" type="text/css" href="./assets/css/home.css">
    <script type="text/javascript" src="./assets/js/home.js"></script>
    <title>HOME</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
<div class="container-fluid">
<a class="navbar-brand" href="#">Brand</a>
<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#main_nav"  aria-expanded="false" aria-label="Toggle navigation">
<span class="navbar-toggler-icon"></span>
</button>
<div class="collapse navbar-collapse" id="main_nav">
  <ul class="navbar-nav">
    <li class="nav-item active"> <a class="nav-link" href="#">Trang chủ </a> </li>
    <li class="nav-item"><a class="nav-link" href="#"> Quản lý từ điển </a></li>
    <li class="nav-item dropdown" id="myDropdown">
      <a class="nav-link dropdown-toggle" href="#" data-bs-toggle="dropdown">  Cơ cấu tổ chức  </a>
      <ul class="dropdown-menu">
        <li> <a class="dropdown-item" href="#"> Dropdown item 1 </a></li>
        <li> <a class="dropdown-item" href="#"> Dropdown item 2 &raquo; </a>
          <ul class="submenu dropdown-menu">
            <li><a class="dropdown-item" href="#">Submenu item 1</a></li>
            <li><a class="dropdown-item" href="#">Submenu item 2</a></li>
            <li><a class="dropdown-item" href="#">Submenu item 3 &raquo; </a>
              <ul class="submenu dropdown-menu">
                <li><a class="dropdown-item" href="#">Multi level 1</a></li>
                <li><a class="dropdown-item" href="#">Multi level 2</a></li>
              </ul>
            </li>
            <li><a class="dropdown-item" href="#">Submenu item 4</a></li>
            <li><a class="dropdown-item" href="#">Submenu item 5</a></li>
          </ul>
        </li>
        <li><a class="dropdown-item" href="#"> Dropdown item 3 </a></li>
        <li><a class="dropdown-item" href="#"> Dropdown item 4 </a></li>
      </ul>
    </li>
    <li class="nav-item"><a class="nav-link" href="#"> Quản lý nhân sự </a></li>
  </ul>
</div>
<!-- navbar-collapse.// -->
</div>
<!-- container-fluid.// -->
</nav>

</body>
</html>