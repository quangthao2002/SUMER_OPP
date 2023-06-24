package bai12;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Manage {

	private List<Course> listCourses ;

	public Manage() {
		listCourses = new ArrayList<>();
	}

	public Manage(List<Course> listCourses) {

		this.listCourses = new ArrayList<>();
	}

	public void addCourse(Course course) {

		listCourses.add(course);
	}
	/// Find Course by courseName
	public List<Course> findCourse(String courseName) {
		List<Course> foundCourses = new ArrayList<>();
		for(Course course : listCourses) {
			if(course.getCourseName().equalsIgnoreCase(courseName)){
				foundCourses.add(course);
			}
		}
		return foundCourses;
	}
	
	public String findCoursebyStudent(Student student) {
		
		for(Course course : listCourses) {
			if(course.getListStudents().contains(student)) { // tìm đối tượng student có tồn tại ds student trong course không
				return course.getCourseName();
			}
		}
		return "Không tìm thấy học viên";
		
	}
	
	public List<Course> CourseEnd(){
		
		List<Course> unfinishedCourses  = new ArrayList<>();
		LocalDate curendate= LocalDate.now();
		for(Course course : listCourses) {
			LocalDate courseEndDate = course.getStartCourse().plusMonths(course.getdurationInMonths());// lấy ngày bắt đầu khóa học + số tháng của khóa học => ra ngày kết thúc
			if(curendate.isBefore(courseEndDate) && course.getStartCourse().isBefore(curendate)) {
				unfinishedCourses.add(course);
			}
		}
		return unfinishedCourses;
		
	}
	
	public List<Course> getUpcomingCourses(){
		List<Course> ListUpcomingCourses = new ArrayList<>();
		LocalDate curendate= LocalDate.now();
		for(Course course : listCourses) {
			if(curendate.isBefore(course.getStartCourse())) {
				ListUpcomingCourses.add(course);
			}
		}
		return ListUpcomingCourses;
		
	}

//	@Override
//	public String toString() {
//		return "Manage [listCourses=" + listCourses + "]";
//	}
	
	
}
