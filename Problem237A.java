package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;


public class Problem237A
{
	public static void main(String[] args) throws IOException
	{
		fastinput.init(System.in);
		int count = 1;
		int n = fastinput.nextInt();
		HashMap<String, Integer> hash = new HashMap<String, Integer>();
		for (int i = 0; i < n; i++)
		{
			String a = fastinput.nextline();
			if (!hash.containsKey(a))
			{
				hash.put(a, 1);
			}
			else
			{
				int thiscount = hash.get(a) + 1;
				hash.put(a, thiscount);
				if (thiscount > count)
					count = thiscount;
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
