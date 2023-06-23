package bai11;

import java.time.LocalDate;
import java.util.List;

public class Student {
	private String fullName;;
	private LocalDate yearOfBirth;
	private List<Float> subjectScores;
	
	public Student() {

	}

	public Student(String fullName, LocalDate yearOfBirth, List<Float> subjectScores) {
		this.fullName = fullName;
		this.yearOfBirth = yearOfBirth;
		this.subjectScores = subjectScores;
	}
	
	public String getFullName() {
		return fullName;
	}
	private float CalcAverageScore() {
		int sum=0;
		for(float point : subjectScores) {
			sum += point;
		}
		return sum/subjectScores.size();
	}
	private boolean PoinBelow5() {
		for(float point : subjectScores) {
			if(point<5) {
				return true;
			}
		}
		return false;
	}
	
	public boolean Dissertation() {
		float average = CalcAverageScore();
		boolean poinBelow5 = PoinBelow5();
		return average >7 && !poinBelow5;
	}
	public boolean Graduate() {
		float average = CalcAverageScore();
		boolean poinBelow5 = PoinBelow5();
		return average <=7 && !poinBelow5;
	}
	
	public boolean Retest() {
		
		return PoinBelow5();
	}

	@Override
	public String toString() {
		return "Student [fullName=" + fullName + ", yearOfBirth=" + yearOfBirth + ", subjectScores=" + subjectScores
				+ "]";
	}
	
	
}
