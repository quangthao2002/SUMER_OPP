package bai8;

public class Employee extends Person {
	private double heSoluong;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public double getHeSoluong() {
		return heSoluong;
	}

	public void setHeSoluong(double heSoluong) {
		this.heSoluong = heSoluong;
	}

	public Employee(String fullName, String address, double heSoluong) {
		super(fullName, address);
		this.heSoluong = heSoluong;
	}
	public double tinhLuong() {
		return 0.0;
	}
	
	public void danhGia() {
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [toString()=");
		builder.append(super.toString());
		builder.append(", heSoluong=");
		builder.append(heSoluong);
		builder.append("]");
		return builder.toString();
	}
	
}
