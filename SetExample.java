package com.javainuse;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
	void add() {
		System.out.println("hi");
	}

//void add();
	public static void main(String[] args) {
//setValues wont follow the insertion order
//duplicates
		Set setValues = new HashSet<>();

		setValues.add(123);
		setValues.add("C");
		setValues.add(true);
		setValues.add(123.0);
		setValues.add('C');
		setValues.add(null);
		setValues.add(123);
		setValues.add(null);

		for (Object o : setValues) {
			// System.out.println(o);
		}

		// generics--compile time
		Set<Integer> intValues = new HashSet<>();
		intValues.add(1);
		intValues.add(12);

		for (Integer o : intValues) {
			// System.out.println(o);
		}

		Set<Student> setOfStudents = new HashSet<>();
		setOfStudents.add(new Student(1, "Nikhila"));
		setOfStudents.add(new Student(10, "fr"));
		setOfStudents.add(new Student(100, "r3"));
		setOfStudents.add(new Student(1223, "er3"));
		setOfStudents.add(new Student(12, "Nikeehila"));
		for (Student student : setOfStudents) {
			// getters and setters
			if (student.getId() > 10 && student.getName().startsWith("e")) {

				System.out.println(student.getId() + " " + student.getName());
			}

		}

		String name = "Nikhila";
		for (int i = 0; i < name.length(); i++) {
			System.out.println(name.charAt(i));
		}

	}

}

class Student {
	int id;
	String name;

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

	public Student(int id, String name) {

		this.id = id;
		this.name = name;
	}

}

// both are class or both are interfaces--> extends
// one class one interface implements