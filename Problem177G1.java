package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Problem177G1
{
	public static void main(String[] args) throws IOException
	{
		fastinput.init(System.in);
		String line1 = fastinput.nextline();
		String[] line1a = line1.split(" ");
		long k = Long.valueOf(line1a[0]);
//		int m = Integer.valueOf(line1a[1]);
//		for (int i = 0; i < m; i++)
//		{
//			String a = fastinput.nextline();
//			
//		}
		System.out.println(fibonacci(k));
	}
	
	public static String fibonacci(long k)
	{
		if (k == 1)
		{
			return "a";
		}
		else if (k == 2)
		{
			return "b";
		}
		else
		{
			StringBuilder sb = new StringBuilder("ab");
			String n1 = "b";
			String n2 = "a";
			long n = 2;
			while (n < k)
			{
				String n3 = n1+n2;
				sb.append(n3);
				n2 = n1;
				n1 = n3;
				n++;
			}
			return sb.toString();
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
