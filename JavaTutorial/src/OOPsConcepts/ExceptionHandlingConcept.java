package OOPsConcepts;

public class ExceptionHandlingConcept {

	public static void main(String[] args) {
		
		
		try
		{
			int i = 9/0;
			System.out.println(i);
		}catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("Test Executed Successfully");
		
		
	}

}
