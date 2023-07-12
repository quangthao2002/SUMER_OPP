package bai7;

public class Programmer extends Employee{
	
	
	private String theLanguage;

	public Programmer(int thePayrollNumber, String theName, double theBasicMonthlySalary, String theLanguage) {
		super(thePayrollNumber, theName, theBasicMonthlySalary);
		this.theLanguage = theLanguage;
	}
	public String getTheLanguage() {
		return theLanguage;
	}
	


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Programmer [toString()=");
		builder.append(super.toString());
		builder.append(", theLanguage=");
		builder.append(theLanguage);
		builder.append("]");
		return builder.toString();
	}
	@Override
	public double getMonthSalary() {
		double phucap=0;
		if(getTheLanguage().equals("Java")) {
			 phucap= getTheBasicMonthlySalary() * 0.2;
		}
		return super.getTheBasicMonthlySalary() + phucap;
	}
	
	
}
