package introduccion_java_arrays;

public class DigitString {
	public int getRightmostDigit(String str) {

		if (str == null || str.equals("")) {
			return -1;
		}

		int length = str.length();

		for (int i = length - 1; i >= 0; i--) {
			char ch = str.charAt(i);

			if (Character.isDigit(ch)) {
				return Character.getNumericValue(ch);
			}
		}
		return -1;
	}
}
