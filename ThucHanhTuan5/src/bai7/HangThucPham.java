package bai7;

import java.time.LocalDate;

public class HangThucPham extends HangHoa {

	private String nhaCungCap;
	private LocalDate ngaySanXuat;
	private LocalDate ngayHetHan;

	public HangThucPham() {
		// TODO Auto-generated constructor stub
	}

	public HangThucPham(String maHang, String tenHang, double donGia, int soLuongTon, String nhaCungCap,
			LocalDate ngaySanXuat, LocalDate ngayHetHan) {
		super(maHang, tenHang, donGia, soLuongTon);
		this.nhaCungCap = nhaCungCap;
		setNgaySanXuat(ngaySanXuat);
		setNgayHetHan(ngayHetHan);
	}

	public String getNhaCungCap() {
		return nhaCungCap;
	}

	public void setNhaCungCap(String nhaCungCap) {

		this.nhaCungCap = nhaCungCap;
	}

	public LocalDate getNgaySanXuat() {
		return ngaySanXuat;
	}

	public void setNgaySanXuat(LocalDate ngaySanXuat) {
		LocalDate currenDate = LocalDate.now();
		if (ngaySanXuat.isBefore(currenDate)) {
			this.ngaySanXuat = ngaySanXuat;
		}else {
			this.ngaySanXuat = currenDate;
		}
	}

	public LocalDate getNgayHetHan() {
		return ngayHetHan;
	}

	public void setNgayHetHan(LocalDate ngayHetHan) {
		if(ngayHetHan.isAfter(ngaySanXuat)) {
			this.ngayHetHan = ngayHetHan;
		}else {
			this.ngayHetHan= ngaySanXuat;
		}
			
	}

	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("HangThucPham: ");
		builder.append(super.toString());
		builder.append(", nhaCungCap=");
		builder.append(nhaCungCap);
		builder.append(", ngaySanXuat=");
		builder.append(ngaySanXuat);
		builder.append(", ngayHetHan=");
		builder.append(ngayHetHan);
		builder.append(", mucDoBanBuon: ");
		builder.append(mucDoBanBuon());
		builder.append(", VAT: ");
		builder.append(tinhVAT());
		builder.append("]");
		return builder.toString();
	}

	@Override
	public String mucDoBanBuon() {
		LocalDate currenDate= LocalDate.now();
		if(getSoLuongTon() >0 && ngayHetHan.isBefore(currenDate)) {
			return "khó bán";
		}
		return "không dánh giá";
		
	}
	@Override
	public double tinhVAT() {
		// TODO Auto-generated method stub
		return getDonGia() * 0.05;
	}


}
