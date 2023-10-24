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
		System.out.println(revWord.trim());
	}

}
