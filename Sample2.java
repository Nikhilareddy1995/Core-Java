package com.javainuse;

public class Sample2 {

	// addition of two numbers -->int int int

	public void add(int a, int b, int c, String name) {
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a+c);
	}

	public static void main(String[] args) {
		Sample2 sample = new Sample2();
		Sample2 sample2 = new Sample2();
		Sample2 sample3 = new Sample2();
		sample.add(1, 34, 54, "Nikhila");
		sample2.add(1, 35, 54, "Nikhila");
		sample3.add(1, 36, 54, "Nikhila");
	}

}

// multiplication of two numbers
// division of two numbers
//list of employee objects
//iterate list through for each loop
