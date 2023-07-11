package Bai6;

public class PhongHocThiNghiem extends PhongHoc {
	private String chuyenNganh;
	private int sucChưa;
	private boolean coBonruakhong;

	public PhongHocThiNghiem() {
		// TODO Auto-generated constructor stub
	}

	public PhongHocThiNghiem(String maPhong, String dayNha, double dienTich, int soBongDen, String chuyenNganh,
			int sucChưa, boolean coBonruakhong) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.chuyenNganh = chuyenNganh;
		this.sucChưa = sucChưa;
		this.coBonruakhong = coBonruakhong;
	}

	public String getChuyenNganh() {
		return chuyenNganh;
	}
	
	public int getSucChưa() {
		return sucChưa;
	}

	public void setSucChưa(int sucChưa) {
		this.sucChưa = sucChưa;
	}

	public boolean isCoBonruakhong() {
		return coBonruakhong;
	}

	public void setCoBonruakhong(boolean coBonruakhong) {
		this.coBonruakhong = coBonruakhong;
	}

	public void setChuyenNganh(String chuyenNganh) {
		this.chuyenNganh = chuyenNganh;
	}

	@Override
	public boolean datChuat() {
		// TODO Auto-generated method stub
		return super.datChuat() && isCoBonruakhong();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PhongHocThiNghiem: ");
		builder.append(super.toString());
		builder.append(", chuyenNganh=");
		builder.append(chuyenNganh);
		builder.append(", coBonruakhong=");
		builder.append(coBonruakhong);
		builder.append(", sucChưa=");
		builder.append(sucChưa);
		builder.append(", datChuanKhong: ");
		builder.append(datChuat());
		builder.append("]");
		return builder.toString();
	}
	
}
