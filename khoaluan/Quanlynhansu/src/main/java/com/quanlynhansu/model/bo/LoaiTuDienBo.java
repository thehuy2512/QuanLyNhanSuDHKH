package com.quanlynhansu.model.bo;

import java.util.ArrayList;

import com.quanlynhansu.model.bean.LoaiTuDienBean;
import com.quanlynhansu.model.dao.LoaiTuDienDao;

public class LoaiTuDienBo {
	LoaiTuDienDao ldao = new LoaiTuDienDao();
	public ArrayList<LoaiTuDienBean> getLoaiTuDien() {
		return ldao.getLoaiTuDien();
	}
}
