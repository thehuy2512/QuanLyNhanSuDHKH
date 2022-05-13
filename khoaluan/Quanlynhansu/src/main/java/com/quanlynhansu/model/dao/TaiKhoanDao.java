package com.quanlynhansu.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.quanlynhansu.model.bean.TaiKhoanBean;

public class TaiKhoanDao {
	public TaiKhoanBean getTaiKhoan(String user,String pass) {
		try {
			TaiKhoanBean tk = null;
			String sql = "SELECT * FROM TaiKhoan where Username=? and Password=?";
			DungChung dc = new DungChung();
			dc.KetNoi();
			PreparedStatement st = dc.cn.prepareStatement(sql);
			st.setString(1,user);
			st.setString(2,pass);
			ResultSet rs = st.executeQuery();
			if (rs.next()) {
				tk = new TaiKhoanBean(rs.getString(1), rs.getString(2));
				return tk;
			}
			else {
				return null;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
}
