package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



public class Problem281A
{
	public static void main(String[] args) throws IOException
	{
		fastinput.init(System.in);
		char[] input = fastinput.next().toCharArray();
		input[0] = Character.toUpperCase(input[0]);
		for (int i = 0; i < input.length; i++)
		{
			System.out.print(input[i]);
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
	}
}
