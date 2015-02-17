package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;



public class Problem270C
{
	public static void main(String[] args) throws IOException
	{
		fastinput.init(System.in);
		int n = fastinput.nextInt();
		String[] sizes = new String[n];
		for (int i = 0; i < n; i++)
		{
			sizes[i] = fastinput.nextline();
		}
		if (n == 1)
		{
			String[] pairs = sizes[0].split(" ");
			int k = Integer.valueOf(pairs[0]);
			int a = Integer.valueOf(pairs[1]);
			if (a <= 4)
				System.out.println(k+1);
			else
			{
				int nk = k+2;
				BigInteger base = new BigInteger("2");
				System.out.println("Past base initialization.");
				base = base.pow(k);
				System.out.println("Past initial power set.");
				base = base.multiply(base);
				System.out.println("Past base*base.");
				BigInteger nsq = new BigInteger(Integer.toString(a));
				BigInteger oldsize = base.multiply(nsq);
				System.out.println(oldsize);
				while (true)
				{
					BigInteger upperbase = new BigInteger("2");
					upperbase = upperbase.pow(nk);
					upperbase = upperbase.multiply(upperbase);
					if (upperbase.compareTo(oldsize) >= 0)
					{
						break;
					}
					else
					{
						nk++;
					}
				}
				System.out.println(nk);
			}
		}
		else
		{
			Arrays.sort(sizes);
			int[] ks = new int[n];
			int[] as = new int[n];
			for (int q = 0; q < sizes.length; q++)
			{
				String[] splitter = sizes[q].split(" ");
				ks[q] = Integer.valueOf(splitter[0]);
				as[q] = Integer.valueOf(splitter[1]);
			}
			
			for (int j = 0; j+1 < sizes.length; j++)
			{
				int firstk = ks[j];
				int firsta = as[j];
				int secondk = ks[j+1];
				int seconda = as[j+1];
				int boxes;
				if (secondk == firstk + 1)
				{
					if (firsta % 4 == 0)
						boxes = firsta >> 2;
					else
						boxes = (firsta >> 2) + 1;
					if (boxes > seconda)
					{
						as[j+1] = boxes;
					}
				}
				else
				{
					while(true)
					{
						if (firsta % 4 == 0)
						{
							boxes = firsta >> 2;
						}
						else
						{
							boxes = (firsta >> 2)+1;
						}
						if (secondk == firstk + 1)
						{
							if (boxes > seconda)
							{
								as[j+1] = boxes;
							}
							break;
						}
						else
						{
							firstk++;
							firsta = boxes;
						}
					}
				}
			}
			int lastk = ks[n-1];
			int lasta = as[n-1];
			if (lasta <= 4)
				System.out.println(lastk+1);
			else
			{
				long nk = lastk+2;
				long oldsize = lastk*lasta;
				long higherbox = 0;
				while (true)
				{
					higherbox = (nk)*(nk);
					if (higherbox >= oldsize)
					{
						break;
					}
					else
					{
						nk++;
					}
				}
				long result = (long)Math.sqrt(higherbox);
				System.out.println(result);
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
		
		static long nextLong() throws IOException
		{
			return Long.parseLong(next());
		}
	}
}
