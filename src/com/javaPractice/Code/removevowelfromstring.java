package com.javaPractice.Code;

public class removevowelfromstring {

	public static void main(String[] args) {
		 String s = "kjgjdhaeiklonbhgu";
	        String vow = "aeiouAEIOU";
	        String res= " "; 
	        for(char c : s.toCharArray()){
	            if(vow.indexOf(c)==-1){
	                res = res + c;
	            }
	        }
	        System.out.print(res);
	}

}
