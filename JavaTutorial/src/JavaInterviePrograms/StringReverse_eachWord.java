package JavaInterviePrograms;

public class StringReverse_eachWord {

	public static void main(String[] args) {
		String s = "Vishal Raut";
		// String s= "neevaNnoitamotuAfoavaJmuineleS";
		String s1[] = s.split(" ");
		String Rev = "";
		String finalStr = "";

		for (String value : s1) {
			// System.out.println(value);
			for (int i = value.length() - 1; i >= 0; i--) {
				Rev = Rev + value.charAt(i);
			}
			//finalStr = finalStr + Rev;
		}
		System.out.println(Rev);
	}

}
