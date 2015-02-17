package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Problem282A
{
	public static void main(String[] args) throws IOException
	{
		fastinput.init(System.in);
		int n = fastinput.nextInt();
		String[] instructions = new String[n];
		int xvalue = 0;
		for (int i = 0; i < n; i++)
		{
			instructions[i] = fastinput.next();
			if (instructions[i].startsWith("++") || instructions[i].endsWith("++"))
				xvalue++;
			else
				xvalue--;
		}
		System.out.println(xvalue);
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
