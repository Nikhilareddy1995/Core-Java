package com.example.demo;

import java.util.HashMap;

public class Employee2 {
	int id;
	String name;
	int salary;

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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	// parameterized const
	public Employee2(int id, String b, int c) {
		this.id = id;
		this.name = b;
		this.salary = c;

	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;

		return obj.equals(obj);
	}

	public static void main(String[] args) {
		Employee2 emp = new Employee2(12, "NIkhila", 1200);
		Employee2 emp2 = new Employee2(12, "NIkhila", 1200);
		System.out.println(emp);
		System.out.println(emp2);
	}

}
