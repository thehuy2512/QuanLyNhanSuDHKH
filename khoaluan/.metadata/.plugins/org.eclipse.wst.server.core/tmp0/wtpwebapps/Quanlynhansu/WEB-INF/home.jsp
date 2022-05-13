<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css" />
	<link rel="stylesheet" type="text/css" href="./assets/css/home.css">
	
    <title>HOME</title>
</head>
<body>
<%@include file="menu.jsp"%>
<%@include file="slideshow.jsp"%>
<div>
 <img alt="trống" src="./assets/img/pre65year.jpg" width="100%" height="500px">
</div>
<div class="quangcao">
	<div class="row">
		<div class="col-8 quangcaotrai">
			<div class="content" style="padding: 20px;">
				<div class="box-header">
					<h1 class="box-title center">
					<span>Trường Đại học Khoa học</span><br>
					Lịch sử xây dựng và phát triển</h1>
				</div>
				<p>Trong lịch sử phát triển hàng trăm năm của nền giáo dục Huế, Trường Đại học Khoa học, Đại học Huế là một điểm sáng đáng chú ý với bề dày truyền thống 65 năm xây dựng và phát triển (1957 - 2022). Ngay từ những ngày đầu thành lập, Trường đã sớm xác lập ảnh hưởng, khẳng định uy tín và vị thế của một trong những trường đại học đầu tiên của miền Nam Việt Nam, mang đậm dấu ấn của vùng đất Cố đô đẹp và thơ, giàu truyền thống lịch sử, văn hoá và đấu tranh cách mạng. Từ đó đến nay, ảnh hưởng, uy tín, vị thế và bản sắc đó đã được lớp lớp thế hệ thầy trò kế thừa và phát huy xứng đáng dẫu rằng trong quá trình phát triển đã gặp không ít khó khăn, thách thức do tác động của bối cảnh trong nước và quốc tế.</p>
				<p>Trải qua chặng đường 65 năm với những tên gọi khác nhau, quá trình xây dựng và phát triển Trường Đại học Khoa học (ĐHKH) được khẳng định qua ba giai đoạn chính.</p>
				<div class="nutthem">
					<a class="btn btn-primary" href="http://husc.hueuni.edu.vn/viewpage.php?page_tag=lichsu">Xem thêm</a>
				</div>
				
			</div>
		</div>
		<div class="col-4">
			<img alt="" src="./assets/img/quangcaophai.jpg" width="100%" height="100%">
		</div>
	</div>
</div>
<div>
 <img alt="trống" src="./assets/img/dhkh4.jpg" width="100%" height="500px">
</div>
<%@include file="footer.jsp"%>
</body>
</html>