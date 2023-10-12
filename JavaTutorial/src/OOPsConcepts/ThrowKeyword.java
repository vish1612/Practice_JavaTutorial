package OOPsConcepts;

public class ThrowKeyword {
	public static void main(String[] args) {
	
		ThrowKeyword tk = new ThrowKeyword();
		tk.customException();
	}
	public void customException()
	{int m=10;
		if(m>0) {
		try
		{
			throw new Exception("Executed Custome Exception");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}}
		
		System.out.println("Test Executed");
	}


}