package week1.day2.assignment;

public class MissingElementsInArray {

	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 4, 6, 7, 8 };
		for (int i = 0; i <= num.length; i++) {
			if (num[i] != i + 1) {
				num[i] = num[i] - 1;
				System.out.println("The missign number in the array is " + num[i]);
				break;
			}
		}

	}

}
