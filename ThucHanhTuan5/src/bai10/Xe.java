package bai10;

public abstract class Xe {
	
	private String tenXe;
	private double dongia;
	
	
	public Xe(String tenXe, double dongia) {
		this.tenXe = tenXe;
		this.dongia = dongia;
	}

	public String getTenXe() {
		return tenXe;
	}

	public void setTenXe(String tenXe) {
		this.tenXe = tenXe;
	}

	public double getDongia() {
		return dongia;
	}

	public void setDongia(double dongia) {
		this.dongia = dongia;
	}

	public abstract double tinhThue();

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Xe [tenXe=");
		builder.append(tenXe);
		builder.append(", dongia=");
		builder.append(dongia);
		builder.append("]");
		return builder.toString();
	}
	
}
