package CodeForces;

import java.util.*;

public class Problem158B
{
	public static int findMinTaxi(int[] groups)
	{
		int count = 0;
		int g1 = 0;
		int g2 = 0;
		int g3 = 0;
		for (int i = 0; i < groups.length; i++)
		{
			if (groups[i] == 4)
			{
				count++;
			}
			else if (groups[i] == 1)
			{
				g1++;
			}
			else if (groups[i] == 2)
			{
				g2++;
			}
			else if (groups[i] == 3)
			{
				g3++;
			}
			else
			{}
		}
		
		if (g3 == g1)
		{
			count = count + g3;
			g3 = 0;
			g1 = 0;
		}
		else if (g3 > g1)
		{
			count = count + g1;
			g3 = g3 - g1;
			g1 = 0;

		}
		else  // (g3 < g1)
		{
			count = count + g3;
			g1 = g1 - g3;
			g3 = 0;
			
		}
		
		if (g2 % 2 == 0)
		{
			count = count + (g2/2);
			g2 = 0;
		}
		else
		{
			count = count + (g2/2);
			g2 = 1;
		}
		
		count = count + g3;
		g3 = 0;

		while (g1 > 0 && g2 > 0)
		{
			if (g2 > 0 && g1 > 1)
			{
				count++;
				g2--;
				g1 = g1 - 2;
			}
			else
			{
				count++;
				g2--;
				g1--;
			}
		}
		
		count = count + g2;
		g2 = 0;
		
		count = count + (g1/4);
		if (g1 % 4 != 0)
		{
			count ++;
		}
		g1 = 0;
		
		return count;
	}
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] groups = new int[n];
		for (int i = 0; i < n; i++)
		{
			groups[i] = scan.nextInt();
		}
		scan.close();
		System.out.println(findMinTaxi(groups));
	}
}
