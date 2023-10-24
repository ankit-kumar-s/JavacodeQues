package com.javaPractice.Code;

public class FindvowelfromString {

	public static void findvowel() {

		String s = "lkjhgfdi";
		boolean ss = s.toLowerCase().matches(".*[aeiou].*");
		if (ss == true) {
			System.out.println(s + " " + "Contain vowels");
		} else
			System.out.println(s + " " + "Don't contain vowels");

	}
	
	public static void removevowels() {
		String ori="ghbvnfhgaeitoEIOQlkhj";
		String vowel="aeiouAEIOU";
		String res=" ";
		  char [] chor=  ori.toCharArray();
		  for(char c : chor)
		if(vowel.indexOf(c)==-1) {
			res=res+c;
		}
		  System.out.println(res);
	}

	public static void main(String[] args) {
		findvowel();
		//removevowels();
	}

}
