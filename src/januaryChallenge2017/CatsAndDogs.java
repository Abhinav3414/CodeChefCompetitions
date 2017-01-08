package januaryChallenge2017;

import java.util.Scanner;

public class CatsAndDogs{

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();

		for (int i = 0; i < t; i++) {
			int c = scan.nextInt();
			int d = scan.nextInt();
			int l = scan.nextInt();
			boolean validCount=false;
			if (l % 4 == 0) {
				int cat_capacity = d * 2;
				int dog_legs = d*4;

				if (c <= d*2) {
				
					if (l >= dog_legs && l <= ((c * 4) + dog_legs))
						{//System.out.println("Hi");
						validCount=true;
						}

				} else {
					//System.out.println("ho");
					int left_cats = c - cat_capacity;
					if (l >= (dog_legs + (left_cats * 4)) && l <= (dog_legs + c*4))
						validCount=true;
				}

			}
			
			if(validCount==true)
				System.out.println("yes");
			else
				System.out.println("no");

		}

	}

}
