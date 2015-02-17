package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Problem467B {
	public static void main(String[] args) throws IOException {
		fastinput.init(System.in);
		int n = fastinput.nextInt();
		int m = fastinput.nextInt();
		int k = fastinput.nextInt();
		int[] players = new int[m + 1];
		for (int i = 1; i < players.length; i++) {
			players[i] = fastinput.nextInt();
		}
		int Fedor = fastinput.nextInt();
		int count = 0;
		for (int i = 1; i < players.length; i++) {
			int bitCount = Integer.bitCount(Integer.valueOf(Fedor ^ players[i]));
			if (bitCount <= k) {
				count++;
			}
		}
		System.out.println(count);
	}

	public static class fastinput {
		static BufferedReader bf;
		static StringTokenizer st;

		static void init(InputStream input) {
			bf = new BufferedReader(new InputStreamReader(input));
			st = new StringTokenizer("");
		}

		static String nextline() throws IOException {
			return bf.readLine();
		}

		static String next() throws IOException {
			while (!st.hasMoreTokens()) {
				st = new StringTokenizer(bf.readLine());
			}
			return st.nextToken();
		}

		static int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		static long nextLong() throws IOException {
			return Long.parseLong(next());
		}
	}
}
