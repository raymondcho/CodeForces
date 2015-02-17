package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Problem402B
{
	public static void main(String[] args) throws IOException
	{
		fastinput.init(System.in);
		int n = fastinput.nextInt();
		int k = fastinput.nextInt();
		if (n == 1)
		{
			System.out.println("0");
		}
		else
		{
			int[] trees = new int[n+1];
			int[] btrees = new int[n+1];
			int count = 0;
			for (int i = 1; i <= n; i++)
			{
				trees[i] = fastinput.nextInt();
			}
			
			boolean check = true;
			while (check)
			{
				for (int i = 1; i <= n; i++)
				{
					btrees[i] = trees[i];
				}
			}
			
			System.out.println(count);
			if (count > 0)
			{
				for (int i = 1; i <= n; i++)
				{
					if (trees[i] < btrees[i])
					{
						System.out.println("+ "+i+" "+(btrees[i]-trees[i]));
					}
					if (trees[i] > btrees[i])
					{
						System.out.println("- "+i+" "+(trees[i]-btrees[i]));
					}
				}
			}
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
		
		static long nextLong() throws IOException
		{
			return Long.parseLong(next());
		}
	}
}
