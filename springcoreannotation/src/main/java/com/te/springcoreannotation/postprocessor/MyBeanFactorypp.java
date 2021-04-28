package com.te.springcoreannotation.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactorypp implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("beanfactorypostprocessor");
		BeanDefinition beandefinition=beanFactory.getBeanDefinition("msgBean");
		MutablePropertyValues values=beandefinition.getPropertyValues();
		values.add("msg", "welcome to technoelevate");
	}

}
