package com.java.core.interview.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class TextFileReader {

	public Map<String, Integer> readFileAndCountGivenWord(String filePath, final String firstWord,
			final String secondWord, final String thirdWord) throws IOException {

		FileReader fileReader;
		BufferedReader bufferReader = null;
		try {
			fileReader = new FileReader(filePath);
			bufferReader = new BufferedReader(fileReader);
			return this.countWord(bufferReader, firstWord, secondWord, thirdWord);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (bufferReader != null) {
				bufferReader.close();
			}
		}
		return null;

	}

	private Map<String, Integer> countWord(final BufferedReader bufferReader, final String forWord, final String isWord,
			final String heWord) throws IOException {

		String readLine = "";
		Map<String, Integer> wordCountMap = new HashMap<>();
		while ((readLine = bufferReader.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(readLine, " ");
			while (st.hasMoreTokens()) {
				String word = st.nextToken();
				if (forWord.equalsIgnoreCase(word) || isWord.equalsIgnoreCase(word)
						|| heWord.equalsIgnoreCase(word)) {
					if (wordCountMap.containsKey(word)) {
						wordCountMap.put(word, wordCountMap.get(word) + 1);
					} else {
						wordCountMap.put(word, 1);
					}
				}

			}
		}
		return wordCountMap;
	}

}
