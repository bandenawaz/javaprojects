public class FirstProgram{
   
int a = 10;// Instance Variable
static int b = 20; //Static variable
   public static void main(String[] args){

	

	void add(){
	int c = a + b;  //c is local variable
	
	//System.out.println("Hello World");
	System.out.println(c);
	}
	if(a > 0){
	   System.out.println("Its a positive number");
	}else{
	   System.out.println("Its a Negative number");
	}
  }//end of main program
}//end of class