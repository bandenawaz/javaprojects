package garbagedemo;

public class GarbageExample {

	public static void main(String[] args) {
		
		/*
		 * Here we are intentionally assigning a null value
		 * to a reference so that the object becomes non 
		 * reachable
		*/
		
		GarbageExample gbj = new GarbageExample();
		gbj = null;
		//System.out.println(gbj);
		
		/*
		 * * Here we are intentionally assigning reference a to 
		 *  another reference b  so to make  the object referenced  
		 * by b unusable
		*/
		
		GarbageExample a = new GarbageExample();
		GarbageExample b = new GarbageExample();
		b = a;
		System.gc();
		}
	
	protected void finalize() throws Throwable{
		
		System.out.println("Garbage collection is performed by JVM");
		
	}

}
