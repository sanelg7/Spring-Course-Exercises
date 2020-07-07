package practice_2;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;

	
	
	public CricketCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}



	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

	@Override
	public String getDailyWorkout() {
		
		return "Practice cricket for 15 mins";
	}

}
