package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem462A {
	public static void main(String[] args) throws IOException {
		fastinput.init(System.in);
		int n = fastinput.nextInt();
		String[] rows = new String[n];
		for (int i = 0; i < n; i++) {
			rows[i] = fastinput.next();
		}
		char[][] checkerboard = new char[n][n];
		for (int row = 0; row < n; row++) {
			for (int column = 0; column < n; column++) {
				checkerboard[row][column] = rows[row].charAt(column);
			}
		}
		boolean result = true;
		for (int row = 0; row < n; row++) {
			for (int column = 0; column < n; column++) {
				int o_count = 0;
				if (row - 1 >= 0 && checkerboard[row - 1][column] == 'o') {
					o_count++;
				}
				if (column - 1 >= 0 && checkerboard[row][column - 1] == 'o') {
					o_count++;
				}
				if (column + 1 < n && checkerboard[row][column + 1] == 'o') {
					o_count++;
				}
				if (row + 1 < n && checkerboard[row + 1][column] == 'o') {
					o_count++;
				}
				if (o_count % 2 != 0) {
					result = false;
					break;
				}

			}
			if (!result) {
				break;
			}
		}
		if (result) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
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
