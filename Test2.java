package com.example.demo;

import java.io.IOException;

//marker interface
//abstract method- functional interface-- Runnable (run)
public class Test2 {
	public void printTable(long n) {
//2*1=2
//2*2=4
//2*3=6
		for (int i = 1; i <= 10; i++) {
			System.out.println(n+"* " + i + " =" + n * i);
		}
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Test2 test = new Test2();
		test.printTable(587587587);

	}

}
