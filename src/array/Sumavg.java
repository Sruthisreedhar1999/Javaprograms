package array;

import java.util.Scanner;

public class Sumavg {

	public static void main(String[] args) {
		int sum=0;
		float avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers:");
	
		 int [] a=new int[4];
		for(int i=0;i<4;i++)
		{
			 a[i]=sc.nextInt();
			 sum=sum+a[i];
		}
		System.out.println("Sum of array="+sum);
		avg=sum/4;
		System.out.println("Sum of array="+avg);
		

	}

}
