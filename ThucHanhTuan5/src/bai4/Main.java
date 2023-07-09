package bai4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;




public class Main {
//	enum Season {
//        SPRING(5), SUMMER(10), FALL(15), WINTER(20);
// 
//        private int value;
// 
//        private Season(int value) {
//            this.value = value;
//        }
//    }
	public static void main(String[] args) {
		
//		 for (Season s : Season.values()) {
//	            System.out.println(s + " " + s.value);
//	        }
		List<GiaoDich> danhSachGiaoDich = new ArrayList<>();

		// Tạo các giao dịch đất
		GiaoDichDat giaoDichDat1 = new GiaoDichDat("GD1", LocalDate.of(2013, 1, 1), 10000, 10, "A");
		GiaoDichDat giaoDichDat2 = new GiaoDichDat("GD2", LocalDate.of(2013, 9, 2), 8000, 20, "B");
		GiaoDichDat giaoDichDat3 = new GiaoDichDat("GD3", LocalDate.of(2013, 3, 3), 1200, 15, "C");

		// Tạo các giao dịch nhà
		GiaoDichNha giaoDichNha1 = new GiaoDichNha("GN1", LocalDate.of(2013, 1, 1), 2000, 12, "cao cấp",
				"Địa chỉ 1");
		GiaoDichNha giaoDichNha2 = new GiaoDichNha("GN2", LocalDate.of(2013, 9, 2), 1500, 15, "thường",
				"Địa chỉ 2");
		GiaoDichNha giaoDichNha3 = new GiaoDichNha("GN3", LocalDate.of(2013, 3, 3), 1800, 18, "thường",
				"Địa chỉ 3");
		GiaoDichNha giaoDichNha4 = new GiaoDichNha("GN4", LocalDate.of(2013, 3, 3), 1800, 18, "thường",
				"Địa chỉ 3");

		danhSachGiaoDich.add(giaoDichDat1);
		danhSachGiaoDich.add(giaoDichDat2);
		danhSachGiaoDich.add(giaoDichDat3);
		danhSachGiaoDich.add(giaoDichNha1);
		danhSachGiaoDich.add(giaoDichNha2);
		danhSachGiaoDich.add(giaoDichNha3);
		danhSachGiaoDich.add(giaoDichNha4);

		int countGdDat = 0;
		int countGdNha = 0;
		for (GiaoDich gd : danhSachGiaoDich) {
			if (gd instanceof GiaoDichDat) {
				countGdDat++;
			} else if (gd instanceof GiaoDichNha) {
				countGdNha++;
			}
		}
		double tongThanhTienGdDat = 0;
		for (GiaoDich gd : danhSachGiaoDich) {
			if (gd instanceof GiaoDichDat) {
				tongThanhTienGdDat += gd.thanhTien();
			}
		}
		double TbTTgiaoDichDat = tongThanhTienGdDat/countGdDat;
		System.out.println("Trung bình thành tiền giao dịch đất: "+ TbTTgiaoDichDat);
		System.out.println("Số lượng giao dịch nhà: " + countGdNha);
		System.out.println("Số lượng giao dịch đất: " + countGdDat);

//        LocalDate thangNamCanTim = LocalDate.of(2013, 9, 1);
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/yyyy");
//        String thangNamChuoi = thangNamCanTim.format(formatter);

		System.out.println("Các giao dịch của tháng 9 năm 2013:");
//        for (GiaoDich giaoDich : danhSachGiaoDich) {
//            LocalDate ngayGiaoDich = giaoDich.getNgayGiaoDich();
//            String ngayThangChuoi = ngayGiaoDich.format(formatter);
//
//            if (ngayThangChuoi.equals(thangNamChuoi)) {
//                System.out.println("Mã giao dịch: " + giaoDich.maGiaoDich);
//            }
		LocalDate thangNamCanTim2 = LocalDate.of(2013, 9, 10);
		for (GiaoDich gd : danhSachGiaoDich) {
			if (gd.getNgayGiaoDich().getMonth() == thangNamCanTim2.getMonth()
					&& gd.getNgayGiaoDich().getYear() == thangNamCanTim2.getYear()) {
				System.out.println(gd);
			}
		}
		
		System.out.println("pageID: " + PageInfor.PAGE_001.getPageID());
        System.out.println("pageTitle: " + PageInfor.PAGE_001.getPageTitle());
        System.out.println("pageURL: " + PageInfor.PAGE_001.getPageURL());
		
	
	}
}
