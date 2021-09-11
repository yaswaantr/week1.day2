package week1.day2.assignment;

public class Intersection {

	public static void main(String[] args) {
		int[] num1 = { 3, 5, 7, 9, 11, 13, 20 };
		int[] num2 = { 12, 14, 16, 18, 20 };
		for (int i = 0; i < num1.length; i++) {
			// System.out.println(i);
			for (int j = 0; j < num2.length; j++) {
				// System.out.println(j);
				if (num1[i] == num2[j]) {
					System.out.println("The first occurence of intersecion is " + num1[i]);
				}
			}
		}
	}

}
