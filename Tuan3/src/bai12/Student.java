package bai12;

public class Student {
	private String fullName;
	private String address;
	private String numberPhone;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(String fullName, String address, String numberPhone) {
		super();
		this.fullName = fullName;
		this.address = address;
		this.numberPhone = numberPhone;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getNumberPhone() {
		return numberPhone;
	}
	public void setNumberPhone(String numberPhone) {
		this.numberPhone = numberPhone;
	}
	@Override
	public String toString() {
		return "Student [fullName=" + fullName + ", address=" + address + ", numberPhone=" + numberPhone + "]";
	}
	
}
