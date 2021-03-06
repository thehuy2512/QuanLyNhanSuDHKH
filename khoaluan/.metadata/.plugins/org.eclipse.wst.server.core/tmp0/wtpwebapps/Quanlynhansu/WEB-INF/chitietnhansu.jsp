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
<link rel="stylesheet" type="text/css" href="./assets/css/themnhansu.css">
<script src="./assets/js/nhansu.js"></script>
<title>Nhân sự</title>
</head>
<body>
<div id="header">
	<%@include file="menu.jsp"%>
</div>
<div class="container no-padding" id="container">
  <h3>Chi tiết nhân sự</h3>
  <div class="row">
  	<div class="col-1">
  	</div>
    <div class="col-10">
				<div class="container" style="border: 1px solid;border-radius: 10px;padding: 5px;line-height: 2.5;background-color: white">
				    <h5 align="center">Thông tin cơ bản</h5>
				    <p align="right">Cập nhật mới nhất: ${hs.getNgayChinhSua()}<br>Ngày vào hồ sơ: ${hs.getNgayTao()}</p>	    
					<div class="row">
						<div class="col-2">								
							<img alt="Trống" style="width: 120px;height: 180px" src="assets/imageHoSo/${hs.getImage()!= null ? hs.getImage() : 'logonhansu.png'}">					
							<div class="row">
								<div class="col"><a href="suaanhController?mahs=${hs.getMaHoSo()}"> Sửa </a></div>	
								<div class="col"><a href="xoaanhnhansuController?mahs=${hs.getMaHoSo()}" onclick="return testConfirmDialogImage();"> Xoá </a></div>		
							</div>
							<div class="row">
								<p style="color: red">${messageAnh}</p>		
							</div>
						</div>
						<div class="col-10">
							<div class="row">
								<div class="col-3">Mã hồ sơ:<input type="text" class="form-control form-control-sm" value="${hs.getMaHoSo()}" readonly="readonly"></div>
								<div class="col-9">Đơn vị quản lý hồ sơ:<input type="text" class="form-control form-control-sm" value="${hs.getDonViQuanLy()}" readonly="readonly"></div>
							</div>
							<div class="row">
								<div class="col-5">Họ và tên:<input type="text" class="form-control form-control-sm" value="${hs.getHoTen()}" readonly="readonly"></div>
								<div class="col-2">Giới tính:<input type="text" class="form-control form-control-sm" value="${hs.getGioiTinh()}" readonly="readonly"></div>
							</div>
							<div class="row">
								<div class="col-3">Ngày sinh:<input type="text" class="form-control form-control-sm" value="${hs.getNgaySinh()}" readonly="readonly"></div>
								<div class="col-3">
									Quê quán:
								</div>
								<div class="col-3">
									<br>
									<input type="text" class="form-control form-control-sm" value="${quanhuyen}" readonly="readonly">
								</div>
								<div class="col-3">
									<br>
									<input type="text" class="form-control form-control-sm" value="${tinhthanh}" readonly="readonly">
								</div>
							</div>
							<br>
							<div class="row">
								
								<div class="col-3">
									Nơi ở hiện nay:
								</div>
								<div class="col-3">
									<input type="text" class="form-control form-control-sm" value="${hs.getDiaChi()}" readonly="readonly">
								</div>
								<div class="col-3">
									<input type="text" class="form-control form-control-sm" value="${quanhuyen2}" readonly="readonly">
								</div>
								<div class="col-3">
									<input type="text" class="form-control form-control-sm" value="${tinhthanh2}" readonly="readonly">
								</div>
							</div>
							<div class="row">
								<div class="col-3">Số CCCD:<input type="text" class="form-control form-control-sm" value="${hs.getCCCD()}" readonly="readonly"></div>
								<div class="col-2">Ngày cấp:<input type="text" class="form-control form-control-sm" value="${hs.getNgayCap()}" readonly="readonly"></div>
							</div>
							<div class="row">
								<div class="col-3">Điện thoại:<input type="text" class="form-control form-control-sm" value="${hs.getDienThoai()}" readonly="readonly"></div>
								<div class="col-2">Di động:<input type="text" class="form-control form-control-sm" value="${hs.getDiDong()}" readonly="readonly"></div>
								<div class="col">Email:<input type="text" class="form-control form-control-sm" value="${hs.getEmail()}" readonly="readonly"></div>
							</div>
							<div class="row">
								<div class="col-3">Chức danh:<input type="text" class="form-control form-control-sm" value="${hs.getChucDanh()}" readonly="readonly"></div>
								<div class="col-2">Học vị:<input type="text" class="form-control form-control-sm" value="${hs.getHocVi()}" readonly="readonly"></div>
								<div class="col">Ngạch công chức:<input type="text" class="form-control form-control-sm" value="${hs.getNgachCongChuc()}" readonly="readonly"></div>
							</div>
							<div class="row">
								<div class="col-5">Chức vụ hiện tại:<input type="text" class="form-control form-control-sm" value="${hs.getChucVuHienTai()}" readonly="readonly"></div>
								<div class="col">Phòng/Ban:<input type="text" class="form-control form-control-sm" value="${hs.getPhongBan()}" readonly="readonly"></div>
							</div>
						</div>
					</div>				
				</div>
				<div class="row" style="padding: 10px">
					<div class="col-4 offset-8">
						<div class="btn-group" role="group" aria-label="Basic mixed styles example" style="display: flex;justify-content: right">
						  	<a href="hienthinhansuController" class="btn btn-success">Trở về</a>
						  	<a href="suanhansuController?mahs=${hs.getMaHoSo()}" class="btn btn-warning">Sửa</a>
						  	<a href="xoanhansuController?mahs=${hs.getMaHoSo()}" class="btn btn-danger" onclick="return testConfirmDialog();">Xoá</a>
						</div>
					</div>
				</div>
				
	</div>
 </div>
</div>

<div id="footer">
	<%@include file="footer.jsp"%>
</div>
</body>
</html>