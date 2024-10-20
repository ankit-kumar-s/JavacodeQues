package com.javaPractice.Code;

import java.util.HashMap;
import java.util.Map;

public class DeepIntent_interviewquestion {

	public static void main(String[] args) {
		findKeyValue();
		findVowelOcc();
	}

	public static void findKeyValue() {

		Map<String, Integer> mp = new HashMap<>();
		mp.put("abcd", 1);

		Map<Character, Integer> mm = new HashMap<>();

		for (Map.Entry<String, Integer> m : mp.entrySet()) {

			String key = m.getKey();
			Integer value = m.getValue();

			for (char cc : key.toCharArray()) {

				mm.put(cc, value);

			}

		}
		System.out.println(mm);

	}
	
	public static void findVowelOcc() {
		
		String name = "ankit";
		Map<Character,Integer> mp = new HashMap<>();
		mp.put('a', 0);
		mp.put('e', 0);
		mp.put('i', 0);
		mp.put('o', 0);
		mp.put('u', 0);
		
		for(char cc :name.toCharArray()) {
			if(mp.containsKey(cc)) {
				mp.put(cc, mp.get(cc)+1);
			}

		}
		
		System.out.println(mp);
		
		
	}
}
