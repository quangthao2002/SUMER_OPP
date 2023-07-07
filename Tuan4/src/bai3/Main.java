package bai3;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<GiaoDich> dsGD= new ArrayList<>();
		
		GiaoDich gdv3= new GiaoDichTienTe("GDTT3", LocalDate.of(2023, 6, 5), 20000, 10,"USD", 10);
		GiaoDich gdv4= new GiaoDichTienTe("GDTT4", LocalDate.of(2022, 7, 7), 30000, 20,"VN", 20);
		GiaoDich gdv5= new GiaoDichTienTe("GDTT5", LocalDate.of(2021, 8, 5), 2000000000, 3,"XXX", 40);
		
		GiaoDich gdv1= new GiaoDichVang("GDV1", LocalDate.of(2023, 8, 20), 66000, 8,"9 số 9");
		GiaoDich gdv2= new GiaoDichVang("GDV2", LocalDate.of(2023, 10,12), 1100000000, 9, "nguyên khối");
		
		dsGD.add(gdv1);
		dsGD.add(gdv2);
		dsGD.add(gdv3);
		dsGD.add(gdv4);
		dsGD.add(gdv5);
		
		int soLuongGDV=0;
		int soLuongTT=0;
		double tb =0;
		double totalTT= 0;
		int count=0;
		for(GiaoDich gd : dsGD) {
			if(gd instanceof GiaoDichTienTe) {
					count ++;
				totalTT += gd.thanhTien();
			}
		}
		for(GiaoDich gd : dsGD) {
			if(gd instanceof GiaoDichTienTe) {
				tb= totalTT /count;
			}
		}
		
		
		
		for(GiaoDich gd : dsGD) {
			if(gd instanceof GiaoDichVang) {
				soLuongGDV += gd.getSoLuong();
			}else if(gd instanceof GiaoDichTienTe){
				soLuongTT += gd.getSoLuong();
			}
		}
		
		System.out.println("Tổng số lượng giao dịch tiền tệ: "+ soLuongTT);
		System.out.println("Tổng số lượng giao dịch vàng: "+ soLuongGDV);
		System.out.println("Trung bình thành tiền của giao dịch tiền tệ: "+ tb);
		System.out.println("\nCác giao dịch có đơn giá lơn hơn 1 tỷ:");
		for(GiaoDich gd : dsGD) {
			if(gd.getDonGia() > 1000000000) {
				System.out.println(gd);
			}
		} 
		
		
		
	}
}
