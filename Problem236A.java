package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;


public class Problem236A
{
	public static void main(String[] args) throws IOException
	{
		fastinput.init(System.in);
		String input = fastinput.next();
		HashSet<Character> hs = new HashSet<Character>();
		for (int i = 0; i < input.length(); i++)
		{
			hs.add(input.charAt(i));
		}
		if (hs.size() % 2 != 0)
			System.out.println("IGNORE HIM!");
		else
			System.out.println("CHAT WITH HER!");
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
