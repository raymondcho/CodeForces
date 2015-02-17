package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



public class Problem268A
{
	public static void main(String[] args) throws IOException
	{
		fastinput.init(System.in);
		int n = fastinput.nextInt();
		int[] home = new int[n+1];
		int[] away = new int[n+1];
		for (int i = 1; i <= n; i++)
		{
			home[i] = fastinput.nextInt();
			away[i] = fastinput.nextInt();
		}
		int count = 0;
		for (int q = 1; q <= n; q++)
		{
			for (int k = 1; k <= n; k++)
			{
				if (q != k)
				{
					if (home[q] == away[k])
						count++;
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
	}
}
