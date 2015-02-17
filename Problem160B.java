package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Problem160B
{
	public static void main(String[] args) throws IOException
	{
		fastinput.init(System.in);
		int n = fastinput.nextInt();
		String a = fastinput.next();
		String b = a.substring(0, (a.length()/2));
		String c = a.substring((a.length()/2));
		char[] d = b.toCharArray();
		char[] e = c.toCharArray();
		Arrays.sort(d);
		Arrays.sort(e);
		boolean answer = true;
		
		if (d[0] > e[0])
		{
			for (int i = 0; i < d.length; i++)
			{
				if (d[i] <= e[i])
				{
					answer = false;
					break;
				}
			}
		}
		else if (d[0] < e[0])
		{
			for (int i = 0; i < d.length; i++)
			{
				if (e[i] <= d[i])
				{
					answer = false;
					break;
				}
			}
		}
		else
		{
			answer = false;
		}

		if (answer)
			System.out.println("YES");
		else
			System.out.println("NO");
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
