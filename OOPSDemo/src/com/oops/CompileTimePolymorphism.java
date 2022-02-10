package com.oops;

class Overload{
	
	void demo(int a) {
		
		System.out.println("a :"+a);
	}
	
	void demo(int a, int b) {
		
		System.out.println("a :"+a+ " b :"+b);
	}
	
	double demo(double a) {
	
	System.out.println("double a :"+a);
	return a * a;
}
}

public class CompileTimePolymorphism {

	public static void main(String[] args) {
		
		Overload ol = new Overload();
		double res;
		
		ol.demo(10);
		ol.demo(10, 20);
		res = ol.demo(5.5);
		
		System.out.println("O/P :"+res);

	}

}
