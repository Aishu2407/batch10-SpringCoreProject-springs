package com.te.sprincoreannotation.config;

import org.springframework.context.annotation.Bean;

import com.te.springcoreannotation.postprocessor.MeesageBean;
import com.te.springcoreannotation.postprocessor.MyBeanFactorypp;
import com.te.springcoreannotation.postprocessor.MyBeanPP;

public class MessageConfig {
	@Bean(name="msgBean")
	public MeesageBean getMsg() {
		MeesageBean bean=new MeesageBean();
		bean.setMsg("now u are technoelevate employee");
		return bean;
	}

	@Bean
	public MyBeanFactorypp getMBFPP() {
		return new MyBeanFactorypp();
	}
	@Bean
	public MyBeanPP getMBPP() {
		return new MyBeanPP();
	}
}
