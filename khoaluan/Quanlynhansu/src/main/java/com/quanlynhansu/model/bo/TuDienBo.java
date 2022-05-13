package com.quanlynhansu.model.bo;

import java.util.ArrayList;

import com.quanlynhansu.model.bean.TuDienBean;
import com.quanlynhansu.model.dao.TuDienDao;

public class TuDienBo {
	TuDienDao tdao = new TuDienDao();
	public ArrayList<TuDienBean> getTuDienByMaLoai(int maloai) {
		return tdao.getTuDienByMaLoai(maloai);
	}
	public TuDienBean getTuDienByMaTuDien(int matudien) {
		return tdao.getTuDienByMaTuDien(matudien);
	}
}
