package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Problem382A
{
	public static void main(String[] args) throws IOException
	{
		fastinput.init(System.in);
		String input = fastinput.next();
		String input2 = fastinput.next();

		int delim = 0;
		for (int i = 0; i < input.length(); i++)
		{
			if (input.charAt(i) == '|')
			{
				delim = i;
				break;
			}
		}
		String left = input.substring(0, delim);
		String right = input.substring(delim+1);
		
		while (true)
		{
			if (left.length() > right.length())
			{
				right = right + input2;
				if (right.length() == left.length())
				{
					System.out.println(left+"|"+right);
					break;
				}
				else if (right.length() < left.length())
				{
					System.out.println("Impossible");
					break;
				}
				else
				{
					int excess = right.length() - left.length();
					input2 = right.substring(right.length()-excess);
					right = right.substring(0, right.length() - excess);
					continue;
				}
			}
			if (left.length() < right.length())
			{
				left = left + input2;
				if (left.length() == right.length())
				{
					System.out.println(left+"|"+right);
					break;
				}
				else if (left.length() < right.length())
				{
					System.out.println("Impossible");
					break;
				}
				else
				{
					int excess = left.length() - right.length();
					input2 = left.substring(left.length()-excess);
					left = left.substring(0, left.length()-excess);
					continue;
				}
			}
			else
			{
				if (input2.length() % 2 != 0)
				{
					System.out.println("Impossible");
					break;
				}
				else
				{
					left = left + input2.substring(0, input2.length()/2);
					right = right + input2.substring(input2.length()/2);
					System.out.println(left+"|"+right);
					break;
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
