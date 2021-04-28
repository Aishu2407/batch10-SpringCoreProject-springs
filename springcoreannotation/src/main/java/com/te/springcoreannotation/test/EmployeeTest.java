package com.te.springcoreannotation.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.sprincoreannotation.config.EmployeeConfig;
import com.te.springcoreannotation.bean.Employee;

public class EmployeeTest {
	
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(EmployeeConfig.class);
		Employee employee=context.getBean(Employee.class);
		
		System.out.println(employee.getId());
		System.out.println(employee.getName());
	}

}
