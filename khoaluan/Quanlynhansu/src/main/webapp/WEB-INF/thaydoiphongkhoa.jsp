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
	<link rel="stylesheet" type="text/css" href="./assets/css/cocautochuc.css">
	<script src="./assets/js/cocautochuc.js"></script>
<title>Thay đổi phòng ban</title>
</head>
<body>
<div id="header">
	<%@include file="menu.jsp"%>
</div>
<div class="container" id="container">
  <h3>Thay đổi phòng ban</h3>
  <div class="row">
  		<div class="col-3"></div>
  		<div class="col-6">
				<div class="container-fluid" style="border: 1px solid;border-radius: 5px;line-height: 2.5;background-color: white;">
					<div class="row" >
					
						<p style="color: red;">${message}</p>
						<form action="thaydoiphongkhoaController" method="post">
						<h5>Thông tin chung</h5>
						<div class="row">
							<div class="col-3">Mã đơn vị:</div>
							<div class="col-4"><input type="text" class="form-control form-control-sm" name="MaPhongKhoa" value="${phongkhoa.getMaPhongKhoa()}" readonly="readonly"></div>
						</div>
						<div class="row">
							<div class="col-3">Tên đơn vị:</div>
							<div class="col"><input type="text" class="form-control form-control-sm" name="TenPhongKhoa" value="${phongkhoa.getTenPhongKhoa()}" required="required"></div>
						</div>
						<h5>Thông tin liên hệ</h5>
						<div class="row">
							<div class="col-3">Điện thoại:</div>
							<div class="col-4"><input type="text" class="form-control form-control-sm" name="DienThoai" value="${phongkhoa.getDienThoai()}"></div>
						</div>
						<div class="row">
							<div class="col-3">Fax:</div>
							<div class="col-4"><input type="text" class="form-control form-control-sm" name="Fax" value="${phongkhoa.getFax()}"></div>
						</div>
						<div class="row">
							<div class="col-3">Website:</div>
							<div class="col"><input type="text" class="form-control form-control-sm" name="Website" value="${phongkhoa.getWebsite()}"></div>
						</div>
						<div class="row">
							<div class="col-3">Email:</div>
							<div class="col"><input type="email" class="form-control form-control-sm" name="Email" value="${phongkhoa.getEmail()}"></div>
						</div>
						<div class="row">
							<div class="col-3">Địa chỉ:</div>
							<div class="col"><input type="text" class="form-control form-control-sm" name="DiaChi" value="${phongkhoa.getDiaChi()}"></div>
						</div>
						<div class="row" style="padding: 10px">							
							<input type="submit" class="btn btn-primary" name="Submit">
						</div>
						</form>
					</div>
					
					</div>
				</div>
			<div class="col-3"></div>
											
	</div>
</div>

<div id="footer">
	<%@include file="footer.jsp"%>
</div>
</body>
</html>