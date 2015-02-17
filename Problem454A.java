package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Problem454A
{
	public static void main(String[] args) throws IOException
	{
		fastinput.init(System.in);
		final int n = fastinput.nextInt();
		final String[] result = new String[n];
		int diamondLevel = 0;
		int antiDiamondLevel = n - 1;
		final char diamond = 'D';
		final char nonDiamond = '*';
		int diamondCount = 1;
		while (true) {
			StringBuilder diamondBuilder = new StringBuilder();
			for (int i = 0; i < diamondCount; i++) {
				diamondBuilder.append(diamond);
			}
			String diamondPart = diamondBuilder.toString();
			StringBuilder nonDiamondBuilder = new StringBuilder();
			for (int i = 0; i < ((n - diamondCount) / 2); i++) {
				nonDiamondBuilder.append(nonDiamond);
			}
			String nonDiamondPart = nonDiamondBuilder.toString();
			String layerResult = nonDiamondPart + diamondPart + nonDiamondPart;
			result[diamondLevel] = layerResult;
			result[antiDiamondLevel] = layerResult;
			diamondCount += 2;
			diamondLevel++;
			antiDiamondLevel--;
			if (diamondLevel > antiDiamondLevel) {
				break;
			}
		}
		for (String output : result) {
			System.out.println(output);
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
