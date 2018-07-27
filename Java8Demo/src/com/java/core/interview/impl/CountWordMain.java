package com.java.core.interview.impl;

import java.io.IOException;
import java.util.Map;

public class CountWordMain {
	
	public static void main(String[] args) throws IOException {
		TextFileReader fileReader= new TextFileReader();
		String filePath="temp.txt";
		String firstWord="for";
		String secondWord="is";
		String thirdWord="he";
		Map<String, Integer> wordCountMap= fileReader.readFileAndCountGivenWord(filePath, firstWord, secondWord, thirdWord);
		System.out.println(" Word Count---"+wordCountMap);
	}

}
