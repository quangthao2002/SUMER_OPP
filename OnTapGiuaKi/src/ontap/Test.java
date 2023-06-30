package ontap;

import java.text.DecimalFormat;

public class Test {

	public static void main(String[] args) {
		DanhSachChuyenXe ds = new DanhSachChuyenXe();
		
		Xe xekhach1= new xeKhach("mc1", "76P1", "NgoQuangThao", 5, 10, 20000);
		Xe xekhach2= new xeKhach("mc1", "76P12", "NgoQuangThao", 5, 10, 15000);
		Xe xetai1= new xeTai("XT001", "77C22", "NguyenVanLam", 15, 51000);
		Xe xetai2= new xeTai("XT002", "77C221", "NguyenVanLam", 8, 50000);
		ds.addXe2(xekhach1);
		ds.addXe2(xekhach2);
		ds.addXe2(xetai1);
		ds.addXe2(xetai2);
		System.out.println("\nDanh sách chuyến xe :\n");
		ds.xuatToanBoDanhSach();
		
		ds.remove("mc2");
		System.out.println("\nDanh sách chuyến xe sau khi xóa :");
		ds.xuatToanBoDanhSach();
		System.out.println("\nSắp xếp :");
		ds.sapXepGiamDanTheoThanhTien();
		ds.xuatToanBoDanhSach();
		DecimalFormat decimalFormat = new DecimalFormat("#,### VNĐ");
		System.out.println("\nTổng thành tiền: "+decimalFormat.format(ds.tongThanhTien()));
		
		
	}
}
