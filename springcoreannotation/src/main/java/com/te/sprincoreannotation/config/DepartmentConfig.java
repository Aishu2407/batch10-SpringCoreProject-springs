package com.te.sprincoreannotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.te.springcoreannotation.bean.Department;
@Configuration
public class DepartmentConfig {
	@Bean("dev")
	@Primary
	public Department getDept()
	{
		Department department=new Department();
		department.setDname("devolper");
		department.setId(70);
		return department;
	}
	@Bean("hr")
	public Department getDeptHr()
	{
		Department department=new Department();
		department.setDname("Hr");
		department.setId(80);
		return department;
	}


}
