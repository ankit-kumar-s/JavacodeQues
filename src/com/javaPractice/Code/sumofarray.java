package com.javaPractice.Code;

public class sumofarray {
	
	
	public static void sumarray() {
		int [] number = {1,1,2,5,6};
		int res =0;
		for(int i=0;i<=number.length-1;i++) {
			res = res+number[i];
			}
		System.out.println(res);

	}
	
	public static void sumofeven(int [] number) {
		
		int res=0;
		for(int i =0 ; i<=number.length-1;i++) {
			if(number[i]%2==0) {
				res=res+number[i];
			}
		}
		System.out.println(res);
	}

	public static void main(String[] args) {
		sumarray();
		int num[] = {4,2,8,1,5,7,0};
		sumofeven(num);
	
}
}
