package bai7;

import java.text.DecimalFormat;

public abstract class Employee {
	protected int thePayrollNumber;
	protected String theName;
	protected double theBasicMonthlySalary;
	public Employee(int thePayrollNumber, String theName, double theBasicMonthlySalary) {
		super();
		this.thePayrollNumber = thePayrollNumber;
		this.theName = theName;
		this.theBasicMonthlySalary = theBasicMonthlySalary;
	}
	public double getTheBasicMonthlySalary() {
		return theBasicMonthlySalary;
	}
	
	public void setTheBasicMonthlySalary(double theBasicMonthlySalary) {
		this.theBasicMonthlySalary = theBasicMonthlySalary;
	}
	
	public abstract double getMonthSalary();
	public int getThePayrollNumber() {
		return thePayrollNumber;
	}
	public void setThePayrollNumber(int thePayrollNumber) {
		this.thePayrollNumber = thePayrollNumber;
	}
	public String getTheName() {
		return theName;
	}
	public void setTheName(String theName) {
		this.theName = theName;
	}
	DecimalFormat decimalFormat= new DecimalFormat("#,###.##");
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [thePayrollNumber=");
		builder.append(thePayrollNumber);
		builder.append(", theName=");
		builder.append(theName);
		builder.append(", theBasicMonthlySalary=");
		builder.append("$"+decimalFormat. format(theBasicMonthlySalary));
		builder.append("]");
		return builder.toString();
	}
	
	
}
