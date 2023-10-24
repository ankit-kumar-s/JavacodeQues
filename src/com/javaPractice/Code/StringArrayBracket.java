package com.javaPractice.Code;

public class StringArrayBracket {

	public static void main(String[] args) {
		
		String brac[] = {"(",")","(","(",")"};
		 int len=brac.length;
		 int open=0;
		 int close=0;
		 for(int i =0;i<=len-1;i++) {
			 if(brac[i]=="(") {
				 open++;
			 }
			 else
				 close++;
		 }
		 System.out.println("open count :"+ open+" " + "close count:"+ close);

	}

}
