package Bai6;

public class PhongHoc {
	private String maPhong;
	private String dayNha;
	private double dienTich;
	private int soBongDen;
	
	public PhongHoc() {
		// TODO Auto-generated constructor stub
	}

	public PhongHoc(String maPhong, String dayNha, double dienTich, int soBongDen) {
		super();
		this.maPhong = maPhong;
		this.dayNha = dayNha;
		this.dienTich = dienTich;
		this.soBongDen = soBongDen;
	}

	public String getMaPhong() {
		return maPhong;
	}

	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}

	public String getDayNha() {
		return dayNha;
	}

	public void setDayNha(String dayNha) {
		this.dayNha = dayNha;
	}

	public double getDienTich() {
		return dienTich;
	}

	public void setDienTich(double dienTich) {
		this.dienTich = dienTich;
	}

	public int getSoBongDen() {
		return soBongDen;
	}

	public void setSoBongDen(int soBongDen) {
		this.soBongDen = soBongDen;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PhongHoc [maPhong=");
		builder.append(maPhong);
		builder.append(", dayNha=");
		builder.append(dayNha);
		builder.append(", dienTich=");
		builder.append(dienTich);
		builder.append(", soBongDen=");
		builder.append(soBongDen);
		builder.append("]");
		return builder.toString();
	}
	public boolean datChuat(){
		 return duAnhsang();
	}

	private boolean duAnhsang() {
		double dientichTB = 10;
		double sobongdenTB=1;
		
		return dienTich/soBongDen <= dientichTB/sobongdenTB;
	}
}
