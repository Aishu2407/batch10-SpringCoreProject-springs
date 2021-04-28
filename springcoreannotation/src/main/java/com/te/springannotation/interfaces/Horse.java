package com.te.springannotation.interfaces;

public class Horse implements Animal{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("eat grass");
	}

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("tik tik.......");
	}
	
	

}
