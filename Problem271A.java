package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



public class Problem271A
{
	public static void main(String[] args) throws IOException
	{
		fastinput.init(System.in);
		int y = fastinput.nextInt()+1;
		char[] y1 = Integer.toString(y).toCharArray();
		while (true)
		{
			if (y1[0] == y1[1] || y1[0] == y1[2] || y1[0] == y1[3] || y1[1] == y1[2] || y1[1] == y1[3] || y1[2] == y1[3])
			{
				y++;
				y1 = Integer.toString(y).toCharArray();
			}
			else 
				break;
		}
		System.out.println(y);
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
