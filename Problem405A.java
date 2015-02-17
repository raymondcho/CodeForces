package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Problem405A
{
	public static void main(String[] args) throws IOException
	{
		fastinput.init(System.in);
		int n = fastinput.nextInt();
		ArrayList<Integer> cubes = new ArrayList<Integer>(n);
		for (int i = 0; i < n; i++)
		{
			cubes.add(fastinput.nextInt());
		}
		Collections.sort(cubes);
		for (int i = 0; i < cubes.size(); i++)
		{
			System.out.print(cubes.get(i)+" ");
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
