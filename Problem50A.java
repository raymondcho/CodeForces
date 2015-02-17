package CodeForces;

import java.util.*;

public class Problem50A
{
	public static int MaxDominoes(int m, int n)
	{
		return (m*n)/2;
	}
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int n = scan.nextInt();
		scan.close();
		System.out.println(MaxDominoes(m, n));
	}
}
