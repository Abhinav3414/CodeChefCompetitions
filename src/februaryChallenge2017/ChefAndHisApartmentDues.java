package februaryChallenge2017;

import java.util.Scanner;

public class ChefAndHisApartmentDues {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int t = scan.nextInt();

		for (int i = 0; i < t; i++) {
			int n = scan.nextInt();
			int a[] = new int[n];

			for (int j = 0; j < n; j++)
				a[j] = scan.nextInt();

			int flag = 0, flaggedIndex = 0;

			for (int j = 0; j < n; j++) {
				if (a[j] == 0) {
					flag = 1;
					flaggedIndex = j;
					break;
				}
			}
			if (flag == 1) {
				int oneCount = 0;
				int count = 0;
				for (int k = flaggedIndex; k < n; k++) {
					if (a[k] == 1)
						oneCount++;

					count++;
				}

				int finalDue = (count * 1100) - (oneCount * 1000);
				System.out.println(finalDue);
			} else
				System.out.println(0);

		}
	}

}
