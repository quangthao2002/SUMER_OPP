package bai6;

import java.time.LocalDate;

public class HoaDonTheoGio extends HoaDon{
	private int soGioThue;
	
	public HoaDonTheoGio() {
		// TODO Auto-generated constructor stub
	}

	public HoaDonTheoGio(String maHoaDon, LocalDate ngayHoaDon, String tenKhachHang, String maPhong, double donGia,
			int soGioThue) {
		super(maHoaDon, ngayHoaDon, tenKhachHang, maPhong, donGia);
		this.soGioThue = soGioThue;
	}

	public int getSoGioThue() {
		return soGioThue;
	}

	public void setSoGioThue(int soGioThue) {
		this.soGioThue = soGioThue;
	}

	@Override
	public double thanhTien() {
		if(soGioThue >30) {
			throw new IllegalArgumentException("Số giờ thuê vượt quá 30 giờ. Không thể tạo hóa đơn theo giờ.");
		}else if(soGioThue >24){
			soGioThue=24;
		}
		return soGioThue * getDonGia();
	}
	
	
	
	
}
