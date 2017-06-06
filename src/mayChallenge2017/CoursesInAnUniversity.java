package mayChallenge2017;

import java.util.Scanner;

public class CoursesInAnUniversity {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();

		for (int i = 0; i < t; i++) {
			int n = scan.nextInt();

			int max = 0;
			for (int j = 0; j < n; j++) {
				int input = scan.nextInt();

				if (input > max)
					max = input;
			}
			System.out.println(n - max);
		}

	}

}
