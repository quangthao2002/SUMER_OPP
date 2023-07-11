package bai8;

public class Customer extends Person {
	private String tenCongTy;
	private double giaTriHoaDon;
	
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}


	public Customer(String fullName, String address, String tenCongTy, double giaTriHoaDon) {
		super(fullName, address);
		this.tenCongTy = tenCongTy;
		this.giaTriHoaDon = giaTriHoaDon;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Customer [toString()=");
		builder.append(super.toString());
		builder.append(", tenCongTy=");
		builder.append(tenCongTy);
		builder.append(", giaTriHoaDon=");
		builder.append(giaTriHoaDon);
		builder.append("]");
		return builder.toString();
	}


	
}
