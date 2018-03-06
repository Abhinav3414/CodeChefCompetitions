package novemberChallenge2017;

import java.util.ArrayList;
import java.util.Scanner;

public class ChefGoesLeftRightLeft {
	public static void main(String[] args) {
		int no = 0;
		Scanner src = new Scanner(System.in);
		no = src.nextInt();
		int n = 0;
		long rating = 0, right_baricate = -1, left_baricate = -1, othrppl_rank = 0;
		ArrayList<Long> ppl_rank = new ArrayList<Long>();
		for (int i = 0; i < no; i++) {
			right_baricate = -1;
			left_baricate = -1;
			ppl_rank.clear();
			n = src.nextInt();
			rating = src.nextLong();
			for (int j = 0; j < n; j++)
				ppl_rank.add(src.nextLong());
			for (int j = 0; j < n; j++) {
				othrppl_rank = ppl_rank.get(j);

				if (rating < othrppl_rank) {
					// move left
					if (right_baricate == -1) {
						right_baricate = othrppl_rank;
						// System.out.println("Move left");
						continue;
					} else {
						if (othrppl_rank > right_baricate) {
							System.out.println("NO");
							break;
						} else if (right_baricate > othrppl_rank) {
							right_baricate = othrppl_rank;
							continue;
						}
					}
				} else if (rating > othrppl_rank) {

					// move right
					if (left_baricate == -1) {
						left_baricate = othrppl_rank;
						continue;
					} else {
						if (othrppl_rank < left_baricate) {
							System.out.println("NO");
							break;
						} else if (othrppl_rank > left_baricate) {
							left_baricate = othrppl_rank;
							continue;
						}
					}
				} else
					System.out.println("YES");
				break;
			}
		}
	}
}