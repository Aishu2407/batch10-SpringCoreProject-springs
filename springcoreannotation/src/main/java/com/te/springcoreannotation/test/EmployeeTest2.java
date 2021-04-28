package com.te.springcoreannotation.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.sprincoreannotation.config.AllConfig;
import com.te.springcoreannotation.bean.Employee;

public class EmployeeTest2 {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AllConfig.class);
		Employee emp = context.getBean(Employee.class);

		System.out.println(emp);
	}

}
