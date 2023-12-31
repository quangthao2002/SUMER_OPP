package bai6;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;


public class Account {
	private long accountNumber;
	private String name;
	private double balance;
	private final double RATE = 0.035;

	public Account() {
		this.accountNumber = 999999;
		this.name = "chưa xác định";
		this.balance = 50000;
	}

	public Account(long accountNumber, String name, double balance) {

		setAccountNumber(accountNumber);
		if(name.isEmpty()) {
			
			this.name = "tên chưa xác định";
		}else {
			this.name =name;
		}
		
		setBalance(balance);
	}

	public Account(long accountNumber, String name) {

		setAccountNumber(accountNumber);
		if(name.isEmpty()) {
			
			this.name = "tên chưa xác định";
		}else {
			this.name =name;
		}
		
//		setBalance(balance);
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		
		if(accountNumber >0) {
			this.accountNumber = accountNumber;
		}else {
			this.accountNumber = 0;
		}
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
	    if (balance >= 50.000) {
	        this.balance = balance;
	    } else {
	        this.balance = 0;
	    }
	}

	public boolean deposit(double amount) {
		if(amount >0) {
		 balance += amount;
			return true;
		}
		return false;

	}

	public boolean withdraw(double amount, double fee) {
		
		if (amount >0 && (amount+fee) <=balance) {
			balance -=  (amount+fee);
			return true;
		}
		return false;

	}

	public void addInterrest() {

		balance = balance +balance *RATE;
	}

	public boolean transfer(Account receiving_account, double amount) {
		if(amount >0 && amount <= balance) {
			balance -= amount;
			receiving_account.deposit(amount);
			return true;
		}
		return false;
	}

	public String toString() {
	    Locale local = new Locale("vi", "vn");
	    DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getCurrencyInstance(local);
	   decimalFormat.setMaximumFractionDigits(2);
	    String formattedBalance = decimalFormat.format(balance);
	    String result = "Account Number: " + accountNumber + ", Name: " + name + ", Balance: " + formattedBalance;
	    return result;
	}

}
