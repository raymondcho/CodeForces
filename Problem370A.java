package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



public class Problem370A
{
	public static void main(String[] args) throws IOException
	{
		fastinput.init(System.in);
		int r1 = fastinput.nextInt();
		int c1 = fastinput.nextInt();
		int r2 = fastinput.nextInt();
		int c2 = fastinput.nextInt();
		
		int rookmoves = 0;
		int bishopmoves = 0;
		int kingmoves = 0;
		
		if (r1 == r2)
		{
			rookmoves = 1;
			if ((c1+c2) % 2 == 0)
			{
				bishopmoves = 2;
			}
			kingmoves = Math.abs(c1-c2);
		}
		else if (c1 == c2)
		{
			rookmoves = 1;
			if ((r1+r2) % 2 == 0)
			{
				bishopmoves = 2;
			}
			kingmoves = Math.abs(r1-r2);
		}
		else
		{
			rookmoves = 2;
			
			if (Math.abs(r1 - r2) == Math.abs(c1 - c2))
			{
				bishopmoves = 1;
			}
			else if ((r1+r2) % 2 == 0 && (c1+c2) % 2 == 0)
			{
				bishopmoves = 2;
			}
			else
			{
				int r1a = r1+1;
				int c1a = c1+1;
				if ((r1a+r2) % 2 == 0 && (c1a+c2) % 2 == 0)
				{
					bishopmoves = 2;
				}
			}
			
			kingmoves = Math.max(Math.abs(r1-r2), Math.abs(c1-c2));
		}
		System.out.println(rookmoves+" "+bishopmoves+" "+kingmoves);
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
