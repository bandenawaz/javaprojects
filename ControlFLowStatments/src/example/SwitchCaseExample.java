package example;

public class SwitchCaseExample {

	public static void main(String[] args) {
		
		/*
		 * int num = 2;
		 * 
		 * switch (num + 2) { case 1: System.out.println("Case 1: Value is :"+num);
		 * 
		 * break; case 2: System.out.println("Case 2: Value is :"+num);
		 * 
		 * break;
		 * 
		 * case 3: System.out.println("Case 3: Value is :"+num);
		 * 
		 * break;
		 * 
		 * default: System.out.println("Default Case: Value is :"+num); break; }
		 */
		
		char ch = 'b';
		switch (ch) {
		
		case 'd':
			System.out.println("Its a D");
			
			break;
			
		case 'b':
			System.out.println("Its a B");
			
			break;
			
		case 'e':
			System.out.println("Its a E");
			
			break;

		default:
			System.out.println("It doesn't match the criteria");
			break;
		}

	}

}
