package bai5;

import java.time.LocalDate;

public class KhachHangVietNam extends HoaDon {
	private String doiTuongKH;
	private double dinhMuc; 
	public KhachHangVietNam() {
		// TODO Auto-generated constructor stub
	}
	
	public KhachHangVietNam(String maKhachHang, String hoTen, LocalDate ngayLapHoaDon, double soKW, double donGia,
			String doiTuongKH, double dinhMuc) {
		super(maKhachHang, hoTen, ngayLapHoaDon, soKW, donGia);
		this.doiTuongKH = doiTuongKH;
		this.dinhMuc = dinhMuc;
	}

	public String getDoiTuongKH() {
		return doiTuongKH;
	}

	public void setDoiTuongKH(String doiTuongKH) {
		this.doiTuongKH = doiTuongKH;
	}

	public double getDinhMuc() {
		return dinhMuc;
	}

	public void setDinhMuc(double dinhMuc) {
		this.dinhMuc = dinhMuc;
	}
	
	@Override
	public double thanhTien() {
		if(getSoKW() <= dinhMuc) {	
			return super.thanhTien();
		}else {
			double soKWvuotdinhmuc= getSoKW()-dinhMuc;
			return super.thanhTien() * dinhMuc * soKWvuotdinhmuc * getDonGia() *2.5;
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("KhachHangVietNam [toString()=");
		builder.append(super.toString());
		builder.append(", doiTuongKH=");
		builder.append(doiTuongKH);
		builder.append(", dinhMuc=");
		builder.append(dinhMuc);
		builder.append("]");
		return builder.toString();
	}
	
	
}
