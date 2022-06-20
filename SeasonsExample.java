package com.example.demo;

public enum SeasonsExample {
	SUNDAY(1), MONDAY("nikhila"), TUESDAY, WEDNESDAY, THRUSHDAY;

	int i;
	String value;

	SeasonsExample(int j) {
	}

	SeasonsExample() {
	}

	SeasonsExample(String string) {
		// TODO Auto-generated constructor stub
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	public static void main(String[] args) {
		//abstract class
		//SeasonsExample s=new SeasonsExample(10,20);
	}

}
