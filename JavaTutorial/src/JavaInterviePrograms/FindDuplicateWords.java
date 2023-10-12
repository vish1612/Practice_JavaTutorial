package JavaInterviePrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateWords {

	public static void main(String[] args) {
		findDuplicateWord("Automation of Java is not Java and Java");
		findDuplicateWord("HI HI HI HI");
	}

	public static void findDuplicateWord(String inputString) {

		String words[] = inputString.split(" ");
		Map<String, Integer> wordcount = new HashMap<String, Integer>();

		for (String word : words) {
			if (wordcount.containsKey(word)) {
				wordcount.put(word, wordcount.get(word) + 1);
			} else {
				wordcount.put(word, 1);
			}
		}
		System.out.println(wordcount);

		//To Extract use Set
		Set<String> wordString = wordcount.keySet();

		for (String word : wordString) {
			if (wordcount.get(word) > 1) {
				System.out.println(word + " : " + wordcount.get(word));
			}
		}

	}

}
