package introduccion_java_arrays;

public class LongestWord {
	public String findLongestWord(String sentence) {

		if (sentence == null || sentence.equals("")) {
			return "";
		}

		String[] words = sentence.split(" ");

		int maxLength = 0;
		String longestWord = "";

		for (String word : words) {
			if (word.length() > maxLength) {
				maxLength = word.length();
				longestWord = word;
			}
		}
		return longestWord;
	}
}
