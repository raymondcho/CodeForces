package CodeForces;

import java.util.*;
	
public class Problem231A
{
	public static int findSolutions(int[][] input)
	{
		int count = 0;
		for (int i = 0; i < input.length; i++)
		{
			if (input[i][0] == 1 && input[i][1] == 1)
				count++;
			else if (input[i][0] == 1 && input[i][2] == 1)
				count++;
			else if (input[i][1] == 1 && input[i][2] == 1)
				count++;
			else
			{}
		}
		return count;
	}
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][] results = new int[n][3];
		for (int i = 0; i < n; i++)
		{
			results[i][0] = scan.nextInt();
			results[i][1] = scan.nextInt();
			results[i][2] = scan.nextInt();
		}
		scan.close();
		System.out.println(findSolutions(results));
	}
}
