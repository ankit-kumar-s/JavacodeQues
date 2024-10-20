package com.javaPractice.Code;

public class ArmStrongnu {

	public static void main(String[] args) {
		
		isArmStrongNumber(121);

	}

	
	public static void isArmStrongNumber(int num) {
		int res=0;
		
      int copy = num;
      while(num>0) {
    	  
    	     int digit = num%10;
    	     num /=10;
    	     res+=(int) Math.pow(digit,3);
    	     
      }
      System.out.println(res==copy);
				
	}
}
