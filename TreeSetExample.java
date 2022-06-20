package com.javainuse;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		//sorting purpose
		//A--65
		//a--97
		Set set=new TreeSet<>();
		set.add("Nikhila");
		set.add("Nikhila");
		set.add("nikhila");
		set.add("India");
		set.add("cat");
		System.out.println(set);
		
		
		
		Set<Integer> setValues=new HashSet<>();
		setValues.add(190);
		setValues.add(12);
		setValues.add(14);
		setValues.add(12);
		//
		for(Integer i: setValues) {
			System.out.println(i);
			
		}

	}
	//list vs set vs treeset
	

}
