package com.javaPractice.Code;

public class totalnoofCharainString {

	public static void main(String[] args) {
		String s = "12The best of both worlds?234";

		String ss = s.replaceAll("[^a-zA-z]", "");
		int count = 0;
		char[] cc = ss.toCharArray();
		for (char c : cc) {
			count++;
		}
		System.out.println("The number of character  in the given string is " + count);
		
		//print only string 
		String [] spli = ss.split(" ");
		for(String s1 : spli) {
			System.out.println(s1 + " ");
		}
	}

}
