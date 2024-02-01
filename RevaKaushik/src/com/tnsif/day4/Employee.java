package com.tnsif.day4;


public class Employee
{
	private String Dept;
	private int Salary;
	private int ID;
	private int Age;
	private String Name;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDept() {
		return Dept;
	}
	public void setDept(String dept) {
		Dept = dept;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	@Override
	public String toString() {
		return "Employee [Dept=" + Dept + ", Salary=" + Salary + ", ID=" + ID + ", Age=" + Age + ", Name=" + Name + "]";
	}
	
	
	

	
	
	
}
