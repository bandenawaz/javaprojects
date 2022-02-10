package example;

public class BreakStatement {

	public static void main(String[] args) {
		
		/*
		 * int num = 0; while(num <= 100) {
		 * System.out.println("The value of the variable is :"+num);
		 * 
		 * if(num==10) {
		 * 
		 * break; } num++; } System.out.println("I am outside the while loop");
		 */
		
		//Using switch
		
		int n = 3;
		
		switch (n) {
		case 1:
			System.out.println("I am first case");
			
			break;
			
		case 2:
			System.out.println("I am second case");
			
			break;
			
		case 3:
			System.out.println("I am third case");
			
			break;

		default:
			System.out.println("I am default case");
			break;
		}
		
	}

}
