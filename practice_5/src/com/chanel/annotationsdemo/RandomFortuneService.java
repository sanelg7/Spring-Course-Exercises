package com.chanel.annotationsdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String fileN = "C:\\Users\\chanel\\eclipse-workspace\\spring-demo-annotations\\src\\fortune.properties";
	private List<String> fortunes;
	//create rand
	private Random rand = new Random();
	//pick random fortune
	public RandomFortuneService() {
		File file = new File(fileN);
		
		System.out.println("reading fortunes" + file);
		System.out.println("file found: " + file.exists());
		
		fortunes = new ArrayList<String>();
		
		try(BufferedReader br = new BufferedReader(
				new FileReader(file))){
			String tempLine;
			
			while ((tempLine = br.readLine()) != null) {
				fortunes.add(tempLine);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

			
	@Override
	public String getFortune() {
		
		int index = rand.nextInt(fortunes.size());
		
		String tempFortune = fortunes.get(index);
		
		return tempFortune;
	}

}
