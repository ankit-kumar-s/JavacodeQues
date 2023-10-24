package com.javaPractice.Code;


class base {
	public void m1(int a) {
		System.out.println("Hi the int value is " + a);
	}
	public void m2(double d) {
		System.out.println("The doblue is " + d);
	}
}

class devired extends base{
	public void m2(float f) {
		System.out.println("the float is " + f);
	}
}

public class Inhertianceconcept {

	public static void main(String[] args) {
		
		new devired().m1(10);;
	}

}
