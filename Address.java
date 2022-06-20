package com.example.demo;

//POJO class
public class Address implements Cloneable {
	private String address;
	private int zipCode;
	private String state;
//referenced variable
	//private Department depart;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [address=" + address + ", zipCode=" + zipCode + ", state=" + state + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	public Address(String address, int zipCode, String state) {
		super();
		this.address = address;
		this.zipCode = zipCode;
		this.state = state;
		//this.depart = d;
	}

	

}