package bai5;

import java.time.LocalDate;

public class Demo {
public static void main(String[] args) {
	
	LocalDate nsx = LocalDate.of(2022, 6, 9);
	LocalDate nhh = LocalDate.of(2023, 6, 11);
	HangThucPham hangThucPham1 =  new HangThucPham( 1, "", 1000000, nsx, nhh);
	System.out.println(hangThucPham1);
	
}
}
