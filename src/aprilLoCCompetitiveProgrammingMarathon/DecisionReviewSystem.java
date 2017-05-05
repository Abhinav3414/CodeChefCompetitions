package aprilLoCCompetitiveProgrammingMarathon;

import java.util.Scanner;

public class DecisionReviewSystem {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int count1=0, count2=0,count3=0, count4=0, count5=0, count6=0;
			for(int j=0; j<n;j++)
			{
				float x=scan.nextFloat();
				if(x<=79.6)
					count1++;
				else if(80.1<=x && x<=159.6)
					count2++;
				else if(160.1<=x && x<=239.6)
					count3++;
				else if(240.1<=x && x<=319.6)
					count4++;
				else if(320.1<=x  && x<=399.6)
					count5++;
				else if(400.1<=x  && x<=449.6)
					count6++;
				else {}
			}
			
			if(count1>2)
				count1=2;
			if(count2>2)
				count2=2;
			if(count3>2)
				count3=2;
			if(count4>2)
				count4=2;
			if(count5>2)
				count5=2;
			if(count6>2)
				count6=2;
			System.out.println(count1+count2+count3+count4+count5+count6);
		}
		
	}

}
