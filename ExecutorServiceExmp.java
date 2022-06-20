package com.example.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExmp {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		//10 -- 5 times
		for (int i = 0; i < 10; i++) {
			Runnable a = new A();
			executorService.execute(a);
		}

	}

}

class A implements Runnable {

	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("hi Nikhila");

	}

}