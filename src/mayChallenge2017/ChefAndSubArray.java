package mayChallenge2017;

import java.util.Scanner;

public class ChefAndSubArray {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int k = scan.nextInt();
		int p = scan.nextInt();
		int a[] = new int[n];
		int countAllOne=0;

		for (int i = 0; i < n; i++)
		{
			a[i] = scan.nextInt();
			if(a[i]==1)
				countAllOne++;
		}
			

		scan.nextLine();
		String pStr = scan.nextLine();
		// ! --> shifts array
		// ? --> dog asks maximal
		int startIndex = 0;

		for (int j = 0; j < pStr.length(); j++) {
			char request = pStr.charAt(j);

			if(k<=n)
			{
				
			
			if (request == '?') {

				int tempIndex = startIndex;
				int m = tempIndex;
				int max = 0;
				for (int l = 0; l < n - (k - 1); l++) {
					int oneCount = 0;
				//	 System.out.println("m "+ m);
				//	System.out.println();
					int countMy = 0;
					while (countMy < k) {
						int myIndex = (m + countMy) % (n);
					//	 System.out.print(a[myIndex]);
						if (a[myIndex] == 1)
							oneCount++;
						countMy++;
					}
					if (oneCount > max)
						max = oneCount;
					if (m == n)
						m = 1;
					else
						m++;
				}
				//System.out.println();
				System.out.println(max);

			}
			if (request == '!') {
				if (startIndex == 0)
					startIndex = n - 1;
				else
					startIndex--;
			}

			}// if(k<=n) closes
			else
			{
				if (request == '?') 
				{
					System.out.println(countAllOne);
				}
			}
			
		} // for closes

	}

}
