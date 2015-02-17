package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Problem96A
{
	public static void main(String[] args) throws IOException
	{
		fastinput.init(System.in);
		char[] input = fastinput.next().toCharArray();
		boolean yes = false;
		for (int i = 0; i < input.length-6; i++)
		{
			if (input[i] == input[i+1] && input[i] == input[i+2] && input[i] == input[i+3] && input[i] == input[i+4] && input[i] == input[i+5] && input[i] == input[i+6])
			{
				yes = true;
				break;
			}	
		}
		if (yes)
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
