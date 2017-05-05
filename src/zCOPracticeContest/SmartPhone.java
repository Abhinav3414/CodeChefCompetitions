package zCOPracticeContest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SmartPhone {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		ArrayList<Long> ns = new ArrayList<>();
		long i = 0;
		for (i = 0; i < n; i++) {
			ns.add(scan.nextLong());
		}

		long max = 0;
		Collections.sort(ns);

		for (long j = 0; j < n; j++) {
			max = max > (n - j) * ns.get((int) j) ? max : (n - j) * ns.get((int) j);
		}
		System.out.println(max);

	}

}
