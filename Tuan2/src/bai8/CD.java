package bai8;

public class CD {

	private int maCD;
	private String tuaCD;
	private int soBaiHat;
	private double giaThanh;
	
	public CD() {
		// TODO Auto-generated constructor stub
	}

	public CD(int maCD, String tuaCD, int soBaiHat, double giaThanh) {
		super();
		this.maCD = maCD;
		this.tuaCD = tuaCD;
		this.soBaiHat = soBaiHat;
		this.giaThanh = giaThanh;
	}

	public int getMaCD() {
		return maCD;
	}

	public void setMaCD(int maCD) {
		if(maCD >0)
		  this.maCD = maCD;
		else
			this.maCD =99999;
			
	}

	public String getTuaCD() {
		return tuaCD;
	}

	public void setTuaCD(String tuaCD) {
		String rs ="chưa xác định";
		if(!tuaCD.equals(""))
			this.tuaCD = tuaCD;
		else
			this.tuaCD =rs;
	}

	public int getSoBaiHat() {
		
		return soBaiHat;
	}

	public void setSoBaiHat(int soBaiHat) {
		if(soBaiHat >0)
			this.soBaiHat = soBaiHat;
		else
			this.soBaiHat =0;
	}

	public double getGiaThanh() {
		
		return giaThanh;
	}

	public void setGiaThanh(double giaThanh) {
		if(giaThanh >0)
			this.giaThanh = giaThanh;
		else
			this.giaThanh =0;
	}

	@Override
	public String toString() {
		return "CD [maCD=" + maCD + ", tuaCD=" + tuaCD + ", soBaiHat=" + soBaiHat + ", giaThanh=" + giaThanh + "]";
	}
	
	
	
}
