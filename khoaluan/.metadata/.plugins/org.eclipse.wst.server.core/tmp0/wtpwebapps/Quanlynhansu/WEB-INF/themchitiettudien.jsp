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
    <script src="./assets/js/chitiettudien.js"></script>
<title>Thêm chi tiết tự điển</title>
</head>
<body>
<div id="header">
	<%@include file="menu.jsp"%>
</div>
<div class="container" id="container" style="background-color: white">
<main>
	<div class="container" >
<h3>Tự điển : ${MaTD}</h3>

	<div class="row">
		<div class="col-6">
				<table class="table table-bordered">
					<thead>
						<tr>
							<th scope="col">STT</th>
							<th scope="col">Mã chi tiết</th>
							<th scope="col">Tên chi tiết</th>
						</tr>
					</thead>
					<tbody>
						<c:set var="stt" value="1"></c:set>
						<c:forEach items="${dschitiet}" var="s">
							<tr>
								<th scope="row">${stt}</th>
								<td>${s.getMaChiTietTuDien()}</td>
								<td>${s.getTenChiTietTuDien()}</td>								
							</tr>
							<c:set var="stt" value="${stt+1}"></c:set> 
						</c:forEach>
					</tbody>
				</table>
		</div>
		<div class="col-6">
				<form action="themchitiettudienController" method="post" style="border: 1px solid; border-radius: 10px; padding: 10px;" onsubmit="return testMaID();">
					<div class="row">
						<h5 class="tieude">Thêm chi tiết</h5>
						<input name="MaTD" id="MaTD" hidden value="${MaTD}">
					</div>
					<p style="color: red">${message}</p>
					<div class="mb-3">
							<label for="MaCT" class="form-label">Mã chi tiết :</label>
							<input type="text" class="form-control"
							id="MaCT" name="MaCT" required="required">
							<small id="MaCT1" class="text-danger"></small>						
					</div>
					<br>
					<div class="mb-3">
							<label for="TenCT" class="form-label">Tên chi tiết :</label>
							<input type="text" class="form-control"
							id="TenCT" name="TenCT" required="required">								
					</div>
					<div class="mb-3">
						<c:choose>
						<c:when test="${MaTD==3}">
							<label for="TinhThanh" class="form-label">Thuộc Tỉnh/Thành :</label>
							<select name="TinhThanh" class="form-select" required="required">
							        	<option value="" disabled="disabled" selected>---</option>
							        	<c:forEach items="${dstinhthanh}" var="tt">
							        		<option value="${tt.getMaChiTietTuDien()}">${tt.getTenChiTietTuDien()}</option>
							        	</c:forEach>
							</select>
						</c:when>
						</c:choose>
					</div>
					<br>
					<div class="row">
						<input type="submit" class="btn btn-success submit" name="Submit" value="Thêm">
					</div>
				</form>
			</div>
	</div>
	<div class="row" style="padding: 20px">
		<form action="chitiettudienController" method="post" style="display: flex;justify-content: right">
			<input type="text" name="matudien"  value="${MaTD}" hidden/> 
 			<input type="submit" class="btn btn-danger" value="Back"/> 
		</form>
	</div>
	
</div>
</main>
</div>
<div id="footer">
	<%@include file="footer.jsp"%>
</div>
</body>
</html>