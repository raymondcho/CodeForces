package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Problem122A
{
	public static void main(String[] args) throws IOException
	{
		fastinput.init(System.in);
		int[] lucky = {4,7,44,47,74,77,444,447,474,477,744,747,774,777};
		int n = fastinput.nextInt();
		boolean success = false;

			for (int i = 0; i < lucky.length; i++)
			{
				if (n % lucky[i] == 0)
				{
					success = true;
					break;
				}
			}

		if (success)
			System.out.println("YES");
		else
			System.out.println("NO");
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
