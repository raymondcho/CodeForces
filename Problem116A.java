package CodeForces;

import java.util.*;

public class Problem116A
{
	public static int SufficientCapacity(int[] departs, int[] arrives)
	{
		int sufficient = 0;
		int current = 0;
		for (int i = 0; i < departs.length; i++)
		{
			current = current - departs[i];
			current = current + arrives[i];
			if (current > sufficient)
				sufficient = current;
		}
		return sufficient;
	}
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] departs = new int[n];
		int[] arrives = new int[n];
		for (int i = 0; i < n; i++)
		{
			departs[i] = scan.nextInt();
			arrives[i] = scan.nextInt();
		}
		scan.close();
		System.out.println(SufficientCapacity(departs, arrives));
	}
}
