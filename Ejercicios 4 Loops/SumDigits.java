package loops_java;

public class SumDigits {
	public int getSumOfDigits(int number) {
		// Write your code here
		if (number < 0) {
			return -1;
		}
		if (number == 0) {
			return 0;
		}
		int sumdigits = 0;
		while (number > 0) {
			int digit = number % 10;
			sumdigits += digit;
			number = number / 10;
		}
		return sumdigits;
	}
}
