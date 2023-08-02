package bai2;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	enum ses{
		ASD("TXTHAO"),ACD("asd");
		private String value;
		public String getValue() {
			return value;
		}
		private ses(String value) {
			this.value = value;
		}
		
	}
	public static void main(String[] args) {
		DanhSachXe  dsxe= new DanhSachXe();

        XeKhach xeKhach1 = new XeKhach("CX001", ses.ASD.getValue(), "Tài xế 1", Season.SUMER.getValueint(),LocalDate.of(2023, 8, 1), 50000, 45);
        XeKhach xeKhach2 = new XeKhach("CX002", "XK002", "Tài xế 2",4, LocalDate.of(2023, 8, 2), 10000, 20);
        XeKhach xeKhach3 = new XeKhach("CX003", "XK003", "Tài xế 2",5, LocalDate.of(2023, 8, 2), 10000, 20);
        XeKhach xeKhach4 = new XeKhach("CX004", "XK004", "Tài xế 2",4, LocalDate.of(2023, 8, 2), 10000, 20);
        XeTai xeTai1 = new XeTai("CX006", "XT001", "Tài xế 3",5, LocalDate.of(2023, 8, 3),  2000);
        XeTai xeTai2 = new XeTai("CX007", "XT003", "Tài xế 4",3, LocalDate.of(2023, 8, 4),  2500);
        XeTai xeTai3 = new XeTai("CX008", "XT004", "Tài xế 4",6, LocalDate.of(2023, 8, 4),  2500);
        
        dsxe.addXe(xeKhach1);
        dsxe.addXe(xeKhach2);
        dsxe.addXe(xeKhach3);
        dsxe.addXe(xeKhach4);
        dsxe.addXe(xeTai1);
        dsxe.addXe(xeTai2);
        dsxe.addXe(xeTai3);
        
        Scanner scanner = new Scanner(System.in);
        int choice ;
        do {
			System.out.println("-----Menu-----");
			System.out.println("1.Thêm xe");
			System.out.println("2.Xóa một chuyến xe");
			System.out.println("3.Tình tổng tiền xe khách");
			System.out.println("4.tinh tổng tiền xe tải");
			System.out.println("5.Sắp xếp giảm dần theo thành tiền");
			System.out.println("6.Thống kê thành tiền theo ngày");
			System.out.println("7.Thống kê số chuyến theo ngày");
			System.out.println("8.Xuất toàn bộ thông tin xe");
			System.out.println("0.Thoát chương trình");
			System.out.println("\nChọn chức năng: ");
			choice = scanner.nextInt();
			scanner.nextLine();// bỏ dòng trống khi nhập số
			switch (choice) {
			case 1: {
				int loaixe;
				System.out.println("Chọn loại xe muốn thêm vào(1: Xe khách 2: Xe tải)");
				loaixe = scanner.nextInt();
				scanner.nextLine();
				switch (loaixe) {
				case 1: {
					System.out.println("Nhập mã xe: ");
					String maXe = scanner.nextLine();
					System.out.println("Nhập số xe: ");
					String soXe = scanner.nextLine();
					System.out.println("Nhập tên tài xế: ");
					String taixe = scanner.nextLine();
					System.out.println("Nhập số chuyến: ");
					int soChuyen = scanner.nextInt();
					System.out.println("Nhập ngày đi theo định dạng(yyyy-mm-dd)");
					String ngayDiStr = scanner.nextLine();
					LocalDate ngayDi = LocalDate.parse(ngayDiStr);
					System.out.println("Nhập giá vé: ");
					double giave = scanner.nextDouble();
					System.out.println("Nhập số chỗ ngồi: ");
					int soChoNgoi = scanner.nextInt();
					
					Xe xk = new XeKhach(maXe, soXe, taixe, soChuyen, ngayDi, giave, soChoNgoi);
					dsxe.addXe(xk);
					break;
				}
				case 2:{
					System.out.println("Nhập mã xe: ");
					String maXe = scanner.nextLine();
					System.out.println("Nhập số xe: ");
					String soXe = scanner.nextLine();
					System.out.println("Nhập tên tài xế: ");
					String taixe = scanner.nextLine();
					System.out.println("Nhập số chuyến: ");
					int soChuyen = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Nhập ngày đi theo định dạng(yyyy-mm-dd)");
					String ngayDiStr = scanner.nextLine();
					LocalDate ngayDi = LocalDate.parse(ngayDiStr);
					System.out.println("Nhập giá chuyến: ");
					double giachuyen = scanner.nextDouble();
					
					Xe xt = new XeTai(maXe, soXe, taixe, soChuyen, ngayDi, giachuyen);
					dsxe.addXe(xt);
					break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + loaixe);
				}
				break;
			}
			case 2:{
				System.out.println("Nhập mã xe để xóa: ");
				String maXoa =scanner.nextLine();
				if(dsxe.removeXe(maXoa)) {
					System.out.println("Xóa xe có mã: "+maXoa+" thành công !!!");
				}else {
					System.out.println("Xóa thất bại");
				}
				
				break;
			}
			case 3:{
				DecimalFormat decimalFormat = new DecimalFormat("###,###,### VNĐ");
		        System.out.println("Tổng thành tiền của các chuyến xe khách: " + decimalFormat.format(dsxe.thanhTienXeKhach()));
		        break;
			}
			case 4 :{
				DecimalFormat decimalFormat = new DecimalFormat("###,###,### VNĐ");
		        System.out.println("Tổng thành tiền của các chuyến xe tải: " + decimalFormat.format(dsxe.thanhTienXeTai()));
		        break;
			}case 5:{
				System.out.println("\nSắp xếp theo doanh thu");
		        dsxe.sortByThanhTien();
		        dsxe.printALL();
		        break;
			}
			case 6:{
		        System.out.println("\nThống kê thành tiền theo ngày:");
		        Map<LocalDate, Double> thongke= dsxe.thongKeThanhTienTheoNgay();
		        for (Map.Entry<LocalDate, Double> entry : thongke.entrySet()) {
					LocalDate ngaydi = entry.getKey();
					Double thanhtien = entry.getValue();
					System.out.println("Ngày đi: "+ngaydi+" Thành tiền: "+thanhtien);
				}
			break;
			}
			case 7:{
		        System.out.println("\nThống kê số chuyến xe đi theo ngày:");
		        Map<LocalDate, Integer> thongke2 = dsxe.thongketheosochuyen();
		        for (Map.Entry<LocalDate, Integer> entry : thongke2.entrySet()) {
					LocalDate ngaydi = entry.getKey();
					Integer sochuyen = entry.getValue();
					System.out.println("Ngày đi: "+ngaydi+" Số chuyến: "+sochuyen);
				}
		        break;
			}
			case 8:{
				dsxe.printALL();
				break;
			}
			case 0:{
				System.out.println("Thoát chương trình thành công");
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
			
			
		} while (choice !=0);
			scanner.close();
	
	}
}
//	
//        System.out.println("Danh sách chuyến xe trước khi sắp xếp:");
//        dsxe.printALL();
//        System.out.println("----------------");
////        dsxe.removeXe("CX003");
//        dsxe.printALL();
//        DecimalFormat decimalFormat = new DecimalFormat("###,###,### VNĐ");
//        System.out.println("Tổng thành tiền của các chuyến xe khách: " + decimalFormat.format(dsxe.thanhTienXeKhach()));
//        System.out.println("----");
//        System.out.println("Tổng thành tiền của các chuyến xe tải: " + decimalFormat.format(dsxe.thanhTienXeTai()));
//        System.out.println("\nGiam dan thanh tien ");
//        dsxe.sortByThanhTien();
//        dsxe.printALL();
//        System.out.println("\nThống kê thành tiền theo ngày:");
//        Map<LocalDate, Double> thongke= dsxe.thongKeThanhTienTheoNgay();
//        for (Map.Entry<LocalDate, Double> entry : thongke.entrySet()) {
//			LocalDate ngaydi = entry.getKey();
//			Double thanhtien = entry.getValue();
//			System.out.println("Ngày đi: "+ngaydi+" Thành tiền: "+thanhtien);
//		}
//        System.out.println("\nThống kê số chuyến xe đi theo ngày:");
//        Map<LocalDate, Integer> thongke2 = dsxe.thongketheosochuyen();
//        for (Map.Entry<LocalDate, Integer> entry : thongke2.entrySet()) {
//			LocalDate ngaydi = entry.getKey();
//			Integer sochuyen = entry.getValue();
//			System.out.println("Ngày đi: "+ngaydi+" Số chuyến: "+sochuyen);
//		}
//        System.out.println("\nSắp xếp theo doanh thu");
//        dsxe.sortByThanhTien();
//        dsxe.printALL();
