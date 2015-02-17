package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Problem266B
{
	public static void output(String s, int t)
	{
		if (t == 0)
		{}
		else
		{
			int currenttime = 0;
			char[] working = s.toCharArray();
			while (currenttime < t)
			{
				for (int i = 0; i < working.length-1; i++)
				{
					if (working[i] == 'B' && working[i+1] == 'G')
					{
						working[i] = 'G';
						working[i+1] = 'B';
						i++;
					}
				}
				currenttime++;
			}
			
			for (int i = 0; i < working.length; i++)
			{
				System.out.print(working[i]);
			}

		}
	}
	
	public static void main(String[] args) throws IOException
	{
		fastinput.init(System.in);
		int n = fastinput.nextInt();
		int t = fastinput.nextInt();
		String initialline = fastinput.next();
		output(initialline, t);
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
