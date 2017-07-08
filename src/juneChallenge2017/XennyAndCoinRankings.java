package juneChallenge2017;

import java.util.Scanner;

public class XennyAndCoinRankings {
	
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		int t=scan.nextInt();
		
		for(int i=0;i<t;i++)
		{
			int u=scan.nextInt();
			int v=scan.nextInt();
			System.out.println((u+v)*(u+v+1)/2+u+1);
			/*int s=u+v;
			int ans = (s*(s+1))/2+u+1;
			System.out.println(ans);
			*/
			
		}
		
		
		
		
	}

}
