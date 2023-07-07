package bai2;

public class SachThamKhao extends Sach {


	private double thue;

	public SachThamKhao(String maSach, String ngayNhap, double donGia, int soLuong, String nhaXuatBan, double thue) {
		super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
		this.thue = thue;
	}

	public double getThue() {
		return thue;
	}

	public void setThue(double thue) {
		this.thue = thue;
	}

	
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SachThamKhao [toString()=");
		builder.append(super.toString());
		builder.append(", thue=");
		builder.append(thue);
		builder.append(", thanhTien()=");
		builder.append(thanhTien());
		builder.append("]");
		return builder.toString();
	}

	@Override
	public double thanhTien() {
		// TODO Auto-generated method stub
		return super.thanhTien() +thue;
	}
	
	
	
	
	

	
	
	
	
	
}
