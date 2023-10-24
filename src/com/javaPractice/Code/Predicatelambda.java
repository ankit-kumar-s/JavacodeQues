package com.javaPractice.Code;

import java.util.function.Predicate;

public class Predicatelambda {

	public static void pre1() {

		// print even number and number > 40.
		int[] a = { 5, 6, 78, 65, 40, 25, 50, 80, 70, 90, 30 };

		/*
		 * without predicte lambda 
		 * for(in i=0;i<a.length-1;it++) { 
		 * if(a[i]%2==0 && a[i]>40) 
		 * { System.out.println(a[i]);
		 *  } 
		 * }
		 */
		// wi

		Predicate<Integer> p = i -> i % 2 == 0;
		Predicate<Integer> p1 = i -> i > 40;
		for (Integer n : a) {
			if (p.and(p1).test(n)) {
				System.out.println(n);
			}
		}

	}

	public static void main(String[] args) {

		pre1() ;

	}

}
