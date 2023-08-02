package bai2;

import java.time.LocalDate;

public class XeTai  extends Xe{
	private double giaChuyen;
	
	public XeTai() {
		// TODO Auto-generated constructor stub
	}

	public XeTai(String maXe, String soXe, String tenTaiXe, int soChuyen, LocalDate ngayDi, double giaChuyen) {
		super(maXe, soXe, tenTaiXe, soChuyen, ngayDi);
		setGiaChuyen(giaChuyen);
	}

	public double getGiaChuyen() {
		return giaChuyen;
	}

	public void setGiaChuyen(double giaChuyen) {
		if(giaChuyen>0) {
			this.giaChuyen = giaChuyen;
		}
		else {
			this.giaChuyen=0;
		}
	}

	@Override
	public String toString() {
		return String.format(
				"XeTai [getMaXe()=%s, getSoXe()=%s, getTenTaiXe()=%s, getSoChuyen()=%s, getNgayDi()=%s, thanhTien()=%s, getClass()=%s, hashCode()=%s, giaChuyen=%s]",
				getMaXe(), getSoXe(), getTenTaiXe(), getSoChuyen(), getNgayDi(), thanhTien(), getClass(), hashCode(),
				giaChuyen);
	}
	
	@Override
	public double thanhTien() {
		
		return getSoChuyen() * getGiaChuyen();
	}
	
}
