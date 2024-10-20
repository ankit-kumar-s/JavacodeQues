package com.javaPractice.Code;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveduplicatefromArray {

	public static void main(String[] args) {
	  
		
		int [] arry = {1,5,7,8,9,3,4,6,7,8,9,10,11,23,11,9};
		Set<Integer> sets = new HashSet<>();
		Set<Integer> dups = new HashSet<>();
		/*
		 * for(Integer newarr : arry) { sets.add(newarr); }
		 * System.out.println(sets.size()); // String ss = sets.toString();
		 * System.out.println(sets);
		 */
      //find duplcate
      for(Integer dup : arry) {
    	  if(!sets.add(dup)) {
    		  dups.add(dup);
    	  }
      }
      System.out.println(dups);
      
	}

}
