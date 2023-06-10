package bai4;

public class Vehicle {

	private String chuXe;
	private String loaiXe;
	private double triGiaXe;
	private int dungTichXyLanh;
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Vehicle(String chuXe, String loaiXe, double triGiaXe, int dungTichXyLanh) {
		super();
		this.chuXe = chuXe;
		this.loaiXe = loaiXe;
		this.triGiaXe = triGiaXe;
		this.dungTichXyLanh = dungTichXyLanh;
	}
	
	public double TinhThue() {
		double thue =0;
		if(triGiaXe < 100) {
		thue=	triGiaXe * 1 /100;
		}else if(dungTichXyLanh >= 100 && dungTichXyLanh <= 200) {
			thue=	triGiaXe * 3 /100;;
		}else {
			thue=	triGiaXe * 5 /100;;
		}
		return thue;
	}

	public String getChuXe() {
		return chuXe;
	}
	public void setChuXe(String chuXe) {
		this.chuXe = chuXe;
	}
	public String getLoaiXe() {
		return loaiXe;
	}
	public void setLoaiXe(String loaiXe) {
		this.loaiXe = loaiXe;
	}
	public double getTriGiaXe() {
		return triGiaXe;
	}
	public void setTriGiaXe(double triGiaXe) {
		this.triGiaXe = triGiaXe;
	}
	public int getDungTichXyLanh() {
		return dungTichXyLanh;
	}
	public void setDungTichXyLanh(int dungTichXyLanh) {
		this.dungTichXyLanh = dungTichXyLanh;
	}
	@Override
	public String toString() {
		return "Vehicle [Tên chủ xe=" + chuXe + ", loaiXe=" + loaiXe + ", triGiaXe=" + triGiaXe + ", dungTichXyLanh="
				+ dungTichXyLanh + ", Thuế phải nộp =" + TinhThue() +  "]";
	}
	 void bang() {
		 System.out.printf("|%5s| |%5s| |%5s| |%8f|\n", chuXe,loaiXe,dungTichXyLanh,triGiaXe,TinhThue());
	 }
	 
	
	
}
