package JavaInterviePrograms;

import java.util.Arrays;

public class LargestSmallestNumInArray {

	public static void main(String[] args) {

		int num[] = { 10, 15, 20, 76, 0, 976 };
		int smallNum = num[0];
		int largeNum = num[0];

		for (int i = 1; i < num.length; i++) {
			if (num[i] > largeNum) {
				largeNum = num[i];
			} else if (num[i] < smallNum) {
				smallNum = num[i];
			}
		}
		System.out.println("Large Number-: " + largeNum + " Small Number-:" + smallNum);
		System.out.println("Array-:" + Arrays.toString(num));
	}

}
