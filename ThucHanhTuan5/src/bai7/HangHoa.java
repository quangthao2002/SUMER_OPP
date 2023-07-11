package bai7;

import java.util.concurrent.ExecutionException;

public abstract class HangHoa {
	private String maHang;
	private String tenHang;
	private double donGia;
	private int soLuongTon;
	
	public HangHoa() {
		// TODO Auto-generated constructor stub
	}

	public HangHoa(String maHang, String tenHang, double donGia, int soLuongTon) {
		super();
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.donGia = donGia;
		this.soLuongTon = soLuongTon;
	}

	public String getMaHang() {
		return maHang;
	}

	public void setMaHang(String maHang) {
		if(maHang.equals("")) {
			new ExecutionException("mã hàng không được rộng", null);
		}
		this.maHang = maHang;
	}

	public String getTenHang() {
		return tenHang;
	}

	public void setTenHang(String tenHang) {
		if(tenHang.equals("")) {
			this.tenHang= "xxx";
		}
		this.tenHang = tenHang;
	}

	public double getDonGia() {
		
		return donGia;
	}

	public void setDonGia(double donGia) {
		if(donGia >=0) {
			this.donGia = donGia;
		}else {
			this.donGia= 0.0;
		}
	}
	public int getSoLuongTon() {
		return soLuongTon;
	}

	public void setSoLuongTon(int soLuongTon) {
		if(soLuongTon>=0)
			this.soLuongTon = soLuongTon;
		else 
			this.soLuongTon = 0;
			
		}
	
	public abstract String mucDoBanBuon();
	public abstract double tinhVAT();
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("HangHoa [maHang=");
		builder.append(maHang);
		builder.append(", tenHang=");
		builder.append(tenHang);
		builder.append(", donGia=");
		builder.append(donGia);
		builder.append(", soLuongTon=");
		builder.append(soLuongTon);
		builder.append("]");
		return builder.toString();
	}
	
	
}
