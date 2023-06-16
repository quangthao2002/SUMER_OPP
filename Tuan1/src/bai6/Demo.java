package bai6;

public class Demo {

	public static void main(String[] args) {
		
//		Account account0 = new Account(-1, "", 40000);
//		Account account1 = new Account(4, "ngo quang thao", 50000);
		
		Account acc1 = new Account(72354, "Ted Murphy", 102.46);
		Account acc2 = new Account(69713, "Jane Smith", 60.00);
		Account acc3 = new Account(93757, "Edward Demsey", 759.32);
		
		System.out.println("------------------Thông tin các tài khoản------------------");
		System.out.println("     Acc 1: "+acc1);
		System.out.println("     Acc 2: "+acc2);
		System.out.println("     Acc 3: "+acc3);
		System.out.println("-----------------------------------------------------------");
		
		acc1.deposit(25.85);
		acc2.deposit(500.00);
//		acc2.withdraw(43.75, 1.50);
//		acc3.addInterrest();
		System.out.println("- Gởi thêm số tiền cho acc1 là 25.85, cho acc2 là 500.00.");
		System.out.println("      Acc 1: "+acc1);
		System.out.println("      Acc 2: "+acc2);
		acc2.withdraw(430.75, 1.50);
		System.out.println("- Rút khỏi acc2 số tiền là 430.75, mức phí 1.50");
		System.out.println("      Acc 2: "+acc2);
		acc3.addInterrest();
		System.out.println("- Tính tiền lãi cho acc3.");
		System.out.println("      Acc 3: "+acc3 );
		
		acc2.transfer(acc1, 100.00);
		System.out.println("- Chuyển tiền từ acc2 sang cho acc1 số tiền là 100.00");
		System.out.println("-------------------------------------------------------------");
		System.out.println("      Acc 2: "+acc2);
		System.out.println("      Acc 1: "+acc1);
		
	}
}
