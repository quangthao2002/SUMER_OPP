package bai10;

public class XeMay extends Xe {

	public XeMay(String tenXe, double dongia) {
		super(tenXe, dongia);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double tinhThue() {
		// TODO Auto-generated method stub
		double VAT = getDongia() * 0.1;
		double thueTruocBa = getDongia() * 0.05;
		return VAT + thueTruocBa;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("XeMay [toString()=");
		builder.append(super.toString());
		builder.append(", tinhThue()=");
		builder.append(tinhThue());
		builder.append("]");
		return builder.toString();
	}

	

}
