package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem466B {
	private static long getMinimum(long a, long b) {
		if (a <= b) {
			return a;
		}
		return b;
	}
	private static long getMaximum(long a, long b) {
		if (a >= b) {
			return a;
		}
		return b;
	}
	private static void outputAnswer(long a, long b) {
		System.out.println(a * b);
		System.out.println(a + " " + b);
	}
	
	public static void main(String[] args) throws IOException {
		fastinput.init(System.in);
		long n = fastinput.nextInt();
		long a = fastinput.nextInt();
		long b = fastinput.nextInt();
		long ab = a * b;
		long minimumSize = 6 * n;
		if (ab >= minimumSize) {
			outputAnswer(a, b);
		} else {
			long a2 = a;
			long b2 = b;
			long outputa = 0;
			long outputb = 0;
			if (minimumSize % a == 0 && minimumSize / a > b) {
				b2 = minimumSize / a;
			}
			if (minimumSize % b == 0 && minimumSize / b > a) {
				a2 = minimumSize / b;
			}
			long candidateRoomSize = Long.MAX_VALUE;
			if (a2 * b >= minimumSize && a2 * b < candidateRoomSize) {
				candidateRoomSize = a2 * b;
			}
			outputa = a2;
			outputb = b;
			if (a * b2 < candidateRoomSize && a * b2 >= minimumSize) {
				candidateRoomSize = a * b2;
				outputa = a;
				outputb = b2;
			}
			if (a2 * b2 < candidateRoomSize && a2 * b2 >= minimumSize) {
				candidateRoomSize = a2 * b2;
				outputa = a2;
				outputb = b2;
			}

			if (candidateRoomSize == minimumSize) {
				outputAnswer(outputa, outputb);
				return;
			}
			
			long factorCounter = getMinimum(a, b);
			while (factorCounter <= (long) Math.sqrt(minimumSize)){
				if (minimumSize % factorCounter == 0) {
					long factor1 = factorCounter;
					long factor2 = minimumSize / factorCounter;
					
					if ((getMinimum(factor1, factor2) >= getMinimum(a, b)) && (getMaximum(factor1, factor2) >= getMaximum(a, b))) {
						if (a == getMinimum(a, b)) {
							outputa = getMinimum(factor1, factor2);
							outputb = getMaximum(factor1, factor2);
						} else {
							outputa = getMaximum(factor1, factor2);
							outputb = getMinimum(factor1, factor2);
						}
						candidateRoomSize = outputa * outputb;
					}
				}
				factorCounter++;
			}
			
			if (candidateRoomSize == minimumSize) {
				outputAnswer(outputa, outputb);
				return;
			}
			
			a2 = (minimumSize / b) + 1;
			if (a2 * b < candidateRoomSize && a2 * b >= minimumSize) {
				outputa = a2;
				outputb = b;
				candidateRoomSize = outputa * outputb;
			}
			b2 = (minimumSize / a) + 1;
			if (a * b2 < candidateRoomSize && a * b2 > minimumSize) {
				outputa = a;
				outputb = b2;
				candidateRoomSize = outputa * outputb;
			}
			if (a2 * b2 < candidateRoomSize && a2 * b2 > minimumSize) {
				outputa = a2;
				outputb = b2;
				candidateRoomSize = outputa * outputb;
			}
			
			if (candidateRoomSize == minimumSize) {
				outputAnswer(outputa, outputb);
				return;
			}
			
			candidateRoomSize--;
			while (candidateRoomSize > minimumSize) {
				
			}
			
			a2 = minimumSize / b;
			if (a2 * b < candidateRoomSize && a2 * b >= minimumSize) {
				outputa = a2;
				outputb = b;
				candidateRoomSize = outputa * outputb;
			}
			b2 = minimumSize / a;
			if (a * b2 < candidateRoomSize && a * b2 > minimumSize) {
				outputa = a;
				outputb = b2;
				candidateRoomSize = outputa * outputb;
			}
			if (a2 * b2 < candidateRoomSize && a2 * b2 > minimumSize) {
				outputa = a2;
				outputb = b2;
				candidateRoomSize = outputa * outputb;
			}
			outputAnswer(outputa, outputb);
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
