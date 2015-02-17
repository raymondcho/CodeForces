package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



public class Problem363A
{
	public static void main(String[] args) throws IOException
	{
		fastinput.init(System.in);
		char[] input = fastinput.next().toCharArray();
		for (int i = input.length-1; i >= 0; i--)
		{
			if (input[i] == '0')
				System.out.println("O-|-OOOO");
			else if (input[i] == '1')
				System.out.println("O-|O-OOO");
			else if (input[i] == '2')
				System.out.println("O-|OO-OO");
			else if (input[i] == '3')
				System.out.println("O-|OOO-O");
			else if (input[i] == '4')
				System.out.println("O-|OOOO-");
			else if (input[i] == '5')
				System.out.println("-O|-OOOO");
			else if (input[i] == '6')
				System.out.println("-O|O-OOO");
			else if (input[i] == '7')
				System.out.println("-O|OO-OO");
			else if (input[i] == '8')
				System.out.println("-O|OOO-O");
			else
				System.out.println("-O|OOOO-");
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
