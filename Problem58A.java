package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Problem58A
{
	public static void main(String[] args) throws IOException
	{
		fastinput.init(System.in);
		String s = fastinput.nextline();
		char[] hello = {'h','e','l','l','o'};
		int counter = 0;
		for (int i = 0; i < s.length(); i++)
		{
			if (counter < 5 && s.charAt(i) == hello[counter])
			{
				counter++;
			}
		}
		if (counter == 5)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
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
