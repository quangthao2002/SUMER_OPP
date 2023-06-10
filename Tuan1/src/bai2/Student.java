package bai2;

public class Student {

	private int mssv;
	private String name;
	private float diemLT;
	private float diemTH;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(int mssv, String name, float diemLT, float diemTH) {
		super();
		this.mssv = mssv;
		this.name = name;
		this.diemLT = diemLT;
		this.diemTH = diemTH;
	}

	public int getMssv() {
		return mssv;
	}
		
	public void setMssv(int mssv) {
		if(mssv <0) {
			this.mssv = 0;			
		} else {
			
			this.mssv = mssv;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name.equals("")) {
			this.name = "default";
		}else {
			this.name = name;
		}
	
		
	}

	public float getDiemLT() {
		
		return diemLT;
	}

	public void setDiemLT(float diemLT) {
		if( diemLT <0 || diemLT >10) {
			this.diemLT = 0;
		}else {
			
			this.diemLT = diemLT;
		}
	}

	public float getDiemTH() {
		return diemTH;
	}

	public void setDiemTH(float diemTH) {
		if( diemTH <0 || diemTH >10) {
			this.diemTH = 0;
		}else {
			
			this.diemTH = diemTH;
		}
	}

	
	public float diemTB() {
		
		return (diemLT+ diemTH)/2;
	}
	@Override
	public String toString() {
		
		return "Student [mssv=" + mssv + ", name=" + name + ", diemLT=" + diemTH + ", diemTH=" + diemTH + ", diemTB=" + diemTB() + "]";
		
	}
	
	
	
	
}
