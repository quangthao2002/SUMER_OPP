package Bai6;

public class PhongMayTinh extends PhongHoc {
	private int soMayTinh;
	
	public PhongMayTinh() {
		// TODO Auto-generated constructor stub
	}

	public PhongMayTinh(String maPhong, String dayNha, double dienTich, int soBongDen, int soMayTinh) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.soMayTinh = soMayTinh;
	}

	public int getSoMayTinh() {
		return soMayTinh;
	}

	public void setSoMayTinh(int soMayTinh) {
		this.soMayTinh = soMayTinh;
	}
	@Override
	public boolean datChuat() {
		// TODO Auto-generated method stub
		return super.datChuat() && (getDienTich()/soMayTinh) >=1.5;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PhongMayTinh: ");
		builder.append(super.toString());
		builder.append(", soMayTinh=");
		builder.append(soMayTinh);
		builder.append(", datChuatKhong: ");
		builder.append(datChuat());
		builder.append("]");
		return builder.toString();
	}
	
}
