package program;

import java.util.Scanner;

public class Compare {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

	    System.out.print("Enter the value of a: ");
	    int a = sc.nextInt();

	    System.out.print("Enter the value of b: ");
	    int b = sc.nextInt();

	    boolean result = a > b;

	    System.out.println("a is greater than b: " + result);

	}

}
