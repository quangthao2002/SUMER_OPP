package bai8;

import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		 Manager management = new Manager(10);
	        Scanner scanner = new Scanner(System.in);
	        int choice;

	        do {
	            System.out.println("----- MENU -----");
	            System.out.println("1. Nhập thông tin sinh viên");
	            System.out.println("2. Nhập thông tin nhân viên");
	            System.out.println("3. Nhập thông tin khách hàng");
	            System.out.println("4. Xóa người khỏi danh sách");
	            System.out.println("5. Sắp xếp danh sách theo tên");
	            System.out.println("6. Xuất danh sách");
	            System.out.println("0. Thoát");
	            System.out.print("Chọn chức năng: ");
	            choice = scanner.nextInt();
	            scanner.nextLine(); // Đọc bỏ dòng trống sau khi nhập số

	            switch (choice) {
	                case 1: {
	                    System.out.print("Nhập họ tên sinh viên: ");
	                    String hoTen = scanner.nextLine();
	                    System.out.print("Nhập địa chỉ sinh viên: ");
	                    String diaChi = scanner.nextLine();
	                    System.out.print("Nhập điểm môn học 1: ");
	                    double diemMonHoc1 = scanner.nextDouble();
	                    System.out.print("Nhập điểm môn học 2: ");
	                    double diemMonHoc2 = scanner.nextDouble();

	                    Student student = new Student(hoTen, diaChi, diemMonHoc1,diemMonHoc2);
	                    management.addPerson(student);
	                    break;
	                }
	                case 2: {
	                    System.out.print("Nhập họ tên nhân viên: ");
	                    String hoTen = scanner.nextLine();
	                    System.out.print("Nhập địa chỉ nhân viên: ");
	                    String diaChi = scanner.nextLine();
	                    System.out.print("Nhập hệ số lương: ");
	                    double heSoLuong = scanner.nextDouble();

	                    Employee employee = new Employee(hoTen, diaChi, heSoLuong);
	                    management.addPerson(employee);
	                    break;
	                }
	                case 3: {
	                    System.out.print("Nhập họ tên khách hàng: ");
	                    String hoTen = scanner.nextLine();
	                    System.out.print("Nhập địa chỉ khách hàng: ");
	                    String diaChi = scanner.nextLine();
	                    System.out.print("Nhập tên công ty: ");
	                    String tenCongTy = scanner.nextLine();
	                    System.out.print("Nhập trị giá hóa đơn: ");
	                    double triGiaHoaDon = scanner.nextDouble();

	                    Customer customer = new Customer(hoTen, diaChi, tenCongTy, triGiaHoaDon);
	                    management.addPerson(customer);
	                    break;
	                }
	                case 4: {
	                    System.out.print("Nhập họ tên người cần xóa: ");
	                    String hoTen = scanner.nextLine();
	                    management.removePerson(hoTen);
	                    break;
	                }
	                case 5: {
	                    management.sortByFullName();
	                    System.out.println("Đã sắp xếp danh sách theo tên.");
	                    break;
	                }
	                case 6: {
	                    management.printDsPerson();
	                    break;
	                }
	                case 0:
	                    System.out.println("Thoát chương trình.");
	                    break;
	                default:
	                    System.out.println("Chức năng không hợp lệ. Vui lòng chọn lại.");
	                    break;
	            }
	        } while (choice != 0);
	    }
	}

