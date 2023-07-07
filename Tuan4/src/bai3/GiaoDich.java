package bai3;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class GiaoDich {
	private String maGiaoDich;
	private LocalDate ngayGiaoDich;
	private double donGia;
	private int soLuong;
	
	public GiaoDich() {
		// TODO Auto-generated constructor stub
	}

	public GiaoDich(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, int soLuong) {
		super();
		this.maGiaoDich = maGiaoDich;
		this.ngayGiaoDich = ngayGiaoDich;
		this.donGia = donGia;
		this.soLuong = soLuong;
	}

	public String getMaGiaoDich() {
		return maGiaoDich;
	}

	public void setMaGiaoDich(String maGiaoDich) {
		this.maGiaoDich = maGiaoDich;
	}

	public LocalDate getNgayGiaoDich() {
		return ngayGiaoDich;
	}

	public void setNgayGiaoDich(LocalDate ngayGiaoDich) {
		this.ngayGiaoDich = ngayGiaoDich;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	
	public double thanhTien() {
		double rs = soLuong * donGia;
		return rs;
		
	}

	DecimalFormat decimalFormat = new DecimalFormat("#,###");
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GiaoDich [maGiaoDich=");
		builder.append(maGiaoDich);
		builder.append(", ngayGiaoDich=");
		builder.append(ngayGiaoDich);
		builder.append(", donGia=");
		builder.append(decimalFormat.format(donGia));
		builder.append(", soLuong=");
		builder.append(soLuong);
		builder.append("]");
		return builder.toString();
	}
	
	
}
