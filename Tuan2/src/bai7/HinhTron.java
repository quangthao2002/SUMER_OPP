package bai7;

public class HinhTron {
	
	private ToaDo tam;
	private double banKinh;
	
	public HinhTron() {

	}

	public HinhTron(ToaDo tam, double banKinh) {
		super();
		this.tam = tam;
		this.banKinh = banKinh;
	}

	public ToaDo getTam() {
		return tam;
	}

	public void setTam(ToaDo tam) {
		this.tam = tam;
	}

	public double getBanKinh() {
		return banKinh;
	}

	public void setBanKinh(double banKinh) {
		this.banKinh = banKinh;
	}
	
	public double tinhChuVi() {
		
		return 2* Math.PI *banKinh;
	}
	public double tinhDienTich() {
		
		return Math.PI * Math.pow(banKinh, banKinh);
	}
	
	public String toString() {
		 return "Hình tròn có tâm O "+ tam.toString() + "với bán kính " + banKinh +
				 " có diện tích và chu vi lần lượt là "+tinhDienTich()+" và "+tinhChuVi();
	}
	
}
