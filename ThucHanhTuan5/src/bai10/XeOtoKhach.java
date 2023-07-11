package bai10;

public class XeOtoKhach extends Xe {

	private int soCho;

	public XeOtoKhach(String tenXe, double dongia, int soCho) {
		super(tenXe, dongia);
		this.soCho = soCho;
	}

	public int getSoCho() {
		return soCho;
	}

	public void setSoCho(int soCho) {
		this.soCho = soCho;
	}

	@Override
	public double tinhThue() {
		double VAT = getDongia() * 0.1;
		double thueTruocBa = getDongia() * 0.2;
		double thueTieuThuDacBiet = (getSoCho() >= 5 ? getDongia() * 0.3 : getDongia() * 0.5);
		return VAT + thueTruocBa + thueTieuThuDacBiet;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("XeOtoKhach [soCho=");
		builder.append(soCho);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

	

}
