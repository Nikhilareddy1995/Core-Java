package com.example.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {

	public  void add(long abc, int b) {
		System.out.println(abc + b);
	}

	public static void main(String[] args) {
		Test test=new Test();
		
		ExecutorService e=Executors.newFixedThreadPool(3);
		for(int i=0;i<5;i++) {
			Runnable r=new SampleNew();
			e.execute(r);
		}
	}

}

class Sample implements Runnable{

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("hi");
		
	}
	
}
