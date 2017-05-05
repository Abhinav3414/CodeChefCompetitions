package aprilLoCCompetitiveProgrammingMarathon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class HolmesAndAcademyAdmission {

	static void printSubsets(ArrayList<Integer> aList) {
		int n = aList.size();
		ArrayList<Integer> bList = null;
		int count = 0;

		for (int i = 0; i < (1 << n); i++) {
			bList = new ArrayList<>();
			for (int j = 0; j < n; j++) {
				if ((i & (1 << j)) > 0)
					bList.add(aList.get(j));
			}

			if (bList.size() == 0)
				;
			else if (bList.size() == 1)
				count++;
			else {
				Collections.sort(bList);
				int min = bList.get(0);
				int max = bList.get(bList.size() - 1);
				if (min == max)
					count++;
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			int t = scan.nextInt();
			ArrayList<Integer> aList = new ArrayList<>();
			for (int j = 0; j < t; j++) {
				aList.add(scan.nextInt());
			}
			printSubsets(aList);
		}

	}

}
