/**
 * 
 */
function testConfirmDialog()  {
			  var flag=false;
              var result = confirm("Bạn có muốn xoá hồ sơ tiết này?");

              if(result)  {
				  flag=true;
              } else {
				  flag=false;
              }
              return flag;
         }
function testConfirmDialogImage()  {
			  var flag=false;
              var result = confirm("Bạn có muốn xoá ảnh này?");

              if(result)  {
				  flag=true;
              } else {
				  flag=false;
              }
              return flag;
         }
function testMaID()  {
			  var flag=false;
			  var MaID = document.getElementById("MaHoSo");
              var regex = /^[0-9]*$/;

              if(regex.test(MaID.value))  {
				  flag=true;
				  document.getElementById("MaHoSo1").innerText="";				  
              } else {
				  flag=false;
				  document.getElementById("MaHoSo1").innerText="Mã là số nguyên";
              }
              return flag;
         }