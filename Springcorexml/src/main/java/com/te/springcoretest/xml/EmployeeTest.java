package com.te.springcoretest.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.springcore.xml.Bean.Employee;

public class EmployeeTest {
	
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
		Employee employee=(Employee) context.getBean("empOne");
		
		System.out.println(employee.getId());
		System.out.println(employee.getName());
	}

}
