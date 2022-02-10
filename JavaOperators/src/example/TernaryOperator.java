package example;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		
		/*
		 * I will use Scanner, which is used to get the user input.
		 * The nextLine() method of Scanner class reads the integer
		 * entered by the user 
		 */
		
		int a, b, c, res, tmp;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		a = sc.nextInt();
		
		System.out.println("Enter the second number");
		b = sc.nextInt();
		
		System.out.println("Enter the third number");
		c = sc.nextInt();
		
		sc.close();
		
		tmp = a > b ? a : b;
		res = c > tmp ? c : tmp;
		
		System.out.println("Largest among three numbers is "+res);
		

	}

}
