package com.javaPractice.Code;

class countNumberofDigits {
	
	
	public static void numberdigit() {
		
		int number = 55678879;
		int count=0;
		while(number!=0) {
			number /=10;
			count++;
		}
		System.out.println(count);
	}
	
	
	public static void sumofdigit() {
		
		int number = 56457;
		int sum=0;
		while(number!=0) {
			sum+=number%10;
			number/=10;
			
		}
		System.out.println(sum);
		
	}
	
	
	

	public static void main(String[] args) {
		numberdigit() ;
		sumofdigit();
	}

}
