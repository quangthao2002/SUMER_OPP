package bai10;

public class XeDap extends Xe {

	public XeDap(String tenXe, double dongia) {
		super(tenXe, dongia);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double tinhThue() {
		// TODO Auto-generated method stub
		// xe đạp không tính thuế
		return 0;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("XeDap [toString()=");
		builder.append(super.toString());
		builder.append(", tinhThue()=");
		builder.append(tinhThue());
		builder.append("]");
		return builder.toString();
	}

	

}
