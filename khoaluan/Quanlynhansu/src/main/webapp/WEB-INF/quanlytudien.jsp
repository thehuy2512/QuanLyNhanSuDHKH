<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css" />
    <link rel="stylesheet" type="text/css" href="./assets/css/layout.css">
    <link rel="stylesheet" type="text/css" href="./assets/css/quanlytudien.css">
<title>Quản lý tự điển</title>
</head>
<body>
<div id="header">
	<%@include file="menu.jsp"%>
</div>
<div class="container" id="container" style="background-color: white;padding: 14px">
<h3>Quản lý từ điển dữ liệu</h3>
<c:forEach items="${ds}" var="s">
			<div class="container-fluid">
				<div class="row loaitudien">
					${s.key.getTenLoaiTuDien()}
				</div>
				<div class="row tudien">				
					<c:forEach items="${s.value}" var="t">
					<div class="col-3 chitiettudien">
						<i class="fas fa-book"></i>						
						<a href="chitiettudienController?matudien=${t.getMaTuDien()}">${t.getMaTuDien()}_${t.getTenTuDien()}</a>						
					</div>
					</c:forEach>
				</div>
			</div>
			<hr>
</c:forEach>	
</div>
<div id="footer">
	<%@include file="footer.jsp"%>
</div>
</body>
</html>