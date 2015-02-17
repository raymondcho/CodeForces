package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;


public class Problem462B {
	private static long getMinimum(final long a, final long b) {
		if (a <= b) {
			return a;
		}
		return b;
	}
	
	public static void main(String[] args) throws IOException {
		fastinput.init(System.in);
		long n = (long) fastinput.nextInt();
		long k = (long) fastinput.nextInt();
		char[] cards = fastinput.next().toCharArray();
		long coins = (long) 0;
		Map<Character, Long> cardCount = new HashMap<Character, Long>();
		for (Character card : cards) {
			if (cardCount.containsKey(card)) {
				long incrementCount = cardCount.get(card) + 1;
				cardCount.put(card, incrementCount);
			} else {
				cardCount.put(card, (long) 1);
			}
		}
		
		while (k > 0) {
			Long maxCardCount = (long) 0;
			Character highestCard = null;
			for (Character card: cardCount.keySet()) {
				if (cardCount.get(card).intValue() > maxCardCount.intValue()) {
					maxCardCount = cardCount.get(card);
					highestCard = card;
				}
			}
			long coinIncrement = getMinimum(k, cardCount.get(highestCard));
			coins += coinIncrement * coinIncrement;
			k -= coinIncrement;
			long oldCardCount = cardCount.get(highestCard);
			cardCount.put(highestCard, oldCardCount - coinIncrement);
		}
		System.out.println(coins);
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
