package bai7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SoftwareHouse   {
	
	private String aName;
	private List<Employee> listStaff ;
	
	public SoftwareHouse(String aName) {
		this.aName = aName;
		listStaff = new ArrayList<>();
	}
	
	public boolean addEmployee(Employee emp) {
		for (Employee employee : listStaff) {
			if(employee.getThePayrollNumber()==emp.getThePayrollNumber()) {
				System.out.println("Trùng mã");
				return false;
			}
		}
		listStaff.add(emp);
		return true;
		
	}
	public void displayAllStaff() {
		for (Employee employee : listStaff) {
			System.out.println(employee);
		}
	}
	
	public double getMonthlySalaryBill() {
		double total=0;
		for (Employee employee : listStaff) {
			total +=employee.getMonthSalary();
		}
		return total;
	}
//	public double getMonthlySalaryAdmin() {
//		double total=0.0;
//		for (Employee employee : listStaff) {
//			if (employee instanceof Administrator) {
//				total += employee.getMonthSalary();
//			}
//		}
//		return total;
//	}	
	public void sortAllStaffByName() {
		Collections.sort(listStaff, Comparator.comparing(e->e.getTheName()));
	}
	
	public void displayListProgramers() {
		List<Programmer> listProgrammers = new ArrayList<>();
		for (Employee employee : listStaff) {
			if(employee instanceof Programmer) {
				listProgrammers.add((Programmer) employee);
				System.out.println(listProgrammers);
			}
		}
		
	}
	public boolean updateDepartmentForAdmin(int thePayrollNumber, String newDepartment) {
		for (Employee emp : listStaff) {
			if (emp instanceof Administrator) {
//				Administrator adm = emp.set
				if(((Administrator) emp).getThePayrollNumber()== thePayrollNumber) {
					((Administrator) emp).setTheDepartment(newDepartment);
					System.out.println("Cập nhật thành công");
					return true;
				}
			}
		}
		System.out.println("Cập nhật không thành công");
		return false;
		
	}
	public boolean deleteEmpByID(int id) {
		for (Employee employee : listStaff) {
			if(employee.getThePayrollNumber()==id) {
				listStaff.remove(employee);
				System.out.println("Xóa thành công");
				return true;
			}
		}
		System.out.println("Xóa không thành công");
		return false;
	}
	
}
