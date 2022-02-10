package example;

public class RelationalOperator {

	public static void main(String[] args) {
	
		int n = 100;
		int m = 50;
		
		if(n == m) {
			System.out.println("n and m are equal");
		}else {
			System.out.println("n and m are not equal");
		}

		//perform !=, <,>,<=,>=
		if(n != m) {
			System.out.println("n and m are not equal");
		}else {
			System.out.println("n and m are  equal");
		}

		if(n > m) {
			System.out.println("n is greater than m");
		}else {
			System.out.println("n is less than m ");
		}

		if(n < m) {
			System.out.println("n is less than m");
		}else {
			System.out.println("n is greater than m");
		}

	}

}
