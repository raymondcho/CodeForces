package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;



public class Problem37A
{
	public static void main(String[] args) throws IOException
	{
		fastinput.init(System.in);
		int n = fastinput.nextInt();
		int highestT = 1;
		HashMap<Integer, Integer> towers = new HashMap<Integer, Integer>();
		for (int i = 0; i < n; i++)
		{
			int c = fastinput.nextInt();
			if (!towers.containsKey(c))
			{
				towers.put(c, 1);
			}
			else
			{
				int old = towers.get(c)+1;
				if (old > highestT)
				{
					highestT = old;
				}
				towers.put(c, old);
			}
		}
		System.out.println(highestT+" "+towers.size());
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
