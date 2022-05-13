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
<script src="./assets/js/chitiettudien.js"></script>
<title>Nhân sự</title>
</head>
<body>
<div id="header">
	<%@include file="menu.jsp"%>
</div>
<div class="container no-padding" id="container" style="background-color: white">
  <h3>Ảnh</h3>
  <div class="row">
  	<div class="col-2 offset-2">
  		
  		<img alt="Trống" style="width: 120px;height: 180px" src="assets/imageHoSo/${nhansu.getImage()!= null ? nhansu.getImage() : 'logonhansu.png'}">
  		<p style="color: red">${message}</p>
  	</div>
    <div class="col-8">
			<form action="thuchiensuaanhController" method="post" class="form-them" enctype="multipart/form-data">
			<input type="text" name="MaHoSo" value="${nhansu.getMaHoSo()}" hidden>
					<div class="row">
						<div class="col-3">Thêm ảnh:</div>
						<div class="col">
							<input type="file" name="txtfile"
								accept="image/png, image/jpg, image/jpeg" />
						</div>

					</div>
					<br>
					<div class="row">
						<input type="submit" name="submit" class="btn btn-primary submit"
							value="Submit">
					</div>
				</form>	
				
	</div>
 </div>
</div>

<div id="footer">
	<%@include file="footer.jsp"%>
</div>
</body>
</html>