package mayChallenge2017;

import java.util.Scanner;

public class ChefAndHisDailyRoutine {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		for (int i = 0; i < n; i++) {
			String str = scan.nextLine();
			int index1 = str.indexOf("SE");
			int index2 = str.indexOf("SC");
			int index3 = str.indexOf("EC");

			if (index1 != -1 || index2 != -1 || index3 != -1)
				System.out.println("no");
			else
				System.out.println("yes");
		}
	}

}
