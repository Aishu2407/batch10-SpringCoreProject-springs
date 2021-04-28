package com.te.spring.student.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Teacher{
	public Teacher() {
		
	}
	private int tid;
	private String tname;
}