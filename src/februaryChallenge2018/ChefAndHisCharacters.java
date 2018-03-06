package februaryChallenge2018;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ChefAndHisCharacters {

	public static boolean isChefPossible(String str)
	{
		Set<String> chefSet = new TreeSet<String>();
		Set<String> chefSetMarker = new TreeSet<String>();
		chefSetMarker.add(String.valueOf('c'));
		chefSetMarker.add(String.valueOf('h'));
		chefSetMarker.add(String.valueOf('e'));
		chefSetMarker.add(String.valueOf('f'));
		
		for(int i=0;i<str.length();i++)
		{
			chefSet.add(String.valueOf(str.charAt(i)));
		}
		
		return (chefSet.equals(chefSetMarker)) ? true : false;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int t = scan.nextInt();
		scan.nextLine();

		for (int i = 0; i < t; i++) {
			String s = scan.nextLine();
			
			if(s.length()<4)
			{
				System.out.println("normal");
			}
			else
			{
				int timesPossible = 0;
				for(int j=0;j<s.length()-3;j++)
				{
					boolean isPossible = isChefPossible(s.substring(j, j+4));
					if(isPossible)
						timesPossible++;
						
				}
				if(timesPossible>0)
					System.out.println("lovely "+ timesPossible);
				else
					System.out.println("normal");
			}
			
			

		}

	}
}
