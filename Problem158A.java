package CodeForces;

import java.util.*;

public class Problem158A
{
	public static int answer(int[] scores, int kthPlace)
	{
		int count = 0;
		for (int i = 0; i < scores.length; i++)
		{
			if (scores[i] >= scores[kthPlace-1] && scores[i] > 0)
			{
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] scores = new int[n];
		for (int i = 0; i < n; i++)
		{
			scores[i] = scan.nextInt();
		}
		System.out.println(answer(scores, k));
		scan.close();
	}
}
