package JavaInterviePrograms;

public class FactorialNumber {

	//Approach_1-> Without Recursive -- Using Loop
	public int Factorial(int num) {
		int fact = 1;
		if (num == 0) {
			return 1;
		}
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact;
	}
	
	//Approach_2-> with Recursive Function-> Function calling itself is called recusrion 
	
	public static int factRec(int num) {
		if(num == 0)
			return 1;
		else
			return (num * factRec(num-1));
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactorialNumber ft = new FactorialNumber();
		System.out.println(ft.Factorial(4));
		System.out.println(factRec(3));
	}

}
