package CodeForces;
import java.util.*;

public class Problem118A
{
	public static String Petya(String s)
	{
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++)
		{
			char a = s.charAt(i);
			int ascii = (int) a;
			if (ascii == 65 || ascii == 97 || ascii == 69 || ascii == 101 || ascii == 73 || ascii == 105 || ascii == 79 || ascii == 111 || ascii == 85 || ascii == 117 || ascii == 89 || ascii == 121)
			{
				
			}
			else if (ascii >= 65 && ascii <= 90)
			{
				sb.append('.');
				sb.append(Character.toLowerCase(a));
			}
			else
			{
				sb.append('.');
				sb.append(a);
			}
		}
		return sb.toString();
	}
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		scan.close();
		System.out.println(Petya(s));
	}
}
