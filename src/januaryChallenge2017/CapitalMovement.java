package januaryChallenge2017;

import java.util.Scanner;

public class CapitalMovement {
	
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		int t=scan.nextInt();
			
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int p[]=new int[n];
			for(int j=0;j<n;j++)
				p[j]=scan.nextInt();
			int qq[]=p;
			
			int dArr[][]=new int [n][n];
			
			for(int in=0;in<n;in++)
				for(int on=0;on<n;on++)
				{
					if(in==on)
						dArr[in][on]=-1;
					else
						dArr[in][on]=-2;
				}
			
			for(int k=0;k<n-1;k++)
			{
				int a=scan.nextInt();
				int b=scan.nextInt();
				
				dArr[a-1][b-1]=0;
				dArr[b-1][a-1]=0;
				
			} // all inputs taken till here
			
			/*for(int in=0;in<n;in++)
			{
				System.out.println();
				for(int on=0;on<n;on++)
					System.out.print(dArr[in][on]+" ");
			}
			*/
			
			// now traverse 2d arr
			 
			 for(int h=0;h<n;h++)
			 {
				 int max=-1, maxIndex=-1;
					int tempS[]=qq;
	
					for(int gg=0;gg<n;gg++)
					{
						
						if(dArr[h][gg]==-2)
						{
							if(tempS[gg]>max)
							{
								max=tempS[gg]; 
								maxIndex=gg+1;
							}
							
						}
					}
					
					System.out.print(maxIndex+" ");
							 
			 }
			
			
		}
		
		
	}

}
/*

1
6
5 10 15 20 25 30
1 3
2 3
3 4
4 5
4 6

*/