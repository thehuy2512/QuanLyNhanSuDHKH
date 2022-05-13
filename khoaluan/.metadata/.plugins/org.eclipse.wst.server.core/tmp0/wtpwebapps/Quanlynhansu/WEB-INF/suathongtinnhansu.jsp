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
<title>Sửa thông tin nhân sự</title>
</head>
<body>
<div id="header">
	<%@include file="menu.jsp"%> 
</div>
<div class="container no-padding" id="container">
  <h3>Sửa thông tin nhân sự</h3>
  <div class="row" >
  	<div class="col-1">
  		
  	</div>
    <div class="col-10">
				<div class="container" style="border: 1px solid;border-radius: 10px;padding: 5px;line-height: 2.5;background-color: white;">
					<p style="color: red;">${message}</p>
				    <h5 align="center">Hồ sơ</h5>
				    <small class="text-danger">${message}</small>
				    <form action="suanhansuController" method="post">
					<div class="row">
						<div class="col-1">
						</div>
						<div class="col-10">
							<div class="row">
								<div class="col-3">Mã hồ sơ:<input type="text" class="form-control" name="MaHoSo" value="${nhansu.getMaHoSo()}" required="required" readonly="readonly"></div>
								<div class="col-9">Đơn vị quản lý hồ sơ:
									<select name="DonVi" class="form-select" >
							        	<option value="${nhansu.getDonViQuanLy()}"  selected>${nhansu.getDonViQuanLy()}</option>
							        	<option value="Đại học khoa học Huế">Đại học khoa học Huế</option>
							      	</select>
								</div>
							</div>
							<div class="row">
								<div class="col-5">Họ và tên:<input type="text" class="form-control" name="HoTen" value="${nhansu.getHoTen()}" required="required"></div>
								<div class="col-2">Giới tính:
									<select name="GioiTinh" class="form-select" >
							        	<option value="${nhansu.getGioiTinh()}"  selected>${nhansu.getGioiTinh()}</option>
							        	<option value="Nam">Nam</option>
							        	<option value="Nữ">Nữ</option>
							      	</select>
							    </div>
							</div>
							<div class="row">
								<input type="text" name="NgaySinhBD" class="form-control" value="${nhansu.getNgaySinh()}" hidden>
								<div class="col-3">Ngày sinh: ${nhansu.getNgaySinh()}<input type="date" class="form-control" name="NgaySinh"></div>
								<div class="col">
									<div class="row">
										<div class="col-3">
											Quê quán: 
								      	</div>
										<div class="col-3">
											Quận/Huyện
											<select name="QuanHuyen" id="quanhuyen" class="form-select">
								        		<option value="${nhansu.getQuanHuyen()}"  selected>${quanhuyen}</option>
	
								      		</select>
								      	</div>
								      	<div class="col-3">
								      		Tỉnh/TP
								      		<select name="TinhThanhPho" id="TinhThanhPho" class="form-select">
								        		<option value="${nhansu.getTinhThanhPho()}"  selected>${tinhthanh}</option>
							        				<c:forEach items="${dstinh}" var="tinh1">
							        						<option value="${tinh1.getMaChiTietTuDien()}">${tinh1.getTenChiTietTuDien()}</option>
							        				</c:forEach>
								      		</select>
								      	</div>
								      	<div class="col-3">
								      		Quốc Gia
								      		<select name="QuocGia" class="form-select">
								        		<option value="" disabled="disabled" selected>Quốc Gia</option>
												<option value="VietNam">Việt Nam</option>
								      		</select>
								      	</div>
							      	</div>
								</div>
							</div>
							<div class="row">
								<div class="col-3">Nơi ở hiện nay:</div>
								<div class="col">
									<div class="row">
										<div class="col-6">
											Địa chỉ
											<input type="text" name="DiaChi" class="form-control" value="${nhansu.getDiaChi()}">
								      	</div>
								      	<div class="col-3">
								      		Quận/huyện
								      		<select name="QuanHuyen2" id="quanhuyen2" class="form-select">
								        		<option value="${nhansu.getQuanHuyen2()}"  selected>${quanhuyen2}</option>
	
								      		</select>
								      	</div>
								      	<div class="col-3">
								      		Tỉnh/Thành
								      		<select name="TinhThanhPho2" id="TinhThanhPho2" class="form-select">
								        		<option value="${nhansu.getTinhThanhPho2()}"  selected>${tinhthanh2}</option>
							        				<c:forEach items="${dstinh}" var="tinh2">
							        						<option value="${tinh2.getMaChiTietTuDien()}">${tinh2.getTenChiTietTuDien()}</option>
							        				</c:forEach>
								      		</select>
								      	</div>
							      	</div>
								</div>
							</div>
							<div class="row">
								<input type="text" name="NgayCapBD" class="form-control" value="${nhansu.getNgayCap()}" hidden>
								<div class="col-3">Số CCCD:<input type="text" name="CCCD" class="form-control" value="${nhansu.getCCCD()}" required="required"></div>
								<div class="col-3">Ngày cấp: ${nhansu.getNgayCap()}<input type="date" name="NgayCap" class="form-control"></div>
							</div>
							<div class="row">
								<div class="col-3">Điện thoại:<input type="text" name="DienThoai" value="${nhansu.getDienThoai()}" class="form-control"></div>
								<div class="col-3">Di động:<input type="text" name="DiDong" value="${nhansu.getDiDong()}" class="form-control"></div>
								<div class="col">Email:<input type="email" name="Email" value="${nhansu.getEmail()}" class="form-control"></div>
							</div>
							<div class="row">
								<div class="col-3">Chức danh:
									<select name="ChucDanh" class="form-select" >
							        	<option value="${nhansu.getChucDanh()}" selected>${nhansu.getChucDanh()}</option>
							        	<option value="Không">Không</option>
							        	<c:forEach items="${dschucvu}" var="cv">
							        		<option value="${cv.getTenChiTietTuDien()}">${cv.getTenChiTietTuDien()}</option>
							        	</c:forEach>
							      	</select>
								</div>
								<div class="col-3">Học vị:
									<select name="HocVi" class="form-select" >
							        	<option value="${nhansu.getHocVi()}" selected>${nhansu.getHocVi()}</option>
							        	<option value="Không">Không</option>
							        	<c:forEach items="${dshv}" var="hv">
							        		<option value="${hv.getTenChiTietTuDien()}">${hv.getTenChiTietTuDien()}</option>
							        	</c:forEach>
							      	</select>
								</div>
								<div class="col">Ngạch công chức:
									<select name="NgachCongChuc" class="form-select" >
							        	<option value="${nhansu.getNgachCongChuc()}" selected>${nhansu.getNgachCongChuc()}</option>
							        	<option value="Không">Không</option>
							        	<c:forEach items="${dsngachcongchuc}" var="ngach">
							        		<option value="${ngach.getTenChiTietTuDien()}">${ngach.getTenChiTietTuDien()}</option>
							        	</c:forEach>
							      	</select>
								</div>
							</div>
							<div class="row">
								<div class="col-6">Chức vụ hiện tại:
									<select name="ChucVu" class="form-select" >
							        	<option value="${nhansu.getChucVuHienTai()}" selected>${nhansu.getChucVuHienTai()}</option>
							        	<option value="Không">Không</option>
							        	<c:forEach items="${dschucvuhientai}" var="cvht">
							        		<option value="${cvht.getTenChiTietTuDien()}">${cvht.getTenChiTietTuDien()}</option>
							        	</c:forEach>
							      	</select>
								</div>
								<div class="col">Phòng/Ban:
									<select name="PhongBan" class="form-select" >
							        	<option value="${nhansu.getPhongBan()}" selected>${nhansu.getPhongBan()}</option>
							        	<option value="Không">Không</option>
							        	<c:forEach items="${dspk}" var="pk">
							        		<option value="${pk.getTenPhongKhoa()}">${pk.getTenPhongKhoa()}</option>
							        	</c:forEach>
							      	</select>
								</div>
							</div>
							<br>
							<div class="row" style="padding: 10px">
								<input type="submit" name="submit" class="btn btn-primary submit" value="Update">
							</div>
						</div>
					</div>
					</form>
				</div>
			</div>
  </div>

