package bai9;

import java.text.DecimalFormat;

public class CongNhan {
	private String maCN;
	private String mHo;
	private String mTen;
	private int mSoSP;
	
	public CongNhan() {

	}

	public CongNhan(String maCN, String mHo, String mTen, int mSoSP) {
		
		this.maCN = maCN;
		this.mHo = mHo;
		this.mTen = mTen;
		this.mSoSP = mSoSP;
	}

	public String getMaCN() {
		return maCN;
	}

	public void setMaCN(String maCN) {
		this.maCN = maCN;
	}

	public String getmHo() {
		return mHo;
	}

	public void setmHo(String mHo) {
		this.mHo = mHo;
	}

	public String getmTen() {
		return mTen;
	}

	public void setmTen(String mTen) {
		this.mTen = mTen;
	}

	public int getmSoSP() {
		return mSoSP;
	}

	public void setmSoSP(int mSoSP) {
		this.mSoSP = mSoSP;
	}
	
//	private double dongia() {
//		double dongia;
//		if(mSoSP >= 1 && mSoSP<= 199) {
//			dongia =0.5;
//		}else if(mSoSP >= 100 && mSoSP<= 399) {
//			dongia =0.55;
//		}
//		else if(mSoSP >= 400 && mSoSP<= 599) {
//			dongia =0.6;
//		}else {
//			dongia =0.65;
//		}
//		return dongia;
//	}
	private double tinhLuong() {
		double dongia;
		if(mSoSP >= 1 && mSoSP<= 199) {
			dongia =0.5;
		}else if(mSoSP >= 100 && mSoSP<= 399) {
			dongia =0.55;
		}
		else if(mSoSP >= 400 && mSoSP<= 599) {
			dongia =0.6;
		}else {
			dongia =0.65;
		}
		return mSoSP * dongia;
	}
	DecimalFormat formatter = new DecimalFormat("###,###,###");
	@Override
	  public String toString() {
        return "Mã CN: " + maCN +
                ", Họ: " + mHo +
                ", Tên: " + mTen +
                ", Số sản phẩm: " + mSoSP+
                ", lương: " + formatter.format(tinhLuong())+" VNĐ" ;
    }
	
	
}
