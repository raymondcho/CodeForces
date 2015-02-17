package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Problem148A
{
	public static void main(String[] args) throws IOException
	{
		fastinput.init(System.in);
		int k = fastinput.nextInt();
		int l = fastinput.nextInt();
		int m = fastinput.nextInt();
		int n = fastinput.nextInt();
		int d = fastinput.nextInt();
		int dragons = 0;
		for (int i = 1; i <= d; i++)
		{
			if (i % k == 0 || i % l == 0 || i % m == 0 || i % n == 0)
				dragons++;
		}
		System.out.println(dragons);
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
