package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



public class Problem25A
{
	public static void main(String[] args) throws IOException
	{
		fastinput.init(System.in);
		int n = fastinput.nextInt();
		int evencount = 0;
		int oddcount = 0;
		int firsteven = -1;
		int firstodd = -1;
		for (int i = 1; i <= n; i++)
		{
			int current = fastinput.nextInt();
			if (current % 2 == 0)
			{
				if (evencount == 0)
				{
					evencount++;
					firsteven = i;
				}
				else
				{
					evencount++;
				}
			}
			else
			{
				if (oddcount == 0)
				{
					oddcount++;
					firstodd = i;
				}
				else
				{
					oddcount++;
				}
			}
		}
		if (evencount == 1)
		{
			System.out.println(firsteven);
		}
		else
		{
			System.out.println(firstodd);
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
