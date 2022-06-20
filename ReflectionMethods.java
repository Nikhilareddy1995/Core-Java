package com.example.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectionMethods extends A15 {
	int id;
	int salary;
	static String comapanyName;

	public void add() {

	}

	public ReflectionMethods() {

	}

	public ReflectionMethods(int a, int b, String name) {
		this.id = a;
		this.salary = b;
		this.comapanyName = name;
	}

	public static void main(String[] args) {
		// default
		ReflectionMethods ref = new ReflectionMethods();
		ReflectionMethods ref1 = new ReflectionMethods(10, 1000, "CG");
		ReflectionMethods ref3 = new ReflectionMethods(11, 100000, "CG");

		ReflectionMethods reflectionMethods = new ReflectionMethods();
		Class className = reflectionMethods.getClass();

		System.out.println(className.getName());
		Constructor[] constructor = className.getConstructors();

		for (Constructor construct : constructor) {
			System.out.println(construct);
		}
		Method[] methods = className.getMethods();

		for (Method construct : methods) {
			// System.out.println(construct);
		}
		System.out.println(className.getSuperclass());
	}
}

class A15 {

}
