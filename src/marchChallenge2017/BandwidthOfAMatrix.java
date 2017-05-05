package marchChallenge2017;

import java.util.Scanner;

public class BandwidthOfAMatrix {
	
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		int t=scan.nextInt();
		
		
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			
			int a[][]= new int[n][n];
			int allZero=0;
			int allOne=0;
			
			for(int j=0;j<n;j++)
			{
				for(int k=0;k<n;k++)
				{
					a[j][k]=scan.nextInt();
					if(a[j][k]==0)
						allZero++;
					if(a[j][k]==1)
						allOne++;
				}
			}

			if(allZero==n*n)
				System.out.println(0);
			if(allOne==n*n)
				System.out.println((n)-1);
			
			
		}
	}

}
