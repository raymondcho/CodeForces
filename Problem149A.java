package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Problem149A
{
	public static void main(String[] args) throws IOException
	{
		fastinput.init(System.in);
		int k = fastinput.nextInt();
		int[] months = new int[12];
		for (int i = 0; i < 12; i++)
		{
			months[i] = fastinput.nextInt();
		}
		Arrays.sort(months);
		if (k == 0)
		{
			System.out.println("0");
		}
		else
		{
			int sum = 0;
			int count = 0;
			int mon = 11;
			while (sum < k)
			{
				if (mon >= 0)
				{
					sum = sum + months[mon];
					mon--;
					count++;
				}
				else
					break;
			}
			if (sum < k)
				System.out.println("-1");
			else
				System.out.println(count);
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
