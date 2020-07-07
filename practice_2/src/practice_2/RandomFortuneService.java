package practice_2;

public class RandomFortuneService implements FortuneService{

	private String [] fortuneArr = {"You have good luck today...","You have normal luck today...","You have bad luck today..."};
	@Override
	public String getFortune() {
		int rand = (int)(Math.random() * 3);
		return fortuneArr[rand];
	}

}
