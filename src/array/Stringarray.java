package array;

import java.util.Scanner;

public class Stringarray {

	public static void main(String[] args) {
		String [] a=new String[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter names:");
		for(int i=0;i<5;i++)
		{
			 a[i]=sc.next();
		}
		System.out.println("entered names:");
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
	}

}