package PyramidStarPatternProgram;

public class AlphabetPattern_03 {

	public static void main(String[] args) {
		
		int alpha = 65; 	//For Capital A asci value is 65 and for small 'a' it is 97
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print((char)(alpha+j) +" ");
			}
			System.out.println();
		}
		
		System.out.println("----------For small Letters");
		int aplhabet = 97; 	//For Capital A asci value is 65 and for small 'a' it is 97
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print((char)(aplhabet+j) +" ");
			}
			System.out.println();
		}
	}

}