</div>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.js"></script>

<script type="text/javascript">    
$(document).ready(function () {
    $('#TinhThanhPho').change(function () {
    	//$('#quanhuyen').append('<option>Quận/Huyện</option>');
        $('#quanhuyen').find('option').remove();
       
        

        let cid = $('#TinhThanhPho').val();
        let data = {
            operation: "tinhthanh",
            id: cid
        };
        $.ajax({
            url: "/Quanlynhansu/themquanhuyenController",
            method: "GET",
            data: data,
            success: function (data, textStatus, jqXHR) {
                //console.log(data);
                let obj = $.parseJSON(data);
                $.each(obj, function (key, value) {
                    $('#quanhuyen').append('<option value="' + value.MaChiTietTuDien + '">' +
                        value.TenChiTietTuDien + '</option>')
                });                
            },
            error: function (jqXHR, textStatus, errorThrown) {
                $('#quanhuyen').append('<option>Quận/Huyện</option>');
            },
            cache: false
        });
    });
    $('#TinhThanhPho2').change(function () {
    	//$('#quanhuyen').append('<option>Quận/Huyện</option>');
        $('#quanhuyen2').find('option').remove();
       
        

        let cid = $('#TinhThanhPho2').val();
        let data = {
            operation: "tinhthanh2",
            id: cid
        };
        $.ajax({
            url: "/Quanlynhansu/themquanhuyenController",
            method: "GET",
            data: data,
            success: function (data, textStatus, jqXHR) {
                //console.log(data);
                let obj = $.parseJSON(data);
                $.each(obj, function (key, value) {
                    $('#quanhuyen2').append('<option value="' + value.MaChiTietTuDien + '">' +
                        value.TenChiTietTuDien + '</option>')
                });                
            },
            error: function (jqXHR, textStatus, errorThrown) {
                $('#quanhuyen2').append('<option>Quận/Huyện</option>');
            },
            cache: false
        });
    });
});        
</script>
<div id="footer">
	<%@include file="footer.jsp"%>
</div>	
</body>
</html>