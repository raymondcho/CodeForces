package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Problem69A
{
	public static void main(String[] args) throws IOException
	{
		fastinput.init(System.in);
		int n = fastinput.nextInt();
		int x = 0;
		int y = 0;
		int z = 0;
		for (int i = 0; i < n; i++)
		{
			x = x + fastinput.nextInt();
			y = y + fastinput.nextInt();
			z = z + fastinput.nextInt();
		}
		if (x == 0 && y == 0 && z == 0)
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
