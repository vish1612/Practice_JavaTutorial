package JavaInterviePrograms;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "Hello World";
		int len=s.length();
		System.out.println(len);
		
		//1. 1st way through Loop
		String rev="";
		for(int i=len-1;i>=0;i--)
		{
			rev= rev + s.charAt(i);
		}
		System.out.println("Reversed String is-: "+rev);
	
		//2. Through StringBuffer
		StringBuffer st = new StringBuffer(s);
		System.out.println(st.reverse());
	}

}
