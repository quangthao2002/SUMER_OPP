package bai6;

public class Demo {

	public static void main(String[] args) {
		
		Account account = new Account(-1, "", 40000);
		Account account2 = new Account(4, "ngo quang thao2", 50000);
		
		System.out.println(account);
		System.out.println(account2);
		
		Account account3 = new Account(72354, "Ted Murphy", 102.56);
		Account account4 = new Account(69713, "Jane Smith", 40.00);
		Account account5 = new Account(93757, "Edward Demsey", 759.32);
		System.out.println(account3);
		
	}
}