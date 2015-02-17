package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Problem41A
{
	public static void main(String[] args) throws IOException
	{
		fastinput.init(System.in);
		char[] s = fastinput.next().toCharArray();
		char[] t = fastinput.next().toCharArray();
		if (s.length != t.length)
		{
			System.out.println("NO");
		}
		else
		{
			int i = 0;
			int j = s.length-1;
			boolean correct = true;
			while (i < s.length && j >= 0)
			{
				if (s[i] != t[j])
				{
					correct = false;
					break;
				}
				else
				{
					i++;
					j--;
				}
			}
			if (correct)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
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
