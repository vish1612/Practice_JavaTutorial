package JavaInterviePrograms;

public class StringPallindrome {

	public static void IsStringPallindrome(String name) {
		String rev = "";
		String s = name;

		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println("Reverse String= " + rev);
		if (rev.equalsIgnoreCase(s)) {
			System.out.println("Given String is Pallindrom");
		} else {
			System.out.println("Given String is not Pallindrom");
		}
	}

	public static void main(String[] args) {
		IsStringPallindrome("Vishal");
		IsStringPallindrome("Teet");
		IsStringPallindrome("Madam");

	}

}
