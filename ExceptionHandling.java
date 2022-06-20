package com.example.demo;

public class ExceptionHandling {
	public static void main(String[] args) {
		Employee employee = new Employee(10, "NIkhila", new Address("ATP", 515581, "AP"));
		Employee employee2 = new Employee(10, "NIkhila", new Address("ATP", 515581, "AP"));
		System.out.println("hi..hello");
		try {
			System.out.println(employee2.getAddress().getAddress());
			System.out.println("hi");

			System.out.println("hi");
		} catch (ArithmeticException e) {
			System.out.println("exception arised and catched");
		}
		catch (NullPointerException e) {
			//default cons
			throw new AddressException("");
		}
		System.out.println("hi");
	}

}
//heap memory--OOM exception
//threads-- stacks--sta
