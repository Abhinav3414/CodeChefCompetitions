package januaryChallenge2017;

import java.util.Scanner;

public class Reservior {
	
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		int t=scan.nextInt();
		
		for(int i=0;i<t;i++)
		{
			int row=scan.nextInt();
			int column=scan.nextInt();

			char a[][]= new char[row][column];
			
			scan.nextLine();
			
		for(int j=0;j<row;j++)
		{
			String lines = scan.nextLine();
			char pa[]=lines.toCharArray();
			int k=0;
			for (char cs : pa) {
				a[j][k]=cs;
				k++;
				}
				
		}
			
		/*	for(int j=0;j<row;j++)
			{
				for(int k=0;k<column;k++)
				{
					System.out.print(a[j][k]+ " ");
				}System.out.println();
			}
			*/

			int spill=0;
			int noWater=0;

			for(int j=0;j<row;j++)
			{
				if(spill==1)
					break;
				for(int k=0;k<column;k++)
				{
					int leftJ=0, leftK=0, rightJ=0, rightK=0, upJ=0, upK=0, downJ=0, downK=0;
					
					if(k==0)
					{
						leftJ=-1; leftK=-1;
					}
					else
					{
						leftJ=j; leftK=k-1;
					}
					if(j==0)
					{
						upJ=-1; upK=-1;
					}
					else
					{
						upJ=j-1; upK=k;
					}
					if(k==column-1)
					{
						rightJ=-1;
						rightK=-1;
					}
					else
					{
						rightJ=j;
						rightK=k+1;
					}
					if(j==row-1)
					{
						downJ=-1;
						downK=-1;
					}
					else
					{
						downJ=j+1; downK=k;
					}
					
					if(a[j][k]=='W' )						
						{
						noWater=1;
						
						if((leftJ==-1 && leftK==-1) || (rightJ==-1 && rightK==-1) || (downJ==-1 && downK== -1))
						{
						spill=1;
						break;
						}
						else if(a[leftJ][leftK]=='B' && a[rightJ][rightK]=='B' && a[downJ][downK]=='B')
							{
							spill=0;
							}
						
						else
						{
							//System.out.println("spill water");
							spill=1;
							break;
						}
						
						}
					
					else if(a[j][k]=='B')
					{
						if( downJ!=-1 && downK!=-1)
							{
								if(a[downJ][downK]=='W' || a[downJ][downK]=='A')
								{

									//System.out.println("spill brick");
									spill=1;
									break;
								}
																
							}
					}
					
			/*		System.out.println(" leftJ, leftK, rightJ, rightK, upJ, upK, downJ, downK"+  
					leftJ + leftK + rightJ + rightK + upJ + upK + downJ +  downK);
					Syst	em.out.println();*/
				}
			}
			
		/*	if(noWater==0)
				System.out.println("no");
			else*/ if(spill==1)
				System.out.println("no");
			else
				System.out.println("yes");
			
			
		}
		
	}

}
