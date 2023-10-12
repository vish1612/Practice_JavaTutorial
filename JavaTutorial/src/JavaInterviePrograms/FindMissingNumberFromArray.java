package JavaInterviePrograms;

public class FindMissingNumberFromArray {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 5, 6, 7, 8, 9, 10 };
		int actualSum = 0, expSum = 0;

		for (int i = 0; i < a.length; i++) {
			actualSum = actualSum + a[i];
		}
		System.out.println("Actual Sum is-: " + actualSum);

		for (int j = 1; j <= 10; j++) {
			expSum = expSum + j;
		}
		System.out.println("Exp Sum is-: " + expSum);

		System.out.println("Missing Element is-: " + (expSum - actualSum));
	}

}
