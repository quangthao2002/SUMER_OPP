package bai7;

public class Demo {

	public static void main(String[] args) {
		ToaDo toaDo= new ToaDo(5,5);
		double banKinh=10.5;
		HinhTron hinhTron= new HinhTron(toaDo, banKinh);
		System.out.println(hinhTron);
		
	}
}
