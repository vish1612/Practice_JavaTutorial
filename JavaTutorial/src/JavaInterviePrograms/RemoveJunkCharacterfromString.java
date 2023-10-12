package JavaInterviePrograms;

public class RemoveJunkCharacterfromString {

	public static void main(String[] args) {
		
		//To Remove Junk Character Use ReplaceAll with Regular Exception
		String s = "&&@!^# N#$ew Automa&09877*@#*tion )*@#(";
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
				
	}

}
