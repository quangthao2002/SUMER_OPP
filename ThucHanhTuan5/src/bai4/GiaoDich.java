package bai4;

import java.time.LocalDate;

public class GiaoDich {
	private String maGiaoDich;
	private LocalDate ngayGiaoDich;
	private double donGia;
	private float dienTich;
	
	public GiaoDich() {

	}
	public GiaoDich(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, float dienTich) {
		super();
		this.maGiaoDich = maGiaoDich;
		this.ngayGiaoDich = ngayGiaoDich;
		this.donGia = donGia;
		this.dienTich = dienTich;
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
	public float getDienTich() {
		return dienTich;
	}
	public void setDienTich(float dienTich) {
		this.dienTich = dienTich;
	}
	
	public double thanhTien() {
		return dienTich * donGia;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GiaoDich [maGiaoDich=");
		builder.append(maGiaoDich);
		builder.append(", ngayGiaoDich=");
		builder.append(ngayGiaoDich);
		builder.append(", donGia=");
		builder.append(donGia);
		builder.append(", dienTich=");
		builder.append(dienTich);
		builder.append("]");
		return builder.toString();
	}
	

}
