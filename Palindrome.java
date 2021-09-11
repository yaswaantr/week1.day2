package week1.day2.assignment;

public class Palindrome {

	public static void main(String[] args) {
		int number = 1111;
		int temp = number;
		int q, r, sum = 0;
		while (number > 0) {
			q = number / 10;
			r = number % 10;
			number = q;
			sum = r + sum * 10;
			System.out.println(sum);
		}
		if (sum == temp) {
			System.out.println("It's palindrom");
		} else
			System.out.println("It's not palindrome");
	}

}
