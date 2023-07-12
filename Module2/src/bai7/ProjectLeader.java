package bai7;

public class ProjectLeader  extends Programmer{

	public ProjectLeader(int thePayrollNumber, String theName, double theBasicMonthlySalary, String theLanguage) {
		super(thePayrollNumber, theName, theBasicMonthlySalary, theLanguage);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getMonthSalary() {
		double phucap= getTheBasicMonthlySalary() * 0.2;
		return super.getTheBasicMonthlySalary() *phucap;
	}
}
