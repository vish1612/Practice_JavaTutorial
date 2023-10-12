package JavaInterviePrograms;

import java.util.stream.IntStream;

public class PrintNumWithoutLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("------1st Approach-----------");
		printNum(1);
		System.out.println("------2nd Approach-----------");
		printNumRange(1, 20);
		System.out.println("------3rd Approach Using Lambda Function-----------");
		IntStream.range(1, 11).forEach(e -> System.out.println(e));
	}

	// 1st Approach with recursive fun
	public static void printNum(int num) {
		if (num <= 20) {
			System.out.println(num);
			num++;
			printNum(num);
		}
	}

	// 2nd Approach
	public static void printNumRange(int startNum, int endNum) {
		if (startNum <= endNum) {
			System.out.println(startNum);
			startNum++;
			printNumRange(startNum, endNum);
		}
	}
}
