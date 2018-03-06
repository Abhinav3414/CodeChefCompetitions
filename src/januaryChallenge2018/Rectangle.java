package januaryChallenge2018;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();

		for (int i = 0; i < t; i++) {
			int side = 0;
			Map<Integer, Integer> rectangleSide = new HashMap<Integer, Integer>();

			boolean invalid = false;

			for (int j = 0; j < 4; j++) {
				side = scan.nextInt();
				if (side <= 0) {
					invalid = true;
					break;
				}
				if (rectangleSide.containsKey(side)) {
					int val = rectangleSide.get(side);
					rectangleSide.put(side, ++val);
				} else {
					rectangleSide.put(side, 1);
				}

			}

			if (rectangleSide.size() == 1) {
				System.out.println("YES");
			} else if (rectangleSide.size() == 2) {
				if (invalid == true) {
					System.out.println("NO");
				} else {
					boolean flag = true;
					for (Entry<Integer, Integer> entry : rectangleSide.entrySet()) {
						if (entry.getValue() != 2)
							flag = false;
					}

					if (flag == true)
						System.out.println("YES");
					else
						System.out.println("NO");
				}
			} else {
				System.out.println("NO");
			}

		}

	}

}
