package com.te.springannotation.interfaces;

public class Dog implements Animal{

	@Override
	public void eat() {
		System.out.println("eat pedigree");
		
	}

	@Override
	public void speak() {
		System.out.println("bow bow....");
	}

}
