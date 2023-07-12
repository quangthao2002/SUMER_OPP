package bai7;

import java.text.DecimalFormat;

public class Main {
	public static void main(String[] args) {
		SoftwareHouse softwareHouse = new SoftwareHouse("Software House Inc.");

        Employee programmer1 = new Programmer(1001, "John Doe", 5000, "Java");
        Employee programmer2 = new Programmer(1002, "Jane Smith", 4500, "C++");
        Employee administrator1 = new Administrator(2001, "Mike Johnson", 6000, "HR");
        Employee administrator2 = new Administrator(2002, "Emily Brown", 5500, "Finance");
        Employee projectLeader = new ProjectLeader(3001, "David Wilson", 7000,"Java");
        
        softwareHouse.addEmployee(programmer1);
        softwareHouse.addEmployee(programmer2);
        softwareHouse.addEmployee(administrator1);
        softwareHouse.addEmployee(administrator2);
        softwareHouse.addEmployee(projectLeader);
        
        softwareHouse.displayAllStaff();
        
        DecimalFormat decimalFormat = new DecimalFormat("#,###.##");
        System.out.println("Total Monthly Salary Bill: $" + decimalFormat.format(softwareHouse.getMonthlySalaryBill()));

        softwareHouse.sortAllStaffByName();
        System.out.println("Sorted List by Name:");
        softwareHouse.displayAllStaff();

        System.out.println("List of Programmers:");
        softwareHouse.displayListProgramers();
        
        softwareHouse.updateDepartmentForAdmin(2002, "new");
        softwareHouse.displayAllStaff();
        softwareHouse.deleteEmpByID(1001);
        softwareHouse.displayAllStaff();
	}
}
