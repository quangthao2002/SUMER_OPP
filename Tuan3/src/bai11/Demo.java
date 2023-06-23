package bai11;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Demo {

	
	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		
		Student student1 = new Student("Ngo Quang Thao", LocalDate.ofYearDay(2022, 20),List.of(9.5f,8.5f,8.6f,7f,8.5f));
		Student student2 = new Student("Ngo Quang B", LocalDate.ofYearDay(2002, 23),List.of(9.5f,8.5f,8.6f,7f,8.5f));
		Student student3 = new Student("Ngo Quang C", LocalDate.ofYearDay(2003, 252),List.of(9.5f,4.5f,8.6f,7f,8.5f));
		Student student4 = new Student("Ngo Quang D", LocalDate.ofYearDay(2001, 22),List.of(9.5f,3.5f,6f,7f,8.5f));
		Student student5 = new Student("Ngo Quang E", LocalDate.ofYearDay(20003, 10),List.of(4.5f,8.5f,8.6f,7f,8.5f));
		Student student6 = new Student("Ngo Quang F", LocalDate.ofYearDay(2004, 10),List.of(9.5f,8.5f,8.6f,7f,8.5f));
		int soLuongLamLuanVan = 0;
        int soLuongThiTotNghiep = 0;
        int soLuongThiLai = 0;
		
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		students.add(student5);
		students.add(student6);
		
		
		List<String> studentRetest = new ArrayList<>();
		for(Student sd : students) {
			if(sd.Dissertation()) {
				soLuongLamLuanVan ++;
			}else if(sd.Graduate()) {
				soLuongThiTotNghiep++;
			}else if(sd.Retest()) {
				soLuongThiLai++;
				studentRetest.add(sd.getFullName());
			}
		}
		System.out.println(student1);
		System.out.println("Số người làm luận văn tốt nghiệp: " + soLuongLamLuanVan);
	    System.out.println("Số người thi tốt nghiệp: " + soLuongThiTotNghiep);
	    System.out.println("Số người phải thi lại: " + soLuongThiLai);
	    System.out.println("Các học viên học lại: " + studentRetest);
	}
}
