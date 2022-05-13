package com.quanlynhansu.model.bo;

import com.quanlynhansu.model.bean.TaiKhoanBean;
import com.quanlynhansu.model.dao.TaiKhoanDao;

public class TaiKhoanBo {
	TaiKhoanDao tkdao = new TaiKhoanDao();
	public TaiKhoanBean getTaiKhoan(String user,String pass) {
		return tkdao.getTaiKhoan(user,pass);
	}
}
