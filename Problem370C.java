package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



public class Problem370C
{
	public static void main(String[] args) throws IOException
	{
		fastinput.init(System.in);
		int n = fastinput.nextInt();
		int m = fastinput.nextInt();
		int[][] kids = new int[n][2];
		for (int i = 0; i < n; i++)
		{
			kids[i][0] = fastinput.nextInt();
			kids[i][1] = kids[i][0];
		}
		int result = 0;
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				if (i != j)
				{
					if (kids[i][0] == kids[i][1] && kids[j][0] == kids[j][1] && kids[i][0] != kids[j][0])
					{
						kids[i][0] = kids[j][0];
						kids[j][0] = kids[i][1];
						result += 2;
						break;
					}
				}
			}
		}
		if (result < n)
		{
			for (int i = 0; i < n; i++)
			{
				if (kids[i][0] == kids[i][1])
				{
					for (int j = 0; j < n; j++)
					{
						if (i != j)
						{
							if (kids[j][0] != kids[j][1] && kids[j][0] != kids[i][0] && kids[j][1] != kids[i][0])
							{
								int temp = kids[j][0];
								kids[j][0] = kids[i][0];
								kids[i][0] = temp;
								result++;
								break;
							}
						}
					}
				}
			}
		}
		System.out.println(result);
		for (int i = 0; i < n; i++)
		{
			System.out.println(kids[i][0]+" "+kids[i][1]);
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
