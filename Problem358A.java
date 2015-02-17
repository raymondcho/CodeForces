package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Problem358A
{
	public static void main(String[] args) throws IOException
	{
        class SemiC implements Comparable<SemiC>
        {
            public int edge1;
            public int edge2;
            public int length;
            public SemiC(int edgeA, int edgeB)
            {
                if (edgeA < edgeB)
                {
                	edge1 = edgeA;
                    edge2 = edgeB;
                }
                else
                {
                	edge1 = edgeB;
                	edge2 = edgeA;
                }
                length = Math.abs(edgeA-edgeB);
            }
            @Override
            public int compareTo(SemiC otherC)
            {
                return this.length - otherC.length;
            }
            public boolean intersect(SemiC otherC)
            {
            	if (this.edge1 < otherC.edge1 && this.edge2 < otherC.edge2 && this.edge2 > otherC.edge1)
            	{
            		return true;
            	}
            	else if (this.edge1 > otherC.edge1 && this.edge2 > otherC.edge2 && this.edge1 < otherC.edge2)
            	{
            		return true;
            	}
            	else
            		return false;
            }
        }
        
        fastinput.init(System.in);
        int n = fastinput.nextInt();
        if (n <= 2)
        {
            System.out.println("no");
        }
        else
        {
            int[] edges = new int[n];
            SemiC[] sc = new SemiC[n-1];
            int f;
            boolean success = true;
            for (f = 0; f < n; f++)
            {
                edges[f] = fastinput.nextInt()+1000000;
                if (f > 0)
                {
                    sc[f-1] = new SemiC(edges[f-1], edges[f]);
                }
                if (f > 1)
                {
                	SemiC c = sc[f-1];
                	for (int i = f-2; i>= 0; i--)
                	{
                		if (sc[i].intersect(c))
                		{
                			success = false;
                			break;
                		}
                	}
                }
            }
            
            if (success)
                System.out.println("no");
            else
                System.out.println("yes");
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
