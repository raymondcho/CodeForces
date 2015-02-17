package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



public class Problem363B
{
	public static void main(String[] args) throws IOException
	{
		fastinput.init(System.in);
		int n = fastinput.nextInt();
		int k = fastinput.nextInt();
		int[] fences = new int[n];
		for (int i = 0; i < n; i++)
		{
			fences[i] = fastinput.nextInt();
		}
		int minimumindex = 0;
		int minimumsum = Integer.MAX_VALUE;
		int transfersum = 0;
		int localsum = 0;
		for (int i = 0; i + (k-1) < n; i++)
		{
			if (i == 0)
			{
				localsum = fences[i];
				int start = 1;
				while (k > start)
				{
					localsum += fences[i+start++];
				}
			}
			else
			{
				localsum = transfersum-fences[i-1]+fences[i+(k-1)];
			}
			transfersum = localsum;
			if (localsum < minimumsum)
			{
				minimumsum = localsum;
				minimumindex = i;
			}
		}
		System.out.println(minimumindex+1);
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
