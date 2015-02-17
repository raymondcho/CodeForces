package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;



public class Problem146A
{
	public static void main(String[] args) throws IOException
	{
		fastinput.init(System.in);
		int n = fastinput.nextInt();
		String scount = fastinput.next();
		boolean isLucky = true;
		for (int i = 0; i < scount.length(); i++)
		{
			if (scount.charAt(i) != '4' && scount.charAt(i) != '7')
			{
				isLucky = false;
				break;
			}
		}
		if (!isLucky)
		{
			System.out.println("NO");
		}
		else
		{
			String a = scount.substring(0, scount.length()/2);
			String b = scount.substring(scount.length()/2);
			char[] a1 = a.toCharArray();
			char[] b1 = b.toCharArray();
			Arrays.sort(a1);
			Arrays.sort(b1);
			boolean answer = true;
			for (int j = 0; j < a1.length; j++)
			{
				if (a1[j] != b1[j])
				{
					answer = false;
					break;
				}
			}
			if (answer)
				System.out.println("YES");
			else
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
