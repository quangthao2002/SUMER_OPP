package bai3;

public class Triangle {

	private double ma;
	private double mb;
	private double mc;
	
	
	public Triangle() {
		// TODO Auto-generated constructor stub
	}


	

	
	public Triangle(int ma, int mb, int mc) {
		super();
		this.ma = ma;
		this.mb = mb;
		this.mc = mc;
	}





	public double perimeter() {
		
		return ma+mb+mc;
	}
	public double acreage() {
		double p = (ma+mb+mc)/2;
		double temp = p*(p-ma)*(p-mb)*(p-mc);
		return  Math.sqrt(temp);
		
	}
	public String CheckTriagle() {
		
		if( ma == mb || ma == mc || mb ==mc) {
			return "Tam Giac Can";
		}else if(ma == mb && ma == mc) {
			return "Tam Giac Đều" ;
		}else if( ma != mb && ma != mc && mb != mc) {
			return "Tam Giac thuong";
		}
		else {
			return "Khong phai Tam Giac";
		}
	}
	public double getMa() {
		return ma;
	}


	public void setMa(int ma) {
		if(ma <0) {	
			this.ma =0;
		}else {
			this.ma =ma;
		}
		
//		this.ma =ma;
	}


	public double getMb() {
		return mb;
	}


	public void setMb(int mb) {

		if(mb <0) {	
			this.mb =0;
		}else {
			this.mb =mb;
		}
	}


	public double getMc() {
		return mc;
	}


	public void setMc(int mc) {

		if(mc <0) {	
			this.mc =0;
		}else {
			this.mc =mc;
		}
	}


	@Override
	public String toString() {
		return "Triangle [ma=" + ma + ", mb=" + mb + ", mc=" + mc +  ", Kiểu tam giác =" + CheckTriagle() +
				 ", Chu vi tam giác =" + perimeter() + 
				 ", Diện tích tam giác =" + acreage() +
				"]";
	}
	
	
	
}
