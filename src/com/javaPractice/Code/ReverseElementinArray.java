package com.javaPractice.Code;

public class ReverseElementinArray {

	public static void main(String[] args) {
		
		int [] arr= {5,1,2,3,4};
		int len = arr.length;
		for(int i=len-1;i>=0;i--) {
			
			System.out.println(arr[i] +" ");
			
		}
		
		Stringg() ;
		

	}
	
	public static void Stringg() {
		
		String [] ss = {"ankit" , "singh" , "kumar"};
		String revword = " ";
		 for(String s : ss) {
			 String rev = " ";
			 for(int i = s.length()-1 ; i>=0;i--) {
				 rev = rev + s.charAt(i);
			 }
			 revword = revword + rev + " ";
		 }
		 System.out.println(revword.trim());
		 
	}

}
