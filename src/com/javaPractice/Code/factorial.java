package com.javaPractice.Code;

public class factorial {

	public static void main(String[] args) {
		 int n=5;
		 int f =1; 
//		 for(int i=1;i<=n;i++) {
//			 f=f*i;
//		 }
		 
		 for(int i=n; i>=1;i--) {
			 f=f*i;
			 
		 }
          System.out.println(f);
	}

}
