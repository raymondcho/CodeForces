package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



public class Problem333A
{
	public static void main(String[] args) throws IOException
	{
		fastinput.init(System.in);
		long n = fastinput.nextLong();
		if (n % 3 == 0)
		{
			System.out.println("1");
		}
		else
		{
			n = (n / 3)+1;
			n = n*3;
			int coins = 0;
			while (n > 0)
			{
				long c = 1;
				if (c == n)
				{
					coins++;
					break;
				}
				while(c < n)
				{
					c = c*3;
				}
				if (c > n)
				{
					c = c / 3;
					coins++;
					n = n-c;
				}
				if (c == n)
				{
					coins++;
					break;
				}
			}
			System.out.println(coins);
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
