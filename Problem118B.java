package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;



public class Problem118B
{
	public static void main(String[] args) throws IOException
	{
		class Coordinate
		{
			public int x;
			public int y;
			public int value;
			public Coordinate(int x, int y, int value)
			{
				this.x = x;
				this.y = y;
				this.value = value;
			}
		}
		
		fastinput.init(System.in);
		int n = fastinput.nextInt();
		char[][] handkerchief = new char[(2*n)+1][(2*n)+1];
		Queue<Coordinate> q1 = new LinkedList<Coordinate>();
		Coordinate start = new Coordinate(n, n, n);
		q1.add(start);
		for (int i = 0; i < (2*n)+1; i++)
		{
			for (int j = 0; j < (2*n) +1; j++)
			{
				handkerchief[i][j] = ' ';
			}
		}
		while (!q1.isEmpty())
		{
			Coordinate current = q1.poll();
			handkerchief[current.y][current.x] = (char) (48 + current.value);
			if (current.value > 0)
			{
				if (current.y - 1 >= 0 && handkerchief[current.y-1][current.x]== ' ')
				{
					q1.add(new Coordinate(current.y-1, current.x, current.value-1));
				}
				if (current.y + 1 < (2*n)+1 && handkerchief[current.y+1][current.x]== ' ')
				{
					q1.add(new Coordinate(current.y+1, current.x, current.value-1));
				}
				if (current.x - 1 >= 0 && handkerchief[current.y][current.x-1]== ' ')
				{
					q1.add(new Coordinate(current.y, current.x-1, current.value-1));
				}
				if (current.x + 1 < (2*n)+1 && handkerchief[current.y][current.x+1]== ' ')
				{
					q1.add(new Coordinate(current.y, current.x+1, current.value-1));
				}
			}
		}
		int limit;
		int antilimit = 1;
		for (int i = 0; i < (2*n)+1; i++)
		{
			if (i <= n)
			{
				limit = n+i;
			}
			else
			{
				limit = 2*n - antilimit++;
			}
			
			for (int j = 0; j <= limit; j++)
			{
				System.out.print(handkerchief[i][j]);
				if (j +1 <= limit)
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
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
