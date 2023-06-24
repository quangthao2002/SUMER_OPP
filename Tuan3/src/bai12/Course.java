package bai12;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Course {
 
	private String courseName;
	private LocalDate startCourse;
	private int durationInMonths;
	private List<Student> listStudents;
	
	public Course() {
		
	}

	

	public Course(String courseName, LocalDate startCourse, int durationInMonths) {
		this.courseName = courseName;
		this.startCourse = startCourse;
		this.durationInMonths = durationInMonths;
		this.listStudents = new ArrayList<>();
	}



	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public LocalDate getOpenCourse() {
		return startCourse;
	}

	public void setOpenCourse(LocalDate openCourse) {
		this.startCourse = openCourse;
	}

	public int getdurationInMonths() {
		return durationInMonths;
	}

	public void setStudyTime(int durationInMonths) {
	
		this.durationInMonths = durationInMonths;
	}
	
	public LocalDate getStartCourse() {
		return startCourse;
	}



	public void setStartCourse(LocalDate startCourse) {
		this.startCourse = startCourse;
	}



	public List<Student> getListStudents() {
		return listStudents;
	}



	public void setListStudents(List<Student> listStudents) {
		this.listStudents = listStudents;
	}



	public void addStudent(Student student) {
		if(listStudents.size() <=20) {
			listStudents.add(student);
		}else 
			System.out.println("Số lượng học viên đã đạt số lượng tối đa là 20 người");
	}



	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", startCourse=" + startCourse + ", durationInMonths="
				+ durationInMonths + ", listStudents=" + listStudents + "]";
	}
	
	
}
	
	

