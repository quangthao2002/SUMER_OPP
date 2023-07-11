package bai7;

public  class HangDienMay extends HangHoa {
	private int thoiGianBaoHanh;
	private double congSuat;
	
	public HangDienMay() {

	}
	
	public HangDienMay(String maHang, String tenHang, double donGia, int soLuongTon, int thoiGianBaoHanh,
			double congSuat) {
		super(maHang, tenHang, donGia, soLuongTon);
		setThoiGianBaoHanh(thoiGianBaoHanh);
		setCongSuat(congSuat);
	}

	public int getThoiGianBaoHanh() {
		return thoiGianBaoHanh;
	}

	public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
		if(thoiGianBaoHanh >= 0) {
			this.thoiGianBaoHanh = thoiGianBaoHanh;
		}else {
			this.thoiGianBaoHanh = 0;
		}
	}

	public double getCongSuat() {
		return congSuat;
	}

	public void setCongSuat(double congSuat) {
		if(congSuat>=0)
			this.congSuat = congSuat;
		else this.congSuat = 0;
	}

	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("HangDienMay: ");
		builder.append(super.toString());
		builder.append(", thoiGianBaoHanh=");
		builder.append(thoiGianBaoHanh);
		builder.append(", congSuat=");
		builder.append(congSuat);
		builder.append(", mucDoBanBuon: ");
		builder.append(mucDoBanBuon());
		builder.append(", tinhVAT : ");
		builder.append(tinhVAT());
		builder.append("]");
		return builder.toString();
	}

	@Override
	public String mucDoBanBuon() {
		if(getSoLuongTon()<3) {
			return "bán được";
		}
		return "không dánh giá";
	}

	@Override
	public double tinhVAT() {
	
		return getDonGia() * 0.1;
	}
	
	
	
	
	
	
	
	
	

	
}
