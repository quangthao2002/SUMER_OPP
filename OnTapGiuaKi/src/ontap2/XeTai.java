package ontap2;

import java.text.DecimalFormat;

public class XeTai extends Xe {

	private double giaChuyen;

	public XeTai() {

	}
	
	public XeTai(String maChuyenXe, String soXe, String tenTaiXe, int soChuyen, double giaChuyen) {
		super(maChuyenXe, soXe, tenTaiXe, soChuyen);
		setGiaChuyen(giaChuyen);
	}

	
	
	
	public double getGiaChuyen() {
		return giaChuyen;
	}

	public void setGiaChuyen(double giaChuyen) {
		if(giaChuyen<0)
			this.giaChuyen= 0;
		else
		 this.giaChuyen = giaChuyen;
	}

	@Override
	public double thanhTien() {
		return getSoChuyen() * getGiaChuyen();
	}

	@Override
	public String toString() {
		DecimalFormat decimalFormat = new DecimalFormat("#,### VNĐ");
		StringBuilder builder = new StringBuilder();
		builder.append("XeTai [toString()=");
		builder.append(super.toString());
		builder.append(", giaChuyen=");
		builder.append(giaChuyen);
		builder.append(", thanhTien()=");
		builder.append(decimalFormat.format(thanhTien()));
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	
}
