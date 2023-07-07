package bai1;

public class XeNgoaiThanh extends Xe {

	private int soTuyen;
	private int soKM;
	
	public XeNgoaiThanh() {

	}
	
	
	public XeNgoaiThanh(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu, int soTuyen, int soKM) {
		super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
		this.soTuyen = soTuyen;
		this.soKM = soKM;
	}
	

	public int getSoTuyen() {
		return soTuyen;
	}


	public void setSoTuyen(int soTuyen) {
		this.soTuyen = soTuyen;
	}


	public int getSoKM() {
		return soKM;
	}


	public void setSoKM(int soKM) {
		this.soKM = soKM;
	}


	@Override
	public double tinhDoanhThu() {
		// TODO Auto-generated method stub
		
		return getDoanhThu() * soKM ;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("XeNgoaiThanh=");
		builder.append(super.toString());
		builder.append(", soTuyen=");
		builder.append(soTuyen);
		builder.append(", soKM=");
		builder.append(soKM);
		builder.append("]");
		return builder.toString();
	}
	
	
}
