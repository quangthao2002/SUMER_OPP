package ontap;

import java.text.DecimalFormat;

public class xeTai extends Xe {

	private double giaChuyen;

	public xeTai(String maChuyen, String soXe, String tenTaiXe, int soChuyen, double giaChuyen) {
		super(maChuyen, soXe, tenTaiXe, soChuyen);
		this.giaChuyen = giaChuyen;
	}
	
	public double getGiaChuyen() {
		return giaChuyen;
	}
	public void setGiaChuyen(double giaChuyen) {
		this.giaChuyen = giaChuyen;
	}

	@Override
	public double thanhTien() {
		// TODO Auto-generated method stub
		
		return getSoChuyen() * getGiaChuyen();
	}

	@Override
	public String toString() {
		DecimalFormat decimalFormat = new DecimalFormat("#,### VNĐ");
		StringBuilder builder = new StringBuilder();
		builder.append("xeTai [toString()=");
		builder.append(super.toString());
		builder.append(", giaChuyen=");
		builder.append(giaChuyen);
		builder.append(", thanhTien=");
		builder.append(decimalFormat.format(thanhTien()));
		builder.append("]");
		return builder.toString();
	}
	
	

	

	

	
	

	
	
	
	
	
}
