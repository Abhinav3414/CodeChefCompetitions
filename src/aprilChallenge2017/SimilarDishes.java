package aprilChallenge2017;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class SimilarDishes {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		scan.nextLine();

		for (int i = 0; i < t; i++) {
			String line1 = scan.nextLine();
			String line2 = scan.nextLine();

			String line1Arr[] = line1.split(" ");
			String line2Arr[] = line2.split(" ");

			Map<String, Integer> line1Map = new TreeMap<>();

			for (String string : line1Arr) {
				line1Map.put(string, 1);
			}
			int counter = 0;

			for (String string2 : line2Arr) {
				if (line1Map.containsKey(string2)) {
					counter++;
				}
			}

			if (counter >= 2)
				System.out.println("similar");
			else
				System.out.println("dissimilar");

		}
	}

}
