package com.exceptionhandling;

public class Example2 {

	public static void main(String[] args) {
	
		try {
			
			int[] a = new int[7];
			a[8] = 30/2;
			System.out.println("first print statement in try block");
			
		}catch (ArithmeticException e) {
			
			System.out.println("Warning: Arithmetic Exception");
			
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Warning: ArrayIndexOutOfBound Exception");

		}catch (Exception e) {
			System.out.println("Warning: Some Exception");

		}

	}

}
