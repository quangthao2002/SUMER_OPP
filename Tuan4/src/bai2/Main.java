package bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Sach> danhSachSach = new ArrayList<>();

		SachGiaoKhoa sachGiaoKhoa1 = new SachGiaoKhoa("GK1", "01/01/2023", 100000, 5, "NXB A", "mới");
		SachGiaoKhoa sachGiaoKhoa2 = new SachGiaoKhoa("GK2", "01/02/2023", 80000, 3, "NXB K", "cũ");
		SachGiaoKhoa sachGiaoKhoa3 = new SachGiaoKhoa("GK5", "01/04/2022", 90000, 6, "NXB K", "mới");
		

		SachThamKhao sachThamKhao1 = new SachThamKhao("TK1", "01/01/2023", 150000, 4, "NXB X", 5000);
		SachThamKhao sachThamKhao2 = new SachThamKhao("TK2", "01/02/2023", 180000, 2, "NXB Y", 6000);
		SachThamKhao sachThamKhao3 = new SachThamKhao("TK3", "01/03/2023", 200000, 3, "NXB Z", 7000);

		danhSachSach.add(sachGiaoKhoa1);
		danhSachSach.add(sachGiaoKhoa2);
		danhSachSach.add(sachGiaoKhoa3);
		danhSachSach.add(sachThamKhao1);
		danhSachSach.add(sachThamKhao2);
		danhSachSach.add(sachThamKhao3);

		double tongThanhTienSachTK = 0;
		double tongThanhTienSachGK = 0;
		double tongdonGia = 0;
		double tbcongdongiaTK = 0;
		int countTK = 0;
		for (Sach s : danhSachSach) {
			if (s instanceof SachGiaoKhoa) {
				tongThanhTienSachGK += s.thanhTien();
			} else if (s instanceof SachThamKhao) {
				tongThanhTienSachTK += s.thanhTien();
				countTK++;
			}
		}
		for (Sach s : danhSachSach) {
			tongdonGia += s.getDonGia();
		}

		if (countTK > 0) {
			tbcongdongiaTK = tongdonGia / countTK;
		}
		for (Sach s : danhSachSach) {
			 
				System.out.println(s);
			
		}
		System.out.println("Tổng thành tiền sách giáo khoa: " + tongThanhTienSachGK);
		System.out.println("Tổng thành tiền sách tham khảo: " + tongThanhTienSachTK);
		System.out.println("Trung bình cộng đơn giá sách tham khảo: " + tbcongdongiaTK);

		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập nhà xuất bản K: ");
		String nxbK = scanner.nextLine();

		boolean conhaxuatban = false;
		for (Sach s : danhSachSach) {
			if (s instanceof SachGiaoKhoa && s.getNhaXuatBan().equals(nxbK)) {
				conhaxuatban = true;
				System.out.println("Mã sách: " + s.getMaSach()+" Ngày nhập: " + s.getNgayNhap() +" Số lượng: "+ s.getSoLuong()+ " Đơn giá: "+s.getSoLuong()+ " Tình trạnh: " + ((SachGiaoKhoa) s).getTinhTrang());

			}
		}
		if(!conhaxuatban) {
			System.out.println("Không có nhà xuất bản cần tìm");
		}
	}
}
