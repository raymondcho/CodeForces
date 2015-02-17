package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Problem110A
{
	public static void main(String[] args) throws IOException
	{
		fastinput.init(System.in);
		String n = fastinput.next();
		int count = 0;
		for (int i = 0; i < n.length(); i++)
		{
			if (n.charAt(i) == '4' || n.charAt(i) == '7')
				count++;
		}
		boolean answer = true;
		String scount = Integer.toString(count);
		for (int i = 0; i < scount.length(); i++)
		{
			if (scount.charAt(i) != '4' && scount.charAt(i) != '7')
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
