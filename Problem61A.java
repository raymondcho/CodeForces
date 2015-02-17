package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Problem61A
{
	public static void main(String[] args) throws IOException
	{
		fastinput.init(System.in);
		String a = fastinput.next();
		String b = fastinput.next();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < a.length(); i++)
		{
			if (a.charAt(i) == b.charAt(i))
				sb.append('0');
			else
				sb.append('1');
		}
		System.out.println(sb);
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
