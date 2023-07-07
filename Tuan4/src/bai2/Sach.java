package bai2;

public class Sach {
	private String maSach;
	private String ngayNhap;
	private double donGia;
	private int soLuong;
	private String nhaXuatBan;

		public Sach() {
			// TODO Auto-generated constructor stub
		}
	public Sach(String maSach, String ngayNhap, double donGia, int soLuong, String nhaXuatBan) {
		this.maSach = maSach;
		this.ngayNhap = ngayNhap;
		this.donGia = donGia;
		this.soLuong = soLuong;
		this.nhaXuatBan = nhaXuatBan;
	}

	public double thanhTien() {
		double total = soLuong * donGia;
		return total;
	}
	
	public String getMaSach() {
		return maSach;
	}
	public void setMaSach(String maSach) {
		this.maSach = maSach;
	}
	public String getNgayNhap() {
		return ngayNhap;
	}
	public void setNgayNhap(String ngayNhap) {
		this.ngayNhap = ngayNhap;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public String getNhaXuatBan() {
		return nhaXuatBan;
	}
	public void setNhaXuatBan(String nhaXuatBan) {
		this.nhaXuatBan = nhaXuatBan;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Sach [maSach=");
		builder.append(maSach);
		builder.append(", ngayNhap=");
		builder.append(ngayNhap);
		builder.append(", donGia=");
		builder.append(donGia);
		builder.append(", soLuong=");
		builder.append(soLuong);
		builder.append(", nhaXuatBan=");
		builder.append(nhaXuatBan);
		builder.append("]");
		return builder.toString();
	}
	

}
