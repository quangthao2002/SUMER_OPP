package bai2;

public class SachGiaoKhoa extends Sach {

	private String tinhTrang;

	public SachGiaoKhoa() {
		// TODO Auto-generated constructor stub
	}

	public String getTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}

	public SachGiaoKhoa(String maSach, String ngayNhap, double donGia, int soLuong, String nhaXuatBan, String tinhTrang) {
		super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
		this.tinhTrang = tinhTrang;
	}

	@Override
	public double thanhTien() {
		if (tinhTrang.equals("mới")) {
			
			return super.thanhTien();
		}
		else if(tinhTrang.equals("cũ")){
			return super.thanhTien() * 0.5;
		}else return 0.0;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SachGiaoKhoa [toString()=");
		builder.append(super.toString());
		builder.append(", tinhTrang=");
		builder.append(tinhTrang);
		builder.append(", thanhTien()=");
		builder.append(thanhTien());
		builder.append("]");
		return builder.toString();
	}

	
	
}
