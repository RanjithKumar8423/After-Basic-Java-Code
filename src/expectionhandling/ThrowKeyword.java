package expectionhandling;

public class ThrowKeyword {

	public static void main(String[] args) {
	
		
		int num=0;
		 try {
			 if (num==0) {
				 throw new Exception("number should not be ZERO ");
			}
		 }
		 catch (Exception e) {
			 e.printStackTrace();
			 System.out.println(e.getMessage());
			 
			
		}
		
	}

}
