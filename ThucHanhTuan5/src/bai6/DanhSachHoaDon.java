package bai6;

import java.util.ArrayList;

public class DanhSachHoaDon {

	private ArrayList<HoaDon> dsHoaDons;
	private int count;

	public DanhSachHoaDon() {
		dsHoaDons = new ArrayList<>();
	}

	public boolean themHD(HoaDon hd) {

//		if (dsHoaDons.contains(hd)) {
//			// trùng mã
//			return false;
//		}
		for (HoaDon hd2 : dsHoaDons) {
			if (hd2.getMaHoaDon().equals(hd.getMaHoaDon())) {
				return false;
			}
		}
		dsHoaDons.add(hd);
		count++;
		return true;
	}

	public void xuat() {
		System.out.println("Danh sach Hoa Don");
		for (HoaDon hd : dsHoaDons) {
			System.out.println(hd.toString());
		}
	}

	public int thongKeSoLuongHDTheoGio() {
		int soluongHDTG = 0;
		for (HoaDon hd : dsHoaDons) {
			if (hd instanceof HoaDonTheoGio) {
				soluongHDTG++;
			}

		}
		return soluongHDTG;
	}

	public int thongKeSoLuongHDTheoNgay() {
		int soluongHDTN = 0;
		for (HoaDon hd : dsHoaDons) {
			if (hd instanceof HoaDonTheoNgay) {
				soluongHDTN++;
			}

		}
		return soluongHDTN;
	}

	public double tinhTongThanhTien(int thang, int nam) {
		double tongThanhTien=0;
		
		for(HoaDon hd : dsHoaDons) {
			int thangHoaDon = hd.getNgayHoaDon().getMonthValue();
			int namHoaDon = hd.getNgayHoaDon().getYear();
			
			if(thangHoaDon== thang && nam==namHoaDon) {
				tongThanhTien += hd.thanhTien();
			}
		}
		return tongThanhTien;
		
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
}
