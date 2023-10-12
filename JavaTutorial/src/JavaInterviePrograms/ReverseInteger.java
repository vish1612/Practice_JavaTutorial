package JavaInterviePrograms;

public class ReverseInteger {

	public static void main(String[] args) {
		
		long num = 123456789;
		long revNum = 0;
		
		//1.Using Loop
		while (num != 0) {
			revNum = revNum * 10 + num % 10;
			num = num / 10;
		}
		System.out.println(revNum);
		
		//2. Using StringBuffer
		int num1 = 12345;
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
	}

}
