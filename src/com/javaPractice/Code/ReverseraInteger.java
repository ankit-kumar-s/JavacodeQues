package com.javaPractice.Code;

public class ReverseraInteger {

	public static void main(String[] args) {
	
		int number = 123467;
		
		 
		  int newnum=0;
		  while(number!=0) { 
			  newnum= newnum*10 + number%10; //7 //764
			  number=number/10;
		  }
		   System.out.println(newnum);
		 
		
		
		//Appraoch 2  
		StringBuffer sbf ;
		StringBuffer sb = new StringBuffer(String.valueOf(number));
		sbf=sb.reverse();
		System.out.println(sbf);

	}

}
