package scannercls;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int a = 0, b = 0, c = 1;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number:");
       int  n = s.nextInt();
        System.out.print("Fibonacci Series:");
        for(int i = 1; i <= n; i++)
        {
            a = b;
            b = c;
            c = a + b;
            System.out.print(a+" ");
        }

	}

}
