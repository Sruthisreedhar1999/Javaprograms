package constructor;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		
		System.out.println("Enter 3  numbers");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		Average s=new Average();
		s.avg(a,b,c);
		
		
		

	}
	public void avg(int a,int b,int c)
	{
		int sum=0,average;
			sum += a+b+c;
			 average = sum / 3;
			 System.out.println("SUM="+average);
	}

	   
		}


		
		
