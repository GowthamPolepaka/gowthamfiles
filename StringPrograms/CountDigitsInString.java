package StringPrograms;

import java.util.Scanner;

public class CountDigitsInString 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String s1 = scan.next();
		int count = 0;
		for(int i=0;i<=s1.length()-1;i++)
		{
			char ch = s1.charAt(i);
			if(Character.isDigit(ch))
			{
				count++;
			}
		}
		System.out.println("The count of Digits in String"+" "+count);
		
		
	}

}
