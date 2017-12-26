package com.me.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsTest {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new EmployeeBuilder("Employee1").address1("Address1").sal(1000).build());
		list.add(new EmployeeBuilder("Employee2").address1("Address2").sal(2000).build());
		list.add(new EmployeeBuilder("Employee3").address1("Address3").sal(3000).build());

		List<Address> a = new ArrayList<>();
		list.stream().map(Employee::getAddress).collect(Collectors.summingInt(Address::getSalary));
	}
}

class EmployeeBuilder {
	private String name;
	private int sal;
	private Address address;

	EmployeeBuilder(String name) {
		this.name = name;
	}

	EmployeeBuilder address1(String address1) {
		if (this.address == null) {
			this.address = new Address();
		}
		this.address.setAddress1(address1);
		return this;
	}

	EmployeeBuilder pincode(String pincode) {
		if (this.address == null) {
			this.address = new Address();
		}
		this.address.setPincode(pincode);
		return this;
	}

	EmployeeBuilder sal(int sal) {
		this.sal = sal;
		return this;
	}

	Employee build() {
		Employee e = new Employee();
		e.setName(this.name);
		e.setAddress(address);
		e.setSalary(sal);
		return e;
	}
}

class Employee {
	private String name;
	private int salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	private Address address;
}

class Address {
	private String address1;
	private String address2;
	private String pincode;
	private int salary;
	
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return address1 + "," + address2 + "," + pincode;
	}
}
