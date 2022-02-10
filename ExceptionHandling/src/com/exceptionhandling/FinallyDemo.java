package com.exceptionhandling;

public class FinallyDemo {

	public static void main(String[] args) {

		/*
		 * int num = 0; try {
		 * 
		 * //this statement will generate exception, have handled in the catch block num
		 * = 121/11; System.out.println(num);
		 * 
		 * }catch (ArithmeticException e) {
		 * 
		 * System.out.println("Number should not be divided by Zero"); }
		 * 
		 * Finally block will always execute even if there is no exception in try block
		 * 
		 * finally {
		 * 
		 * num = num + 10; System.out.println(num);
		 * 
		 * }
		 */
		System.out.println(FinallyDemo.myMethod());
		
		
	}
	
	public static int myMethod() {
		
		try {
			return 12;
		}
		finally {
			System.out.println("This is Finally block");
			System.out.println("This block executed even after the return statement");
		}
		
	}

}
