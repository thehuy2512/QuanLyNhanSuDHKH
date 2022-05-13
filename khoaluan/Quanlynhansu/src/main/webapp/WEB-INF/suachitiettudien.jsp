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
    <link rel="stylesheet" type="text/css" href="./assets/css/themchitiettudien.css">
<title>Sửa chi tiết tự điển</title>
</head>
<body>
<div id="header">
	<%@include file="menu.jsp"%>
</div>
<div class="container" id="container" style="background-color: white;">
<h3>Tự điển</h3>
	<div class="row">
		<div class="col-3">
				
		</div>
		<div class="col-6">
				<form action="suachitiettudienController" method="post" style="border: 1px solid; border-radius: 10px; padding: 10px;">
					<div class="row">
						<h5 class="tieude">Sửa chi tiết</h5>
						<input name="matd" hidden value="${MaTD}">
						<input name="macttd" hidden value="${MaCTTD}">
					</div>
					<p style="color: red">${message}</p>					
					<div class="row">
						<div class="col-3">
							<label for="MaCT" class="form-label">Mã chi tiết :</label>
						</div>
						<div class="col">
							<input type="text" class="form-control"
							id="MaCT" name="MaCT" required="required" readonly="readonly" value="${chitiettudien.getMaChiTietTuDien()}">
						</div>						
					</div>
					<br>
					<div class="row">
						<div class="col-3">
							<label for="TenCT" class="form-label">Tên chi tiết :</label>
						</div>
						<div class="col">
							<input type="text" class="form-control"
							id="TenCT" name="TenCT" required="required" value="${chitiettudien.getTenChiTietTuDien()}">
						</div>						
					</div>
					<br>
					<div class="row">
						<input type="submit" class="btn btn-primary submit" name="Submit" value="Sửa">
					</div>
				</form>
			</div>
		<div class="col-3">
				
		</div>
	</div>
	<div class="row">
		<form action="chitiettudienController" method="post" style="display: flex;justify-content: right">
			<input type="text" name="matudien"  value="${MaTD}" hidden/> 
 			<input type="submit" class="btn btn-danger" value="Back"/> 
		</form>
	</div>
</div>
<div id="footer">
	<%@include file="footer.jsp"%>
</div>
</body>
</html>