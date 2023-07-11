package bai7;

import java.time.LocalDate;

public class HangSanhSu extends HangHoa {
	private String nhaSanXuat;
	private LocalDate ngayNhapKho;
	
	public HangSanhSu() {
		// TODO Auto-generated constructor stub
	}

	public HangSanhSu(String maHang, String tenHang, double donGia, int soLuongTon, String nhaSanXuat,
			LocalDate ngayNhapKho) {
		super(maHang, tenHang, donGia, soLuongTon);
		this.nhaSanXuat = nhaSanXuat;
		setNgayNhapKho(ngayNhapKho);
	}

	public String getNhaSanXuat() {
		return nhaSanXuat;
	}

	public void setNhaSanXuat(String nhaSanXuat) {
		this.nhaSanXuat = nhaSanXuat;
	}

	public LocalDate getNgayNhapKho() {
		return ngayNhapKho;
	}

	public void setNgayNhapKho(LocalDate ngayNhapKho) {
		LocalDate currenDate= LocalDate.now();
		if(ngayNhapKho.isBefore(currenDate))
			this.ngayNhapKho = ngayNhapKho;
		else {
			this.ngayNhapKho = currenDate;
		}
	}


@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("HangSanhSu: ");
		builder.append(super.toString());
		builder.append(", nhaSanXuat=");
		builder.append(nhaSanXuat);
		builder.append(", ngayNhapKho=");
		builder.append(ngayNhapKho);
		builder.append(", mucDoBanBuon: ");
		builder.append(mucDoBanBuon());
		builder.append(", VAT: ");
		builder.append(tinhVAT());
		builder.append("]");
		return builder.toString();
	}

	//	getNgayNhapKho().getDayOfMonth()> getNgayNhapKho().getDayOfMonth()+10
	@Override
	public String mucDoBanBuon() {
		if(getSoLuongTon()>50 && LocalDate.now().isAfter(ngayNhapKho.plusDays(10))) {
			return "bán chậm";
		}else {
			return "không dánh giá";
		}
	}

	@Override
	public double tinhVAT() {
		// TODO Auto-generated method stub
		return getDonGia() * 0.1;
	}
	
}
