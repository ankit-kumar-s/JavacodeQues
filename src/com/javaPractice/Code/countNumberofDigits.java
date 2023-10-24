package com.javaPractice.Code;

public class countNumberofDigits {
	
	
	public static void numberdigit() {
		
		int number = 5567887;
		int count=0;
		while(number!=0) {
			number = number/10;
			count++;
		}
		System.out.println(count);
	}
	
	
	public static void sumofdigit() {
		
		int number = 56457;
		int sum=0;
		while(number!=0) {
			sum=sum+number%10;
			number = number/10;
			
		}
		System.out.println(sum);
		
	}
	
	
	

	public static void main(String[] args) {
		numberdigit() ;
		//sumofdigit();
	}

}
