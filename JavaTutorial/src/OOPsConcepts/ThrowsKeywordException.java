package OOPsConcepts;

public class ThrowsKeywordException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsKeywordException ts = new ThrowsKeywordException();
		ts.dis();
		System.out.println("Test Executed");
	}
	public void dis()
	{
		try{
			arith();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void arith() throws ArithmeticException {
		int m = 23/0;
		System.out.println(m);
	}

}
