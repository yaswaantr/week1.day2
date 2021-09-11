package week1.day2.assignment;

public class ArmStrongNumber {

	public static void main(String[] args) {
		int number = 407;
		int n = number;
		int quotient, remainder, sum = 0;
		while (number > 0) {
			quotient = number / 10;
			remainder = number % 10;
			number = quotient;
			sum = sum + remainder * remainder * remainder;
			System.out.println(sum);
		}
		if (n == sum) {
			System.out.println("The given number " + n + " is armstrong number");
		} else {
			System.out.println("The given number " + n + " is not armstrong number");
		}

	}

}
