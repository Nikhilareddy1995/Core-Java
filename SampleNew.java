package com.example.demo;

public class SampleNew implements Runnable {
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("hi nikhila");

	}

	public static void main(String[] args) throws InterruptedException {
		SampleNew sampleNew = new SampleNew();
		Thread thread = new Thread(sampleNew);//NEW/BORN
		Thread thread2 = new Thread(sampleNew);
		thread.setName("nikhila");
		thread2.start();//RUNNABLE--> RUNNING-->TERMINATED
		thread.start();// thread scheduler
		thread.join();
		//thread.setPriority(11);
		System.out.println(thread.getName());
		System.out.println(thread2.getName());
		

	}

}
