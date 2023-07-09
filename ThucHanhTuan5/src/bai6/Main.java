package bai6;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DanhSachHoaDon danhSachHoaDon = new DanhSachHoaDon();

        boolean exit = false;

        while (!exit) {
            System.out.println("----- Hotel Management System Menu -----");
            System.out.println("1. Thêm hóa đơn");
            System.out.println("2. Xuất danh sách hóa đơn");
            System.out.println("3. Thống kê số lượng hóa đơn theo giờ");
            System.out.println("4. Thống kê số lượng hóa đơn theo ngày");
            System.out.println("5. Tính tổng thành tiền theo tháng và năm");
            System.out.println("6. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    // Thêm hóa đơn
                    System.out.print("Nhập mã hóa đơn: ");
                    String maHoaDon = scanner.nextLine();
                    System.out.print("Nhập ngày hóa đơn (theo định dạng dd/MM/yyyy): ");
                    String ngayHoaDon = scanner.nextLine();
                    System.out.print("Nhập tên khách hàng: ");
                    String tenKhachHang = scanner.nextLine();
                    System.out.print("Nhập mã phòng: ");
                    String maPhong = scanner.nextLine();
                    System.out.print("Nhập đơn giá: ");
                    double donGia = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.println("Chọn loại hóa đơn (1 - Theo giờ, 2 - Theo ngày): ");
                    int loaiHoaDon = scanner.nextInt();
                    scanner.nextLine();

                    if (loaiHoaDon == 1) {
                        System.out.print("Nhập số giờ thuê: ");
                        int soGioThue = scanner.nextInt();
                        scanner.nextLine();

                        HoaDonTheoGio hoaDonGio = new HoaDonTheoGio(maHoaDon, null, tenKhachHang, maPhong, donGia, soGioThue);
                        boolean themThanhCong = danhSachHoaDon.themHD(hoaDonGio);
                        if (themThanhCong) {
                            System.out.println("Thêm hóa đơn thành công.");
                        } else {
                            System.out.println("Thêm hóa đơn thất bại. Mã hóa đơn đã tồn tại.");
                        }
                    } else if (loaiHoaDon == 2) {
                        System.out.print("Nhập số ngày thuê: ");
                        int soNgayThue = scanner.nextInt();
                        scanner.nextLine();

                        HoaDonTheoNgay hoaDonNgay = new HoaDonTheoNgay(maHoaDon, null, tenKhachHang, maPhong, donGia, soNgayThue);
                        boolean themThanhCong = danhSachHoaDon.themHD(hoaDonNgay);
                        if (themThanhCong) {
                            System.out.println("Thêm hóa đơn thành công.");
                        } else {
                            System.out.println("Thêm hóa đơn thất bại. Mã hóa đơn đã tồn tại.");
                        }
                    } else {
                        System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
                    }

                    break;
                case 2:
                    // Xuất danh sách hóa đơn
                    danhSachHoaDon.xuat();
                    break;
                case 3:
                    // Thống kê số lượng hóa đơn theo giờ
                    int countGio = danhSachHoaDon.thongKeSoLuongHDTheoGio();
                    System.out.println("Số lượng hóa đơn theo giờ: " + countGio);
                    break;
                case 4:
                    // Thống kê số lượng hóa đơn theo ngày
                    int countNgay = danhSachHoaDon.thongKeSoLuongHDTheoNgay();
                    System.out.println("Số lượng hóa đơn theo ngày: " + countNgay);
                    break;
                case 5:
                    // Tính tổng thành tiền theo tháng và năm
                    System.out.print("Nhập tháng: ");
                    int thang = scanner.nextInt();
                    System.out.print("Nhập năm: ");
                    int nam = scanner.nextInt();
                    double tongThanhTien = danhSachHoaDon.tinhTongThanhTien(thang, nam);
                    System.out.println("Tổng thành tiền: " + tongThanhTien);
                    break;
                case 6:
                    // Thoát khỏi chương trình
                    exit = true;
                    System.out.println("Đã thoát khỏi chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
                    break;
            }

            System.out.println();
        }

        scanner.close();
    }
}
