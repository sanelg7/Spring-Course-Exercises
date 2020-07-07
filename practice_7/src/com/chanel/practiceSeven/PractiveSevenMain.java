package com.chanel.practiceSeven;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PractiveSevenMain {

	public static void main(String[] args) {


		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(BasketballConfig.class);
		Coach basketballCoach = context.getBean("basketballCoach",Coach.class);
		System.out.println(basketballCoach.getDailyWorkout());
		System.out.println(basketballCoach.getDailyFortune());
	}

}
