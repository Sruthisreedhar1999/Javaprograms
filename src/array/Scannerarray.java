package array;

import java.util.Scanner;

public class Scannerarray {

	public static void main(String[] args) {
		int [] a=new int[3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers:");
		for(int i=0;i<3;i++)
		{
			 a[i]=sc.nextInt();
		}
		System.out.println("entered numbers:");
		for(int i=0;i<3;i++)
		{
			System.out.println(a[i]);
		}
		//for each
		for(int v:a)
		{
			System.out.println(v);
		}
	}

}
