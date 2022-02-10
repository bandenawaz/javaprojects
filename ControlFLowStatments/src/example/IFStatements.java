package example;

import java.util.Scanner;

public class IFStatements {

	public static void main(String[] args) {
		
		int num;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		if(num < 100) {
			System.out.println("Number is less than 100");
			
			if(num > 50 ) {
				System.out.println("Number is greater than 50");
			}else {
				System.out.println("Number is less than 50");
			}
		}else {
			System.out.println("Number is greater than 100");
		}
		
		System.out.println("I am printing from the outside if block");
	}

}
