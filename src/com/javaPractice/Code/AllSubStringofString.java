package com.javaPractice.Code;

public class AllSubStringofString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		substring("abc");

	}
	
	public static void substring(String input) {
		int len = input.length();
		//stem.out.println(len);
		
		for(int startindex=0;startindex<len;startindex++) {
			for(int endindex=startindex+1;endindex<=len;endindex++) {
				System.out.println(input.substring(startindex,endindex));
			}
		}
	}

}
