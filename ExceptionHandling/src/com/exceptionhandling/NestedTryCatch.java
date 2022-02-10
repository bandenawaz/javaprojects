package com.exceptionhandling;

public class NestedTryCatch {

	public static void main(String[] args) {
		//main try block
		
		try {
			//try block2
			//Statements for different exception
			try {
				//statement for number format exception
				//try block 3
				try {
					int arr[] = {1,2,3,4};
					/*
					 * I'm trying to display the value of an element
					 * which doesn't exist. The code should throw and exception
*/				
					System.out.println(arr[10]);
					}catch (ArithmeticException e) {
						System.out.println("ArithmeticException");
						System.out.println("Handled in try block 3");
					}
			}catch (ArithmeticException e2) {
				System.out.println("ArithmeticException");
				System.out.println("Handled in try block 2");
			}
		}catch (ArithmeticException e3) {
			System.out.println("ArithmeticException");
			System.out.println("Handled in main try block ");
			
		}catch (ArrayIndexOutOfBoundsException e4) {
			System.out.println("ArrayIndexOutOfBoundsException ");
			System.out.println("Handled in main try block ");
			
		}catch (Exception e5) {
			System.out.println("Exception ");
			System.out.println("Handled in main try block ");
		}
	}

}
