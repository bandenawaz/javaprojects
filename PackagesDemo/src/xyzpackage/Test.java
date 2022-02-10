package xyzpackage;

/*
 * We are importing the abc package but still we will get error
 * because the class we are trying to use has default access modifier
*/
import abcpackage.*;

public class Test extends Addition{

	public static void main(String[] args) {

		/*
		 * Addition ad = new Addition();
		 * 
		 * 
		 * It will throw error because we are trying to access the default method in
		 * another package
		 * 
		 * System.out.println(ad.addTwoNumbers(10,21));
		 */
		
		Test test = new Test();
		System.out.println(test.addTwoNumbers(11,22));
	}

}
