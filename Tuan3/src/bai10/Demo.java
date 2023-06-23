package bai10;

import java.time.LocalDate;

public class Demo {
	
	public static void main(String[] args) {
		
		Product pd1= new Product("Nước tương", "SP001", 8.000);
		Product pd2= new Product("Gạo", "SP002", 18.000);
		Product pd3= new Product("Đường", "SP005", 10.000);
		Product pd4= new Product("Mì tôm", "SP007", 18.000);
		
		Order order = new Order(1, LocalDate.now());
		order.addLineItem(pd1,10);
		order.addLineItem(pd2,5);
		order.addLineItem(pd3,1);
		order.addLineItem(pd4,1);
		
		System.out.println(order);
		}
	
	
	
	
	
}
