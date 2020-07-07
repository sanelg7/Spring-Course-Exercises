package com.chanel.annotationsdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("fileBasedFortune")
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println("inside default constructor");
	}
	/*
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("inside setter for fortuneservice");
		this.fortuneService = fortuneService;
	}*/
	/*
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	*/
	@Override
	public String getDailyWorkout() {
		return "Practice backhand";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	//define init and destroy methods...
	@PostConstruct
	public void doStartup() {
		System.out.println("Startup stuff...");
	}
	@PreDestroy
	public void doCleanup() {
		System.out.println("Cleanup stuff...");
	}
	

}
