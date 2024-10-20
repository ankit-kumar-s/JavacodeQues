package com.javaPractice.Code;

import java.util.HashSet;
import java.util.Set;

public class findmissingelement {

	public static void main(String[] args) {
		
		
		int[] a = {10,11,13,12,14,16,15,20};

		Set<Integer> ss = new HashSet<Integer>();
		for(int s : a) {
			ss.add(s);
		}
		
		for(int i=10;i<20;i++) {
			if(!ss.contains(i)) {
				System.out.println(i);
			}
		}
		

	}

}
