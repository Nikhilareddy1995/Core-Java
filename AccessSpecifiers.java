package com.javainuse;

public class AccessSpecifiers {
	private void add() {
		System.out.println("hi");
	}

	void sub() {
		System.out.println("hi");
	}

	protected void mul() {
		System.out.println("hi");
	}

	public void div() {
		System.out.println("hi");
	}

	public static void main(String[] args) {
		AccessSpecifiers as = new AccessSpecifiers();
		
	}

}
