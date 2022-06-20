package com.example.demo;

public class ExecutorServiceExample implements Runnable {
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

	public static void main(String[] args) {

	}

}
