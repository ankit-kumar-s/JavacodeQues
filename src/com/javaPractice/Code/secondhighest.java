package com.javaPractice.Code;

public class secondhighest {

	public static void main(String[] args) {
		
		
		int l = 0 ;
		int s=0;
		int t = 0;
		
		int [] a = {9,2,1,60,47,33};
		for(int i=0;i<a.length;i++) {
			if(a[i]>l) {
				s=l;
				l = a[i];
			}else if(a[i]>s){
				t=s;
				s=a[i];
			}else if(a[i]>t) {
				t=a[i];
			}
		}
		System.out.println(t);
		
	}

}
