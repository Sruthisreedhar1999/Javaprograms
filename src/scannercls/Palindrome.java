package scannercls;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int s=0,r,temp;
	    
		System.out.println("Enter a number:");

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		temp=n;
		while(n>0)
		{
			r=n%10;
			s=s*10+r;
			n=n/10;
		}
		if(temp==s)
		{
			System.out.println("Palindrome");

		}
		else
		{
			System.out.println("not");

		}

	}

}
