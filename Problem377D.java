package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.StringTokenizer;

public class Problem377D
{
	public static void main(String[] args) throws IOException
	{
		class entry implements Comparable<entry>
		{
			int time;
			int workn;
			int code;
			public entry(int time, int workn, int code)
			{
				this.time = time;
				this.workn = workn;
				this.code = code;
			}
			public int compareTo(entry e2)
			{
				if (this.time < e2.time)
				{
					return -1;
				}
				if (this.time > e2.time)
				{
					return 1;
				}
				if (this.code != e2.code)
				{
					return this.code-e2.code;
				}
				else
				{
					return this.workn - e2.workn;
				}
			}
		}
		
		fastinput.init(System.in);
		int n = fastinput.nextInt();
		ArrayList<entry> entryarray = new ArrayList<entry>(n*3);
		
		for (int i = 1; i <= n; i++)
		{
			int li = fastinput.nextInt();
			int vi = fastinput.nextInt();
			int ri = fastinput.nextInt();
			
			entryarray.add(new entry(li, i, 1));
			entryarray.add(new entry(vi, i, 2));
			entryarray.add(new entry(ri, i, 3));
		}
		Collections.sort(entryarray);
		
		int highcount = 0;
		int highindex = 1;
		HashMap<Integer, LinkedList<Integer>> workingset = new HashMap<Integer, LinkedList<Integer>>();
		int[] closed = new int[n+1];
		
		for (int i = 0; i < entryarray.size(); i++)
		{
			entry a = entryarray.get(i);
			if (a.code == 1)
			{
				workingset.put(a.workn, new LinkedList<Integer>());
			}
			if (a.code == 2)
			{
				for (int j = i-1; j >= 0; j--)
				{
					if (entryarray.get(j).code == 1)
					{
						LinkedList<Integer> w = workingset.get(entryarray.get(j).workn);
						if (w != null && closed[entryarray.get(j).workn] == 0)
						{
							w.add(a.workn);
							if (w.size() > highcount)
							{
								highcount = w.size();
								highindex = entryarray.get(j).workn;
							}
							workingset.put(entryarray.get(j).workn, w);
						}
					}
					if (entryarray.get(j).workn == a.workn)
					{
						break;
					}
				}
			}
			if (a.code == 3)
			{
				closed[a.workn] = 1;
			}
		}
		LinkedList<Integer> highest = workingset.get(highindex);
		System.out.println(highest.size());
		ListIterator<Integer> it1 = highest.listIterator();
		while (it1.hasNext())
		{
			Integer ab = it1.next();
			System.out.print(ab+" ");
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
		
		static long nextLong() throws IOException
		{
			return Long.parseLong(next());
		}
	}
}
