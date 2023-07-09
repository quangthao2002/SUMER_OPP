package bai5;

import java.time.LocalDate;

public class KhanhHangNuocNgoai extends HoaDon {
	private String quocTich;
	public KhanhHangNuocNgoai() {
		// TODO Auto-generated constructor stub
	}
	public KhanhHangNuocNgoai(String maKhachHang, String hoTen, LocalDate ngayLapHoaDon, double soKW, double donGia,
			String quocTich) {
		super(maKhachHang, hoTen, ngayLapHoaDon, soKW, donGia);
		this.quocTich = quocTich;
	}
	
	@Override
	public double thanhTien() {
		return super.thanhTien();
	}
	public String getQuocTich() {
		return quocTich;
	}
	public void setQuocTich(String quocTich) {
		this.quocTich = quocTich;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("KhanhHangNuocNgoai [toString()=");
		builder.append(super.toString());
		builder.append(", quocTich=");
		builder.append(quocTich);
		builder.append("]");
		return builder.toString();
	}
	
	
}
