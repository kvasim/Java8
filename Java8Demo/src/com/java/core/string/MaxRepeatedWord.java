package com.java.core.string;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.StringTokenizer;

public class MaxRepeatedWord {

	 public Map<String,Integer> getWordsCount(String fileName){

	        FileInputStream fis;
	        DataInputStream dis;
	        BufferedReader br = null;
	        Map<String,Integer> wordMap = new HashMap<String,Integer>();
	        try {
	            fis = new FileInputStream(fileName);
	            dis = new DataInputStream(fis);
	            br = new BufferedReader(new InputStreamReader(dis));
	            String line;
	            while((line = br.readLine()) != null){
	                StringTokenizer st = new StringTokenizer(line, " ");
	                while(st.hasMoreTokens()){
	                    String tmp = st.nextToken().toLowerCase();
	                    if(wordMap.containsKey(tmp)){
	                        wordMap.put(tmp, wordMap.get(tmp)+1);
	                    } else {
	                        wordMap.put(tmp, 1);
	                    }
	                }
	            }
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally{
	            try {
	                if (br != null) {
	                    br.close();
	                }
	            } catch(Exception ex){

	            }
	        }
	        return wordMap;
	    }

	 public List<Entry<String, Integer>> sortByValue(Map<String, Integer> wordMap){
         
	        Set<Entry<String, Integer>> set = wordMap.entrySet();
	        List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
	        Collections.sort( list, (o1,  o2 )-> (o2.getValue()).compareTo( o1.getValue() )	);
	        return list;
	    }

	    public static void main(String a[]){
	        MaxRepeatedWord maxRepeatedWord = new MaxRepeatedWord();
	        Map<String,Integer> wordMap = maxRepeatedWord.getWordsCount("temp2.txt");
	        
	       List<Entry<String, Integer>> listMap=maxRepeatedWord.sortByValue(wordMap);
	       System.out.println(listMap);
	       System.out.println("Max repeated word is== " + listMap.get(0).getKey().toUpperCase() + " ==with count - " + listMap.get(0).getValue());
	    }
	}

