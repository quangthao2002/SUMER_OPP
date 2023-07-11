package Bai6;

import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		DanhSachPhongHoc quanLyPhongHoc = new DanhSachPhongHoc();
		 PhongHocLyThuyet phongLyThuyet1 = new PhongHocLyThuyet("LT01", "A1", 100, 10, true);
		 PhongHocLyThuyet phongLyThuyet2 = new PhongHocLyThuyet("LT02", "B1", 120, 12, false);
		    PhongMayTinh phongMayTinh1 = new PhongMayTinh("MT01", "C1", 20, 30, 60);
		    PhongMayTinh phongMayTinh2 = new PhongMayTinh("MT02", "D1", 150, 15, 60);
		    PhongHocThiNghiem phongThiNghiem1 = new PhongHocThiNghiem("TN01", "A2", 200, 10, "Hóa học", 30, true);
		    PhongHocThiNghiem phongThiNghiem2 = new PhongHocThiNghiem("TN02", "B2", 180, 12, "Vật lý", 25, false);
		    
		    quanLyPhongHoc.addPhongHoc(phongLyThuyet1);
		    quanLyPhongHoc.addPhongHoc(phongLyThuyet2);
		    quanLyPhongHoc.addPhongHoc(phongMayTinh1);
		    quanLyPhongHoc.addPhongHoc(phongMayTinh2);
		    quanLyPhongHoc.addPhongHoc(phongThiNghiem1);
		    quanLyPhongHoc.addPhongHoc(phongThiNghiem2);

		    quanLyPhongHoc.printAllPhongHoc();
		    PhongHoc phongTimKiem = quanLyPhongHoc.findById("LT02");
		    System.out.println("Tìm kiếm phòng:" + phongTimKiem.getMaPhong());
		    System.out.println(phongTimKiem);
		    if (phongTimKiem != null) {
		        System.out.println("Tìm thấy phòng học có mã " + phongTimKiem.getMaPhong());
		    } else {
		        System.out.println("Không tìm thấy phòng học có mã LT01");
		    }
		    System.out.println("Danh sách các phòng học đạt chuẩn:");
		    List<PhongHoc> ph= quanLyPhongHoc.printDatChuan();
		    System.out.println(ph);
		    
		    quanLyPhongHoc.sortByDayNhaTangDan();
		    System.out.println("\nDanh sách phòng học sau khi sắp xếp theo dãy nhà tăng dần:");
		    quanLyPhongHoc.printAllPhongHoc();

		    quanLyPhongHoc.sortByDienTichGiamDan();
		    System.out.println("\nDanh sách phòng học sau khi sắp xếp theo diện tích giảm dần:");
		    quanLyPhongHoc.printAllPhongHoc();

		    quanLyPhongHoc.sortByBongDenTangDan();
		    System.out.println("\nDanh sách phòng học sau khi sắp xếp theo số đèn tăng dần:");
		    quanLyPhongHoc.printAllPhongHoc();
		    
		    quanLyPhongHoc.UpdateSoMayTinh("MT01", 25);
		    quanLyPhongHoc.printAllPhongHoc();
		    Scanner scanner = new Scanner(System.in);
		    System.out.println("\nNhập mã cần xóa:");
		    String maCanXoa= scanner.nextLine();
		    quanLyPhongHoc.removePhongHoc(maCanXoa);
		    quanLyPhongHoc.printAllPhongHoc();
		    
	    quanLyPhongHoc.UpdateSoMayTinh("MT02", 60);
		    
		    System.out.println("Tổng số lượng phòng học: "+ quanLyPhongHoc.soPhongHoc());
	    System.out.println("Số máy bằng  60:");
		    List<PhongMayTinh> dsSM60 = quanLyPhongHoc.dsPhongMayCo60May();
		   
	    for (PhongMayTinh phongMayTinh : dsSM60) {
		        System.out.println(phongMayTinh.toString());
		    }
	}
}
