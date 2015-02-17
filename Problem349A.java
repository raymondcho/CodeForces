package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Problem349A
{
	public static void main(String[] args) throws IOException
	{
		fastinput.init(System.in);
		int n = fastinput.nextInt();
		int[] line = new int[n];
		for (int i = 0; i < n; i++)
		{
			line[i] = fastinput.nextInt();
		}
		
		int change25 = 0;
		int change50 = 0;

		for (int i = 0; i < n; i++)
		{
			if (line[i] == 25)
			{
				change25++;
			}
			else if (line[i] == 50)
			{
				change25--;
				if (change25 < 0)
					break;
				change50++;
			}
			else if (line[i] == 100)
			{
				if (change50 > 0)
				{
					change50--;
					change25--;
				}
				else if (change50 == 0)
				{
					change25 -= 3;
				}
				
				if (change25 < 0)
					break;
			}
			else
			{}
		}
		if (change25 < 0)
			System.out.println("NO");
		else
			System.out.println("YES");
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
