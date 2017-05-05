package aprilChallenge2017;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class DishOfLife {

	public static boolean findAll(int k, TreeSet<Integer> set) {
		boolean flag = true;

		for (int i = 1; i <= k; i++) {
			if (!set.contains(i)) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	public static ArrayList<Integer> findAllAL(ArrayList<Integer> myList, ArrayList<Integer> list) {

		for (int i = 0; i < list.size(); i++) {
			if (myList.contains(list.get(i))) {
				myList.remove(list.get(i));
			}
		}

		return myList;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();

		for (int i = 0; i < t; i++) {
			int n = scan.nextInt();
			int k = scan.nextInt();
			int flagk = 0;

			TreeSet<Integer> set = new TreeSet<>();

			List<ArrayList> listOfN = new ArrayList<>();

			for (int j = 0; j < n; j++) {

				int p = scan.nextInt();
				List<Integer> listIsland = new ArrayList<>();

				for (int z = 0; z < p; z++) {
					int items = scan.nextInt();
					listIsland.add(items);
					set.add(items);
				}
				listOfN.add((ArrayList) listIsland);

			}

			if (findAll(k, set) == false)
				System.out.println("sad");
			else {
				ArrayList<Integer> myList = new ArrayList<>();
				for (int y = 1; y <= k; y++) {
					myList.add(y);
				}

				for (int l = 0; l < listOfN.size(); l++) {
					ArrayList<Integer> myListReturn = findAllAL(myList, listOfN.get(l));

					if (myListReturn.size() == 0 && l < listOfN.size() - 1) {
						System.out.println("some");
						break;
					} else if (myListReturn.size() == 0 && l == listOfN.size() - 1) {
						System.out.println("all");
						break;
					}
				}

			}
		}

	}
}
