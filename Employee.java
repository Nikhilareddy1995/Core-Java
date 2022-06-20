package com.javainuse;

public class Employee extends AccessSpecifiers implements A1, A2 {
	@Override
	public void sub() {
		// TODO Auto-generated method stub

	}

	@Override
	public void sub(int a) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		Employee e=new Employee();
		

	}

}

class A {
	public void add() {
		System.out.println("hi");
	}
}

class B {
	public void add() {
		System.out.println("hello");
	}
}

interface A1 {
	public void sub();
}

interface A2 {
	public void sub(int a);
}
