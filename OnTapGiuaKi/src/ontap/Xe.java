package ontap;

public abstract class Xe {
	private String maChuyen;
	private String soXe;
	private String tenTaiXe;
	private int soChuyen;
	
	


	public Xe(String maChuyen, String soXe, String tenTaiXe, int soChuyen) {
		this.maChuyen = maChuyen;
		this.soXe = soXe;
		this.tenTaiXe = tenTaiXe;
		this.soChuyen = soChuyen;
	}


	public String getMaChuyen() {
		return maChuyen;
	}


	public void setMaChuyen(String maChuyen) {
		this.maChuyen = maChuyen;
	}


	public String getSoXe() {
		return soXe;
	}


	public void setSoXe(String soXe) {
		this.soXe = soXe;
	}


	public String getTenTaiXe() {
		return tenTaiXe;
	}


	public void setTenTaiXe(String tenTaiXe) {
		this.tenTaiXe = tenTaiXe;
	}


	public int getSoChuyen() {
		return soChuyen;
	}


	public void setSoChuyen(int soChuyen) {
		this.soChuyen = soChuyen;
	}
	
	public abstract double thanhTien();


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Xe [maChuyen=");
		builder.append(maChuyen);
		builder.append(", soXe=");
		builder.append(soXe);
		builder.append(", tenTaiXe=");
		builder.append(tenTaiXe);
		builder.append(", soChuyen=");
		builder.append(soChuyen);
		builder.append("]");
		return builder.toString();
	}


	



	

	
	
	
}
