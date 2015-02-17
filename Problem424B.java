package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;


public class Problem424B
{
	public static void main(String[] args) throws IOException
	{
		class location implements Comparable<location>
		{
			int xi;
			int yi;
			int ki;
			double distance;
			public location(int xi, int yi, int ki)
			{
				this.xi = xi;
				this.yi = yi;
				this.ki = ki;
				distance = Math.sqrt((double)((Math.abs(xi)*Math.abs(xi))+(Math.abs(yi)*Math.abs(yi))));
			}
			public int compareTo(location l2)
			{
				if (this.distance != l2.distance)
				{
					return (int) ((this.distance - l2.distance)*1000);
				}
				else if (this.ki != l2.ki)
				{
					return this.ki - l2.ki;
				}
				else if (this.xi != l2.xi)
				{
					return this.xi - l2.xi;
				}
				else
				{
					return this.yi - l2.yi;
				}
			}
		}
		
		fastinput.init(System.in);
		int n = fastinput.nextInt();
		int s = fastinput.nextInt();
		TreeSet<location> locations = new TreeSet<location>();
		int checkpop = s;
		for (int i = 0; i < n; i++)
		{
			int x = fastinput.nextInt();
			int y = fastinput.nextInt();
			int k = fastinput.nextInt();
			location b = new location(x, y, k);
			locations.add(b);
			checkpop = checkpop + k;
		}
		if (checkpop < 1000000)
		{
			System.out.println("-1");
		}
		else
		{
			double radius = 0;
			int currentpop = s;
			while (currentpop < 1000000 && !locations.isEmpty())
			{
				location z = locations.pollFirst();
				int nx = Math.abs(z.xi);
				int ny = Math.abs(z.yi);
				double nradius = Math.sqrt((double)((ny*ny)+(nx*nx)));
				
				currentpop = currentpop + z.ki;
				if (nradius > radius)
				{
					radius = nradius;
				}
			}
			System.out.println(radius);
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
