package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



public class Problem1B
{
	public static String NumColtoLetCol(int column)
	{
		String out = "";
		while (column > 0)
		{
			int outerletter = column % 26;
			if (outerletter == 0)
			{
				outerletter = 26;
				column -= 26;
			}
			String rem = Character.valueOf((char) ((outerletter)+64)).toString();
			out = rem+out;
			column = column / 26;
		}
		return out;
	}
	
	public static int LetColtoNumCol(String column)
	{
		int output = 0;
		int counter = 0;
		for (int i = column.length() - 1; i >= 0; i--)
		{
			char c = column.charAt(i);
			int d = (int)c;
			d -= 64;
			int multipl = (int)Math.pow(26, counter++);
			int subout = d*multipl;
			output += subout;
		}
		return output;
	}
	
	public static void decode(String s)
	{
		int row = 0;
		int column = 0;
		int rowformat = 0;
		
		if (s.charAt(0) == 'R' && s.charAt(1) >= 49 && s.charAt(1) <= 57)
		{
			String ns = s.substring(1);
			String[] ns2 = ns.split("C");
			row = Integer.valueOf(ns2[0]);
			column = Integer.valueOf(ns2[1]);
			rowformat = 1;
		}
		else
		{
			for (int i = 0; i < s.length(); i++)
			{
				if (s.charAt(i) >= 49 && s.charAt(i) <= 57)
				{
					String toCol = s.substring(0, i);
					String toRow = s.substring(i);
					row = Integer.valueOf(toRow);
					column = LetColtoNumCol(toCol);
					break;
				}
			}
		}
		
		if (rowformat == 1)
		{
			System.out.println(NumColtoLetCol(column)+row);
		}
		else
		{
			System.out.println("R"+row+"C"+column);
		}
	}
	
	public static void main(String[] args) throws IOException
	{
		fastinput.init(System.in);
		int n = fastinput.nextInt();
		String[] inputs = new String[n];
		for (int i = 0; i < n; i++)
		{
			inputs[i] = fastinput.nextline();
		}
		for (int i = 0; i < n; i++)
		{
			decode(inputs[i]);
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
