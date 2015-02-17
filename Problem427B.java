package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Problem427B
{
	public static void main(String[] args) throws IOException
	{
		fastinput.init(System.in);
		int n = fastinput.nextInt();
		int t = fastinput.nextInt();
		int c = fastinput.nextInt();
		int[] prisoners = new int[n];
		for (int i = 0; i < n; i++)
		{
			prisoners[i] = fastinput.nextInt();
		}
		int ways = 0;
		int lcache = 0;
		for (int i = 0; i < n; i++)
		{
			if (lcache < c && prisoners[i] <= t)
			{
				lcache++;
			}
			if (prisoners[i] > t)
			{
				lcache = 0;
			}
			
			if (lcache == c)
			{
				ways++;
			}
		}
		System.out.println(ways);
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
		
		static String nextline() throws IOException
		{
			return bf.readLine();
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
		
		static long nextLong() throws IOException
		{
			return Long.parseLong(next());
		}
	}
}
