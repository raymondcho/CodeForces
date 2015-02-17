package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Problem266A
{
	public static void main(String[] args) throws IOException
	{
		fastinput.init(System.in);
		int n = fastinput.nextInt();
		char[] stones = fastinput.next().toCharArray();

		if (n == 1)
		{
			System.out.println(0);
		}
		else if (n == 2)
		{
			if (stones[0] == stones[1])
				System.out.println(1);
			else
				System.out.println(0);
		}
		else
		{
			int count = 0;
			char current;
			char next;
			for (int i = 0; i < n - 1; i++)
			{
				current = stones[i];
				next = stones[i+1];
				if (current == next)
					count++;
			}
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
