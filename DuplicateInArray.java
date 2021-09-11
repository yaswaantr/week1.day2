package week1.day2.assignment;

public class DuplicateInArray {

	public static void main(String[] args) {
		int[] num = { 2, 4, 6, 8, 10, 12, 14, 2, 16, 18 };
		int count = 0;
		for (int i = 0; i < num.length;) {
			for (int j = 0; j < num.length; j++) {
				if (num[i] == num[j]) {
					count = count + 1;
					if (count > 1) {
						System.out.println("The duplicate number in the array is " + num[i] + " and the index position is " + j);
					}
				}
			}
			break;
		}
	}

}
