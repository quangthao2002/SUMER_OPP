package bai1;

public class XeNoiThanh extends Xe {
	private String noiDen;
	private int ngayDi;
	
	
	
	public XeNoiThanh(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu, String noiDen, int ngayDi) {
		super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
		this.noiDen = noiDen;
		this.ngayDi = ngayDi;
	}


	public String getNoiDen() {
		return noiDen;
	}


	public void setNoiDen(String noiDen) {
		this.noiDen = noiDen;
	}


	public int getNgayDi() {
		return ngayDi;
	}


	public void setNgayDi(int ngayDi) {
		this.ngayDi = ngayDi;
	}


	@Override
	public double tinhDoanhThu() {
		// TODO Auto-generated method stub
		return getDoanhThu() * ngayDi;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("XeNoiThanh =");
		builder.append(super.toString());
		builder.append(", noiDen=");
		builder.append(noiDen);
		builder.append(", ngayDi=");
		builder.append(ngayDi);
		builder.append("]");
		return builder.toString();
	}
	
}
