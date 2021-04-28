package com.te.springcoreannotation.bean;

import java.io.Serializable;

import lombok.Data;
@Data
public class Department implements Serializable {
	
	private int id;
	private String dname;

}
