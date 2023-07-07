package bai3;

import java.time.LocalDate;

public class GiaoDichVang extends GiaoDich {
	private String loaiVang;
	
	public GiaoDichVang() {
		// TODO Auto-generated constructor stub
	}

	public GiaoDichVang(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, int soLuong, String loaiVang) {
		super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
		this.loaiVang = loaiVang;
	}

	public String getLoaiVang() {
		return loaiVang;
	}

	public void setLoaiVang(String loaiVang) {
		this.loaiVang = loaiVang;
	}
	
	@Override
	public double thanhTien() {
		return super.thanhTien();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GiaoDichVang =");
		builder.append(super.toString());
		builder.append(", loaiVang=");
		builder.append(loaiVang);
		builder.append(", thanhTien()=");
		builder.append(thanhTien());
		builder.append("]");
		return builder.toString();
	}

	
	
	
}
