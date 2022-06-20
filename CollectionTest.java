package com.example.demo;

public class CollectionTest extends A22 {
	int x = 50;

	public void m1() {
		System.out.println("collection test m1 method");
	}

	public static void main(String[] args) {
		CollectionTest a = new CollectionTest();//1
		a.m1();
		System.out.println(a.x);
		String s= "Hello";  //1
		String s1= new String ("Hel");//2
		String s2= "Hello";
		//SCP=--nikhila
		String s3="nikhila".intern();
	}

}

class A22 {
	int x = 20;

	public void m1() {
		System.out.println("a22 m1 method");
	}

	public void m2() {
		System.out.println("a22 m2 method");
	}
}
