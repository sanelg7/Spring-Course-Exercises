package com.chanel.annotationsdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class FileBasedFortune implements FortuneService{

	private String fileName = "C:\\Users\\chanel\\eclipse-workspace\\practiceSix\\src\\fortune.properties";
	private List<String> theFortunes;
	
	private Random myRandom = new Random();
	
	public FileBasedFortune() {
		System.out.println("inside default constructor");
	}
	
	@PostConstruct
	private void readFortunes() {
		
		System.out.println(">> FileFortuneService: inside method loadTheFortunesFile");

		File theFile = new File(fileName);
		
		System.out.println("Reading fortunes from file: " + theFile);
		System.out.println("File exists: " + theFile.exists());
		
		// initialize array list
		theFortunes = new ArrayList<String>();
		
		// read fortunes from file
		try (BufferedReader br = new BufferedReader(
				new FileReader(theFile))) {

			String tempLine;

			while ((tempLine = br.readLine()) != null) {
				theFortunes.add(tempLine);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	@Override
	public String getFortune() {
		int index = myRandom.nextInt(theFortunes.size());

		String tempFortune = theFortunes.get(index);

		return tempFortune;	}

}
