package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Problem417B
{
	public static void main(String[] args) throws IOException
	{
		fastinput.init(System.in);
		int n = fastinput.nextInt();
		int[] Xsolutions = new int[100001];
		boolean correct = true;
		for (int i = 0; i < n; i++)
		{
			int a = fastinput.nextInt();
			int b = fastinput.nextInt();
			
			if (Xsolutions[b] == a)
			{
				Xsolutions[b]++;
			}
			else if (Xsolutions[b] > a)
			{
				
			}
			else
			{
				correct = false;
				break;
			}
		}
		if (correct)
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
		
		static long nextLong() throws IOException
		{
			return Long.parseLong(next());
		}
	}
}
