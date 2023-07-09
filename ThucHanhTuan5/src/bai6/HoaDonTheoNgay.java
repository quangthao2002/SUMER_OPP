package bai6;

import java.time.LocalDate;

public class HoaDonTheoNgay extends HoaDon {
	private int soNgayThue;
	public HoaDonTheoNgay() {
		// TODO Auto-generated constructor stub
	}
	
	public HoaDonTheoNgay(String maHoaDon, LocalDate ngayHoaDon, String tenKhachHang, String maPhong, double donGia,
			int soNgayThue) {
		super(maHoaDon, ngayHoaDon, tenKhachHang, maPhong, donGia);
		this.soNgayThue = soNgayThue;
	}

	public int getSoNgayThue() {
		return soNgayThue;
	}

	public void setSoNgayThue(int soNgayThue) {
		this.soNgayThue = soNgayThue;
	}

	@Override
	public double thanhTien() {
		if(soNgayThue>7) {
		return	((7 *getDonGia()) + ((soNgayThue-7) *(getDonGia() *0.8)));
		}
		return soNgayThue * getDonGia();
	}

}
