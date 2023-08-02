package bai2;

import java.time.LocalDate;

public class XeKhach extends Xe {
	
	private double giaVe;
	private int soChoNgoi;
	
	public XeKhach() {

	}
	
	public XeKhach(String maXe, String soXe, String tenTaiXe, int soChuyen, LocalDate ngayDi, double giaVe,
			int soChoNgoi) {
		super(maXe, soXe, tenTaiXe, soChuyen, ngayDi);
		setGiaVe(giaVe);
		setSoChoNgoi(soChoNgoi);
	}

	public double getGiaVe() {
		return giaVe;
	}

	public void setGiaVe(double giaVe) {
		if(giaVe>0) {
			this.giaVe = giaVe;
		}else {
			this.giaVe=0;
		}
	}

	public int getSoChoNgoi() {
		return soChoNgoi;
	}

	public void setSoChoNgoi(int soChoNgoi) {
			if(soChoNgoi == 10 || soChoNgoi == 20 || soChoNgoi == 45) {
				this.soChoNgoi = soChoNgoi;
			}else {
				this.soChoNgoi =0;
			}
	}

	@Override
	public double thanhTien() {
		return getSoChuyen() * getSoChoNgoi() * getGiaVe();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("XeKhach [toString()=");
		builder.append(super.toString());
		builder.append(", giaVe=");
		builder.append(giaVe);
		builder.append(", soChoNgoi=");
		builder.append(soChoNgoi);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
