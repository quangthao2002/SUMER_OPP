package ontap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class DanhSachChuyenXe {

	private List<Xe> dsChuyenXe;

	public DanhSachChuyenXe() {
		dsChuyenXe = new ArrayList<>();

	}

	public boolean addXe(Xe x) {
		for(Xe chuyenxe : dsChuyenXe) {
			boolean trungid_number = chuyenxe.getMaChuyen().equals(x.getMaChuyen())&&chuyenxe.getSoXe().equals(x.getSoXe());
			if(trungid_number) {
				System.out.println("Trùng mã và trùng số xe");
				return false;
			}
		}
		for(Xe chuyenxe : dsChuyenXe) {
			if(chuyenxe.getMaChuyen().equals(x.getMaChuyen())) {
				System.out.println("Trùng mã xe: "+ chuyenxe.getMaChuyen());
				return false;
			}
		}
		for(Xe chuyenxe : dsChuyenXe) {
			if(chuyenxe.getSoXe().equals(x.getSoXe())) {
				System.out.println("Trùng số xe: "+ chuyenxe.getSoXe());
				return false;
			}
		}
		dsChuyenXe.add(x);
		System.out.println("Thêm thành công xe có mã: "+ x.getMaChuyen());
		return true;
	}
	
	public boolean addXe2(Xe x) {
		String maChuyen = x.getMaChuyen();
		String maSoXe= x.getSoXe();
		for(Xe chuyenxe : dsChuyenXe) {
			if(chuyenxe.getMaChuyen().equals(maChuyen)&&chuyenxe.getSoXe().equals(maSoXe)) {
				System.out.println("Mã chuyến xe và số xe đã trùng");
				return false;
			}
			if(chuyenxe.getMaChuyen().equals(maChuyen)) {
				System.out.println("Mã chuyến xe trùng");
				return false;
			}
			if(chuyenxe.getSoXe().equals(maSoXe)) {
				System.out.println("Số xe trùng");
				return false;
			}
		}
		dsChuyenXe.add(x);
		return true;
	}
	public boolean remove(String maChuyen) {

		for (Xe xe : dsChuyenXe) {

			if (xe.getMaChuyen().equals(maChuyen)) {

				dsChuyenXe.remove(xe);
				return true;
			}
		}
		return false;
	}

	public double tongThanhTien() {
		double tongThanhTien = 0;

		for (Xe x : dsChuyenXe) {
			tongThanhTien += x.thanhTien();
		}

		return tongThanhTien;
	}

	public void sapXepGiamDanTheoThanhTien() {

//		Collections.sort(dsChuyenXe, Comparator.comparingDouble(Xe::thanhTien).reversed());
		// không có reversed là tăng dần
		Collections.sort(dsChuyenXe, Comparator.comparingInt(xe -> xe.getSoChuyen()));
	}

	public void xuatToanBoDanhSach() {

		for (Xe x : dsChuyenXe) {
			System.out.println(x);
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DanhSachChuyenXe [dsChuyenXe=");
		builder.append(dsChuyenXe);
		builder.append(", tongThanhTien()=");
		builder.append(tongThanhTien());
		builder.append("]");
		return builder.toString();
	}

}
