package bai12;

import java.time.LocalDate;
import java.util.List;

public class Demo {
	
	public static void main(String[] args) {
		
		Manage manage = new Manage();
		
		
		Course course1 = new Course("Java Programming", LocalDate.of(2023, 9, 15),2);
        Course course2 = new Course("Web Development", LocalDate.of(2023, 9, 5),3);
        Course course3 = new Course("Data Science", LocalDate.of(2023, 3, 1), 6);
        Course course4 = new Course("JavaCript", LocalDate.of(2022, 1, 21),4);
        Course course5 = new Course("Python", LocalDate.of(2023, 7, 21),5);
        manage.addCourse(course1);
        manage.addCourse(course2);
        manage.addCourse(course3);
        manage.addCourse(course4);
        manage.addCourse(course5);
        
        Student student1 = new Student("John Doe", "123 Main St", "123456789");
        Student student2 = new Student("Jane Smith", "456 Park Ave", "987654321");
        Student student3 = new Student("Jane Smith2", "Gò vấp", "91293123");
        Student student4 = new Student("Jane Smith3", "Thủ đức", "98123214321");
        Student student5 = new Student("Jane Smith4", "Bình thạnh", "987654321");
        Student student6 = new Student("Jane Smith5", "Tân Phú", "98765345344");
        Student student7 = new Student("Jane Smith6", "Phú nhuận", "123123678");
        Student student8 = new Student("Jane Smith7", "Bình Tân", "98765431");
        Student student9 = new Student("Jane Smith8", "Bình Chánh", "98761254321");
        
        course1.addStudent(student1);
        course1.addStudent(student2);
        course1.addStudent(student3);
        course2.addStudent(student4);
        course2.addStudent(student5);
        course2.addStudent(student6);
        course3.addStudent(student7);
        course3.addStudent(student8);
        course3.addStudent(student9);
      
        System.out.println("* Tìm kiếm khóa học có tên là Java Programming: ");
        List<Course> foundCourses = manage.findCourse("Java Programming");
      
        for(Course course : foundCourses) {
        	System.out.println("- "+course );
        }
      
        String rs = manage.findCoursebyStudent(student4);
        System.out.println("* Khóa học của học viên 4: "+rs);
        
     
       System.out.println("* Các khóa học chưa kết thúc và chưa bắt đầu:");
        manage.CourseEnd().forEach(x -> System.out.println("- "+x));
        System.out.println("* Các khóa học chưa bắt dầu:");
        manage.getUpcomingCourses().forEach(x -> System.out.println("- "+x));
     
	}
}
