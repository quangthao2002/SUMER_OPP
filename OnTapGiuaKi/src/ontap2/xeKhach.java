package ontap2;

import java.text.DecimalFormat;

public class xeKhach extends Xe {

	private double giaVe;
	private int soChoNgoi;
	
	public xeKhach() {
	}
	public xeKhach(String maChuyenXe, String soXe, String tenTaiXe, int soChuyen, double giaVe, int soChoNgoi) {
		super(maChuyenXe, soXe, tenTaiXe, soChuyen);
		setGiaVe(giaVe);
		this.soChoNgoi = soChoNgoi;
	}
	
	public double getGiaVe() {
		return giaVe;
	}
	public void setGiaVe(double giaVe) {
		if(giaVe <0) {
			this.giaVe=0;
		}else {
			this.giaVe = giaVe;
		}
	}
	public int getSoChoNgoi() {
		return soChoNgoi;
	}
	public void setSoChoNgoi(int soChoNgoi) {
		this.soChoNgoi = soChoNgoi;
	}
	@Override
	public double thanhTien() {
		// TODO Auto-generated method stub
		return getSoChuyen() * getSoChoNgoi() * getGiaVe();
	}
	@Override
	public String toString() {
		DecimalFormat decimalFormat = new DecimalFormat("#,### VNĐ");
		StringBuilder builder = new StringBuilder();
		builder.append("xeKhach [toString()=");
		builder.append(super.toString());
		builder.append(", giaVe=");
		builder.append(giaVe);
		builder.append(", soChoNgoi=");
		builder.append(soChoNgoi);
		builder.append(", thanhTien()=");
		builder.append(decimalFormat.format(thanhTien()));
		builder.append("]");
		return builder.toString();
	}
	
	
}
