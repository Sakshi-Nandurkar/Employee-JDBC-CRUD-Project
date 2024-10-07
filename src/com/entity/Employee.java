package com.entity;

public class Employee {

	private int id;
	private String name;
	private String department;
	private int salary;
	private int hiringdate;
	private String address;
	
	public Employee() {
		super();
	}

	public Employee(int id, String name, String department, int salary, int hiringdate, String address) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.hiringdate = hiringdate;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getHiringdate() {
		return hiringdate;
	}

	public void setHiringdate(int hiringdate) {
		this.hiringdate = hiringdate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary
				+ ", hiringdate=" + hiringdate + ", address=" + address + "]";
	}
	
	
	
}
