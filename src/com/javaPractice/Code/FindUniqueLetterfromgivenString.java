package com.javaPractice.Code;

import java.util.HashMap;
import java.util.Map;

public class FindUniqueLetterfromgivenString {

	public static void main(String[] args) {
		String value = "Management";
		//findLetterwithoutMap(value);
		findLetterwithtMap(value);

	}
	
	public static void findLetterwithtMap(String input){
		
		Map<Character , Integer> mp = new HashMap<Character , Integer>();
		
		for(char cc : input.toLowerCase().toCharArray()) {
			
			//this code will store duplicate data with value
			mp.put(cc, mp.getOrDefault(cc, 0)+1);
		}
		
		//this code will print unique character
		for(Map.Entry<Character,Integer> me : mp.entrySet()) {
			if(me.getValue()==1) {
				System.out.print(me.getKey() + " ");
			}
		}
		
	}
	
	
		public static void findLetterwithoutMap(String input) {
		char[] cc = input.toLowerCase().toCharArray();
		for(int i=0;i<cc.length;i++) {
			boolean found= false; // this will give me the  unique character 
			for(int j=0;j<cc.length;j++) {
				//the below condition will check duplicate first and also the index of it as we want the duplicate character should be on different index
				if(cc[i]==cc[j] && i!=j) {
					
					found =true;
					break;
					
				}
			}
			//it will assign to false only if the character is unique
			if(found==false) {

				System.out.print(cc[i] + " ");
			}
		}
	}

}
