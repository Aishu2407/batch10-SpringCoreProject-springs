package com.te.springcoreannotation.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.te.sprincoreannotation.config.MessageConfig;
import com.te.springcoreannotation.postprocessor.MeesageBean;

public class MessageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new AnnotationConfigApplicationContext(MessageConfig.class);
		MeesageBean bean=context.getBean(MeesageBean.class);
		System.out.println(bean.getMsg());
		((AbstractApplicationContext) context).close();

	}

}
