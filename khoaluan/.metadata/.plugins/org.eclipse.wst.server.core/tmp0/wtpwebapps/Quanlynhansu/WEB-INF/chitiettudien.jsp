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
    <script src="./assets/js/chitiettudien.js"></script>
<title>Quản lý tự điển</title>
</head>
<body>
<div id="header">
	<%@include file="menu.jsp"%>
</div>


<div class="container" id="container" style="background-color: white">
<h3>Tự điển</h3>
	<div class="row">
		<div class="col-3">
				<ul class="list-group">
					<li class="list-group-item">
						<h5>Mã tự điển : ${tudien.getMaTuDien()}</h5>	
					</li>
					<li class="list-group-item">
						<h5>Tên tự điển : ${tudien.getTenTuDien()}</h5>
					</li>				
				</ul>
		</div>
		<div class="col-6">
				<table class="table table-bordered">
					<thead>
						<tr>
							<th scope="col">STT</th>
							<th scope="col">Mã chi tiết</th>
							<th scope="col">Tên chi tiết</th>
							<th scope="col">Hành động</th>
						</tr>
					</thead>
					<tbody>
						<c:set var="stt" value="1"></c:set>
						<c:forEach items="${dschitiet}" var="s">
							<tr>
								<th scope="row">${stt}</th>
								<td>${s.getMaChiTietTuDien()}</td>
								<td>${s.getTenChiTietTuDien()}</td>
								<td>
									<i class="fas fa-edit" style="color: blue;"></i> <a href="suachitiettudienController?macttd=${s.getMaChiTietTuDien()}&matd=${tudien.getMaTuDien()}">Thay đổi</a>
									<i class="fas fa-minus-circle" style="color: red;"></i> <a href="xoachitiettudienController?macttd=${s.getMaChiTietTuDien()}&matd=${tudien.getMaTuDien()}" onclick="return testConfirmDialog();">Xoá</a>
								</td>
								
							</tr>
							<c:set var="stt" value="${stt+1}"></c:set> 
						</c:forEach>
					</tbody>
				</table>
			</div>
		<div class="col-3">
				<ul class="list-group">
					<li class="list-group-item">
						<h5>Thao tác dữ liệu</h5>
						<p>${message}</p>
					</li>
					<li class="list-group-item"><i class="fas fa-plus-circle"></i> <a href="themchitiettudienController?MaTD=${tudien.getMaTuDien()}">Thêm dữ liệu</a></li>				
				</ul>
		</div>
	</div>

</div>
<div id="footer">
	<%@include file="footer.jsp"%>
</div>


</body>
</html>