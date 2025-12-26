package expectionhandling;

public class TryCatchBlock {

	String name;
	public static void main(String[] args) {
	
		System.out.println("A");
		System.out.println("B");
		TryCatchBlock t1=new TryCatchBlock();
		t1=null;
		
		
		try {
			int i=9/8;
			t1.name="ranjith";
			
		} catch (ArithmeticException e) {
		System.out.println("ArithmeticException is there near 11 line");
		e.printStackTrace();
		}
		
		 catch (NullPointerException e) {
				System.out.println("NullPointer Exception is there near 14 line");
				e.printStackTrace();
				}
		
		System.out.println("bye");

		

	}

}
