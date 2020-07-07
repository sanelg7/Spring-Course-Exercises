package com.chanel.annotationsdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		//read spring config
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		//get bean from spring container
		Coach tennisCoach = context.getBean("tennisCoach",Coach.class);
		//call method on the bean
		System.out.println(tennisCoach.getDailyWorkout());
		//call method to get fortune
		System.out.println(tennisCoach.getDailyFortune());
		
		//close the context
		context.close();
	}

}
