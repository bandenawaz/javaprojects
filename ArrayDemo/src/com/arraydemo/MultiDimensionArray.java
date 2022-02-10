package com.arraydemo;

public class MultiDimensionArray {

	public static void main(String[] args) {
		
		int arr[][] = {{2,7,9},{36,3,1},{25,35,15}};
		
		//Lets print the 2D array
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j<3; j++) {
				System.out.print(arr[i][j] + " ");
			
			}
			System.out.println();
		}
	}

}
