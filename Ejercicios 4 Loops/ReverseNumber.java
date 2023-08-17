package loops_java;

public class ReverseNumber {
	public int reverseNumber(int number) {
		// TODO: Write your code here
		if (number < 0) {
			return -1;
		}

		if (number == 0) {
			return 0;
		}

		int reverseNumber = 0;
		while (number > 0) {
			int digit = number % 10;
			reverseNumber = reverseNumber * 10 + digit;
			number = number / 10;
		}
		return reverseNumber;
	}
}
