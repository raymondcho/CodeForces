package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Problem131A
{
	public static void main(String[] args) throws IOException
	{
		fastinput.init(System.in);
		char[] input = fastinput.next().toCharArray();
		if (input.length == 1)
		{
			if (input[0] >= 65 && input[0] <= 90)
			{
				input[0] = Character.toLowerCase(input[0]);
				System.out.println(input[0]);
			}
			else
			{
				input[0] = Character.toUpperCase(input[0]);
				System.out.println(input[0]);
			}
		}
		else
		{
			if (input[0] >= 97 && input[0] <= 122)
			{
				int prematureend = 0;
				for (int i = 1; i < input.length; i++)
				{
					if (input[i] < 65 || input[i] > 90)
					{
						prematureend = 1;
						break;
					}
				}
				if (prematureend == 1)
				{
					for (int i = 0; i < input.length; i++)
					{
						System.out.print(input[i]);
					}
				}
				else
				{
					for (int i = 0; i < input.length; i++)
					{
						if (input[i] >= 97 && input[i] <= 122)
						{
							input[i] = Character.toUpperCase(input[i]);
							System.out.print(input[i]);
						}
						else
						{
							input[i] = Character.toLowerCase(input[i]);
							System.out.print(input[i]);
						}
					}
				}
			}
			else
			{
				int prematureend = 0;
				for (int i = 0; i < input.length; i++)
				{
					if (input[i] < 65 || input[i] > 90)
					{
						prematureend = 1;
						break;
					}
				}
				if (prematureend == 1)
				{
					for (int i = 0; i < input.length; i++)
					{
						System.out.print(input[i]);
					}
				}
				else
				{
					for (int i = 0; i < input.length; i++)
					{
						input[i] = Character.toLowerCase(input[i]);
						System.out.print(input[i]);
					}
				}
			}
			
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
