package com.example.demo;

public class SynchronizedExmp {
	public synchronized void add() {
		for (int i = 0; i < 5; i++) {

			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		B b = new B(new SynchronizedExmp());
		Thread thread = new Thread(b);
		Thread thread2 = new Thread(b);
		thread.start();
		thread2.start();
	}

}

class B implements Runnable {
	SynchronizedExmp synchronizedExmp;
	int a;

	B(SynchronizedExmp syn) {
		this.synchronizedExmp = syn;
	}

	@Override
	public void run() {
		synchronizedExmp.add();
	}

}