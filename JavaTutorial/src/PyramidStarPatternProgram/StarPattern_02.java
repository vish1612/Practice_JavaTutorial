package PyramidStarPatternProgram;

public class StarPattern_02 {

	public static void main(String[] args) {
		int i, j, k;
		
		System.out.println("-------Normal Pattern");
		for (i = 0; i < 4; i++) {
			for (j = 4; j > i; j--) {
				System.out.print(" ");
			}
			for (k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("----Pyramid Pattern-----------");
		for (i = 0; i < 4; i++) {
			for (j = 4; j > i; j--) {
				System.out.print(" ");
			}
			for (k = 0; k <= i; k++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		
	}
}
