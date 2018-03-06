package novemberChallenge2017;

import java.util.Scanner;

public class VillagesAndTribes {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		scan.nextLine();

		for (int i = 0; i < t; i++) {
			String s = scan.nextLine();
			char last = '*';
			int villageA = 0, villageB = 0, count = 0;

			for (int j = 0; j < s.length(); j++) {
				char present = s.charAt(j);

				if (present == 'A') {
					villageA++;
					if (last == 'A') {
						villageA = villageA + count;
						count = 0;
					} else if (last == 'B') {
						last = 'A';
						count = 0;
					} else {
						last = 'A';
						count = 0;
					}
				} 
				else if (present == 'B') {
					villageB++;
					if (last == 'B') {
						villageB = villageB + count;
						count = 0;
					} else if (last == 'A') {
						last = 'B';
						count = 0;
					} else {
						last = 'B';
						count = 0;
					}

				}
				else {
					count++;
				}
			}
			System.out.println(villageA + " " + villageB);
		}

	}
}