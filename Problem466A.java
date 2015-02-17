package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Problem466A
{
	public static void main(String[] args) throws IOException
	{
		fastinput.init(System.in);
		int n = fastinput.nextInt();
		int m = fastinput.nextInt();
		int a = fastinput.nextInt();
		int b = fastinput.nextInt();
		int singleRideTotalCost = n * a;
		int multiRideTotalCost = 0;
		int multiRidePlusSingleCost = 0;
		if (n % m == 0) {
			multiRideTotalCost = (n / m) * b;
			multiRidePlusSingleCost = multiRideTotalCost;
		} else {
			multiRideTotalCost = ((n / m) + 1) * b;
			multiRidePlusSingleCost = ((n / m) * b) + ((n % m) * a);
		}
		
		int minimumSum = singleRideTotalCost;
		if (multiRideTotalCost < minimumSum) {
			minimumSum = multiRideTotalCost;
		}
		if (multiRidePlusSingleCost < minimumSum) {
			minimumSum = multiRidePlusSingleCost;
		}
		System.out.println(minimumSum);
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
