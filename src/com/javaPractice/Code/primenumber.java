package com.javaPractice.Code;

public class primenumber {

	public static void main(String[] args) {

		int n = 5;
		int count = 0;

		if (n > 1) {

			for (int i = 1; i <= n; i++) {
				if (n % i== 0)
					count++;
			}
			if(count==2) {
				System.out.println("Prime number");
			}
			else {
				System.out.println("Not prime");
			}

		}

	}

}
