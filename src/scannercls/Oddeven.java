package scannercls;

import java.util.Scanner;

public class Oddeven {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the limit:");
		int n=sc.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter the number:");
	
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		
		
	
			if(ar[i]%2==0)
		{
			 System.out.println("Even no is:"+ ar[i]);	
		}
		else 
		{
		
			System.out.println("odd no is:" +ar[i]);	
		}
		
		
		}
}

	}