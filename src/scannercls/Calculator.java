package scannercls;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("Enter ur choice:");
		int choice=sc.nextInt();
		System.out.println("Enter first number:");
		int a=sc.nextInt();
		System.out.println("Enter second number:");
		int b=sc.nextInt();
		int result=sc.nextInt();
		
		switch(choice)
		{
		case 1:System.out.println("add="+(a+b));
		break;
		case 2:System.out.println("sub="+(a-b));
		break;
		case 3:System.out.println("mult="+(a*b));
		break;
		case 4:if(b==0)
		{
			System.out.println("error");
		}
		else
		{
			System.out.println("div="+(a/b));
			break;
		}
		default:System.out.println("invalid");
		break;
		}
		

	}

}
