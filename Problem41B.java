package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Problem41B
{
	public static void main(String[] args) throws IOException
	{
		fastinput.init(System.in);
		int n = fastinput.nextInt();
		int b = fastinput.nextInt();
		int[] a1 = new int[n];
		for (int j = 0; j < n; j++)
		{
			a1[j] = fastinput.nextInt();
		}
		int output = b;
		for (int a = 0; a < n; a++)
		{
			for (int c = 0; c < n; c++)
			{
				if (a != c)
				{
					if (a1[c] > a1[a] && c > a)
					{
						int dollars = b/a1[a];
						int remains = b%a1[a];
						int convert = dollars*a1[c];
						remains += convert;
						if (remains > output)
						{
							output = remains;
						}
					}
				}
			}
		}
		System.out.println(output);
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
