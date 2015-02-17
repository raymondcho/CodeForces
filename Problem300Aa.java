package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;



public class Problem300Aa
{
	public static void main(String[] args) throws IOException
	{
		fastinput.init(System.in);
		int n = fastinput.nextInt();
		ArrayList<Integer> set1 = new ArrayList<Integer>();
		ArrayList<Integer> set2 = new ArrayList<Integer>();
		ArrayList<Integer> set3 = new ArrayList<Integer>();
		for (int i = 0; i < n; i++)
		{
			int a = fastinput.nextInt();
			if (a == 0)
			{
				set3.add(a);
			}
			else if (a < 0 && set1.size() == 0)
			{
				set1.add(a);
			}
			else if (a < 0)
			{
				set3.add(a);
			}
			else if (a > 0)
			{
				set2.add(a);
			}
			else
			{
				set3.add(a);
			}
		}
		if (set2.size() == 0)
		{
			for (int q = 0; q < 2; q++)
			{
				for (int w = 0; w < set3.size(); w++)
				{
					if (set3.get(w) < 0)
					{
						Integer g = set3.get(w);
						set2.add(g);
						set3.remove(w);
						break;
					}
				}
			}
		}
		
		System.out.print(set1.size()+" ");
		for (int r = 0; r < set1.size(); r++)
		{
			System.out.print(set1.get(r)+" ");
		}
		System.out.println("");
		System.out.print(set2.size()+" ");
		for (int r = 0; r < set2.size(); r++)
		{
			System.out.print(set2.get(r)+" ");
		}
		System.out.println("");
		System.out.print(set3.size()+" ");
		for (int r = 0; r < set3.size(); r++)
		{
			System.out.print(set3.get(r)+" ");
		}
		System.out.println("");
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
