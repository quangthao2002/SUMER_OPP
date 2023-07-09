package bai5;

import java.time.LocalDate;

public class HoaDon {
	private String maKhachHang;
	private String hoTen;
	private LocalDate ngayLapHoaDon;
	private double soKW;
	private double donGia;
	public HoaDon() {
		// TODO Auto-generated constructor stub
	}
	public HoaDon(String maKhachHang, String hoTen, LocalDate ngayLapHoaDon, double soKW, double donGia) {
		this.maKhachHang = maKhachHang;
		this.hoTen = hoTen;
		this.ngayLapHoaDon = ngayLapHoaDon;
		this.soKW = soKW;
		this.donGia = donGia;
	}
	public String getMaKhachHang() {
		return maKhachHang;
	}
	public void setMaKhachHang(String maKhachHang) {
		this.maKhachHang = maKhachHang;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public LocalDate getNgayLapHoaDon() {
		return ngayLapHoaDon;
	}
	public void setNgayLapHoaDon(LocalDate ngayLapHoaDon) {
		this.ngayLapHoaDon = ngayLapHoaDon;
	}
	public double getSoKW() {
		return soKW;
	}
	public void setSoKW(int soKW) {
		this.soKW = soKW;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	
	public double thanhTien() {
		return soKW * donGia;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("KhacHang [maKhachHang=");
		builder.append(maKhachHang);
		builder.append(", hoTen=");
		builder.append(hoTen);
		builder.append(", ngayLapHoaDon=");
		builder.append(ngayLapHoaDon);
		builder.append(", soKW=");
		builder.append(soKW);
		builder.append(", donGia=");
		builder.append(donGia);
		builder.append("]");
		return builder.toString();
	}
	
	
}
