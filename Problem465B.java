package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Problem465B {
	public static void main(String[] args) throws IOException {
		fastinput.init(System.in);
		int n = fastinput.nextInt();
		int[] letters = new int[n];
		int count = 0;
		int lastUnopenedLetterIndex = -1;
		for (int i = 0; i < n; i++) {
			letters[i] = fastinput.nextInt();
			if (letters[i] == 1) {
				lastUnopenedLetterIndex = i;
			}
		}
		boolean previousUnopenedLetter = false;
		if (lastUnopenedLetterIndex < 0) {
			System.out.println(0);
			return;
		}
		for (int i = 0; i <= lastUnopenedLetterIndex; i++) {
			if (letters[i] == 1) {
				count++;
				previousUnopenedLetter = true;
			}
			if (letters[i] == 0 && previousUnopenedLetter) {
				count++;
				previousUnopenedLetter = false;
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
