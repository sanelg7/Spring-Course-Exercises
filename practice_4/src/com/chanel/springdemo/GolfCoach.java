package com.chanel.springdemo;

public class GolfCoach implements Coach {

	private FortuneService fortuneService;
	
	public GolfCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice for 5 hours";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}