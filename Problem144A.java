package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



public class Problem144A
{
	public static void main(String[] args) throws IOException
	{
		fastinput.init(System.in);
		int n = fastinput.nextInt();
		int[] rank = new int[n];
		rank[0] = fastinput.nextInt();
		int minvalue = rank[0];
		int minpos = 0;
		int maxvalue = rank[0];
		int maxpos = 0;
		for (int i = 1; i < n; i++)
		{
			rank[i] = fastinput.nextInt();
			if (rank[i] <= minvalue)
			{
				minvalue = rank[i];
				minpos = i;
			}
			if (rank[i] > maxvalue)
			{
				maxvalue = rank[i];
				maxpos = i;
			}
		}
		if (rank[0] == maxvalue && rank[n-1] == minvalue)
		{
			System.out.println("0");
		}
		else if (minpos < maxpos)
		{
			int q = maxpos + (n - 1 - (minpos+1));
			System.out.println(q);
		}
		else
		{
			int w = maxpos + (n - 1 - minpos);
			System.out.println(w);
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
	}
}
