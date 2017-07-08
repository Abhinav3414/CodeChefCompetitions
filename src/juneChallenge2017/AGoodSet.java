package juneChallenge2017;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AGoodSet {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();

		for (int i = 0; i < t; i++) {
			int n = scan.nextInt();

			if (n == 1)
				System.out.println(1);
			else if (n == 2)
				System.out.println("1" + " 2");
			else {
				Set<Integer> mySet = new HashSet<Integer>();
				int index = 1;
				while (mySet.size() != n) {
					int setFlag = 0;

					for (Integer integer : mySet) {

						if (mySet.contains(index - integer)) {
							setFlag = 1;
							break;
						}
					}
					if (setFlag == 0)
						mySet.add(index);
					index++;
				}

				for (Integer integer : mySet) {
					System.out.print(integer + " ");
				}
				System.out.println();
				// System.out.println(mySet);

			}
		}
	}
}
