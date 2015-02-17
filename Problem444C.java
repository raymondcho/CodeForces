package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Problem444C {

	public static long[] colors;
	public static long[] colorfulness;
	public static int n;
	public static int t;
	public NodeTree nodeTree;
	
	public class Node {
		int l;
		int r;
		Node left;
		Node right;
		Node parent;
		long colorfulness;
		public Node() {
			l = 0;
			r = 0;
			left = null;
			right = null;
			parent = null;
			colorfulness = 0;
		}
		public void selfInitiate() {
			if (l < r) {
				int leftChildL = l;
				int leftChildR = (l + r) >> 1;
				int rightChildL = ((l + r) >> 1) + 1;
				int rightChildR = r;
				if (leftChildL <= leftChildR) {
					Node leftChild = new Node();
					leftChild.l = leftChildL;
					leftChild.r = leftChildR;
					leftChild.parent = this;
					this.left = leftChild;
					leftChild.selfInitiate();
				}
				if (rightChildL <= rightChildR) {
					Node rightChild = new Node();
					rightChild.l = rightChildL;
					rightChild.r = rightChildR;
					rightChild.parent = this;
					this.right = rightChild;
					rightChild.selfInitiate();
				}
			}
			if (l == r) {
				colorfulNodes[l] = this;
			}
		}
	}

	public class NodeTree {
		Node root;
		public NodeTree(int n) {
			int l = 0;
			int r = n - 1;
			root = new Node();
			root.l = l;
			root.r = r;
			root.selfInitiate();
		}
	}
	
	public static Node[] colorfulNodes;
	
	public static int getMinimum(int a, int b) {
		if (a <= b) {
			return a;
		}
		return b;
	}
	
	public static int getMaximum(int a, int b) {
		if (a >= b) {
			return a;
		}
		return b;
	}
	
	public static void updateSum(int l, int r, Node node) {
		if (node.left != null || node.right != null) {
			if (node.left != null && l <= node.left.r) {
				if (node.right != null) {
					node.colorfulness = node.right.colorfulness;
				} else {
					node.colorfulness = 0;
				}
				updateSum(l, getMinimum(r, node.left.r), node.left);
				node.colorfulness += node.left.colorfulness;
			}
			if (node.right != null && r <= node.right.r) {
				if (node.left != null) {
					node.colorfulness = node.left.colorfulness;
				} else {
					node.colorfulness = 0;
				}
				updateSum(getMinimum(r, node.right.l), r, node.right);
				node.colorfulness += node.right.colorfulness;
			}
		}
	}
	
	public static long getSum(int l, int r, Node node) {
		if (node.l == l && node.r == r) {
			return node.colorfulness;
		}
		if (node.r < l || node.l > r) {
			return 0;
		}
		long runningSum = 0;
		if (node.left != null && l <= node.left.r) {
			runningSum += getSum(l, getMinimum(r, node.left.r), node.left);
		}
		if (node.right!= null && r <= node.right.r) {
			runningSum += getSum(getMinimum(r, node.right.l), r, node.right);
		}
		return runningSum;
	}
	
	public static void main(String[] args) throws IOException {
		fastinput.init(System.in);
		n = fastinput.nextInt();
		if (n % 2 != 0) {
			n += 1;
		}
		int m = fastinput.nextInt();
		colors = new long[n];
		for (int i = 0; i < n; i++) {
			colors[i] = (long) (i + 1);
		}
		colorfulNodes = new Node[n];
		Problem444C problem = new Problem444C();
		problem.nodeTree = problem.new NodeTree(n);
		
		for (int i = 0; i < m; i++) {
			int operation = fastinput.nextInt();
			if (operation == 1) {
				int l = fastinput.nextInt() - 1;
				int r = fastinput.nextInt() - 1;
				long x = (long) fastinput.nextInt();
				for (int j = l; j <= r; j++) {
					long y = colors[j];
					colors[j] = x;
					colorfulNodes[j].colorfulness += Math.abs((x - y));
				}
				updateSum(l, r, problem.nodeTree.root);
				continue;
			}
			if (operation == 2) {
				int l = fastinput.nextInt() - 1;
				int r = fastinput.nextInt() - 1;
				long sum = getSum(l, r, problem.nodeTree.root);
				System.out.println(sum);
			}
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
