package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;


public class Problem370B
{
	public static void main(String[] args) throws IOException
	{
		fastinput.init(System.in);
		int n = fastinput.nextInt();
		ArrayList<HashSet<Integer>> hashes = new ArrayList<HashSet<Integer>>(n);
		
		for (int i = 0; i < n; i++)
		{
			int m = fastinput.nextInt();
			HashSet<Integer> hbingo = new HashSet<Integer>(m);
			int b;
			for (int j = 0; j < m; j++)
			{
				b = fastinput.nextInt();
				hbingo.add(b);
			}
			hashes.add(hbingo);
		}
		for (int q = 0; q < n; q++)
		{
			boolean output = true;
			HashSet<Integer> first = hashes.get(q);
			for (int w = 0; w < n; w++)
			{
				output = true;
				if (q != w)
				{
					HashSet<Integer> second = hashes.get(w);
					if (second.size() < first.size())
					{
						int actualmatch = 0;
						for (Integer s : first)
						{
							if (second.contains(s))
							{
								actualmatch++;
							}
						}
						if (second.size() == actualmatch)
						{
							output = false;
							break;
						}
					}
					if (second.size() == first.size() && second.equals(first))
					{
						output = false;
						break;
					}
				}
				if (output == false)
				{
					break;
				}
			}
			if (output)
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
