package com.javaPractice.Code;

public class FirstUpperLetterofString {

	public static void main(String[] args) {
		/*
		 * firstletter("ankit"); String arr="firstletter ankit"; String[]
		 * firstletterofArray1= arr.split(""); firstletterofArray(firstletterofArray1);
		 */	
	
	lastletterCap("ankit");
	}
	
	public static void firstletter(String input) {
		
		String res="";
		res=res+input.substring(0,1).toUpperCase()+input.substring(1).toLowerCase();
		System.out.println(res);
		
	}
	
public static void firstletterofArray(String[] input) {
	
		String res="";
		for(String firstletter : input) {
			//two Appraochs
		//	res=res+firstletter.substring(0,1).toUpperCase()+firstletter.substring(1).toLowerCase()+" ";
			res=res+firstletter.toUpperCase().charAt(0)+firstletter.substring(1).toLowerCase()+" ";
		}
		System.out.println(res);
		
		
	}

 public static void lastletterCap(String input) {
	 
	 String res = " ";
	 int len=input.length();
	 
	 res=res+input.substring(0,len-1).toLowerCase()+input.substring(len-1).toUpperCase()+" ";
	 
		System.out.println(res);
 }

}
