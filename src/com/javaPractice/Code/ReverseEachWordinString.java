package com.javaPractice.Code;

public class ReverseEachWordinString {

	public static void main(String[] args) {

		String origin = "Welcome to Java";
		String revWord = " ";
		
		String[] arrwords = origin.split(" ");
		for (String word : arrwords) {
			String rev = " ";

			for (int j = word.length() - 1; j >= 0; j--) {
				rev = rev + word.charAt(j);
			}
			revWord = revWord + rev + " ";
		}
		
		StringBuilder sb = new StringBuilder(origin).reverse();
		String newString = sb.toString();
		System.out.println(newString);
		System.out.println(revWord.trim());
		
		//Reverse word 
		
		String newrev= " ";
		String[] split = origin.split(" ");
         for(int i= split.length-1;i>=0;i--) {
        	 newrev= newrev+split[i] + " ";
		}
        System.out.println(newrev.trim());
	}

}
