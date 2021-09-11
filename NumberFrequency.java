package week1.day2.assignment;

public class NumberFrequency {

	public static void main(String[] args) {
		int[] num = { 3, 4, 2, 5, 1, 2, 6, 3, 6, 2, 4, 7, 1 };
		int[] num1 = new int[num.length];
		int count = -1, frequency = 1;
		;
		for (int i = 0; i < num.length; i++) {
			if (num1[i] != -1) {
				for (int j = i + 1; j < num.length; j++) {
					if (num[i] == num[j]) {
						num1[j] = count;
						frequency++;
					}
				}
				num1[i] = frequency;
				frequency = 1;
			}
		}
		for (int i = 0; i < num1.length; i++) {
			if (num1[i] == -1) {
				continue;
			}
			System.out.println("The element " + num[i] + " occurred " + num1[i] + " times");
			;
		}

	}

}
