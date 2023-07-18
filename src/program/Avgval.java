package program;

import java.util.Scanner;

public class Avgval {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

	    int sum = 0;
	    System.out.print("Enter numbers:");
	    for (int i = 1; i <= 10; i++) {
	      
	      int num = sc.nextInt();
	      sum += num;
	    }

	    double average = (double) sum / 10;

	    System.out.println("The average of the 10 integers is: " + average);
	  }
	}