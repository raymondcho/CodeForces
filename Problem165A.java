package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Problem165A
{
	public static void main(String[] args) throws IOException
	{
		class Coordinate
		{
			int x;
			int y;
			public Coordinate(int x, int y)
			{
				this.x = x;
				this.y = y;
			}
		}
		fastinput.init(System.in);
		int n = fastinput.nextInt();
		Coordinate[] coords = new Coordinate[n];
		for (int i = 0; i < n; i++)
		{
			int nx = fastinput.nextInt();
			int ny = fastinput.nextInt();
			coords[i] = new Coordinate(nx, ny);
		}
		int count = 0;
		for (int i = 0; i < n; i++)
		{
			int right = 0;
			int left = 0;
			int lower = 0;
			int upper = 0;
			for (int j = 0; j < n; j++)
			{
				if (i != j)
				{
					if (coords[j].x > coords[i].x && coords[j].y == coords[i].y)
					{
						right++;
					}
					else if (coords[j].x < coords[i].x && coords[j].y == coords[i].y)
					{
						left++;
					}
					else if (coords[j].x == coords[i].x && coords[j].y < coords[i].y)
					{
						lower++;
					}
					else if (coords[j].x == coords[i].x && coords[j].y > coords[i].y)
					{
						upper++;
					}
					else
					{
						
					}
				}
			}
			if (right > 0 && left > 0 && lower > 0 && upper > 0)
			{
				count++;
			}
		}
		System.out.println(count);
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
