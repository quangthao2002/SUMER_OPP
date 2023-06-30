package ontap2;

import java.text.DecimalFormat;

public class Test {

	public static void main(String[] args) {
		DanhSachChuyenXe dsXe = new DanhSachChuyenXe();
		Xe xeKhach1 = new xeKhach("XK001", "76P122", "Ngo Quang Thao", 10, 20000, 12);
		Xe xeKhach2 = new xeKhach("XK002", "76P123", "Ngo Quang Tuấn", -1, -1, 30);
		Xe xeKhach3 = new xeKhach("XK002", "76P123", "Ngo Quang Tuấn", 12, 30000, 45);
		Xe xeTai1= new XeTai("XT003", "78C2121", "Nguyễn Văn A", 21, 30000);
		Xe xeTai2= new XeTai("XT004", "78D2154", "Nguyễn Văn B", -1, -1);
		
		dsXe.addXe(xeKhach1);
		dsXe.addXe(xeKhach2);
		dsXe.addXe(xeKhach3);
		
		dsXe.addXe(xeTai1);
		dsXe.addXe(xeTai2);
		System.out.println("\nDanh sách các xe:");
		dsXe.printAllXe();
		System.out.println("\nDanh sách sau khi bị xóa 1 xe:");
		dsXe.deleteXe("XK003");
		dsXe.printAllXe();
		DecimalFormat decimalFormat = new DecimalFormat("#,### VNĐ");
		System.out.println("Tổng thành tiền: "+ decimalFormat.format(dsXe.tongThanhTien()));
		System.out.println("\nDanh sách các xe sau khi được sắp xếp theo thành tiền:");
		dsXe.sortByThanhTien();
		dsXe.printAllXe();
		
	}
}
