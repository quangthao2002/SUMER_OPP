package bai7;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DanhSachHangHoa {

	private List<HangHoa> dsHangHoa;
	
	public DanhSachHangHoa(int n) {
		dsHangHoa = new ArrayList<>(n);
	}
	
	public boolean addHangHoa(HangHoa hh) {
		
		for(HangHoa hangHoa : dsHangHoa) {
			if(hangHoa.getMaHang().equals(hh.getMaHang())) {
				System.out.println("Trùng mã hàng đã có trong danh sách có mã là: " + hangHoa.getMaHang());
				return false;
			}
		}
		dsHangHoa.add(hh);
		System.out.println("Thêm hàng hóa vào danh sách thành công có mã: " + hh.getMaHang());
		return true;
	}
	
	public void printDsHangHoa() {
		for(HangHoa hh : dsHangHoa) {
			System.out.println(hh);
		}
	}
	public void printHangHoaThucPham() {
		for(HangHoa hh : dsHangHoa) {
			if(hh instanceof HangThucPham) {
				System.out.println(hh);
			}
		}
	}
	public void printHangHoaSanhSu() {
		for(HangHoa hh : dsHangHoa) {
			if(hh instanceof HangSanhSu) {
				System.out.println(hh);
			}
		}
	}
	public void printHangHoaDieMay() {
		for(HangHoa hh : dsHangHoa) {
			if(hh instanceof HangDienMay) {
				System.out.println(hh);
			}
		}
	}
	public HangHoa findProductById(String maHang) {
		for(HangHoa hh : dsHangHoa) {
			if(hh.getMaHang().equals(maHang)){
				return hh;
			}
		}
		return null;
	}
	public void sortByProductName() {
		Collections.sort(dsHangHoa, Comparator.comparing(HangHoa::getTenHang));
	}
	public void sortByQuantityProduct() {
		Collections.sort(dsHangHoa, Comparator.comparingInt(HangHoa::getSoLuongTon).reversed());
		
	}
	
	public void printProductHardToShellFood() {
		System.out.println("Hàng thực phẩm khó bán");
		for(HangHoa hh : dsHangHoa) {
			if(hh instanceof HangThucPham) {
				HangThucPham hangThucPham = (HangThucPham) hh;
				if(hangThucPham.getSoLuongTon() >0 && hangThucPham.getNgayHetHan().isBefore(LocalDate.now())) {
					System.out.println(hh);
				}
			}
		}
	}
	public boolean removeProductById(String mahh) {
		for (HangHoa hangHoa : dsHangHoa) {
			if(hangHoa.getMaHang().equals(mahh)) {
				dsHangHoa.remove(hangHoa);
				return true;
			}
		}
		return false;
	}
	public boolean updatePrice(String maHangHoa, double newPrice) {
		for (HangHoa hangHoa : dsHangHoa) {
			if(hangHoa.getMaHang().equals(maHangHoa)) {
				hangHoa.setDonGia(newPrice);
				System.out.println("sửa thành công hàng hóa có mã là: " + maHangHoa);
				return true;
			}
		}
		System.out.println("Không tìm thấy hàng hóa có mã " + maHangHoa);
		return false;
	}
}
