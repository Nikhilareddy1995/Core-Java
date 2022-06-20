package com.javainuse;

//default java.lang
//parent class is object

public class StringExample {

	// String -- immutable
	public static void main(String[] args) {
		// literal
		String name = "Nikhila"; // 7--> 0
		// new keyword
		/*
		 * String name2=new String("India");//2 String name3=new String("India");//1
		 * 
		 * String name4="Nikhila";
		 * 
		 * //content and reference
		 * 
		 * System.out.println(name.equals(name2));//false
		 * System.out.println(name3.equals(name2));
		 * System.out.println("--------------"); System.out.println(name==name2);//false
		 * System.out.println(name3==name2); System.out.println(name4==name);
		 */

		// System.out.println(name);

		for (int i = 1; i <= 100; i++) {
			 System.out.println(i);
		}
		// 1.0v--> thread safe--it wont multithreading--performance low--synchronized
		// SBuffer and SBuilder
		// 1 to 100
		// 1.0v
		StringBuffer sb = new StringBuffer("Nikhila");
		sb.reverse();
		System.out.println(sb);
		// Sbuilder-1.5v
		StringBuffer sb2 = new StringBuffer("Nikhila");

		System.out.println(sb.equals(sb2));// true
		System.out.println(sb == sb2);// false
		sb2.append("reddy");

	}

}
//created a branch
//check out to that branch