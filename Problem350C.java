package CodeForces;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem350C
{

	
	public static void main(String[] args) throws IOException
	{
		class BombCoordNode
		{
			int x;
			int y;
			int z;
			BombCoordNode left;
			BombCoordNode right;
			public BombCoordNode(int x, int y)
			{
				this.x = x;
				this.y = y;
				z = (Math.abs(x)+Math.abs(y));
			}
		}
		
		class BinaryBombTree
		{
			BombCoordNode root;
			public BinaryBombTree(BombCoordNode start)
			{
				root = start;
			}
			public void insert(BombCoordNode start, BombCoordNode b)
			{
				if (b.z < start.z && start.left != null)
				{
					insert(start.left, b);
				}
				else if (b.z >= start.z && start.right != null)
				{
					insert(start.right, b);
				}
				else if (b.z < start.z)
				{
					start.left = b;
				}
				else
				{
					start.right = b;
				}
			}
			public void inOrderDiffuse(BombCoordNode start)
			{
				if (start.left != null)
				{
					inOrderDiffuse(start.left);
				}
				if (start.x > 0)
					System.out.println("1 " + start.x + " R");
				if (start.x < 0)
					System.out.println("1 " + (start.x*-1) + " L");
				if (start.y > 0)
					System.out.println("1 " + start.y + " U");
				if (start.y < 0)
					System.out.println("1 " + (start.y*-1) + " D");
				
				System.out.println("2");
				
				if (start.x > 0)
					System.out.println("1 " + start.x + " L");
				if (start.x < 0)
					System.out.println("1 " + (start.x*-1) + " R");
				if (start.y > 0)
					System.out.println("1 " + start.y + " D");
				if (start.y < 0)
					System.out.println("1 " + (start.y*-1) + " U");
				
				System.out.println("3");
				if (start.right != null)
				{
					inOrderDiffuse(start.right);
				}
			}
		}
		
		fastinput.init(System.in);
		int count = 0;
		int n = fastinput.nextInt();
		int ix = fastinput.nextInt();
		int iy = fastinput.nextInt();
		BombCoordNode bi = new BombCoordNode(ix, iy);
		BinaryBombTree btree = new BinaryBombTree(bi);
		if (ix != 0 && iy != 0)
		{
			count += 6;
		}
		else
		{
			count += 4;
		}
		for (int i = 1; i < n; i++)
		{
			int x = fastinput.nextInt();
			int y = fastinput.nextInt();

			if (x != 0 && y != 0)
			{
				count += 6;
			}
			else
			{
				count += 4;
			}
			BombCoordNode b = new BombCoordNode(x, y);
			btree.insert(btree.root, b);
		}

		System.out.println(count);
		btree.inOrderDiffuse(btree.root);
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

