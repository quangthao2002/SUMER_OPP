package bai7;

public class Administrator extends Employee{

	private String theDepartment;

	public Administrator(int thePayrollNumber, String theName, double theBasicMonthlySalary, String theDepartment) {
		super(thePayrollNumber, theName, theBasicMonthlySalary);
		this.theDepartment = theDepartment;
	}
	
	
public String getTheDepartment() {
	return theDepartment;
}
public void setTheDepartment(String theDepartment) {
	this.theDepartment = theDepartment;
}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Administrator [toString()=");
		builder.append(super.toString());
		builder.append(", theDepartment=");
		builder.append(theDepartment);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public double getMonthSalary() {
		
		double phucap= getTheBasicMonthlySalary() *0.4;
		return super.getTheBasicMonthlySalary()+ phucap;
		
	}
	
	
}
