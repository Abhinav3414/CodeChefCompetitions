package mayChallenge2017;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MedianOfAdjacentMaximumNumbers {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int t = scan.nextInt();

		for (int i = 0; i < t; i++) {
			int n = scan.nextInt();
			ArrayList<Integer> aList = new ArrayList<>();
			ArrayList<Integer> bList = new ArrayList<>();

			for (int j = 0; j < n * 2; j++) {
				int input = scan.nextInt();
				aList.add(input);
				bList.add(input);
			}

			Collections.sort(bList);
			Collections.sort(aList);
			Collections.reverse(aList);

			System.out.println(aList.get(n / 2));

			for (int k = 0; k < aList.size() / 2; k++)
				System.out.print(bList.get(k) + " " + aList.get(k) + " ");

		}

	}
}