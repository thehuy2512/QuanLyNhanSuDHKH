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
<link rel="stylesheet" type="text/css" href="./assets/css/hienthinhansu.css">
<title>Nhân sự</title>
</head>
<body>
<div id="header">
	<%@include file="menu.jsp"%> 
</div>
<div class="container" id="container" style="background-color: white;padding: 14px">
  <h3>Quản lý hồ sơ nhân sự</h3>
  <div class="row">
    <div class="col-3">
      <ul class="list-group">
      	  <li class="list-group-item">
      	  	<h5>Thao tác dữ liệu</h5>
      	  </li>
		  <li class="list-group-item"><a href="themnhansuController"><i class="fas fa-plus-circle"></i> Thêm hồ sơ</a></li>
		  <li class="list-group-item">
		  <form action="hienthinhansuController" method="post">
			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label"><i class="fas fa-search"></i> Tìm kiếm hồ sơ (họ tên, tên phòng)</label> 
				<input type="text" class="form-control"
							id="txttimkiem" name="txttimkiem">
				<small id="txttimkiem1" class="text-danger">${message}</small>
			</div>
			<button type="submit" class="btn btn-primary align-right">Search</button>
	 	  </form>
		  </li>
	  </ul>
	  
    </div>
    <div class="col-9">
				<nav aria-label="Page navigation example" style="margin-right: 20px;">
		            <ul class="pagination d-flex justify-content-end">
		              <c:forEach begin="1" end="${endPage}" var="i">	  
			              <li class="${i==indexPage?'page-item active':'page-item'}"><a class="page-link" href="hienthinhansuController?sotrang=${i}">${i}</a></li>
		              </c:forEach>
		            </ul>
		        </nav>
				<table class="table">
					<thead>
						<tr>
							<th scope="col">Mã hồ sơ</th>
							<th scope="col">Họ và tên</th>
							<th scope="col">Ngày sinh</th>
							<th scope="col">Ảnh</th>
							<th scope="col">Phòng khoa</th>
							<th scope="col">Hành động</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${dshs}" var="hs">
							<tr>
								<th scope="row">${hs.getMaHoSo()}</th>
								<td>${hs.getHoTen()}</td>
								<td>${hs.getNgaySinh()}</td>
								<td>
									<img alt="Trống" style="width: 90px;height: 120px" src="assets/imageHoSo/${hs.getImage()!= null ? hs.getImage() : 'logonhansu.png'}">
								</td>
								<td>${hs.getPhongBan()}</td>
								<td><a href="chitietnhansuController?macths=${hs.getMaHoSo()}"><i class="fas fa-list-ul"></i> Chi tiết</a> </td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				
			</div>
  </div>

</div>
<div id="footer">
	<%@include file="footer.jsp"%>	
</div>

</body>
</html>