package java_generics;

public class WordReverser {
	public String reverseWordsInSentence(String sentence) {
		if (sentence == null) {
			return "INVALIDO";
		}

		if (sentence.equals("")) {
			return "";
		}

		StringBuilder reversedSentence = new StringBuilder();

		for (String word : sentence.split(" ")) {
			StringBuilder reversedWord = new StringBuilder(word).reverse();
			reversedSentence.append(reversedWord).append(" ");
		}

		return reversedSentence.toString().trim();
	}
}
