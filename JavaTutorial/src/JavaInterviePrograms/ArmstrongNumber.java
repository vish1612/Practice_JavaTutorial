package JavaInterviePrograms;

public class ArmstrongNumber {

	public static void IsNumberArmstrong(int num) {
		int temp = num;
		int sum = 0;
		int i = 0;
		int cube = 0;

		while (num > 0) {
			i = num % 10;
			num = num / 10;
			cube = cube + (i * i * i);
		}
		if (cube == temp) {
			System.out.println(temp + " is Armstrong Number");
		} else {
			System.out.println(temp + " is not a Armstrong Number");
		}

	}

	public static void main(String[] args) {
		IsNumberArmstrong(153);
	}

}
