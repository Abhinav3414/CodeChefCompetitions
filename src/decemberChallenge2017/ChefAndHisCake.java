package decemberChallenge2017;

import java.util.Scanner;

public class ChefAndHisCake {
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		int t=scan.nextInt();
		
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int m=scan.nextInt();
			scan.nextLine();
			
			char a[][]= new char [n][m];
			
			for(int j=0; j<n ; j++) {
				String str=scan.nextLine();
				a[j]=str.toCharArray();
			}
			
			//if column 'm' are even, then cost will always be same after starting from either red or green
			
			int rCount =0, gCount =0;
			int rRowCount[]= new int[n];
			int gRowCount[]= new int[n];
			
			for(int j=0; j<n ; j++)
			{

				rCount =0;
				gCount =0;
				char first=a[j][0];
				char second = (first=='R') ? 'G' : 'R';
			//	System.out.println("first "+ first + " second "+ second);
				
				for(int k=1; k<m;k++)
				{
					if(k%2!=0 && a[j][k]!=second)
					{
						if(second=='R')
							rCount++;
						else
							gCount++;
					}
					else if(k%2==0 && a[j][k]!=first)
					{
						if(first=='R')
							rCount++;
						else
							gCount++;
					}
				}
				
				rRowCount[j]=rCount;
				gRowCount[j]=gCount;
			}
			
			
			// reverse logic (i.e. count from back cost of R and G) 
			
			int rCountRev =0, gCountRev =0;
			int rRowCountRev[]= new int[n];
			int gRowCountRev[]= new int[n];
			
			for(int j=0; j<n ; j++) 
			{
				
				rCountRev =0;
				gCountRev =0;
				char last=a[j][m-1];
				char secondLast = (last=='R') ? 'G' : 'R';
			//	System.out.println("last "+ last + " secondLast "+ secondLast);
				
				for(int k=m-1; k>=0;k--)
				{
					if(k%2!=0 && a[j][k]!=secondLast)
					{
						if(secondLast=='R')
							rCountRev++;
						else
							gCountRev++;
					}
					else if(k%2==0 && a[j][k]!=last)
					{
						if(last=='R')
							rCountRev++;
						else
							gCountRev++;
					}
					
				}
				
				rRowCountRev[j]=rCountRev;
				gRowCountRev[j]=gCountRev;
			}
			
			int finalRCount=0;

			for(int g=0;g<n;g++)
			{
				finalRCount = (rRowCount[g]<=rRowCountRev[g]) ?  finalRCount + rRowCount[g] : finalRCount + rRowCountRev[g];
			}

			int finalGCount=0;
			
			for(int g=0;g<n;g++)
			{
				finalGCount = (gRowCount[g]<=gRowCountRev[g]) ?  finalGCount + gRowCount[g] : finalGCount + gRowCountRev[g];
			}
			
			
			System.out.println(finalRCount*3 + finalGCount*5);
			
		}
		
		
	}

}
