package com.te.springcoreannotation.postprocessor;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import lombok.Data;
@Data
public class MeesageBean implements Serializable {

	public MeesageBean()
	{
		System.out.println("instantiation phase");
	}
	private String msg;
	
	@PostConstruct
	public void init()
	{
		System.out.println("my init phase");
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("my destroy phase");
	}
}
