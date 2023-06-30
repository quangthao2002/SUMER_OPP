package ontap2;

public abstract class Xe {

	private String maChuyenXe;
	private String soXe;
	private String tenTaiXe;
	private int soChuyen;

	public Xe() {

	}

	public Xe(String maChuyenXe, String soXe, String tenTaiXe, int soChuyen) {
		this.maChuyenXe = maChuyenXe;
		this.soXe = soXe;
		this.tenTaiXe = tenTaiXe;
		setSoChuyen(soChuyen);
	}

	public String getMaChuyenXe() {
		return maChuyenXe;
	}

	public void setMaChuyenXe(String maChuyenXe) {
		this.maChuyenXe = maChuyenXe;
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
		if (soChuyen < 0) {
			this.soChuyen = 0;
		} else {
			this.soChuyen = soChuyen;
		}
	}

	public abstract double thanhTien();

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Xe [maChuyenXe=");
		builder.append(maChuyenXe);
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
