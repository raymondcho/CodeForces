package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;



public class Problem327B
{
	public static void main(String[] args) throws IOException
	{
		fastinput.init(System.in);
		int n = fastinput.nextInt();
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10);
		while (n - 1 > 0)
		{
			int test = list.getLast();
			for (int i = test+1; i <= 10000000; i++)
			{
				if (i % test != 0)
				{
					list.add(i);
					break;
				}
			}
			n--;
		}
		Iterator<Integer> it1 = list.iterator();
		while (it1.hasNext())
		{
			System.out.print(it1.next()+" ");
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
