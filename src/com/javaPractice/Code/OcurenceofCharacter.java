package com.javaPractice.Code;

import java.util.HashMap;
import java.util.Map;

public class OcurenceofCharacter {
	
	
	public static void occuchar(String occ) {
		
		String newocc= occ.replaceAll("[, ]", "").toLowerCase();
		    char[] newoc  = newocc.toCharArray();
		    Map<Character , Integer> mp = new HashMap<Character , Integer>();
		    for(char c : newoc) {
		    	if(mp.containsKey(c)) {
		    		mp.put(c, 1+1);
		    	}
		    	else {
		    		mp.put(c, 1);
		    	}
		    }
		    System.out.println(mp);
		
	}

	public static void main(String[] args) {
	
		String occ= "Hello,how are you";
		occuchar(occ);
		

	}

}
