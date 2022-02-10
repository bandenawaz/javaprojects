package example;

public class BitwiseOperator {

	public static void main(String[] args) {
		
		int a = 11; // 11 = 00001011
		int b = 22; // 22 = 00010110
		int res = 0;
		
		res = a & b;
		System.out.println("a & b :"+res);
		
		//Task: |,^,~,<<, >>

		res = a | b;
		System.out.println("a | b :"+res);
		
		res = ~a ;
		System.out.println("~a :"+res);
		
		res = a << 2; //00101100
		System.out.println("a << b :"+res);
		
		res = a >> 2;//00000010
		System.out.println("a >> b :"+res);
	}

}
