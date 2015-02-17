package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;


public class Problem127B
{
	public static void main(String[] args) throws IOException
	{
		fastinput.init(System.in);
		int n = fastinput.nextInt();
		HashMap<Integer, Integer> h1 = new HashMap<Integer, Integer>();
		ArrayList<Integer> sticks = new ArrayList<Integer>(n);
		for (int i = 0; i < n; i++)
		{
			Integer s = fastinput.nextInt();
			Integer t = h1.get(s);
			if (t == null)
			{
				h1.put(s, 1);
				sticks.add(s);
			}
			else
			{	
				h1.put(s, t+1);
			}
		}
		int count = 0;
		int count2 = 0;
		for (int j = 0; j < sticks.size(); j++)
		{
			int p = sticks.get(j);
			int q = h1.get(p);
			if (q >= 4)
			{
				count = count + (q/4);
				q = q % 4;
				h1.put(p, q);
			}
			if (q >= 2)
			{
				count2 = count2 + (q/2);
				q = q % 2;
				h1.put(p, q);
			}
		}
		count = count + (count2/2);
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
