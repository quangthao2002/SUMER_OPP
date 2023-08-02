package bai2;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DanhSachXe {
	private  List<Xe> dsXe;
	private int n;
	
	public DanhSachXe() {
		// TODO Auto-generated constructor stub
		dsXe = new ArrayList<Xe>(n);
	}
	
	public boolean addXe(Xe xe) {
		
		for (Xe x : dsXe) {
			boolean trungma = x.getMaXe().equals(xe.getMaXe());
			boolean trungxe =x.getSoXe().equals(xe.getSoXe());
			if (trungma && trungxe) {
				System.out.println("Trùng mã xe có mã là: "+x.getMaXe()+" và số xe: "+x.getSoXe());
				return false;
			}else if (trungma){
				System.out.println("Trùng mã xe có mã là: "+x.getMaXe());
				return false;
			}else if (trungxe){
				System.out.println("Trùng số xe có mã là: "+x.getMaXe());
				return false;
			}
		}
		dsXe.add(xe);
		System.out.println("Thêm thành công xe "+xe.getMaXe());
		return true;
	}
	public boolean removeXe(String maXe) {
		
		for (Xe xe : dsXe) {
			if(xe.getMaXe().equals(maXe)) {
				dsXe.remove(xe);
				return true;
			}
		}
		return  false;
	}
	
	public double thanhTienXeTai() {
		double total=0;
		for (Xe xe : dsXe) {
			if(xe instanceof XeTai) {
				System.out.println(xe.thanhTien());
				total += xe.thanhTien();
			}
		}
		return total;
	}
	
	public double thanhTienXeKhach() {
		double total=0;
		for (Xe xe : dsXe) {
			if(xe instanceof XeKhach) {
				total += xe.thanhTien();
			}
		}
		return total;
	}
	public void sortByThanhTien() {
		Collections.sort(dsXe, Comparator.comparingDouble(Xe::thanhTien).reversed());
	}
	public void printALL() {
		DecimalFormat df = new DecimalFormat("###,###,### VNĐ");
		for (Xe xe : dsXe) {
			System.out.println("mã xe: " + xe.getMaXe() +" số xe: "+xe.getSoXe()+ " tên xe: "+xe.getTenTaiXe()+ " số chuyến: "+xe.getSoChuyen()+  " ngày đi: "+xe.getNgayDi()+" lương: "+df.format(xe.thanhTien()));
		}
	}
	// thống kê doanh thu theo ngày
	public Map<LocalDate, Double> thongKeThanhTienTheoNgay(){
		Map<LocalDate, Double> thongke = new HashMap<>();
			for (Xe xe : dsXe) {
				LocalDate ngayDi= xe.getNgayDi();
				double thanhTien= xe.thanhTien();
				thongke.put(ngayDi, thongke.getOrDefault(ngayDi, 0.0) + thanhTien);
			}
		
		return thongke;
	}
	// thống kê theo số chuyến
	
	public Map<LocalDate, Integer> thongketheosochuyen(){
		Map<LocalDate, Integer> thongke= new HashMap<>();
		for (Xe xe : dsXe) {
			LocalDate ngaydi = xe.getNgayDi();
			int sochuyen = xe.getSoChuyen();
			thongke.put(ngaydi, thongke.getOrDefault(ngaydi, 0)+ sochuyen);
		}
		return thongke;
	}
	
}
