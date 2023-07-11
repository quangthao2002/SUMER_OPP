package bai8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Manager {
	private List<Person> dsPerson;
	private int count;
	
	public Manager(int n) {
		dsPerson = new ArrayList<>(n);
	}
	
	
	public List<Person> getDsPerson() {
		return dsPerson;
	}


	public void setDsPerson(List<Person> dsPerson) {
		this.dsPerson = dsPerson;
	}


	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}

	public boolean addPerson(Person p) {
		dsPerson.add(p);
		count ++;
		return true;
	}
	public boolean removePerson(String hoten) {
		for (Person person : dsPerson) {
			if(person.getFullName().equals(hoten)) {
				dsPerson.remove(person);
				System.out.println("Xóa thành công");
				return true;
			}
		}
		System.out.println("Xóa không thành công");
		return false;
	}
	public void sortByFullName() {
		Collections.sort(dsPerson,Comparator.comparing(Person::getFullName));
	}
	public void printDsPerson() {
		for (Person person : dsPerson) {
			System.out.println(person);
		}
	}
}
