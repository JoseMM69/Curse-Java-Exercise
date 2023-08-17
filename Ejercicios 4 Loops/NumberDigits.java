package loops_java;

public class NumberDigits {
	public int getNumberOfDigits(int number) {
		if (number < 0) {
			return -1;
		}
		if (number == 0) {
			return 1;
		}
		int ndigit = 0;
		while (number > 0) {
			number = number / 10;
			ndigit++;
		}
		return ndigit;
	}
}
