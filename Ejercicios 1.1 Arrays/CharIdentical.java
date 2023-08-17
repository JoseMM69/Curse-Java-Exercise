package introduccion_java_arrays;

public class CharIdentical {
	public boolean hasConsecutiveDuplicates(String str) {

		for (int i = 0; i < str.length() - 1; i++) {
			char currentCharacter = str.charAt(i);
			char nextCharacter = str.charAt(i + 1);
			if (currentCharacter == nextCharacter) {
				return true;
			}
		}
		return false;
	}
}
