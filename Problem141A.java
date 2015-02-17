package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;


public class Problem141A
{
	public static void main(String[] args) throws IOException
	{
		fastinput.init(System.in);
		String line1 = fastinput.nextline();
		String line2 = fastinput.nextline();
		String line3 = fastinput.nextline();
		line1 = line1.concat(line2);
		
		HashMap<Character, Integer> hash = new HashMap<Character, Integer>();
		for (int i = 0; i < line1.length(); i++)
		{
			Character c = line1.charAt(i);
			if (!hash.containsKey(c))
			{
				hash.put(c, 1);
			}
			else
			{
				int value = hash.get(c);
				hash.put(c, value+1);
			}
		}
		boolean success = true;
		
		for (int i = 0; i < line3.length(); i++)
		{
			Character c = line3.charAt(i);
			if (hash.containsKey(c))
			{
				int value = hash.get(c);
				if (value > 0)
				{
					hash.put(c, --value);
					if (value == 0)
					{
						hash.remove(c);
					}
				}
				else
				{
					success = false;
					break;
				}
			}
			else
			{
				success = false;
				break;
			}
		}
		
		if (success && hash.isEmpty())
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
