package bai1;

public abstract class Xe {
	
	private String maSoChuyen;
	private String hoTenTaiXe;
	private String soXe;
	private double doanhThu;
	public Xe() {

	}

	public Xe(String maSoChuyen, String hoTenTaiXe, String soXe,double doanhThu) {
		this.maSoChuyen = maSoChuyen;
		this.hoTenTaiXe = hoTenTaiXe;
		this.soXe = soXe;
		this.doanhThu = doanhThu;
	}

	

	public String getMaSoChuyen() {
		return maSoChuyen;
	}

	public void setMaSoChuyen(String maSoChuyen) {
		this.maSoChuyen = maSoChuyen;
	}

	public String getHoTenTaiXe() {
		return hoTenTaiXe;
	}

	public void setHoTenTaiXe(String hoTenTaiXe) {
		this.hoTenTaiXe = hoTenTaiXe;
	}

	public String getSoXe() {
		return soXe;
	}

	public void setSoXe(String soXe) {
		this.soXe = soXe;
	}

	public double getDoanhThu() {
		return doanhThu;
	}

	public void setDoanhThu(double doanhThu) {
		this.doanhThu = doanhThu;
	}

	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Xe [maSoChuyen=");
		builder.append(maSoChuyen);
		builder.append(", hoTenTaiXe=");
		builder.append(hoTenTaiXe);
		builder.append(", soXe=");
		builder.append(soXe);
		builder.append(", doanhThu=");
		builder.append(doanhThu);
		builder.append("]");
		return builder.toString();
	}

	public abstract double  tinhDoanhThu();

	
}
