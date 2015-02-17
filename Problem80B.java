package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



public class Problem80B
{
	public static void main(String[] args) throws IOException
	{
		fastinput.init(System.in);
		String s = fastinput.next();
		String parse = ":";
		String[] result = s.split(parse);
		int hours = Integer.valueOf(result[0]);
		int mins = Integer.valueOf(result[1]);
		if (hours >= 12)
		{
			hours -= 12;
		}
		int fminute = 6 * mins;
		double mhours = 30 * hours;
		double shours = 0.5 * mins;
		mhours = mhours + shours;
		String fhours = Double.toString(mhours);
		if (fhours.charAt(fhours.length()-1) == '0')
		{
			fhours = fhours.substring(0, fhours.length()-2);
		}
		System.out.println(fhours+" "+fminute);
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
