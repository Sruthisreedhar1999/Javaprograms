package stringpgm;

import java.util.Scanner;

public class Countvowel {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string:");
		String s=sc.next();
		int c=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'|| s.charAt(i)=='e'|| s.charAt(i)=='i'|| s.charAt(i)=='o'|| s.charAt(i)=='u')
			{
				c++;
				
			}
		}
		
		System.out.println("count="+c);
	}

}
