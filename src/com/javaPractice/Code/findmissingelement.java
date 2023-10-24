package com.javaPractice.Code;

public class findmissingelement {

	public static void main(String[] args) {
		
		
		int[] a = {10,11,13,12,14,16};
		int sum = 0;
		for(int i=0;i<=a.length-1;i++) {
			
			sum=sum+a[i];
			
		}
		int sum1=0;
		
		for(int i=10;i<=16;i++) {
			sum1=sum1+i;
		}
		
		System.out.println("Missig number is :" + (sum1 - sum));

	}

}
