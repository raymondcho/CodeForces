package CodeForces;


import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;


public class Problem158C
{
	public static void main(String[] args) throws IOException
	{
		Scanner scan = new Scanner(System.in);
		int n = Integer.valueOf(scan.nextLine());
		String[] instructions = new String[n];
		LinkedList<String> directory = new LinkedList<String>();
		for (int i = 0; i < n; i++)
		{
			instructions[i] = scan.nextLine();
		}
		scan.close();
		for (int i = 0; i < n; i++)
		{
			if (instructions[i].equals("pwd"))
			{
				output(directory);
			}
			else if (instructions[i].startsWith("cd"))
			{
				if (instructions[i].equals("cd .."))
				{
					if (!directory.isEmpty())
						directory.removeLast();
				}
				else if (instructions[i].startsWith("cd /"))
				{
					directory.clear();
					String substr[];
					substr = instructions[i].split("/");
					for (int j = 1; j < substr.length; j++)
					{
						if (substr[j].equals("..") && !directory.isEmpty())
						{
							directory.removeLast();
						}
						else
						{
							directory.add(substr[j]);
						}
					}
				}
				else
				{
					String substr[];
					substr = instructions[i].split("/");
					substr[0] = substr[0].substring(3);
					for (int j = 0; j < substr.length; j++)
					{
						if (substr[j].equals("..") && !directory.isEmpty())
						{
							directory.removeLast();
						}
						else
						{
							directory.add(substr[j]);
						}
					}
				}
			}
		}
		
	}
	
	public static void output(LinkedList<String> l)
	{
		for (String a : l)
		{
			System.out.print("/");
			System.out.print(a);
		}
		System.out.print("/");
		System.out.println("");
	}
	
}
