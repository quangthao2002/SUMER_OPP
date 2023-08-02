package bai2;

import java.time.LocalDate;

public abstract class Xe {
	private String maXe;
	private String soXe;
	private String tenTaiXe;
	private int soChuyen;
	private LocalDate ngayDi;
	private String mua;
	
	public Xe() {

	}

	public Xe(String maXe, String soXe, String tenTaiXe, int soChuyen, LocalDate ngayDi) {
		this.maXe = maXe;
		this.soXe = soXe;
		this.tenTaiXe = tenTaiXe;
		setSoChuyen(soChuyen);
		this.ngayDi = ngayDi;
	}

	public String getMua() {
		return mua;
	}
	public String getMaXe() {
		return maXe;
	}

	public void setMaXe(String maXe) {
		this.maXe = maXe;
	}

	public String getSoXe() {
		return soXe;
	}

	public void setSoXe(String soXe) {
		this.soXe = soXe;
	}

	public String getTenTaiXe() {
		return tenTaiXe;
	}

	public void setTenTaiXe(String tenTaiXe) {
		this.tenTaiXe = tenTaiXe;
	}

	public int getSoChuyen() {
		return soChuyen;
	}

	public void setSoChuyen(int soChuyen) {
		if(soChuyen>0) {
			this.soChuyen = soChuyen;
		}else {
			this.soChuyen=0;
		}
	}

	public LocalDate getNgayDi() {
		return ngayDi;
	}

	public void setNgayDi(LocalDate ngayDi) {
		this.ngayDi = ngayDi;
	}
	
	public abstract double thanhTien();
	
}
