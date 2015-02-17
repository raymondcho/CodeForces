package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Problem119A
{
	public static void main(String[] args) throws IOException
	{
		fastinput.init(System.in);
		int a = fastinput.nextInt();
		int b = fastinput.nextInt();
		int n = fastinput.nextInt();
		
		boolean simonturn = true;
		
		while(true)
		{
			if (simonturn)
			{
				if (n <= 0)
					break;
				int stones = findGCD(a, n);
				n = n - stones;
				simonturn = false;
			}
			else
			{
				if (n <= 0)
					break;
				int stones = findGCD(b, n);
				n = n - stones;
				simonturn = true;
			}
		}
		if (simonturn)
			System.out.println(1);
		else
			System.out.println(0);
	}
	
	public static int findGCD(int a, int b)
	{
		if (b == 0)
			return a;
		return findGCD(b, a%b);
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
