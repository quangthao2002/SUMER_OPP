package Bai6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class DanhSachPhongHoc {

	private List<PhongHoc> dsPhongHoc;

	public DanhSachPhongHoc() {
		dsPhongHoc = new ArrayList<>();

	}

	public boolean addPhongHoc(PhongHoc ph) {
		for (PhongHoc phongHoc : dsPhongHoc) {
			if (phongHoc.getMaPhong().equals(ph.getMaPhong())) {
				System.out.println("Trùng mã phòng có mã: " + phongHoc.getMaPhong());
				return false;
			}
		}
		dsPhongHoc.add(ph);
		return true;
	}

	public PhongHoc findById(String maPhong) {
		for (PhongHoc phongHoc : dsPhongHoc) {
			if (phongHoc.getMaPhong().equals(maPhong)) {
				return phongHoc;
			}
		}
		System.out.println("Không tìm thấy");
		return null;
	}

	public PhongHoc printAllPhongHoc() {
		for (PhongHoc phongHoc : dsPhongHoc) {
			System.out.println(phongHoc);
		}
		return null;
	}

//	public void printDatChuan() {
//		for (PhongHoc phongHoc : dsPhongHoc) {
//			if(phongHoc.datChuat()) {
//				System.out.println(phongHoc);
//			}
//		}
//	}
	public List<PhongHoc> printDatChuan() {
		List<PhongHoc> dsPhongHocDatChuat = new ArrayList<>();
		for (PhongHoc phongHoc : dsPhongHoc) {
			if (phongHoc.datChuat()) {
				dsPhongHocDatChuat.add(phongHoc);
			}
		}
		return dsPhongHocDatChuat;
	}

	public void sortByDayNhaTangDan() {
		Collections.sort(dsPhongHoc, Comparator.comparing(ph -> ph.getDayNha()));
	}

	public void sortByDienTichGiamDan() {
		Collections.sort(dsPhongHoc, Comparator.comparing(PhongHoc::getDienTich).reversed());
	}

	public void sortByBongDenTangDan() {
		Collections.sort(dsPhongHoc, Comparator.comparing(ph -> ph.getSoBongDen()));
	}

	public void UpdateSoMayTinh(String maPhong, int soMayTinhMoi) {
		PhongHoc phongHoc = findById(maPhong);

		if (phongHoc instanceof PhongMayTinh) {
			((PhongMayTinh) phongHoc).setSoMayTinh(soMayTinhMoi);
			System.out.println("Cập nhật số máy tính thành công");
		} else {
			System.out.println("Cập nhật thất bại");
		}
	}

	public void removePhongHoc(String maPhong) {
		Scanner scanner = new Scanner(System.in);
		PhongHoc phongHoc = findById(maPhong);
		if (phongHoc != null) {
			System.out.println("Thông tin của  phòng học sẽ xóa: ");
			System.out.println(phongHoc.toString());
			System.out.print("Bạn có chắc chắn muốn xóa phòng này? (Y/N): ");

			String conFirm = scanner.nextLine();

			if (conFirm.equalsIgnoreCase("Y")) {
				dsPhongHoc.remove(phongHoc);
				System.out.println("Đã xóa phòng học thành công.");
			} else {
				System.out.println("Không xóa phòng học.");
			}
		} else
			System.out.println("Không tìm thấy phòng học có mã: " + maPhong);
	}

	public int soPhongHoc() {
		return dsPhongHoc.size();
	}

	public List<PhongMayTinh> dsPhongMayCo60May() {
		ArrayList<PhongMayTinh> dsPM60 = new ArrayList<>();
		for (PhongHoc phongHoc : dsPhongHoc) {
			if (phongHoc instanceof PhongMayTinh) {
				PhongMayTinh phongMayTinh = (PhongMayTinh) phongHoc;
				if (((PhongMayTinh) phongHoc).getSoMayTinh() == 60) {
					dsPM60.add((PhongMayTinh) phongHoc);
				}
			}
		}
		return dsPM60;
	}
}
