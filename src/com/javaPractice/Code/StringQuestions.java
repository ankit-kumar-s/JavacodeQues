package com.javaPractice.Code;

public class StringQuestions {

	public static void Stringcurly() {

		int opencout = 0;
		int closecount = 0;
		String curly = "(,),),(,(,),(,),)";
		String newcurly=curly.replaceAll(",", "");
		char[] newcur = newcurly.toCharArray();
		int len = newcur.length;
		for (int i = 0; i <= len - 1; i++) {
			if (newcur[i] == '(') {
				opencout++;
			} else {
				closecount++;
			}

		}
		System.out.println("Open bracket:" + opencout);
		System.out.println("Close bracket:" + closecount);
	}

	public static void main(String[] args) {
		 Stringcurly() ;

	}

}
