package ontap2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DanhSachChuyenXe {

	private List<Xe> listXe;

	public DanhSachChuyenXe() {
		listXe = new ArrayList<>();
	}

	public boolean addXe(Xe x) {

		for (Xe chuyenxe : listXe) {
			String maXe = x.getMaChuyenXe();
			String soXe = x.getSoXe();
			if (chuyenxe.getMaChuyenXe().equals(maXe) && chuyenxe.getSoXe().equals(soXe)) {
				System.out.println("Mã xe và số xe đã bị trùng");
				return false;
			}
			if (chuyenxe.getMaChuyenXe().equals(maXe)) {
				System.out.println("Mã xe đã bị trùng");
				return false;
			}
			if (chuyenxe.getSoXe().equals(soXe)) {
				System.out.println("Số xe đã bị trùng");
				return false;
			}
		}
			listXe.add(x);
			System.out.println("Thêm thành công có mã xe: " + x.getMaChuyenXe());
			return true;
	}
	
	public boolean deleteXe(String maXe) {
		for(Xe x : listXe) {
			if(x.getMaChuyenXe().equals(maXe)) {
				listXe.remove(x);
				return true;
			}
		}
		return false;
	}
	public double tongThanhTien() {
		double total=0;
		for(Xe x: listXe) {
			total += x.thanhTien();
		}
		return total;
	}
	
	public void sortByThanhTien() {
		
		Collections.sort(listXe, Comparator.comparingDouble(Xe::thanhTien));
		Collections.sort(listXe,Comparator.comparingInt(xe -> xe.getSoChuyen()));
	}
	public void printAllXe() {
		for(Xe x : listXe) {
			System.out.println(x);
		}
	}
}
