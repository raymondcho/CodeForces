package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;


public class Problem452A
{
	public static void main(String[] args) throws IOException
	{
		fastinput.init(System.in);
		int n = fastinput.nextInt();
		String input = fastinput.next();
		String[] eeveeEvolveCandidates = {"vaporeon", "jolteon", "flareon", "espeon", "umbreon", "leafeon", "glaceon", "sylveon"};
		List<String> filteredEvolveCandidates = new LinkedList<String>();
		for (String string : eeveeEvolveCandidates) {
			if (string.length() == n) {
				filteredEvolveCandidates.add(string);
			}
		}
		if (filteredEvolveCandidates.size() == 1) {
			System.out.println(filteredEvolveCandidates.get(0));
		} else {
			for (String string : filteredEvolveCandidates) {
				boolean reject = false;
				for (int i = 0; i < input.length(); i++) {
					if (!reject && input.charAt(i) != '.') {
						if (input.charAt(i) != string.charAt(i)) {
							reject = true;
							break;
						}
					}
				}
				if (!reject) {
					System.out.println(string);
				}
			}
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
