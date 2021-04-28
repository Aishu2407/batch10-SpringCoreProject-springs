package com.te.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.springcore.bean.Car;



public class CarTest {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Carconfig.xml");
		
		Car car=context.getBean("car", Car.class);
		System.out.println(car);
	}

}
