package bai8;

public class Person {
	private String fullName;
	private String address;
	
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(String fullName, String address) {
		super();
		this.fullName = fullName;
		this.address = address;
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
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [fullName=");
		builder.append(fullName);
		builder.append(", address=");
		builder.append(address);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
}
