package bai5;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;



public class Main {
public static void main(String[] args) {
	
	
        List<HoaDon> danhSachHoaDon = new ArrayList<>();

        // Tạo các khách hàng Việt Nam
        KhachHangVietNam khachHangVietNam1 = new KhachHangVietNam("KHVN1", "Nguyễn Văn A", LocalDate.of(2018, 9, 1), 100, 5000, "sinh hoạt", 200);
        KhachHangVietNam khachHangVietNam2 = new KhachHangVietNam("KHVN2", "Trần Thị B", LocalDate.of(2018, 9, 2), 300, 6000, "kinh doanh", 400);
        KhachHangVietNam khachHangVietNam3 = new KhachHangVietNam("KHVN3", "Lê Văn C", LocalDate.of(2018, 9, 3), 500, 7000, "sản xuất", 600);

        // Tạo các khách hàng nước ngoài
        KhanhHangNuocNgoai khachHangNuocNgoai1 = new KhanhHangNuocNgoai("KHN1", "John Smith", LocalDate.of(2018, 9, 1), 200, 8000, "USA");
        KhanhHangNuocNgoai khachHangNuocNgoai2 = new KhanhHangNuocNgoai("KHN2", "Maria Garcia", LocalDate.of(2018, 6, 2), 400, 9000, "Spain");
        KhanhHangNuocNgoai khachHangNuocNgoai3 = new KhanhHangNuocNgoai("KHN3", "Satoshi Tanaka", LocalDate.of(2018, 9, 3), 600, 10000, "Japan");

        danhSachHoaDon.add(khachHangVietNam1);
        danhSachHoaDon.add(khachHangVietNam2);
        danhSachHoaDon.add(khachHangVietNam3);
        danhSachHoaDon.add(khachHangNuocNgoai1);
        danhSachHoaDon.add(khachHangNuocNgoai2);
        danhSachHoaDon.add(khachHangNuocNgoai3);
        
        int countVN = 0;
		int countNN = 0;
		for (HoaDon hd : danhSachHoaDon) {
			if (hd instanceof KhachHangVietNam) {
				countVN++;
			} else if (hd instanceof KhanhHangNuocNgoai) {
				countNN++;
			}
		}
		
		System.out.println("Tổng số lượng  khách hàng Việt Nam: "+ countVN);
		System.out.println("Tổng số lượng  khách hàng Nước ngoài: "+ countNN);
		double tongThanhTienKHNN = 0;
		for (HoaDon hd : danhSachHoaDon) {
			if (hd instanceof KhanhHangNuocNgoai) {
				tongThanhTienKHNN += hd.thanhTien();
			}
		}
		DecimalFormat decimalFormat = new DecimalFormat("#,### VNĐ");
		double TbTTgiaoDichDat = tongThanhTienKHNN/countNN;
		System.out.println("Trung bình thành tiền khách hành nước ngoài: "+ decimalFormat.format(tongThanhTienKHNN));
		System.out.println("Các hóa đơn của tháng 9 năm 2018:");
		
		

		LocalDate thangNamCanTim2 = LocalDate.of(2018, 9, 10);
		for (HoaDon hd : danhSachHoaDon) {
			if (hd.getNgayLapHoaDon().getMonth() == thangNamCanTim2.getMonth()
					&& hd.getNgayLapHoaDon().getYear() == thangNamCanTim2.getYear()) {
				System.out.println(hd);
			}
		}
}
}
