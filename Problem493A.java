package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;


public class Problem493A {
	
	public static void main(String[] args) throws IOException {
		fastinput.init(System.in);
		String homeTeam = fastinput.nextline();
		String awayTeam = fastinput.nextline();
		int n = fastinput.nextInt();
		int[] minutes = new int[n];
		boolean[] hometeam = new boolean[n];
		int[] players = new int[n];
		boolean[] isYellowCard = new boolean[n];
		String home = "h";
		String yellow = "y";
		for (int i = 0; i < n; i++) {
			minutes[i] = Integer.valueOf(fastinput.next());
			if (home.equals(fastinput.next())) {
				hometeam[i] = true;
			} else {
				hometeam[i] = false;
			}
			players[i] = Integer.valueOf(fastinput.next());
			if (yellow.equals(fastinput.next())) {
				isYellowCard[i] = true;
			} else {
				isYellowCard[i] = false;
			}
		}
		int[] homeplayers = new int[100];
		int[] awayplayers = new int[100];
		List<String> output = new LinkedList<String>();
		for (int i = 0; i < n; i++) {
			if (hometeam[i]) {
				if (homeplayers[players[i]] == -1) {
					continue;
				}
				if (homeplayers[players[i]] < 2) {
					if (isYellowCard[i]) {
						homeplayers[players[i]] += 1;
					} else {
						homeplayers[players[i]] += 2;
					}
					if (homeplayers[players[i]] >= 2) {
						addLine(output, homeTeam, minutes[i], players[i]);
						homeplayers[players[i]] = -1;
					}
				}
			} else {
				if (awayplayers[players[i]] == -1) {
					continue;
				}
				if (awayplayers[players[i]] < 2) {
					if (isYellowCard[i]) {
						awayplayers[players[i]] += 1;
					} else {
						awayplayers[players[i]] += 2;
					}
					if (awayplayers[players[i]] >= 2) {
						addLine(output, awayTeam, minutes[i], players[i]);
						awayplayers[players[i]] = -1;
					}
				}
			}
		}
		if (output.isEmpty()) {
			return;
		} else {
			for (String s : output) {
				System.out.println(s);
			}
		}
	}
	
	public static void addLine(List<String> output, String team, int minute, int playerNum) {
		String newLine = team + " " + String.valueOf(playerNum) + " " + String.valueOf(minute);
		output.add(newLine);
		return;
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
