package com.java.core.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharactor {

	public static void main(String[] args) {
		DuplicateCharactor dcs = new DuplicateCharactor();
	        dcs.findDuplicateChars("Hello, this is java program to find out that duplicate character in string text");

	}

	public void findDuplicateChars(String str){
        
        Map<Character, Integer> dupMap = new HashMap<Character, Integer>(); 
        char[] chrs = str.toCharArray();
        for(Character ch:chrs){
            if(dupMap.containsKey(ch)){
                dupMap.put(ch, dupMap.get(ch)+1);
            } else {
                dupMap.put(ch, 1);
            }
        }
        Set<Character> keys = dupMap.keySet();
        for(Character ch:keys){
            if(dupMap.get(ch) > 1){
                System.out.println(ch+"--->"+dupMap.get(ch));
            }
        }
    }
}
