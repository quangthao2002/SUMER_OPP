package bai4;

import java.time.LocalDate;

public class GiaoDichDat extends GiaoDich {

	private String loaiDat;

	public GiaoDichDat() {
		
	}
	public GiaoDichDat(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, float dienTich, String loaiDat) {
		super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
		this.loaiDat = loaiDat;
	}
	public String getLoaiDat() {
		return loaiDat;
	}
	public void setLoaiDat(String loaiDat) {
		this.loaiDat = loaiDat;
	}
	
	@Override
	public double thanhTien() {
		if(loaiDat.equals("B")||loaiDat.equals("C") ) {
			return super.thanhTien();
		}else {
			return super.thanhTien() *1.5;
		}
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GiaoDichDat [toString()=");
		builder.append(super.toString());
		builder.append(", loaiDat=");
		builder.append(loaiDat);
		builder.append(", thanhTien()=");
		builder.append(thanhTien());
		builder.append("]");
		return builder.toString();
	}
	
	
	


}
