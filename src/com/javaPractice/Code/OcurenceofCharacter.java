package com.javaPractice.Code;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class OcurenceofCharacter {
	
	
	public static void occuchar(String occ) {
		
		String newocc= occ.replaceAll("[, ]", "").toLowerCase();
		    char[] newoc  = newocc.toCharArray();
		    Map<Character , Integer> mp = new HashMap<Character , Integer>();
		    for(char c : newoc) {
		    	if(mp.containsKey(c)) {
		    		mp.put(c, mp.get(c)+1);
		    	}
		    	else {
		    		mp.put(c, 1);
		    	}
		    }
		    System.out.println(mp);
		    
		    for(Entry e : mp.entrySet()) {
		    	
		    	System.out.println(e.getKey() + " " + e.getValue());
		    	
		    }
		
	}

	public static void main(String[] args) {
	
		String occ= "Hello,how are you uoi";
		occuchar(occ);
		

	}

}
