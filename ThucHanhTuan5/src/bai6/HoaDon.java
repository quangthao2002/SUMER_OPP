package bai6;

import java.time.LocalDate;

public abstract class HoaDon {
	private String maHoaDon;
	private LocalDate ngayHoaDon;
	private String tenKhachHang;
	private String maPhong;
	private double donGia;
	
	public HoaDon() {
		// TODO Auto-generated constructor stub
	}

	public HoaDon(String maHoaDon, LocalDate ngayHoaDon, String tenKhachHang, String maPhong, double donGia) {
		super();
		this.maHoaDon = maHoaDon;
		this.ngayHoaDon = ngayHoaDon;
		this.tenKhachHang = tenKhachHang;
		this.maPhong = maPhong;
		this.donGia = donGia;
	}

	public String getMaHoaDon() {
		return maHoaDon;
	}

	public void setMaHoaDon(String maHoaDon) {
		this.maHoaDon = maHoaDon;
	}

	public LocalDate getNgayHoaDon() {
		return ngayHoaDon;
	}

	public void setNgayHoaDon(LocalDate ngayHoaDon) {
		this.ngayHoaDon = ngayHoaDon;
	}

	public String getTenKhachHang() {
		return tenKhachHang;
	}

	public void setTenKhachHang(String tenKhachHang) {
		this.tenKhachHang = tenKhachHang;
	}

	public String getMaPhong() {
		return maPhong;
	}

	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public abstract double thanhTien();
//	@Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//
//        if (obj == null || getClass() != obj.getClass()) {
//            return false;
//        }
//
//        HoaDon other = (HoaDon) obj;
//        return maHoaDon.equals(other.maHoaDon);
//    }
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("HoaDon [maHoaDon=");
		builder.append(maHoaDon);
		builder.append(", ngayHoaDon=");
		builder.append(ngayHoaDon);
		builder.append(", tenKhachHang=");
		builder.append(tenKhachHang);
		builder.append(", maPhong=");
		builder.append(maPhong);
		builder.append(", donGia=");
		builder.append(donGia);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
