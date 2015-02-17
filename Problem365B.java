package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Problem365B
{
	
	public static void main(String[] args) throws IOException
	{
		fastinput.init(System.in);
		int n = fastinput.nextInt();
		if (n <= 2)
		{
			System.out.println(n);
		}
		else
		{
			int[] input = new int[n];
			for (int i = 0; i < n; i++)
			{
				input[i] = fastinput.nextInt();
			}
			int longest = 0;
			int current = 0;
			for (int i = n-1; i >= 2; i--)
			{
				if (input[i] == input[i-1]+input[i-2])
				{
					current++;
					if (current > longest)
					{
						longest = current;
					}
				}
				else
				{
					current = 0;
				}
			}
			System.out.println(longest+2);
		}

		
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
	}
}
