package marchChallenge2017;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class BearAndExtraNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int t = scan.nextInt();

		for (int i = 0; i < t; i++) {
			int n = scan.nextInt();
			Set<Integer> set = new TreeSet<>();
			int item = 0;
			int dupFlag = 0;

			for (int j = 0; j < n; j++) {
				int input = scan.nextInt();

				if (set.add(input) == false) {
					dupFlag = 1;
					item = input;
				}
			}
			if (dupFlag == 0) {
				List aList = new ArrayList(set);

				if ((int) aList.get(1) - (int) aList.get(0) != 1) {
					item = (int) aList.get(0);
				}
				if ((int) aList.get(n - 1) - (int) aList.get(n - 2) != 1) {
					item = (int) aList.get(n - 1);
				}
			}

			if (dupFlag == 1)
				System.out.println(item);
			else
				System.out.println(item);
		}
	}
}
