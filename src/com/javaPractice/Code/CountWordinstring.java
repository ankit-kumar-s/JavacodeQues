package com.javaPractice.Code;

public class CountWordinstring {
	
	public static void countString() {
		
	
		String st = "Ankit Singh kumar";
	    System.out.println(st.length());
	}
	
	//Appracoh1
	public static void countword() {
		int count = 0;
		String s= "Hi welcome to code";
		 String couword[] = s.split(" ");
		 for(String word : couword) {
			   count++;
		 }
		 System.out.println(count);
	}
	
	//Appraoch2
	
	public static void countwor() {
		String origin = "Welcome to code java ankit";
		int count =1;
		for(int i=0 ; i<origin.length()-1;i++) {
			if(origin.charAt(i)==' ' && origin.charAt(i+1)!= ' ') {
				 count++;
			}
		}
		System.out.println(count);
		
	}

	public static void main(String[] args) {
		//countString();
		//countword();
		countwor();

	}

}
