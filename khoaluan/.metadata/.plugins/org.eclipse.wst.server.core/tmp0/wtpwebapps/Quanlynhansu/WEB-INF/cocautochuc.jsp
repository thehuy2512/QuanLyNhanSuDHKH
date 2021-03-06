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
<title>Cơ cấu tổ chức</title>
</head>
<body>
<div id="header">
	<%@include file="menu.jsp"%>
</div>
<div class="container">
  <h3>Quản lý cơ cấu tổ chức</h3>
  <div class="row">
			<div class="col-3">
				<ul class="list-group scroll">
					<c:forEach items="${dspb}" var="s">
						<li class="${s.getMaPhongKhoa()==phonghientai.getMaPhongKhoa()?'list-group-item active':'list-group-item'}">
							${s.getMaPhongKhoa()} _
							<a href="cocautochucController?mpb=${s.getMaPhongKhoa()}">${s.getTenPhongKhoa()}</a>
						</li>
					</c:forEach>
				</ul>

			</div>
			<div class="col-6">
				<div class="container-fluid" style="border: 1px solid;border-radius: 5px;line-height: 2.5;background-color: white;">
					<div class="row" >
						<h5>Thông tin chung</h5>
						<div class="row">
							<div class="col-3">Mã đơn vị:</div>
							<div class="col-4"><input type="text" class="form-control form-control-sm" value="${phonghientai.getMaPhongKhoa()}" readonly="readonly"></div>
						</div>
						<div class="row">
							<div class="col-3">Tên đơn vị:</div>
							<div class="col"><input type="text" class="form-control form-control-sm" value="${phonghientai.getTenPhongKhoa()}" readonly="readonly"></div>
						</div>
						<h5>Thông tin liên hệ</h5>
						<div class="row">
							<div class="col-3">Điện thoại:</div>
							<div class="col-4"><input type="text" class="form-control form-control-sm" value="${phonghientai.getDienThoai()}" readonly="readonly"></div>
						</div>
						<div class="row">
							<div class="col-3">Fax:</div>
							<div class="col-4"><input type="text" class="form-control form-control-sm" value="${phonghientai.getFax()}" readonly="readonly"></div>
						</div>
						<div class="row">
							<div class="col-3">Website:</div>
							<div class="col"><input type="text" class="form-control form-control-sm" value="${phonghientai.getWebsite()}" readonly="readonly"><a href="${phonghientai.getWebsite()}">Liên kết</a></div>
						</div>
						<div class="row">
							<div class="col-3">Email:</div>
							<div class="col"><input type="text" class="form-control form-control-sm" value="${phonghientai.getEmail()}" readonly="readonly"></div>
						</div>
						<div class="row">
							<div class="col-3">Địa chỉ:</div>
							<div class="col"><input type="text" class="form-control form-control-sm" value="${phonghientai.getDiaChi()}" readonly="readonly"></div>
						</div>
					</div>

				</div>
				
			</div>
			<div class="col-2">
				<ul class="list-group">
					<li class="list-group-item">
						<h5>Thao tác dữ liệu</h5>
						<p class="text-danger">${message}</p>
					</li>
					<li class="list-group-item"><i class="fas fa-plus-circle"></i> <a href="themphongkhoaController">Thêm phòng ban</a></li>
					<li class="list-group-item"><i class="fas fa-edit"></i> <a href="thaydoiphongkhoaController?mapk=${phonghientai.getMaPhongKhoa()}">Thay đổi thông tin</a></li>
					<li class="list-group-item"><i class="fas fa-minus-circle"></i> <a href="xoaphongkhoaController?mapk=${phonghientai.getMaPhongKhoa()}" onclick="return testConfirmDialog();">Xoá phòng ban</a> </li>					
				</ul>
			</div>
		</div>
</div>


<div id="footer">
	<%@include file="footer.jsp"%>
</div>
</body>
</html>