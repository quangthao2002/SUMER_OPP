package bai8;

import java.util.List;

public class Student extends Person {
	private double diemMonHoc1;
	private double diemMonHoc2;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	



	public Student(String fullName, String address, double diemMonHoc1, double diemMonHoc2) {
		super(fullName, address);
		this.diemMonHoc1 = diemMonHoc1;
		this.diemMonHoc2 = diemMonHoc2;
	}




	

	public double getDiemMonHoc1() {
		return diemMonHoc1;
	}




	public void setDiemMonHoc1(double diemMonHoc1) {
		this.diemMonHoc1 = diemMonHoc1;
	}




	public double getDiemMonHoc2() {
		return diemMonHoc2;
	}




	public void setDiemMonHoc2(double diemMonHoc2) {
		this.diemMonHoc2 = diemMonHoc2;
	}




	public double avgPoinSubject() {
		int sum =0;
		
		return (diemMonHoc1+diemMonHoc2)/2;
	}
	public String danhGia() {
		double diemTrungBinh = avgPoinSubject();
        if (diemTrungBinh >= 8.0) {
            return "Giỏi";
        } else if (diemTrungBinh >= 6.5) {
            return "Khá";
        } else if (diemTrungBinh >= 5.0) {
            return "Trung bình";
        } else {
            return "Yếu";
        }
	}




	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student: ");
		builder.append(super.toString());
		builder.append(", diemMonHoc1: ");
		builder.append(diemMonHoc1);
		builder.append(", diemMonHoc2: ");
		builder.append(diemMonHoc2);
		builder.append(", avgPoinSubject: ");
		builder.append(avgPoinSubject());
		builder.append(", danhGia: ");
		builder.append(danhGia());
		builder.append("]");
		return builder.toString();
	}


	
	
	
}
