package CodeForces;

import java.util.Scanner;

public class Problem104A
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		int[] cards = {2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6,7,7,7,7,8,8,8,8,9,9,9,9,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
		int count = 0;
		for (int i = 0; i < cards.length; i++)
		{
			if (10+cards[i] == n)
				count++;
		}
		if (1+10 == n || 11 + 10 == n)
			count += 4;
		System.out.println(count);
	}
}
