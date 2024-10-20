package com.javaPractice.Code;

public class swapvaluewithinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word= "ignore";
		char[] cc =word.toCharArray();
		//Appraoch 1[Mine] 
		 String newName= " ";
		 newName = String.valueOf(cc[1]);
		 cc[1]=cc[2];
		 cc[2]= newName.charAt(0);
		 System.out.println(cc);
		 
		 //Appraoch 2
		 char temp=cc[1];
		 cc[1]=cc[2];
		 cc[2]=temp;
		 System.out.println(cc);
		 
}
}
