package com.chanel.annotationsdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeSix {

	public static void main(String[] args) {

		//load config
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve bean from spring
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		System.out.println(theCoach.getDailyFortune());
		//end context
		context.close();
	}

}
