package com.exceptionhandling;

public class Example {

	public static void main(String[] args) {
		
		int  num2;
		String num1;
		
		try {
			/*
			 * We suspect that this block of statement can throw 
			 * exception so we handled it by placing these statements 
			 * inside try and handled the exception in catch block
			  
*/		
		num1 = "7";
		num2 = 35/Integer.parseInt(num1);
		
		System.out.println(num2);
		System.out.println("Hey I'am at the end of try block");
		}catch(ArithmeticException e) {
			/*
			 * This block will only execute if any Arithmetic exception 
			 * occured in try block
			*/		
			System.out.println("You should not divide a number by zero");
			
		}catch(Exception e) {
			System.out.println("Exception occured");
		}
		
		System.out.println("I am outside the blocks");
		//System.out.println(num2);

	}

}
