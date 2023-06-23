package bai2;

import java.util.Scanner;

public class Demo {
	
	public static void main(String[] args) {
		Student student  = new Student(2, "Quang Thao", 7, 6);
		Student student1  = new Student(3, "Quang Thao2", 8, 9);
		Scanner scanner = new Scanner(System.in);
		System.out.println("                    Nhập thông tin sinh viên ");
		Student student2 = new Student();
		System.out.println("Nhập vào mã số sinh viên: ");
		student2.setMssv(scanner.nextInt());
		scanner.nextLine();
		System.out.println("Nhập vào tên sinh viên: ");
		student2.setName(scanner.nextLine());
		System.out.println("Nhập vào điểm lý thuyết : ");
		student2.setDiemLT(scanner.nextFloat());
		System.out.println("Nhập vào điểm thực hành : ");
		student2.setDiemTH(scanner.nextFloat());
		
		System.out.println(student);
		System.out.println(student1);
		System.out.println(student2);
	}
}