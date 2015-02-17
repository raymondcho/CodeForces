package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;


public class Problem276E
{
	public static void main(String[] args) throws IOException
	{
		fastinput.init(System.in);
		
		class TreeNode
		{
			int value;
			int edge1;
			int edge2;
			boolean isRoot;
			public TreeNode()
			{
				value = 0;
				edge1 = 0;
				edge2 = 0;
				isRoot = false;
			}
			public void addEdge(int n)
			{
				if (n == edge1 || n == edge2)
				{}
				else if (edge1 == 0)
				{
					edge1 = n;
				}
				else if (edge2 == 0)
				{
					edge2 = n;
				}
				else
				{}
			}
			public void addValue(int addedvalue)
			{
				value = value + addedvalue;
			}
		}
		
		class Tree
		{
			TreeNode[] trees;
			public ArrayList<Integer> rootedges;
			public Tree(int n)
			{
				trees = new TreeNode[n+1];
				rootedges = new ArrayList<Integer>();
				TreeNode root = new TreeNode();
				root.isRoot = true;
				trees[1] = root;
				for (int i = 2; i <= n; i++)
				{
					trees[i] = new TreeNode();
				}
			}
			public HashSet<Integer> findNodeDistance(int fnode, int node, int distance)
			{
				HashSet<Integer> result = new HashSet<Integer>();
				
				if (distance == 0)
				{
					result.add(node);
					return result;
				}
				else if (node == 1)
				{
					result.add(node);
					for (int i = 0; i < rootedges.size(); i++)
					{
						if (fnode != rootedges.get(i))
							result.addAll(findNodeDistance(node, rootedges.get(i), distance-1));
					}
					return result;
				}
				else
				{
					result.add(node);
					if (trees[node].edge1 != 0 && trees[node].edge1 != fnode)
						result.addAll(findNodeDistance(node, trees[node].edge1, distance-1));
					if (trees[node].edge2 != 0 && trees[node].edge2 != fnode)
						result.addAll(findNodeDistance(node, trees[node].edge2, distance-1));
					return result;
				}
			}
		}
		
		int n = fastinput.nextInt();
		int q = fastinput.nextInt();
		Tree sometree = new Tree(n);
		String[] edges = new String[n-1];
		for (int i = 0; i < n-1; i++)
		{
			edges[i] = fastinput.nextline();
			String[] ed = edges[i].split(" ");
			int n1 = Integer.valueOf(ed[0]);
			int n2 = Integer.valueOf(ed[1]);
			if (n1 == 1)
			{
				
				sometree.rootedges.add(n2);
				sometree.trees[n2].addEdge(n1);
			}
			else if (n2 == 1)
			{
				sometree.rootedges.add(n1);
				sometree.trees[n1].addEdge(n2);
			}
			else
			{
				sometree.trees[n1].addEdge(n2);
				sometree.trees[n2].addEdge(n1);
			}
		}
		String[] instructions = new String[q];
		for (int j = 0; j < q; j++)
		{
			instructions[j] = fastinput.nextline();
			String[] in = instructions[j].split(" ");
			if (in.length == 2 && in[0].equals("1"))
			{
				int a = Integer.valueOf(in[1]);
				System.out.println(sometree.trees[a].value);
			}
			if (in.length == 4 && in[0].equals("0"))
			{
				int v = Integer.valueOf(in[1]);
				int x = Integer.valueOf(in[2]);
				int d = Integer.valueOf(in[3]);
				ArrayList<Integer> nodesToAdd = new ArrayList<Integer>();
				nodesToAdd.addAll(sometree.findNodeDistance(v, v, d));
				for (int z = 0; z < nodesToAdd.size(); z++)
				{
					sometree.trees[nodesToAdd.get(z)].addValue(x);
				}
			}
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
	}
}
