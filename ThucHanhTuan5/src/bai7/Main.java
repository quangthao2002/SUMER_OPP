package bai7;

import java.io.InputStream;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
//		System.out.println("Nhập số lượng hàng hóa: ");
//		int n = scanner.nextInt();
//		scanner.nextLine();

		DanhSachHangHoa listHangHoa = new DanhSachHangHoa(62);
		
		HangHoa tp1= new HangThucPham("tp1", "mi tom", 2000, 5, "Hao Hao", LocalDate.of(2022, 12, 6),LocalDate.of(2023, 4, 6));
		HangHoa tp2= new HangThucPham("tp1", "mi tom", 2000, 5, "Hao Hao", LocalDate.of(2023, 11, 6),LocalDate.of(2023, 4, 6));
		
		HangHoa dm1= new HangDienMay("dm1", "Tu lanh", 3000, 2, 4, 2);
		HangHoa dm2= new HangDienMay("dm2", "Tu lanh", 3000, 6, -1, -1);
		
		HangHoa ss1=  new HangSanhSu("ss1", "Coc su", 30000, 3, "gom thanhlong", LocalDate.of(2023, 1, 3));
		HangHoa ss2=  new HangSanhSu("ss2", "Coc su", 30000, 51, "gom thanhlong", LocalDate.of(2023, 6, 29));
		
		listHangHoa.addHangHoa(tp1);
		listHangHoa.addHangHoa(tp2);
		listHangHoa.addHangHoa(dm1);
		listHangHoa.addHangHoa(dm2);
		listHangHoa.addHangHoa(ss1);
		listHangHoa.addHangHoa(ss2);
		
		boolean next = false;

		while (!next) {
			System.out.println("----- Menu -----");
			System.out.println("1. Thêm hàng hóa");
			System.out.println("2. In toàn bộ danh sách hàng hóa");
			System.out.println("3. In danh sách hàng thực phẩm");
			System.out.println("4. In danh sách hàng sành sứ");
			System.out.println("5. In danh sách hàng điện máy");
			System.out.println("6. Tìm kiếm hàng hóa");
			System.out.println("7. Sắp xếp hàng hóa theo tên");
			System.out.println("8. Sắp xếp hàng hóa theo số lượng tồn");
			System.out.println("9. Xuất hàng thực phẩm khó bán");
			System.out.println("10. Xóa hàng hóa");
			System.out.println("11. Sửa thông tin đơn giá của hàng hóa");
			System.out.println("12. Thoát");
			System.out.println("--------------------Chọn 1 - 12 để thực hiện chức năng--------------------");
			int choice = scanner.nextInt();
//			scanner.nextLine();

			switch (choice) {
			case 1: {
				// Thêm hàng hóa
				System.out.print("Nhập mã hàng: ");
				String maHang = scanner.nextLine();
				System.out.print("Nhập tên hàng: ");
				String tenHang = scanner.nextLine();
				System.out.print("Nhập đơn giá: ");
				double donGia = scanner.nextDouble();
				scanner.nextLine();
				System.out.print("Nhập số lượng tồn: ");
				int soLuongTon = scanner.nextInt();
				scanner.nextLine();

				System.out.println("Chọn loại hàng hóa (1 - Thực phẩm, 2 - Sành sứ, 3 - Điện máy): ");
				int loaiHang = scanner.nextInt();
				scanner.nextLine();
				switch (loaiHang) {
				case 1: {
					System.out.println("Nhà cung cấp: ");
					String nhaCungCap = scanner.nextLine();
					System.out.print("Nhập ngày sản xuất (theo định dạng yyyy-MM-dd): ");
					String ngaySanXuatStr = scanner.nextLine();
					LocalDate ngaySanXuat = LocalDate.parse(ngaySanXuatStr);
					System.out.print("Nhập ngày hết hạn (theo định dạng yyyy-MM-dd): ");
					String ngayHetHanStr = scanner.nextLine();
					LocalDate ngayHetHan = LocalDate.parse(ngayHetHanStr);

					HangThucPham hangThucPham = new HangThucPham(maHang, tenHang, donGia, soLuongTon, nhaCungCap,
							ngaySanXuat, ngayHetHan);
					Boolean themHangHoa = listHangHoa.addHangHoa(hangThucPham);
					if (themHangHoa) {
						System.out.println("Thêm hàng thực phẩm thành công !!!");
					} else {
						System.out.println("Thêm hàng thực phẩm không thành công");
					}
					break;
				}

				case 2: {
					System.out.print("Nhập nhà sản xuất: ");
					String nhaSanXuat = scanner.nextLine();
					System.out.print("Nhập ngày nhập kho (theo định dạng yyyy-MM-dd): ");
					String ngayNhapKhoStr = scanner.nextLine();
					LocalDate ngayNhapKho = LocalDate.parse(ngayNhapKhoStr);

					HangSanhSu hangSanhSu = new HangSanhSu(maHang, tenHang, donGia, soLuongTon, nhaSanXuat,
							ngayNhapKho);
					boolean themHangSanhSu = listHangHoa.addHangHoa(hangSanhSu);
					if (themHangSanhSu) {
						System.out.println("Thêm hàng sành sứ thành công.");
					} else {
						System.out.println("Thêm hàng sành sứ thất bại. Mã hàng đã tồn tại.");
					}
					break;
				}
				case 3: {
					System.out.print("Nhập thời gian bảo hành (tháng): ");
					int thoiGianBaoHanh = scanner.nextInt();
					scanner.nextLine();
					System.out.print("Nhập công suất (KW): ");
					double congSuat = scanner.nextDouble();
					scanner.nextLine();

					HangDienMay hangDienMay = new HangDienMay(maHang, tenHang, donGia, soLuongTon, thoiGianBaoHanh,
							congSuat);
					boolean themHangDienMay = listHangHoa.addHangHoa(hangDienMay);
					if (themHangDienMay) {
						System.out.println("Thêm hàng điện máy thành công.");
					} else {
						System.out.println("Thêm hàng điện máy thất bại. Mã hàng đã tồn tại.");
						}
					break;
					}
				default:
					System.out.println("Lưa chon không hợp lệ vui lòng chọn lại !!!");
				}
			}
			case 2:{
				System.out.println("-----Danh Sách Hàng hóa-----");
				listHangHoa.printDsHangHoa();
//				next = true;
//				scanner.nextInt();
				break;
			}
			case 3:{
				System.out.println("-----Danh Sách Hàng thực phẩm-----");
				listHangHoa.printHangHoaThucPham();
				break;
			}
			case 4:{
				System.out.println("-----Danh Sách Hàng hoàn điện máy-----");
				listHangHoa.printHangHoaDieMay();
				break;
			}
			case 5:{
				System.out.println("-----Danh Sách Hàng sành sứ-----");
				listHangHoa.printHangHoaSanhSu();
				break;
			}
			case 6:{
				System.out.println("Nhập mã hàng cần tìm: ");
				scanner.nextLine();
				String maHang = scanner.nextLine();
			
				HangHoa hangHoa = listHangHoa.findProductById(maHang);
				if(hangHoa != null) {
					System.out.println("Thông tin hàng hóa tìm kiếm: ");
					System.out.println(hangHoa);
				}else {
					System.out.println("Không tìm thấy");
				}
				break;
			}
			case 7:{
				System.out.println("-----Danh Sách Hàng hóa theo tên hàng tăng dần-----");
				listHangHoa.sortByProductName();
				listHangHoa.printDsHangHoa();
			
			}
			case 8:{
				System.out.println("-----Danh Sách Hàng hóa theo số lượng tồn giảm dần-----");
				listHangHoa.sortByQuantityProduct();
				listHangHoa.printDsHangHoa();
				
				break;
			}
			case 9:{
				System.out.println("-----Xuất hàng thực phẩm khó bán-----");
				listHangHoa.printProductHardToShellFood();
				break;
			}
			case 10:{
				System.out.println("Nhập mã hàng hóa cần xóa");
				scanner.nextLine();
				String maHangHoa = scanner.nextLine();
				boolean rs = listHangHoa.removeProductById(maHangHoa);
				if (rs) {
			        System.out.println("Xóa hàng hóa thành công.");
			    } else {
			        System.out.println("Xóa hàng hóa thất bại. Mã hàng không tồn tại.");
			    }
				break;
			}
			case 11:{
				System.out.println("Nhập mã hàng hóa cần sữa: ");
				scanner.nextLine();
				String maHangHoa = scanner.nextLine();
//				scanner.nextLine();
				System.out.print("Nhập đơn giá mới: ");
			    double donGiaMoi = scanner.nextDouble();
			    scanner.nextLine(); // Đọc bỏ ký tự Enter
			    
			    boolean rs= listHangHoa.updatePrice(maHangHoa, donGiaMoi);
			    if (rs) {
			        System.out.println("Sửa thông tin đơn giá thành công.");
			    } else {
			        System.out.println("Sửa thông tin đơn giá thất bại. Mã hàng không tồn tại.");
			    }
			    		
			}
			 case 12:
                 // Thoát khỏi chương trình
                 next = true;
                 System.out.println("Đã thoát khỏi chương trình.");
                 break;
			default:
				System.out.println("Lựa chon không hợp lệ vui lòng chọn lại !!!");			}

		}

	}
}
