package marchChallenge2017;

import java.util.Scanner;

public class XennyAndAlternatingTasks {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();

		for (int i = 0; i < t; i++) {

			int n = scan.nextInt();
			int oddPos = 0;
			int evenPos = 0;

			for (int k = 0; k < n; k++) {
				int input1 = scan.nextInt();
				if (k % 2 == 0)
					evenPos = evenPos + input1;
				else
					oddPos = oddPos + input1;
			}

			for (int j = 0; j < n; j++) {
				int input = scan.nextInt();
				if (j % 2 == 0)
					oddPos = oddPos + input;
				else
					evenPos = evenPos + input;
			}

			if (oddPos <= evenPos)
				System.out.println(oddPos);
			else
				System.out.println(evenPos);

		}

	}

}
