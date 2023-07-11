package bai10;

public class Main {
	public static void main(String[] args) {
		Xe xe = new XeDap("XeTheThao", 10);
		Xe xe2 = new XeMay("XeTheThao", 10);
		Xe xe3 = new XeOtoKhach("XeTheThao", 10,10);
		Xe xe4 = new XeOtoTai("XeTheThao", 10);
		
		System.out.println(xe);
		System.out.println(xe2);
		System.out.println(xe3);
		System.out.println(xe4);
		
	}
}
