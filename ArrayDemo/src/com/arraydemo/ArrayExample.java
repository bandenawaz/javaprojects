package com.arraydemo;

//Problem Statement: Program to illustrate creating an array of integers. 
//Add some value in the array. print each value to the standard output

public class ArrayExample {

	public static void main(String[] args) {
		
		//declare an Array of integers
		int[] arr;
	
		
		//allocate memory for 5 integers
		arr = new int[5];
		
		// initinialize all the items individually
		arr[0] = 10;
		arr[1] = 6;
		arr[2] = 25;
		arr[3] = 85;
		arr[4] = 76;
		
		//using loop, print all the array items to the console
		for(int i = 0; i < arr.length; i++) {
			System.out.println("Element at index "+i +" : "+arr[i]);
		}

	}

}
