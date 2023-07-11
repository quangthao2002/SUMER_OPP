package Bai6;

public class PhongHocLyThuyet extends PhongHoc{
	private boolean mayChieu;

	public PhongHocLyThuyet(String maPhong, String dayNha, double dienTich, int soBongDen, boolean mayChieu) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.mayChieu = mayChieu;
	}
	
	public boolean isMayChieu() {
		return mayChieu;
	}

	public void setMayChieu(boolean mayChieu) {
		this.mayChieu = mayChieu;
	}

	@Override
	public boolean datChuat() {
		// TODO Auto-generated method stub
		return super.datChuat() && isMayChieu();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PhongHocLyThuyet: ");
		builder.append(super.toString());
		builder.append(", mayChieu=");
		builder.append(mayChieu);
		builder.append(", datChuatKhong: ");
		builder.append(datChuat());
		builder.append("]");
		return builder.toString();
	}
	
}
