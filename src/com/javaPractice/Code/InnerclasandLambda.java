package com.javaPractice.Code;

public class InnerclasandLambda {
	
	String name;
	int eno;
	
	public InnerclasandLambda(String name,int en) {
		this.name=name;
		this.eno=en;
	}
	
	  public String toString() { return name +": " + eno; }
	 

	public static void main(String[] args) {
		InnerclasandLambda il=new InnerclasandLambda("ankit",100);
		/*we can replace the below two lin of code with toStringmetod
		System.out.println(il.name);
		System.out.println(il.eno); */
		System.out.println(il);

	}

}
