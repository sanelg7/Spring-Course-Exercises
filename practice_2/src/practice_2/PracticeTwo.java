package practice_2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeTwo {

	public static void main(String[] args) {
		
		//load spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
				
		
		//cricket
		CricketCoach cricketCoach = context.getBean("cricketCoach",CricketCoach.class);
		System.out.println(cricketCoach.getDailyWorkout());
		System.out.println(cricketCoach.getDailyFortune());
		context.close();
		

		
	}

}

