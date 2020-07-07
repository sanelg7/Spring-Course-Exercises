package com.chanel.practiceSeven;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BasketballConfig {
	 @Bean
	 public FortuneService basketballFortune() {
		return new BasketballFortune();
	 }
	 @Bean
	 public Coach basketballCoach() {
		return new BasketballCoach(basketballFortune());
	 }

}
