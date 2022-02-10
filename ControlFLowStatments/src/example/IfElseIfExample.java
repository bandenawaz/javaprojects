package example;

public class IfElseIfExample {

	public static void main(String[] args) {
		
		int x = 1234;
		if(x < 100 && x >= 1) {
			System.out.println("Its a Two digit number");
			
		}else if(x < 1000 && x >= 100) {
			System.out.println("Its a Three digit number");
			
		}else if(x < 10000 && x >= 1000) {
			System.out.println("Its a Four digit number");
		}else {
			System.out.println("Numer is out of range between 1 and 99999");
		}

	}

}
