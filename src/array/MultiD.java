package array;

import java.util.Scanner;

public class MultiD {

	public static void main(String[] args) {
		System.out.println("Enter numbers:");
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[3][2];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		//using for each
		for(int v[]:a)
		{
			for(int v1:v)
			{
				System.out.print(v1+" ");
			}
			System.out.println();
			
		}
		System.out.println("Entered numbers are:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
