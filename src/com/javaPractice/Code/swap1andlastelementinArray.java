package com.javaPractice.Code;

import java.util.Arrays;

public class swap1andlastelementinArray {

	public static void main(String[] args) {
		
		int [] arr = {3,4,6,7,9};
		int len = arr.length;
		int temp =arr[1];
		arr[1] = arr[len-1];
		arr[len-1]=temp;
		System.out.println(Arrays.toString(arr));
		swap();

	}
	
	public static void swap() {
		int [] arr = {3,4,6,7,9};
		int len = arr.length;
		for(int i=0;i<len-1;i++) {
			int temp = arr[i];
			   arr[i]= arr[i+1];
			   arr[i+1] = temp;
			}
		System.out.println(arr);
		
	}

}
