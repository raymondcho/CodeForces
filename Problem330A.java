package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Problem330A
{
	public static void main(String[] args) throws IOException
	{
		fastinput.init(System.in);
		int r = fastinput.nextInt();
		int c = fastinput.nextInt();
		char[][] cake = new char[r][c];
		for (int i = 0; i < r; i++)
		{
			char[] in = fastinput.nextline().toCharArray();
			for (int j = 0; j < in.length; j++)
			{
				cake[i][j] = in[j];
			}
		}
		int count = 0;
		for (int i = 0; i < r; i++)
		{
			boolean hasEvil = false;
			for (int k = 0; k < c; k++)
			{
				if (cake[i][k] == 'S')
				{
					hasEvil = true;
					break;
				}
			}
			if (!hasEvil)
			{
				int eaten = 0;
				for (int k = 0; k < c; k++)
				{
					if (cake[i][k] == '.')
					{
						eaten++;
					}
				}
				if (eaten > 0)
				{
					for (int k = 0; k < c; k++)
					{
						if (cake[i][k] == '.')
						{
							count++;
							cake[i][k] = 'e';
						}
					}
				}
			}
		}
		for (int j = 0; j < c; j++)
		{
			boolean hasEvil = false;
			for (int i = 0; i < r; i++)
			{
				if (cake[i][j] == 'S')
				{
					hasEvil = true;
					break;
				}
			}
			if (!hasEvil)
			{
				int eaten = 0;
				for (int i = 0; i < r; i++)
				{
					if (cake[i][j] == '.')
					{
						eaten++;
					}
				}
				if (eaten > 0)
				{
					for (int i = 0; i < r; i++)
					{
						if (cake[i][j] == '.')
						{
							count++;
							cake[i][j] = 'e';
						}
					}
				}
			}
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
