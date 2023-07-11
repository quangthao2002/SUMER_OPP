package bai3;

import java.time.LocalDate;

public class GiaoDichTienTe extends GiaoDich {
	private String loaiTien;
	private double tiGia;

	public GiaoDichTienTe() {
	}

	public GiaoDichTienTe(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, int soLuong, String loaiTien,
			double tiGia) {
		super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
		this.loaiTien = loaiTien;
		setLoaiTien(loaiTien);
	}

	public String getLoaiTien() {
		return loaiTien;
	}

	public void setLoaiTien(String loaiTien) {
		if (loaiTien.equals("USD") || loaiTien.equals("Euro") || loaiTien.equals("VN")) {
			this.loaiTien = loaiTien;
		} else {
			this.loaiTien = "Loại tiền nhập sai";
		}

	}

	public double getTiGia() {
		return tiGia;
	}

	public void setTiGia(double tiGia) {
		this.tiGia = tiGia;
	}

	@Override
	public double thanhTien() {
		if (loaiTien.equals("USD") || loaiTien.equals("Euro")) {
			return super.thanhTien() * tiGia;
		} else {
			return super.thanhTien();
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GiaoDichTienTe =");
		builder.append(super.toString());
		builder.append(", loaiTien=");
		builder.append(loaiTien);
		builder.append(", tiGia=");
		builder.append(tiGia);
		builder.append(", thanhTien()=");
		builder.append(thanhTien());
		builder.append("]");
		return builder.toString();
	}

}
