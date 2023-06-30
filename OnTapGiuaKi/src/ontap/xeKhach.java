package ontap;

import java.text.DecimalFormat;

public class xeKhach extends Xe{

	private int soChoNgoi;
	private double giaVe;
	
	public xeKhach(String maChuyen, String soXe, String tenTaiXe, int soChuyen, int soChoNgoi, double giaVe) {
		super(maChuyen, soXe, tenTaiXe, soChuyen);
		this.soChoNgoi = soChoNgoi;
		this.giaVe = giaVe;
	}

	public int getSoChoNgoi() {
		return soChoNgoi;
	}

	public void setSoChoNgoi(int soChoNgoi) {
		this.soChoNgoi = soChoNgoi;
	}

	public double getGiaVe() {
		return giaVe;
	}

	public void setGiaVe(double giaVe) {
		this.giaVe = giaVe;
	}


	@Override
	public double thanhTien() {
		// TODO Auto-generated method stub
		DecimalFormat decimalFormat = new DecimalFormat("#,###");
		return getSoChuyen() * getSoChoNgoi() * getGiaVe();
	}

	@Override
	public String toString() {
		DecimalFormat decimalFormat = new DecimalFormat("#,### VNĐ");
		StringBuilder builder = new StringBuilder();
		builder.append("xeKhach [toString()=");
		builder.append(super.toString());
		builder.append(", soChoNgoi=");
		builder.append(soChoNgoi);
		builder.append(", giaVe=");
		builder.append(giaVe);
		builder.append(", thanhTien=");
		builder.append(decimalFormat.format(thanhTien()));
		builder.append("]");
		return builder.toString();
	}

	

	
	
	
	
	
	
	
}
