package com.quanlynhansu.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.quanlynhansu.model.bean.LoaiTuDienBean;

public class LoaiTuDienDao {
	public ArrayList<LoaiTuDienBean> getLoaiTuDien() {
		try {
			ArrayList<LoaiTuDienBean> ds= new ArrayList<LoaiTuDienBean>();
			String sql = "SELECT * FROM LoaiTuDien";
			DungChung dc = new DungChung();
			dc.KetNoi();
			PreparedStatement st = dc.cn.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				ds.add(new LoaiTuDienBean(rs.getInt(1), rs.getString(2)));
				
			}
			return ds;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
}
