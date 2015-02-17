package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Problem369B
{
	public static void main(String[] args) throws IOException
	{
		fastinput.init(System.in);
		int n = fastinput.nextInt();
		int k = fastinput.nextInt();
		int l = fastinput.nextInt();
		int r = fastinput.nextInt();
		int sall = fastinput.nextInt();
		int sk = fastinput.nextInt();
		
		int[] team = new int[n];
		for (int i = 0; i < n; i++)
		{
			if (k > 1)
			{
				if (sk % k == 0 && (sk/k) <= r)
				{
					team[i] = sk/k;
					sall -= team[i];
					sk -= team[i];
					k--;
				}
				else
				{
					int check = sk/k;
					
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
