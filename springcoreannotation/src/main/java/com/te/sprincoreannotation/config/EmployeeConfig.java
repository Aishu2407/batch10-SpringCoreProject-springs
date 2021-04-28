package com.te.sprincoreannotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import com.te.springcoreannotation.bean.Employee;

@Configuration
public class EmployeeConfig {
	@Bean
	// @Primary
	public Employee getEmployee() {
		return new Employee();
	}

	@Bean
	@Primary
	public Employee getEmp() {
		return new Employee(100, "shashank", null);
	}
	@Bean
	public Employee getEmployee2() {
		Employee emp=new Employee();
		emp.setId(200);
		emp.setName("omk");
		return emp;
	}
}
