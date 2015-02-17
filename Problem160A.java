package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Problem160A
{
	public static void main(String[] args) throws IOException
	{
		fastinput.init(System.in);
		int n = fastinput.nextInt();
		int[] coins = new int[n];
		int totalvalue = 0;
		for (int i = 0; i < n; i++)
		{
			coins[i] = fastinput.nextInt();
			totalvalue = totalvalue + coins[i];
		}
		Arrays.sort(coins);
		totalvalue = totalvalue/2 + 1;
		int count = 0;
		int workingvalue = 0;
		for (int i = n-1; i >= 0; i--)
		{
			if (workingvalue >= totalvalue)
				break;
			workingvalue = workingvalue + coins[i];
			count++;
		}
		System.out.println(count);
	}
	
	public static class fastinput
	{
		static BufferedReader bf;
		static StringTokenizer st;
		
		static void init(InputStream input)
		{
			bf = new BufferedReader(new InputStreamReader(input));
			st = new StringTokenizer("");
		}
		
		static String next() throws IOException
		{
			while (!st.hasMoreTokens())
			{
				st = new StringTokenizer(bf.readLine());
			}
			return st.nextToken();
		}
		
		static int nextInt() throws IOException
		{
			return Integer.parseInt(next());
		}
	}
}
