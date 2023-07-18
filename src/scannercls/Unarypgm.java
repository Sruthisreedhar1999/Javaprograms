package scannercls;

import java.util.Scanner;

public class Unarypgm {

	public static void main(String[] args) {
		System.out.println("Enter a number:");

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("pre increment value is:"+(++n));
		System.out.println("post increment value is:"+(n++));
		System.out.println("post decrement value is:"+(n--));
		System.out.println("pre decrement value is:"+(--n));

	}

}
