package com.example.demo;

//jva.lang
public class MultiThreadingExample implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}

	}

	public static void main(String[] args) throws InterruptedException {
		MultiThreadingExample multiThreadingExample = new MultiThreadingExample();
		Thread thread = new Thread(multiThreadingExample);
		System.out.println(thread.getState());
		Thread thread2 = new Thread(multiThreadingExample);
		Thread thread3 = new Thread(multiThreadingExample);
		thread.start();
		System.out.println(thread.getState());
		//thread scheduler
		thread.setPriority(10);
		//1 to 5 , 10
		
		thread2.start();
		thread.join();
		thread.setName("My thread");
		System.out.println(thread.getName());
		System.out.println(thread3.getName());
		System.out.println(thread2.getName());
		thread3.start();
		//context switching between the thread
		//thread2.run();
		//thread.start();

	}

}
//access specifier+ return type+ method name+parameters

//THread class
//Runnable Interface
// NEW RUNNABLE RUNNING WAITING TERMINATED 
//Executor service

//

//implements Runnable intrtface
//extends Thread--class
