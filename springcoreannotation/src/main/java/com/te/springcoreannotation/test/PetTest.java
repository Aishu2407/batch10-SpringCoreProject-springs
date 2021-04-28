package com.te.springcoreannotation.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.sprincoreannotation.config.PetConfig;
import com.te.springcoreannotation.bean.Pet;

public class PetTest {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(PetConfig.class);
		Pet pet=context.getBean(Pet.class);
		System.out.println(pet.getName());
		pet.getAnimal().eat();
		pet.getAnimal().speak();

	}

}
