package com.javaPractice.Code;

public class ReverseaString {
	
	
	public static String rever(String word) {
		
		int len=word.length();
		String rev="";
		for(int i=len-1;i>=0;i--) {
			rev=rev+word.charAt(i);
		}
		return rev;
		
	}

	public static void main(String[] args) {
		
	String newword =rever("Ankit");
	System.out.println(newword);

	}

}
