package scannercls;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {

		int sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n:");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            sum =sum+i;
        }

        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
    }
}

