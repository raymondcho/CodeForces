package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;


public class Problem228A
{
	public static void main(String[] args) throws IOException
	{
		fastinput.init(System.in);
		int s1 = fastinput.nextInt();
		int s2 = fastinput.nextInt();
		int s3 = fastinput.nextInt();
		int s4 = fastinput.nextInt();
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		hs.add(s4);
		System.out.println(4-hs.size());
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
