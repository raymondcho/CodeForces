package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;


public class Problem462C {
	public static void main(String[] args) throws IOException {
		fastinput.init(System.in);
		int n = fastinput.nextInt();
		List<Long> inputs = new ArrayList<Long>(n);
		long score = (long) 0;
		long pqSum = (long) 0;
		for (int i = 0; i < n; i++) {
			long a = (long) fastinput.nextInt();
			inputs.add(a);
			score += a;
			pqSum += a;
		}
		PriorityQueue<Long> pq = new PriorityQueue<Long>(inputs);

		while (pq.size() > 2) {
			Long popped = pq.poll();
			score += popped.longValue();
			pqSum -= popped.longValue();
			score += pqSum;
		}
		if (pq.size() == 2) {
			score += pqSum;
		}
		System.out.println(score);
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
