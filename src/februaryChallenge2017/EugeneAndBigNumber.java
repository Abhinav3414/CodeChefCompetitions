package februaryChallenge2017;

import java.util.Scanner;

public class EugeneAndBigNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int t = scan.nextInt();		

		for (int i = 0; i < t; i++) {
			long a = scan.nextInt(), n = scan.nextInt(), m = scan.nextInt();
			
			String sB="";
			
			for (int j = 0; j < n; j++)
				sB= sB+a;

			long val= Long.parseLong(sB);
			long finalVal= (val%m);
			
			System.out.println(finalVal);
		}
	}

}
