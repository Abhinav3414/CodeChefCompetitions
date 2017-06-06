package snackDownOnlineQualifier2017;

import java.util.Scanner;

public class SameSnake {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int t = scan.nextInt();
		for (int i = 0; i < t; i++) {

			int s1_Orientation = 0; // horizontal
			int s2_Orientation = 0; // horizontal

			int x11 = scan.nextInt();
			int y11 = scan.nextInt();

			int x12 = scan.nextInt();
			int y12 = scan.nextInt();

			if (y11 == y12)
				s1_Orientation = 1;

			int x21 = scan.nextInt();
			int y21 = scan.nextInt();

			int x22 = scan.nextInt();
			int y22 = scan.nextInt();

			if (y21 == y22)
				s2_Orientation = 1;

			if (s1_Orientation != s2_Orientation) {
				if ((x11 == x21 && y11 == y21) || (x11 == x22 && y11 == y22) || (x12 == x22 && y12 == y22) || (x12 == x21 && y12 == y21))
					System.out.println("yes");
				else
					System.out.println("no");
			} else {
				// if both are vertical
				if (s1_Orientation == 1 && s2_Orientation == 1) {
					int y1 = y11;
					int y2 = y21;
					if (y1 != y2) // if both snakes are not in one vertical line
						System.out.println("no");
					else {
						// System.out.println("ho");
						int snake1_min = 0;
						int snake1_max = 0;

						if (x11 < x12) {
							snake1_min = x11;
							snake1_max = x12;
						} else {
							snake1_min = x12;
							snake1_max = x11;

						}

						int snake2_min = 0;
						int snake2_max = 0;

						if (x21 < x22) {
							snake2_min = x21;
							snake2_max = x22;
						} else {
							snake2_min = x22;
							snake2_max = x21;
						}
						/*
						 * System.out.println("snake1_min" +snake1_min);
						 * System.out.println("snake1_max" +snake1_max);
						 * System.out.println("snake2_min" +snake2_min);
						 * System.out.println("snake2_max" +snake2_max);
						 * 
						 */ if (snake1_max < snake2_min)
							System.out.println("no");
						else if (snake1_min > snake2_max)
							System.out.println("no");
						else
							System.out.println("yes");

					}

				} else // if both are horizontal snakes
				{
					int x1 = x11;
					int x2 = x21;
					if (x1 != x2) // if both snakes are not in one horizontal
									// line
						System.out.println("no");
					else {
						// System.out.println("ho");
						int snake1_min = 0;
						int snake1_max = 0;

						if (y11 < y12) {
							snake1_min = y11;
							snake1_max = y12;
						} else {
							snake1_min = y12;
							snake1_max = y11;

						}

						int snake2_min = 0;
						int snake2_max = 0;

						if (y21 < y22) {
							snake2_min = y21;
							snake2_max = y22;
						} else {
							snake2_min = y22;
							snake2_max = y21;
						}

						/*
						 * System.out.println("snake1_min" +snake1_min);
						 * System.out.println("snake1_max" +snake1_max);
						 * System.out.println("snake2_min" +snake2_min);
						 * System.out.println("snake2_max" +snake2_max);
						 */

						if (snake1_max < snake2_min)
							System.out.println("no");
						else if (snake1_min > snake2_max)
							System.out.println("no");
						else
							System.out.println("yes");

					}

				} // else closes for both horizontal

			} // else closes for same orientation

		} // if loop for t test cases.

		
	} // main ends
	
} // class ends
