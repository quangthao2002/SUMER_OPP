package bai12;

public class OverdraftAccount extends Acount {
	private double odLimit;
	private double overdraft;
	private double availableBalance;
	
	public double getOdLimit() {
		return odLimit;
	}
	public void setOdLimit(double odLimit) {
		this.odLimit = odLimit;
	}
	public double getAvailableBalance() {
		return availableBalance;
	}
	public void setAvailableBalance(double availableBalance) {
		this.availableBalance = availableBalance;
	}
	
	
}
