package bai5;

import java.time.LocalDate;

public class Demo {
public static void main(String[] args) throws Exception {
	
	LocalDate nsx = LocalDate.of(2022, 6, 9);
	LocalDate nhh = LocalDate.of(2023, 9, 12);
	LocalDate nsx2 = LocalDate.of(2022, 5, 7);
	LocalDate nhh2 = LocalDate.of(2023, 4, 8);
	HangThucPham hangThucPham1 =  new HangThucPham( "456", "", 1000000, nsx, nhh);
	HangThucPham hangThucPham2 =  new HangThucPham( "223", "Gạo", 2000000, nsx2, nhh2);
	System.out.println(hangThucPham1);
	System.out.println(hangThucPham2);
	
}
}
