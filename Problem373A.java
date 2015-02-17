package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;


public class Problem373A
{
	public static void main(String[] args) throws IOException
	{
		fastinput.init(System.in);
		int k = fastinput.nextInt();
		HashMap<Integer, Integer> beats = new HashMap<Integer, Integer>();
		for (int i = 0; i < 4; i++)
		{
			String input = fastinput.nextline();
			for (int j = 0; j < 4; j++)
			{
				if (input.charAt(j) != '.')
				{
					int a = Integer.valueOf(input.substring(j, j+1));
					if (beats.containsKey(a))
					{
						int b = beats.get(a);
						beats.put(a, ++b);
					}
					else
					{
						beats.put(a, 1);
					}
				}
			}
		}
		boolean answer = true;
		for (int q = 1; q < 10; q++)
		{
			if (beats.containsKey(q))
			{
				if (beats.get(q) > 2*k)
				{
					answer = false;
					break;
				}
			}
		}
		if (answer)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
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
