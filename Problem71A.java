package CodeForces;
import java.util.*;

public class Problem71A
{
	public static void WayTooLong(String[] s)
	{
		for (int i = 0; i < s.length; i++)
		{
			if (s[i].length() > 10)
			{
				int middle = s[i].length()-2;
				s[i] = s[i].substring(0, 1)+Integer.toString(middle)+s[i].substring(s[i].length()-1);
			}
		}
	}
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String[] input = new String[n];
		for (int i = 0; i < n; i++)
		{
			input[i] = scan.next();
		}
		scan.close();
		WayTooLong(input);
		for (int i = 0; i < n; i++)
		{
			System.out.println(input[i]);
		}
	}
}
