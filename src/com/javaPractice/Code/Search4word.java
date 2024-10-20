
package com.javaPractice.Code;

public class Search4word {

	public static void main(String[] args) {
		String shar = "Hello,howh are,  you!!";
		char cf = 'h';
		schar(shar, cf);
		//wordstring();
	}

	// find word in a give string

	public static void wordstring() {

		String sen = "Hi there how are you , How";
		String wordfin = "how";
		int count = 0;
		String[] ori = sen.split(" ");
		for (String f : ori) {
			if (wordfin.equalsIgnoreCase(f)) {
			
				count++;
			}
		}
		System.out.println(count);
	}

	// find special caracter form string

	static public void schar(String shar, char cf) {

		int count = 0;
		char[] c = shar.toLowerCase().toCharArray();
		for (char cc : c) {
			if (cc==cf) {
				count++;
			}
		}
		System.out.println(count);

	}

}
