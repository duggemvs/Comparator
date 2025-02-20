package com.java.comparator;

public class Employe {
	private int age;
	private String name;
	private double Salary;
	private String city;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Employe(int age, String name, double salary, String city) {
		super();
		this.age = age;
		this.name = name;
		Salary = salary;
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "[age=" + age + ", name=" + name + ", Salary=" + Salary + ", city=" + city + "]";
	}
	
	
}
