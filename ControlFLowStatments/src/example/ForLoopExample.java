package example;

public class ForLoopExample {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			System.out.println("The value is :"+i);
		}
		
		//Factorial of number
		
		//Fibonacci series 
		int count = 15, n1=0, n2=1;
		
		System.out.println("Fibonacci Series of "+count+" number:");
		
		for(int i = 1; i <= count; ++i) {
			System.out.println(n1+ " ");
			
			int tmp = n1 + n2;
			n1 = n2;
			n2 = tmp;
		}

	}

}
