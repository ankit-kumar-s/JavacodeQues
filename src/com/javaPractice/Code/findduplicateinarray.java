package com.javaPractice.Code;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class findduplicateinarray {

	public static void main(String[] args) {

		int[] arr = { 1, 3, 4, 2, 5, 7, 2, 4 ,1};
		int duplicatecount = 0;

		for (int i = 0; i < arr.length - 1; i++) { // 7<7

			for (int j =i+ 1; j <= arr.length-1; j++) {  //7<7

				if (arr[i] == arr[j]) {
					System.out.println("Duplicate number are" + arr[j] );
				duplicatecount++;
				}
             }
			
		}

	//	dupset();

	}
	
	
	  public static void dupset() {
	  
	  int[] arr = { 1, 3, 4, 2, 5, 7, 2, 4 ,1};
	  
	  Map<Integer , Integer> mapd = new HashMap<>();
	  for(int i : arr) {
		  if(mapd.containsKey(i)) {
			  mapd.put(i, 1+1);		 
		  }
		  else {
			  mapd.put(i, 1);
		  }
	  }
	  
//	  for(Integer x : mapd.keySet()) {
//		  if(mapd.get(x)> 1) {
//			  System.out.println("Duplicate value are :" + x);
//		  }
//	  }
	  
	  for( Map.Entry  ent :mapd.entrySet()) {
		  System.out.println(ent.getKey() + " " + ent.getValue());
	  }
	  
	  }
	 

}
