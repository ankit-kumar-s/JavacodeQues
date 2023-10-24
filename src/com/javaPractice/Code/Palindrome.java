
package com.javaPractice.Code;

public class Palindrome {

	public static void intnum(int num) {

		int dupl = num;
		int rev = 0;

		while (num != 0) {

			rev = rev * 10 + num % 10;
			num = num / 10;
		}

		if (dupl == rev) {
			System.out.println("the give int is palindrome");
		} else
			System.out.println("The given int is not palindrome");

	}
	
	
	public static void strings(String s) {
		String dup = s;
		String rev = "";
		int len =s.length();
		for(int i=len-1;i>=0;i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
		if(dup.equals(rev)) {
			System.out.println("the give string is palindrome");
		}
		else
			System.out.println("The given string is not palindrome");
		
		
		
	}

	public static void main(String[] args) {

		//intnum(717);
		strings("mom");
	}

}
