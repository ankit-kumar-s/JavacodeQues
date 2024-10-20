package com.javaPractice.Code;

import java.util.Arrays;

public class FindAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean output = isAnagram("ankit", "itkna");
		System.out.println(output);

	}

	public static boolean isAnagram(String inputA, String inputB) {

		if (inputA.length() != inputB.length()) {
			return false;

		}

		// coverting string into charArray to check each letter in String
		
		char[] arrA = inputA.toCharArray();
		char[] arrB = inputB.toCharArray();
		Arrays.sort(arrA);
		Arrays.sort(arrB);
		int len = arrA.length;
		int startindex = 0;
		int endindex = 0;
		
		// the condition in while is for to traverse at the end of the last char i.e why we are using < and not <=
		
		while (startindex < len && endindex < len) {
			// traverse each word from starting index to end index also we are checking if
			// length is not equal then its not anAnagram
			if (arrA[startindex] != arrB[endindex]) {
				return false;
			}
			startindex++;
			endindex++;

		}

		return true;

	}

}
