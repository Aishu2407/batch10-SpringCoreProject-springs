package com.te.studentTest;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.spring.student.bean.Student;

public class StudentTest {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("studentbeans.xml");
		
		Student student=(Student)context.getBean("student");
		System.out.println(student.getSid());
		System.out.println(student.getSname());
		System.out.println(student.getTeacher().getTid());
		System.out.println(student.getTeacher().getTname());

	}

}