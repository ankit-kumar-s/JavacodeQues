package pattern;

import java.util.HashSet;
import java.util.Set;

public class Hollow_rectangle {

	public static void main(String[] args) {
		int n=4;
		int m=5;
		
		
		  for(int i=1;i<=n;i++) {
			  for(int j=1;j<=m;j++) { 
				  if(i==1||i==n||j==1||j==m) {
		  System.out.print("*");
		  
		  }else System.out.print(" ");
		  
		  } System.out.println(" ");
		  
		  }
		 // num();
	}
	//15334
	//1,2,3,3,5,6,7
	
	public static void num() {
		int [] nu = {1,5,3,3,4};
	 Set<Integer> missi = new HashSet<Integer>();
	 HashSet<Integer> dup = new HashSet<Integer>();
	 for(int vlue : nu) {
		 if(!missi.add(vlue)) {
			 dup.add(vlue);
		 }
	 }
	 System.out.println(dup);
	

 		
		for(int i=1 ; i<=nu.length;i++) {
			if(!missi.contains(i)) {
				System.out.println(i);
			}
		}
	}
}
