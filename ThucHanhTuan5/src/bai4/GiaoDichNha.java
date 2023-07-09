package bai4;

import java.time.LocalDate;

public class GiaoDichNha extends GiaoDich {
	private String loaiNha;
	private String diaChi;
	
	public GiaoDichNha() {

	}

	public GiaoDichNha(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, float dienTich, String loaiNha,
			String diaChi) {
		super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
		this.loaiNha = loaiNha;
		this.diaChi = diaChi;
	}

	public String getLoaiNha() {
		return loaiNha;
	}

	public void setLoaiNha(String loaiNha) {
		this.loaiNha = loaiNha;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	
	@Override
	public double thanhTien() {
		if(loaiNha.equals("thường"))
			return super.thanhTien() * 0.9;
		else {
			return super.thanhTien();
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GiaoDichNha [toString()=");
		builder.append(super.toString());
		builder.append(", loaiNha=");
		builder.append(loaiNha);
		builder.append(", diaChi=");
		builder.append(diaChi);
		builder.append(", thanhTien()=");
		builder.append(thanhTien());
		builder.append("]");
		return builder.toString();
	}
	
	
}
