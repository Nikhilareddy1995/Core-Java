package com.javainuse;

public class Sample {
	// Data types
	// Numbers --> Integers--> byte(1-8 bits)/short(2 bytes)/int(4bytes)/long(8
	// bytes, 2)
	// Floating Numbers--> float/double--> 0.0
	// varaible name should be start with any char/_/$
	byte values = 19;
	int val = 1324343;
	long v = 1L;
	float floatValue = 1.9f;
	boolean v3 = true;
	char v4 = 'c';
	String v5 = "nikhila";// --> null

	int salary;
	String name;

	// Access specifiers--public,private,protected and default
//access specifier+ return type+ method name+ parameters
	// some task
	// over loading
	public void addTwoNumbers(int a, int b) {
		System.out.println("Jhansi" + a + b);// Jhansi 110
		System.out.println(a + b + "Jhansi " + a + b);// 11 Jhansi 110
	}

	// constructor--> only return type
	public Sample() {
		System.out.println("hello India");
	}

	public void addTwoNumbers(long abc, int b) {
		System.out.println("NIkhila" + (abc + b));
	}

	public void addTwoNumbers(String a, int b) {
		System.out.println("NIkhila" + (a + b));
	}

	public static void main(String[] args) {
		// JVM will allocate memory--> new keyword
		// object creation
		Sample sample = new Sample();
		sample.salary = 500;
		sample.name = "NIkhila";
		sample.addTwoNumbers(1, 10);
		 System.out.println(sample.floatValue);
	}
}

// Spring boot -- IDE(integrated development envt)--eclipse and intellij
// first line --package
// while run--compile(Sample.class)--byte code--> run
//ASCII values-- 67 a-96
//OOPS--Object oriented prg lang
//Polymorphism--compile(over loading) and runtime(overriding)
//Inheritence--making relationship b/w two class with extends keyword
//Abstraction-- Hiding--> abstract(0-100% extends) and interface(100%--implements)