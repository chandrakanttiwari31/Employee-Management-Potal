package com.emp.pojo;

public class Employee {

	private int id;
  private String email;
  private String name;
  private String address;
  private long salary;
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public long getSalary() {
	return salary;
}
public void setSalary(long salary) {
	this.salary = salary;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", email=" + email + ", name=" + name + ", address=" + address + ", salary=" + salary
			+ "]";
}

	
}
