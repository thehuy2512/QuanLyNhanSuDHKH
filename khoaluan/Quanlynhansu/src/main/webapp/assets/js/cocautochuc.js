/**
 * 
 */
function testConfirmDialog()  {
			  var flag=false;
              var result = confirm("Bạn có muốn xoá phòng này?");

              if(result)  {
				  flag=true;
              } else {
				  flag=false;
              }
              return flag;
         }
function testMaID()  {
			  var flag=false;
			  var MaID = document.getElementById("MaPhongKhoa");
              var regex = /^[0-9]*$/;

              if(regex.test(MaID.value))  {
				  flag=true;
				  document.getElementById("MaPhongKhoa1").innerText="";				  
              } else {
				  flag=false;
				  document.getElementById("MaPhongKhoa1").innerText="Mã là số nguyên";
              }
              return flag;
         }