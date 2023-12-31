 package bai5;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

import javax.swing.text.DateFormatter;

public class HangThucPham {

	private String maHang;
	private String tenHang;
	private double donGia;
	private LocalDate ngaySanXuat;
	private LocalDate ngayHetHan;
	
	public HangThucPham() {
		// TODO Auto-generated constructor stub
	}

	public HangThucPham(String maHang, String tenHang, double donGia, LocalDate ngaySanXuat, LocalDate ngayHetHan) throws Exception {
//		super();
		setMaHang(maHang);
		setTenHang(tenHang);
		setDonGia(donGia);
		setDonGia(donGia);
		setNgaySanXuat(ngaySanXuat);
		setNgayHetHan(ngayHetHan);
	}

	
	public HangThucPham(String maHang) {
//		super();
		this.maHang = maHang;
	}

	public String Check_HSD() {
		LocalDate curentDate = LocalDate.now();
		if (ngayHetHan.isAfter(curentDate)) {
			return "Còn hạng sử dụng";
		} else {
			return "Hết hạn sử dụng";
		}
	}
	
	public String getMaHang() {
		return maHang;
	}

	public void setMaHang(String maHang) throws Exception {
		if(!maHang.equals("")) {
			this.maHang = maHang;
//			this.maHang = null;
		}else {
			
//			System.out.println("Mã Hàng không được để rỗng !!!");
			throw new Exception("ma hang khong duoc rong");
		}
	}

	public String getTenHang() {
		return tenHang;
	}

	public void setTenHang(String tenHang) {
		if(tenHang.isEmpty()) {
			System.out.println("Tên hàng có mã "+maHang+" không được để rỗng !!!");
			this.tenHang = "xxx";
		}else {
			
			this.tenHang = tenHang;
		}
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		if(donGia <0) {
			System.out.println("Đơn giá phải lơn hơn không");
			this.donGia = 0;
		}else {
			
			this.donGia = donGia;
		}
	}

	public LocalDate getNgaySanXuat() {
		return ngaySanXuat;
	}

	public void setNgaySanXuat(LocalDate ngaySanXuat) {
		LocalDate curentDate = LocalDate.now(); // Lấy ra ngạy hiện tại
		if(ngaySanXuat.isAfter(curentDate)) {
			System.out.println("ngày sản xuất không được sau ngày hiện tại");
			this.ngaySanXuat =curentDate;
		}else {
			
			this.ngaySanXuat = ngaySanXuat;
		}
	}

	public LocalDate getNgayHetHan() {
		return ngayHetHan;
	}

	public void setNgayHetHan(LocalDate ngayHetHan) {
		if(ngayHetHan.isBefore(ngaySanXuat)) {
			System.out.println("Ngày hết hạn phải sau ngày sản xuất");
			this.ngayHetHan = this.ngaySanXuat;
		}
		else {
			this.ngayHetHan = ngayHetHan;
		}
	}
	DecimalFormat df= new DecimalFormat("#,#00.00");
	 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	@Override
	public String toString() {
		return "HangThucPham [maHang=" + maHang + ", tenHang=" + tenHang + ", donGia=" + df.format(donGia) + "VNĐ" + ", ngaySanXuat="
				+ dtf.format(ngaySanXuat) + ", ngayHetHan=" + dtf.format(ngayHetHan) + ", Ghi chú:" + Check_HSD() + " ]";
	}

	
}
