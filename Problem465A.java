package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Problem465A {
	public static void main(String[] args) throws IOException {
		fastinput.init(System.in);
		int n = fastinput.nextInt();
		String bits = fastinput.next();
		char[] bitsArray = bits.toCharArray();
		int count = 0;
		boolean carryOver = false;
		boolean startAdd = true;
		for (Character bit : bitsArray) {
			if (bit.charValue() == '0') {
				if (startAdd) {
					bit = '1';
					count++;
					startAdd = false;
					continue;
				}
				if (carryOver) {
					bit = '1';
					count++;
					carryOver = false;
				}
				continue;
			}
			if (bit.charValue() == '1') {
				if (startAdd) {
					bit = '0';
					count++;
					startAdd = false;
					carryOver = true;
					continue;
				}
				if (carryOver) {
					bit = '0';
					count++;
					carryOver = true;
					continue;
				}
				carryOver = false;
				continue;
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
