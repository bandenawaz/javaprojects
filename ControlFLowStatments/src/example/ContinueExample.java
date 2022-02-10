package example;

public class ContinueExample {

	public static void main(String[] args) {
		
		/*
		 * for (int i = 0; i<=6; i++) { if(i == 4) { continue; }
		 * 
		 * System.out.println(i); }
		 */
		
		//Using while loop
		int counter = 10;
		while(counter >= 0) {
			
			if(counter == 7) {
				counter--;
				continue;
			}
			
			System.out.println(counter + " ");
			counter--;
		}
	}

}
